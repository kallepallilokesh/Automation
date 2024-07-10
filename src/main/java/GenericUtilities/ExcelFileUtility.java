package GenericUtilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
public String readDataFromExcel(String Sheetname,int rownum,int cellnum) throws Throwable {
	FileInputStream fise = new FileInputStream(IconstantUtility.excelpath);
	Workbook wb = WorkbookFactory.create(fise);
	String value = wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	return value;

}
}
