import java.util.Scanner;
import java.util.Random;
public class numbergame {

    public static void main(String[] args) {
        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!! ");
		System.out.println("//You can play the game for 6 rounds and "
				+ "you will only get 10 chances in each round to guess the number//");
		Scanner in=new Scanner(System.in);
		Random rand=new Random();
		int rnum=rand.nextInt(100)+1;
		int guess=0;
		int maxguess=10;
		int round=0;
		int score=0;
		while(round<6) {
		while(guess<maxguess) {
		System.out.println("ENTER YOUR GUESS: ");
		int n=in.nextInt();
		if (n==rnum)
		{
			System.out.println("YOU GUESSED IT RIGHT! YOU WIN!");
			break;
		}
		else {
			if (n<rnum)
			{
				System.out.println("NUMBER TOO LOW!");
			}
			else {
				System.out.println("NUMBER TOO HIGH!");
			}
			guess++;
			
		}
			}score = (maxguess - guess)-1;
			System.out.println("FINAL SCORE: " + score);
			System.out.println("YOU HAVE NO GUESSES LEFT!");
			System.out.println("WOULD YOU LIKE TO CONTINUE WITH ANOTHER ROUND OF THE GAME?(yes/no)");
			String userResponse = in.next();
			if (userResponse.equals("yes"))
			{
				guess=0;
				round++;
			} else if (userResponse.equals("no")) {
			    System.out.println("GAME END!");
			    break; 
			} else {
			    System.out.println("INVALID RESPONSE!");
			}
		}System.out.println("YOU HAVE NO ROUNDS LEFT!");
		System.out.println("GAME END!");
    in.close();}
}