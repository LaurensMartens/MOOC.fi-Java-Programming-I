
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gebruiker
 */
public class Points {

    private final List<Integer> pointList;

    public Points() {
        this.pointList = new ArrayList<>();
    }

    public void add(int num) {
        this.pointList.add(num);
    }

    public double averageOfPoints() {
        return pointList.stream().mapToInt(x -> x).average().orElseThrow(IllegalStateException::new);
    }

    public String averagePassingGrade() {
        double averagePassing = pointList.stream().filter(x -> x >= 50).mapToInt(x -> x).average().orElse(0);
        return averagePassing == 0 ? "-" : "" + averagePassing;
    }

    public double passPercentage() {
        return 100 * ((double) pointList.stream().filter(x -> x >= 50).count()
                / pointList.size());
    }

    public String gradeDistribution() {
        String fiveStar = "", fourStar = "", threeStar = "", twoStar = "", 
                oneStar = "", noStar = "";
        
        for (int point : pointList) {
            if (point >= 90) {
                fiveStar += "*";
            } else if (point >= 80) {
                fourStar += "*";
            } else if (point >= 70) {
                threeStar += "*";
            } else if (point >= 60) {
                twoStar += "*";
            } else if (point >= 50) {
                oneStar += "*";
            } else {
                noStar += "*";
            }
        }
        return "5: " + fiveStar + "\n" + 
                "4: " + fourStar + "\n" + 
                "3: " + threeStar + "\n" + 
                "2: " + twoStar + "\n" + 
                "1: " + oneStar + "\n" + 
                "0: " + noStar + "\n";
    }
}
