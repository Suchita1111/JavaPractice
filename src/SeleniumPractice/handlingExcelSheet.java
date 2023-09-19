package SeleniumPractice;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class handlingExcelSheet {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\Selenium\\Data\\Tracker_Devops_Engineer.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook(file);
        int lastRowNum = workbook.getSheet("Consolidated tracker-Deevops En").getLastRowNum();
        int lastColNum = workbook.getSheet("Consolidated tracker-Deevops En").getRow(0).getLastCellNum();
        
        for(int i=0; i<=lastRowNum;i++)
        {
            for(int j=0; j<=lastColNum; j++)
            {
               String data = workbook.getSheet("Consolidated tracker-Deevops En").getRow(i).getCell(j).getStringCellValue();
                System.out.print(data +"  ");
            }
            System.out.println();

        }


    }
}
