package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Zadatak2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File nasFile = new File("data/podaci.xlsx");
		FileInputStream fis = new FileInputStream(nasFile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet3 = wb.getSheet("Zadatak2");
		
		int indeksPoslednjegReda = sheet3.getLastRowNum();
		
		double zbirBrojevaUlice = 0;
		for (int i = 1; i <= indeksPoslednjegReda; i++) {
			XSSFRow redUPetlji = sheet3.getRow(i);
			XSSFCell text = redUPetlji.getCell(0);
			XSSFCell broj = redUPetlji.getCell(1);
			
			int brUlice = (int) broj.getNumericCellValue();
			zbirBrojevaUlice+=brUlice;
			
			XSSFCell text1 = redUPetlji.getCell(2);
			XSSFCell text2 = redUPetlji.getCell(3);
			
			System.out.print(text.getStringCellValue());
			System.out.print(brUlice + " ");
			System.out.print(text1.getStringCellValue() + ", ");
			System.out.println(text2.getStringCellValue());
		}
		
		System.out.println("Zbir brojeva ulice je " + zbirBrojevaUlice);
		fis.close();
		wb.close();

	}
	
}	
