package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
				
		FileInputStream st = new FileInputStream ("C:\\Users\\Redwan\\Desktop\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(st);
		XSSFSheet worksheet = workbook.getSheet("sheet1");

/*		String value = worksheet.getrow(0).getCell(0).getStringCellValue();
		double intvalue = worksheet.getRow(2).getCell(1).getNumericCellValue();
		System.out.println(value);
		System.out.println(intvalue); */
	
		XSSFCell cell = worksheet.getRow(0).getCell(0);
		int type = cell.getCellType();
		System.out.println(type);//String = 1 ; Int = 0
		
		if (type == 0){
			System.out.println(cell.getNumericCellValue());
		}
		
		else if (type==1){
			System.out.println(cell.getStringCellValue());
		}
	}

}
