public class JavaSingletonPattern {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        singleton.str = "Hi!";
        Singleton singleton2 = Singleton.getSingleInstance();
        System.out.println(singleton2);
    }

}

class Singleton {

    public static String str;
    private static Singleton singletonInstance;

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        if (singletonInstance == null) {
            return new Singleton();
        } else {
            return singletonInstance;
        }
    }
}
