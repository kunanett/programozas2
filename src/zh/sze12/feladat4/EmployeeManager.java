package zh.sze12.feladat4;

import java.util.List;

import zh.potZH_gyak.gyak1.feladat4.FileUtils;

public class EmployeeManager {
    public static double getAverageAge(List<String> lines) {
        int sumOfAges = 0;
        int numberOfEmployees = 0;
        for (String line : lines) {
            String[] data = line.split(";");
            sumOfAges += Integer.parseInt(data[2]);
            numberOfEmployees++;
        }
        return (double) sumOfAges / numberOfEmployees;
    }

    public static void main(String[] args) {
        List<String> lines = FileUtils.readLines("src/zh/sze12/feladat4/employees.txt");
        double averageAge = getAverageAge(lines);
        System.out.println("The average age: " + averageAge);
    }
}
