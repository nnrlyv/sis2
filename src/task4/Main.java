package task4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String excelFilePath = "src/task4/students1.xlsx";
        List<Student> students = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {

                int id = (int) row.getCell(0).getNumericCellValue();
                String name = row.getCell(1).getStringCellValue();
                String group = row.getCell(2).getStringCellValue();
                double currentScholarship = row.getCell(3).getNumericCellValue();
                double gpa = row.getCell(4).getNumericCellValue();
                String faculty = row.getCell(5).getStringCellValue();

                double newScholarship = calculateNewScholarship(currentScholarship, gpa, faculty);

                Student student = new Student(id, name, group, currentScholarship, gpa, faculty, newScholarship);
                students.add(student);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static double calculateNewScholarship(double currentScholarship, double gpa, String faculty) {
        switch (faculty) {
            case "Engineering":
                return gpa > 2.4 ? currentScholarship * 1.10 : currentScholarship;
            case "Economics":
                return gpa > 2.4 ? currentScholarship * 1.15 : currentScholarship;
            case "Philosophy":
                return gpa > 2.2 ? currentScholarship * 1.05 : currentScholarship;
            case "Marketing":
                return gpa > 2.5 ? currentScholarship * 1.08 : currentScholarship;
            default:
                return currentScholarship;
        }
    }
}

