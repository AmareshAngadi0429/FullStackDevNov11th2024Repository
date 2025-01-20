package gentech.com.ExcelDemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class exe {
    public static void main(String[] args) {
        read();

    }

    private static void read() {
        FileInputStream fin = null;
        Workbook wb = null;
        Sheet sh = null;
        Sheet sh1 = null;
        Row row = null;
        Row row1 = null;
        Cell cell = null;
        Cell cell1 = null;
        FileOutputStream fout = null;

        try {

            fin = new FileInputStream("D:\\Excel\\TestJan18\\Main1.xlsx");
            wb = new XSSFWorkbook(fin);
            sh = wb.getSheet("Sheet1");
            sh1 = wb.getSheet("Sheet2");
            if (sh1 == null) {
                sh1 = wb.createSheet("Sheet2");
            }
            int rc = sh.getPhysicalNumberOfRows();
            int k = rc-1;
            for (int r = 0; r < rc; r++) {
                row = sh.getRow(r);
                cell = row.getCell(3);
                String data = cell.getStringCellValue();
                row1 = sh1.getRow(3);
                if (row1 == null)
                {
                    row1 = sh1.createRow(3);

                }
                cell1 = row1.getCell(k);
                if(cell1 == null)
                {
                    cell1 = row1.createCell(k);
                }
                cell1.setCellValue(data);
                k--;

            }
            fout = new FileOutputStream("D:\\Excel\\TestJan18\\Main1.xlsx");
            wb.write(fout);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) fin.close();
                if (wb != null) wb.close();
                if (fout != null) fout.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}
