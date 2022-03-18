package example;

public class Exam_1 {
    public static void main(String args[]) {
        System.out.println("Exam1 Main");
        Exam_1 exam_1 = new Exam_1();
        System.out.println("Result Sum : " + exam_1.sum(1,2));
    }

    public int sum(int a, int b) {
        return a+b;
    }

}
