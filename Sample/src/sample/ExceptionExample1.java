package sample;

public class ExceptionExample1 {

    public static void main(String[] args) {
        System.out.println("処理開始");
        
        try {
            //here write a possible error code!
            System.out.println("割り算開始");
            int a = 10 / 0;
            System.out.println(a);
        }catch (ArithmeticException e) {
            //Write ArithmeticException transaction
            System.out.println("ArithmeticExceptionが発生"+ e.getMessage());    
        }finally {
            //例額の有無にかかわらず実行されるコードを書く（オプション）
            System.out.println("割り算終了");
        }

        System.out.println("処理終了");
        
    }

}
