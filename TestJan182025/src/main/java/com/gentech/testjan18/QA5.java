package com.gentech.testjan18;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class QA5 {
    public static void main(String[] args) {
        xyz();
    }
    private static void xyz()
    {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh1 = null;
        Sheet sh2 = null;
        Row row1 = null;
        Row row2 = null;
        Cell cell1 = null;
        Cell cell2 = null;
        try
        {
            fin = new FileInputStream("D:\\Excel\\TestJan18\\Test5.xlsx");
            wb = new XSSFWorkbook(fin);
            sh1 = wb.getSheet("Sheet1");
            sh2 = wb.getSheet("Sheet2");
            if (sh2 == null)
            {
                sh2 = wb.createSheet("Sheet2");
            }
            int rc = sh1.getPhysicalNumberOfRows();
            for (int r =0;r<rc;r++)
            {
                row1 = sh1.getRow(r);
                cell1 = row1.getCell(r);
                String data = cell1.getStringCellValue();
                row2 = sh2.getRow(r);
                if (row2 == null)
                {
                    row2 = sh2.createRow(r);
                }
                cell2 = row2.getCell(r);
                if (cell2 == null)
                {
                    cell2 = row2.createCell(r);
                }
                cell2.setCellValue(data);
            }
            fout = new FileOutputStream("D:\\Excel\\TestJan18\\Test5.xlsx");
            wb.write(fout);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                fin.close();
                fout.close();
                wb.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
