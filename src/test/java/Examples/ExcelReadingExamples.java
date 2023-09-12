package Examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingExamples {

	public static void main(String[] args) throws IOException {
		// convert to reading mode
		
		FileInputStream fis=new FileInputStream("./Data/EmployeeInfo.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		 int rows=sheet.getLastRowNum();//print the how many rows is available 
         int cells=sheet.getRow(1).getLastCellNum();
         
         System.out.println(rows);
         System.out.println(cells);
         
         for(int i=1;i<=rows;i++) {  //printing rows data
        	 
        	 //capture the rows
    		 XSSFRow row=sheet.getRow(i);
        	 
        	 for(int j=0;j<cells;j++) {
        		 
        		 String value= row.getCell(j).toString();
        		 
        		 System.out.print(value+ "  ");
        		
        		 
        	 }
        	 
        	 System.out.println();
        	 
         }
         
         wb.close();
         fis.close();
		 
		 
	}

}
