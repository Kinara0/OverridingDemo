import org.w3c.dom.ls.LSOutput;

public class example {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);

    }
}
        class A
        {
            int i = 10;

        }
        class B extends A
        {
            int i = 20;
        }