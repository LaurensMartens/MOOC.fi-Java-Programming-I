
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class UserInterface {

    private final Scanner s;
    private final Points p;

    public UserInterface(Scanner scanner, Points pointList) {
        s = scanner;
        p = pointList;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int inputValue = Integer.valueOf(s.nextLine());
            if (inputValue == -1) {
                break;
            }

            if (inputValue >= 0 && inputValue <= 100) {
                p.add(inputValue);
            }
        }
        System.out.println("Point average (all): " + p.averageOfPoints());
        System.out.println("Point average (passing): " + p.averagePassingGrade());
        System.out.println("Pass percentage: " + p.passPercentage());
        System.out.println(p.gradeDistribution());
    }
}
