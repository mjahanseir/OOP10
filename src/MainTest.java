public class MainTest {
    private int num;

    public static void main(String[] args) {
        MainTest c = new MainTest();
        c.num = 5;
        c.assignZero();
    }

    public void assignZero() {
        num = 0; // this.num = 0; same
    }
}