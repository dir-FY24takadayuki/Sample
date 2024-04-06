package sample;

public class SwitchSample {

    public static void main(String[] args) {
        var score = 72;
        
        switch(score / 10) {
        case 10:{
            System.out.println("Perfect!!");
        } case 9:
          case 8:
              System.out.println("Well Done!");
              break;
          case 7:
          case 6:
              System.out.println("Pass");
              break;
          default:
              System.out.println("Fail");
                  
        }

    }

}
