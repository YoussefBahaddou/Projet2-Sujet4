package program;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestApp {
    public static void main(String[] args) {
        StringBuilder program = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your mathematical expressions (empty line to execute):");
        
        while (true) {
            String line = scanner.nextLine().trim();
            
            if (line.isEmpty()) {
                if (program.length() > 0) {
                    executeProgram(program.toString());
                    program = new StringBuilder();
                }
                System.out.println("\nEnter new expressions (empty line to execute):");
            } else {
                program.append(line).append("\n");
            }
        }
    }
    
    private static void executeProgram(String program) {
        try {
            Calculator calculator = new Calculator(new ByteArrayInputStream(program.getBytes()));
            calculator.Program();
        } catch (ParseException e) {
            System.out.println("Syntax error: " + e.getMessage());
        }
    }
}
