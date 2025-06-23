package FunctionalInterface;

interface inter3
{
    void show3();

}

public class Dmeo3 {
    public static void main(String[] args) {

        inter3 inter3 = new inter3() {
            @Override
            public void show3() {
                System.out.println("show method ");
            }
        };
        inter3.show3();
    }
}
