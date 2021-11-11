package Student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
        int max;
        return max = (english>math)?english:math;

    }

    public void print(){
        int average = getAverage();
        char grading='F';
        System.out.println(name + "\t" + english+ "\t"+ math+ "\t"+ getAverage()+"\t"+ ((average>60)?"PASS":"FAILED")+"\t"+grading);
        switch (average/10){
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
            default:
                grading='F';
        }

//        if (getAverage()>60){
//            System.out.println("\tPASS");
//        }else {
//            System.out.println("\tFAILED");}
    }
    public int getAverage(){
        return (english+math)/2;
    }
}
