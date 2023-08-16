//Techno_Hacks_Edutach Task 2
import java.util.*;
public class Techno_Hacks_Edutech_task2
{
    public static void main(String args[]){
        generateRandom();
        }
    public static void generateRandom(){
        Random number=new Random();
        int randomnumber=number.nextInt(101);
        guess(randomnumber);
    public static void guess(int randomnumber){
        Scanner Sn=new Scanner(System.Sn);
        System.out.println(" ");
        System.out.println("Number Game");
        System.out.println("Guess a number between 0 to 100: ");
        int guess=Sn.nextInt();
        System.out.println(" ");
        while(guess<0||guess>100){
            System.out.println("Guess a number between 0 to 100");
            guess=Sn.nextInt();
            System.out.println(" ");
        }
    int start=0;
    while(guess!=Random){
        Start++;
        System.out.println("Wrong guess number");
        System.out.println("Guess again");
        guess =Sn.nextInt();
        System.out.println(" ");
        while(guess<0||guess>100){
            System.out.println("Guess a number between 0 to 100");
            guess=Sn.nextInt();
            System.out.println(" ");
        }
    }
    System.out.println("Correct Answer You Won!");
    System.out.println("Worng Start:"+Start);
    System.out.println(" ");
    System.out.println("Press 1 to play again");
    System.out.println("Press 0 to exit");
    int choice =Sn.nextInt();
    if(choice ==1)
     generateRandom();
    else
    return;
    }
    }
}