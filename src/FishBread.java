public class FishBread {
    private int size;
    private String taste;

    public void fishPrint() {
        System.out.println("붕어빵의 크기는 " + size + "cm");
        System.out.println("붕어빵의 맛은 " + taste);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}
