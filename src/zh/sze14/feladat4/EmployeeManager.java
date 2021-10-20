package zh.sze14.feladat4;

import java.util.List;

public class EmployeeManager {
    public static String getOldestEmployee(List<String> lines) {
        int maxAge = Integer.MIN_VALUE;
        String oldestEmployee = "";
        for (String line : lines) {
            String[] data = line.split(";");
            int age = Integer.parseInt(data[2]);
            String name = data[0];
            if (age > maxAge) {
                maxAge = age;
                oldestEmployee = name;
            }
        }
        return oldestEmployee;
    }

    public static void main(String[] args) {
        String oldestEmployee = getOldestEmployee(FileUtils.readLines("src/zh/sze14/feladat4/employees.txt"));
        System.out.println("The oldest employee: " + oldestEmployee);
    }
}
