package bugman;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("cpu")
                .name("name")
                .screen("screen")
                .build();
    }
}
