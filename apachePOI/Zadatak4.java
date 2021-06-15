package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Zadatak4 {

	
		// TODO Auto-generated method stub

/*		u fajl iz zadatka za upis brojeva dodajte novi sheet gde cete ispisati brojeve od 100 do 1000	*/	
		
		
		
		
		
			public static void main(String[] args) throws IOException {
				// TODO Auto-generated method stub
				
				File postojeciFile = new File("data/podaci3.xlsx");
				FileInputStream fis = new FileInputStream(postojeciFile);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				FileOutputStream fos = new FileOutputStream(postojeciFile);
				//int randomBroj = (int) Math.random() * 101;
				//String nazivSheeta = "novi sheet" + randomBroj;
				
				wb.createSheet("Brojevi od 100 do 1000");
				XSSFSheet noviSheet = wb.getSheet("Brojevi od 100 do 1000");
				
				for (int i = 0; i <= 900; i++) {
					XSSFRow redIzPetlje = noviSheet.createRow(i);
					XSSFCell poljeUBKoloni = redIzPetlje.createCell(0);
					poljeUBKoloni.setCellValue(i+100);
				}
				wb.write(fos);
				wb.close();
				fis.close();
				fos.close();
				System.out.println("Kraj nedelje");
		
	}

}
