package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    HashMap<Integer, String> studentInfo;

    public Student(HashMap<Integer, String> studentInfo) {
        this.studentInfo = studentInfo;
    }

    static int key = 1;


    void addKeyAndValue() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name of student: ");
        String nameOfStudent = reader.nextLine();
        this.studentInfo.put(key, nameOfStudent);
        key++;
    }

    void whileLoopAddStudents() {
        Scanner reader = new Scanner(System.in);
        char yOrN;
        do {
            addKeyAndValue();
            System.out.println("Do you wand to add another student? y/n");
            yOrN = reader.next().charAt(0);
        } while (yOrN == 'y');
    }

    void getOrdinalNumberAndNameOfStudent() {
        System.out.println("Ordinal number and name of the students: ");
        for (Integer studentKey : this.studentInfo.keySet()) {
            System.out.println(studentKey + ". " + this.studentInfo.get(studentKey));
        }
    }

    public int userOption() {
        Scanner read = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Do you want to: \n1 - Add new student \n2 - Remove student \n3 - Change student name \n4 - EXIT ");
        return read.nextInt();
    }

    void removeStudent() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the ordinal number of the student you want to remove: ");
        int num = reader.nextInt();
        this.studentInfo.remove(num);
        System.out.println("Your list after removal");
        getOrdinalNumberAndNameOfStudent();
    }

    void findStudentAndChangeName() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the ordinal number of the student whose name you want to change:");
        int num = reader.nextInt();
        for (Map.Entry<Integer, String> map : this.studentInfo.entrySet()) {
            if (map.getKey().equals(num)) {
                System.out.println(map.getKey() + ". " + map.getValue());
            }
        }
        changeStudentName(num);

    }

    private void changeStudentName(int num) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter new name:");
        this.studentInfo.put(num, reader.nextLine());
    }

}
