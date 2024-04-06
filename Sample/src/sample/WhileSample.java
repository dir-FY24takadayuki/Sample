package sample;

public class WhileSample {

    public static void main(String[] args) {
//numが１０２４以下である限りnumを印字し、その数の２倍をnumに格納する
        var num = 2;
       
       
       while (num <= 1024) {
           System.out.println(num);
           num = num * 2;
       }

    }

}
