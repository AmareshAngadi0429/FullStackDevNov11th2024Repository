package com.gentech.testjan18;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class QA4 {
    public static void main(String[] args) {
        xyz();
    }
    private static void xyz()
    {
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Row row = null;
        Cell cell = null;
        try
        {
            wb = new XSSFWorkbook();
            sh = wb.getSheet("Sheet1");
            if (sh ==null)
            {
                sh = wb.createSheet("Sheet1");
            }
            row = sh.getRow(9);
            if (row == null)
            {
                row = sh.createRow(9);
            }
            for (int c =0;c<20;c++)
            {
                cell = row.getCell(c);
                if (cell == null)
                {
                    cell = row.createCell(c);
                }
                cell.setCellValue("fruit"+(c+1));
            }
            fout = new FileOutputStream("D:\\Excel\\TestJan18\\Test4.xlsx");
            wb.write(fout);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                fout.close();
                wb.close();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
