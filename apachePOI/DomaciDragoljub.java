package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DomaciDragoljub {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
/*		
		Napravite excel fajl gde cete u jednom sheetu napraviti kolone Valid username, Valid password, Invalid username i Invalid password 
		(dodajte koliko zelite celija za ove kolone ali sve kolone moraju imati isti broj celija). Zatim iz tog fajla napravite onoliko 
		petlji koliko ima kombinacija za unos i naravno u petlji stampajte podatke iz celija.
		Na primer: Petlja 1 - Valid username, valid password
		Petlja 2 - Invalid username, valid password  */
		
		
		File nasFile = new File("data/domaci23.xlsx"); 
		FileInputStream fis = new FileInputStream(nasFile); 
		
		XSSFWorkbook wb = new XSSFWorkbook(fis); 
		XSSFSheet sheet1 = wb.getSheet("Domaci23"); 
		
		int indeksPoslednjegReda = sheet1.getLastRowNum();
	
		System.out.print("Petlja 1: ");	
		
		for (int i = 0; i <= indeksPoslednjegReda; i++) { 
			
			XSSFRow redUPetlji = sheet1.getRow(i);
			
			XSSFCell validUsername = redUPetlji.getCell(0);
			XSSFCell validPassword = redUPetlji.getCell(1);
			
		
			System.out.print(validUsername.getStringCellValue() + ", ");
			System.out.println(validPassword.getStringCellValue() + ", ");
		
			
		}
		
		System.out.println("-------------------------------------------");
		System.out.print("Petlja 2: ");
		
		for (int i = 0; i <= indeksPoslednjegReda; i++) { 
			
			XSSFRow redUPetlji = sheet1.getRow(i);
			
			XSSFCell invalidUsername = redUPetlji.getCell(2);
			XSSFCell invalidPassword = redUPetlji.getCell(3);
			
			
			System.out.print(invalidUsername.getStringCellValue() + ", ");
			System.out.println(invalidPassword.getStringCellValue() + ", ");
		
			
		}
		
		System.out.println("-------------------------------------------");
		System.out.print("Petlja 3: ");
		
		for (int i = 0; i <= indeksPoslednjegReda; i++) { 
			
			XSSFRow redUPetlji = sheet1.getRow(i);
			
			XSSFCell validUsername = redUPetlji.getCell(0);
			XSSFCell invalidPassword = redUPetlji.getCell(3);
			
			
			System.out.print(validUsername.getStringCellValue() + ", ");
			System.out.println(invalidPassword.getStringCellValue() + ", ");
		
			
		}
		
		System.out.println("-------------------------------------------");
		System.out.print("Petlja 4: ");
		
		
		for (int i = 0; i <= indeksPoslednjegReda; i++) { 
			
			XSSFRow redUPetlji = sheet1.getRow(i);
			
			XSSFCell invalidUsername = redUPetlji.getCell(1);
			XSSFCell validPassword = redUPetlji.getCell(2);
			
			
			System.out.print(invalidUsername.getStringCellValue() + ", ");
			System.out.println(validPassword.getStringCellValue() + ", ");
		
			
		}
		
		fis.close();
		wb.close();
		
		
		
		
		
	}

}
