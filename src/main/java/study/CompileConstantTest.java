package study;
class MyTest{
    static{
        System.out.println("��̬��ʼ����");
    }
    static final String compileConstant = System.currentTimeMillis() + "";
}
public class CompileConstantTest {
    public static void main(String[] args){
        System.out.println(MyTest.compileConstant);
    }
}
