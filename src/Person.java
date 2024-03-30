public class Person {

    private float cm;
    private float kg;

    public float getBMI(){
        float bmi = this.kg / (this.cm/100 * this.cm/100);
        return bmi;
    }
    public void say(){
        System.out.println("응애");
    }


    public Person () {}
    public Person (float cm, float kg) {
        this.cm = cm;
        this.kg = kg;
    }
    public float getCm() {
        return cm;
    }

    public void setCm(float cm) {
        this.cm = cm;
    }
    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

}
