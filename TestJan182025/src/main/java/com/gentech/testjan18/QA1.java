package com.gentech.testjan18;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class QA1 {
    public static void main(String[] args) {
        read();
    }
    private static void read()
    {
        FileInputStream fin = null;
        Workbook wb = null;
        Sheet sh = null;
        Row r = null;

        try
        {
            fin = new FileInputStream("D:\\Excel\\TestJan18\\Test1.xlsx");
            wb = new XSSFWorkbook(fin);
            sh =  wb.getSheet("Sheet1");
            r = sh.getRow(0);
            int col =r.getPhysicalNumberOfCells();
            System.out.println("no of col in row 0 : "+ col);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            try
            {
                fin.close();
                wb.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
