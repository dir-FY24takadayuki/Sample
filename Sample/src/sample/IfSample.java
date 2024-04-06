package sample;

public class IfSample {

    public static void main(String[] args) {
        var score = ９９; // 成績
        
        if (score == 100) {//=が２個ないと値の格納になってしまう
            System.out.println("満点です！");
        } else if (score >= 80) {
            System.out.println("よくできました！");
        } else if (score >=60 ) {
            System.out.println("合格です！");
        } else {
            System.out.println("赤点です。。。");
            }
        

    }

}
