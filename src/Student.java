public class Student extends Person {

    private String name;


    public void printIntro() {
        System.out.print(name + "의 키는 " + super.getCm() + " 이고, ");
        System.out.print("몸무게는 " + super.getKg() + "이므로 ");
        System.out.println("BMI수치는 " + super.getBMI() + "입니다.");
    }
    public void say() {
        System.out.println("안녕");
    }


    public Student () { }
    public Student (String name, float cm, float kg) {
        super(cm, kg);
        this.name = name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
