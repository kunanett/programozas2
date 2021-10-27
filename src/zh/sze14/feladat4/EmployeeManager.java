package zh.sze14.feladat4;

import java.util.List;

public class EmployeeManager {
    public static String getOldestEmployee(List<String> lines) {
        int maxAge = Integer.MIN_VALUE;
        String oldest = "";
        for (String line : lines) {
            String[] data = line.split(";");
            int age = Integer.parseInt(data[2]);
            String name = data[0];
            if (age > maxAge) {
                maxAge = age;
                oldest = name;
            }
        }
        return oldest;
    }

    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("src/zh/sze14/feladat4/employees.txt");
        String oldestEmployee = getOldestEmployee(lines);
        System.out.println("The oldest employee: " + oldestEmployee);
    }
}
