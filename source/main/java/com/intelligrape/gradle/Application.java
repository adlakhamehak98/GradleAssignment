import org.apache.commons.lang3.StringUtils;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Java1.display();
        Java2.display();
        String s = "Hello";
        System.out.println(StringUtils.reverse(s));
    }
}
