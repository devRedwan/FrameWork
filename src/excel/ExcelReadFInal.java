package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadFInal {

	public static void main(String[] args) throws IOException {
		
		FileInputStream st = new FileInputStream ("C:\\Users\\Redwan\\Desktop\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(st);
		XSSFSheet worksheet = workbook.getSheet("sheet1");
		
		Iterator <Row> riterator = worksheet.iterator();
		while (riterator.hasNext()){
			
			Row nextrow = riterator.next();
			Iterator<Cell> cellIterator = nextrow.cellIterator();
			while (cellIterator.hasNext()){
				
				Cell cell = cellIterator.next();
				
				switch (cell.getCellType()){
				
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				}
			}
		}
	}
}
