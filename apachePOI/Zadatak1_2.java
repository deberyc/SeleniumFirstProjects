package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Zadatak1_2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File nasFile = new File("data/podaci.xlsx");
		FileInputStream fis = new FileInputStream(nasFile);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet2 = wb.getSheet("Zadatak1_2"); // sheet iz kog čitamo u Ekselu
		
		int indeksPoslednjegReda = sheet2.getLastRowNum(); // poslednji ispisan red red sheet-u
		
		for (int i = 0; i <= indeksPoslednjegReda; i++) {
			
			XSSFRow redUPetlji = sheet2.getRow(i);
			
			XSSFCell text = redUPetlji.getCell(0);
			System.out.println(text.getStringCellValue());
			
		}
		fis.close();
		wb.close();

	

}

}