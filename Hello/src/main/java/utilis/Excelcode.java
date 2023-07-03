package utilis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcode {
	 public static String[][] readData(String ExcelfileName) throws IOException{
			//step1: set up the path for the work book
			XSSFWorkbook wb= new XSSFWorkbook("./dat/"+ExcelfileName+".xlsx");
			//step2:Get in to the respective sheet
			XSSFSheet ws=wb.getSheet("Sheet1");//using sheet name
			

			
			// to get row count
			int  rowCount =ws.getLastRowNum();
			System.out.println(rowCount);
			
			//to get cell count
		   int cellcount=ws.getRow(1).getLastCellNum();
			System.out.println(cellcount);
			
			//How to use excel
			String[][] data= new String[rowCount][cellcount];
			                           
			
			for(int i=1;i<=rowCount;i++) {
				for(int j=0;j<cellcount;j++) {
				String cellValue=ws.getRow(i).getCell(j).getStringCellValue();
			        System.out.print(cellValue );
			        data[i-1][j] =cellValue;
			        

			}
				
			}
			wb.close();
			return data;
			

}
}