import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Student maxBmiStudent;

        students.add(new Student("홍길동", 175, 75));
        maxBmiStudent = students.getFirst();
        students.add(new Student("이서경", 180, 78));
        if (students.getLast().getBMI() > maxBmiStudent.getBMI()) maxBmiStudent = students.getLast();
        students.add(new Student("이영희", 155, 49));
        if (students.getLast().getBMI() > maxBmiStudent.getBMI()) maxBmiStudent = students.getLast();
        students.add(new Student("김멋사", 182, 82));
        if (students.getLast().getBMI() > maxBmiStudent.getBMI()) maxBmiStudent = students.getLast();

        for (Student student: students) {
            if (maxBmiStudent.equals(student)) {
                students.remove(student);
                break;
            }
        }

        for (Student student: students) {
            student.printIntro();
            student.say();
        }
    }
}