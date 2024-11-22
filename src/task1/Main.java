package task1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String excelFilePath = "src/students.xlsx";
        List<Student> students = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0)
                    continue;
                String name = row.getCell(0).getStringCellValue();

                double currentScholarship = row.getCell(1).getNumericCellValue();
                double newScholarship = row.getCell(2).getNumericCellValue();
                Student student = new Student(name, currentScholarship, newScholarship);
                students.add(student);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


