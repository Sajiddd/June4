package generic;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static String readDataFromExcelFile(String path,String sheet, int row,int col)
	{
		String text="";
		try
		{
			Workbook workBook = WorkbookFactory.create(new FileInputStream(new File(path)));
			text=workBook.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		}
		catch (Exception e) {
			
		}
		return text;
	}
}
