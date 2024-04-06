package sample;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExample2 {

    public static void main(String[] args) {
       System.out.println("処理開始！");
       
       
       try {
           //ここに例外が発生する可能性のあるコードを書く
           System.out.println("割り算開始");
           int a = divide(10, 0);
           System.out.println(a);
       }catch(ArithmeticException e) {
           //ArithmeticeExceptionが起こった場合の」エラーを書く
           System.out.println("Arithmetic Exception caught :" + e.getMessage());
       }
       
       System.out.println("割り算終了") ;
       }
    
    public static int divide(int a, int b) throws ArithmeticException{
        if(b == 0) {
            //0での徐さんを」試みた場合、ArithmeticExceptionを投げる
            throw new ArithmeticException("0徐さんエラーです");
        }
        return a/b;
        
        

    }

}
