package utilitymicro;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Microutility {
	public static String getCellValue(String x1,String sheet,int r,int c)
	{
		try
		{
			FileInputStream fi=new FileInputStream(x1);
			@SuppressWarnings("resource")
			XSSFWorkbook Wb=new XSSFWorkbook(fi);
			XSSFCell cell=Wb.getSheet(sheet).getRow(r).getCell(c); 
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				
				return cell.getRawValue();
			}
		}
			catch(Exception e)
			{
				return "";
			
			}
	}

	public static int getRowcount(String xl, String Sheet) {
		try 
		{
			FileInputStream fi=new FileInputStream(xl);  
			@SuppressWarnings("resource")
			XSSFWorkbook Wb=new XSSFWorkbook(fi);
      return Wb.getSheet(Sheet).getLastRowNum();

		}
		catch(Exception e)
		{
			
		return 0;
	    }
		
	}
}
