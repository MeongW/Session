public class Circle {
    private int radius;

    public double size(){
        return radius * radius * Math.PI;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }
}
