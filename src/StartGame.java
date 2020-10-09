import java.util.Scanner;

public class StartGame {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GameLogic gc=new GameLogic();
        System.out.print("Enter your Name: ");
        String userName = sc.nextLine().toString();
        System.out.println("Hello " + userName +", Welcome to NUMBER GAME");
        System.out.println("___________________________________________________________");
        System.out.println("Instructions: This is a number guessing game,");
        System.out.println("You have to guess a number according to difficulty level,");
        System.out.println("Every time you guess a wrong number you will get a clue");
        System.out.println("___________________________________________________________");
        System.out.println("So are you ready "+userName+" ? (y/n)");
        char userReady = sc.next().charAt(0);
        if (userReady == 'y'){
            gc.gameStarts(userName);
        }else{
            System.out.println(userName + " Responded No, Game closed");
        }
    }
}

