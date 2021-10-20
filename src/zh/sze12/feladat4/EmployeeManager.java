package zh.sze12.feladat4;

import java.util.List;

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
        double averageAge = getAverageAge(FileUtils.readLines("src/zh/sze12/feladat4/employees.txt"));
        System.out.println("The average age: " + averageAge);
    }
}
