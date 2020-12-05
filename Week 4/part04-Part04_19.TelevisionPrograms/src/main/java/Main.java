import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String program = scanner.nextLine();
            if (program.equals("")) {
                break;
            }
            
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            programs.add(new TelevisionProgram(program, duration));            
        }
        System.out.print("Program's maximum duration?");
        int maxDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram piece: programs) {
            if (piece.getDuration() <= maxDuration) {
                System.out.println(piece.toString());
            }
        }
    }
}
