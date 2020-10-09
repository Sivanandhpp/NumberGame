import java.util.Random;
import java.util.Scanner;

class GameLogic {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    public void gameStarts(String userName){
        int randomNumber=0;
        int userLife=0;
        System.out.println(" Select Difficulty Level: (1)-Leow (2)-Medium (3)-High");
        int level = sc.nextInt();
        switch (level){
            case 1:
                System.out.println("Selected: Low, Number Range 0-9 ");
                userLife=3;
                randomNumber = rn.nextInt(10);
                break;
            case 2:
                System.out.println("Selected: Medium, Number Range 0-99 ");
                userLife=6;
                randomNumber = rn.nextInt(100);
                break;
            case 3:
                System.out.println("Selected: High, Number Range 0-999 ");
                userLife=9;
                randomNumber = rn.nextInt(1000);
                break;
            default:
                System.out.println("Error...! In Valid Response, Select a valid option ");
                gameStarts(userName);
        }
        System.out.println("You have "+userLife+" life");

        while (userLife>0){
            System.out.println("Come on "+userName+" Guess it:");
            int userInput = sc.nextInt();
            if (userInput==randomNumber){
                System.out.println("Hey "+userName+" you got it, Congrats!");
                break;
            }else {
                userLife--;
                System.out.println("Wrong Guess");
                if (userLife==0){
                    System.out.println("GAME OVER!, Life Out");
                    System.out.println("The Number is " +randomNumber);
                }else {
                    if (userInput>randomNumber){
                        System.out.println("Clue: The number is less than "+ userInput);
                    }else {
                        System.out.println("Clue: The number is greater than "+ userInput);
                    }
                    System.out.println("You have "+userLife+" life left");
                }
            }
        }
    }
}