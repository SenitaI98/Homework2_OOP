package task2;

import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student(new HashMap<>());
        student.whileLoopAddStudents();
        student.getOrdinalNumberAndNameOfStudent();
        Scanner reader = new Scanner(System.in);
        char yOrN;
        do {
            int option = student.userOption();
            if (option == 1) {
                student.whileLoopAddStudents();
                student.getOrdinalNumberAndNameOfStudent();
            }
            if (option == 2) {
                student.removeStudent();
            }
            if (option == 3) {
                student.findStudentAndChangeName();
                student.getOrdinalNumberAndNameOfStudent();
            }
            if (option == 4) {
                System.exit(0);
            }
            System.out.println("Do you want another option?");
            yOrN = reader.next().charAt(0);
        } while(yOrN=='y');

    }
}
