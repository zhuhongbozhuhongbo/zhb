package study;

interface Product{
    int getProduceTime();
}
public class Printer implements Output, Product{
    private String[] printData = new String[MAX_CACHE_LINE];

    private int dataNum = 0;
    @Override
    public void out(){
        while(dataNum > 0){

        }

    }

    @Override
    public void getData(String msg) {

    }

    @Override
    public int getProduceTime() {
        return 0;
    }
}
