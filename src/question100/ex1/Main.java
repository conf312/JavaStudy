package question100.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student student = new Student("1001", "홍길동");
        Student student2 = new Student("1002", "엄복동");

        students.add(student);
        students.add(student2);

        System.out.println("검색할 학생이 있습니까? (Y:N) : ");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        String result = "";

        if ("Y".equals(input)) {
            System.out.println("학생의 이름을 입력하시오. : ");
            String name = scanner.next();
            for (Student obj : students) {
                if (name.equals(obj.getName())) {
                    result = obj.getNo();
                    break;
                }
            }
            result = result.isEmpty() ? "해당 학생은 존재하지 않습니다." : "해당 학생의 학번은 " + result + "입니다.";
            System.out.println(result);
            return;
        }

        System.out.println("종료되었습니다,");
    }
}
