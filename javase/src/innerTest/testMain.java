package innerTest;

public class testMain {
    public static void main(String[] args) {
        testInner test = new testInner();
        testInner.innerBody bod = new testInner().new innerBody();
        bod.testone();
    }
}
