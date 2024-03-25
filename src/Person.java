public class Person {
    private float cm;
    private float kg;

    public float getBMI(){
        float bmi = this.kg / (this.cm * this.cm);
        return bmi;
    }
    public void say(){
        System.out.println("응애");
    }
}
