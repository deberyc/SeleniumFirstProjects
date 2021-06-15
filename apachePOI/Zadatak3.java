package apachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Zadatak3 {
	
/*	upisati u novi excel fajl u kolonu B brojeve od 1 do 99, sheet nazvati "brojevi do 100" */

	public static void main(String[] args) throws IOException {
		
		File fileZaUpis = new File("data/podaci3.xlsx");
		FileOutputStream fos = new FileOutputStream(fileZaUpis);
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet1 = wb.createSheet("brojevi do 100");
		
		for (int i = 0; i < 99; i++) {
			XSSFRow redIzPetlje = sheet1.createRow(i);
			XSSFCell poljeUBKoloni = redIzPetlje.createCell(1);
			poljeUBKoloni.setCellValue(i+1);
		}
		
		wb.write(fos);
		wb.close();
		fos.close();
		
		System.out.println("Kraj programa");
	}

}
