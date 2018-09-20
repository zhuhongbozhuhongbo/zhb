package study;

public interface Output {
    //等同于public static final int MAX_CACHE_LINE = 50;
    int MAX_CACHE_LINE = 50;
    //接口里定义的普通方法只能是public的抽象方法
    void out();
    void getData(String msg);
    //在接口中定义默认方法，需要用default修饰,默认Public修饰
    default void print(String... msgs){
        for(String msg : msgs){
            System.out.println(msg);
        }
    }

    default void test(){
        System.out.println("默认的test()方法");
    }
    //在接口中定义类方法，需要用static修饰
    static String staticTest(){
        return "接口里的方法";
    }

    //
}
