package Student;

import java.util.Scanner;

public class studentRunner {
    public static void main(String[] args) {
        userInput();
//        Student stu= new Student("Tex",77,99);
//        stu.print();
//        System.out.println("the highest score:"+ stu.highest());
    }
//抽取程式碼成為方法 ctrl+alt+m
    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a student's name:");
        String name = scanner.next();
        System.out.println("Please enter english score:");
        int english = scanner.nextInt();
        System.out.println("Please enter math score:");
        int math = scanner.nextInt();
        Student stu= new Student(name,english,math);
        stu.print();
        System.out.println(stu.highest());
    }
}
