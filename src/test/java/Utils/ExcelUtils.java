package Utils;



import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    public static String getCellData(String filePath, String sheetName, int rowNum, int colNum) {
        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheet(sheetName);
            Cell cell = sheet.getRow(rowNum).getCell(colNum);

            return cell.getStringCellValue(); // assumes cell has String data
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

