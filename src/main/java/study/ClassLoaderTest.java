package study;


public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException{
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        cl.loadClass("Tester1");
        Class.forName("Tester1");
    }
}
