package study;
class MyTest{
    static{
        System.out.println("¾²Ì¬³õÊ¼»¯¿é");
    }
    static final String compileConstant = System.currentTimeMillis() + "";
}
public class CompileConstantTest {
    public static void main(String[] args){
        System.out.println(MyTest.compileConstant);
    }
}
