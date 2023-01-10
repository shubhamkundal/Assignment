package java_class;

import java.util.Random;
import java.util.Scanner;


//Normal approach given by sir

/*class Guesser{
	int guessnum;
	public int guessNum() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Guess the Number between 1-10 for guesser");
		guessnum=sc.nextInt();
		
		if(guessnum<10) {
			return guessnum;
		}
		else {
			
			System.out.println("Please Enter number between 0-10");
			guessNum();
		}
		return guessnum;
	}
}*/


//create random number for gusser
class Guesser{
	public int guessNum() {
		
		Random R = new Random();
		int guessnum = R.nextInt(10);
		return guessnum;
	}
}

//To guess number of player
class Player{
	int guessnum;
	public int guessNum(int noofplayer) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Guess the Number between 0-10 for Player"+noofplayer);
		guessnum = sc.nextInt();
		if(guessnum<10) {
			return guessnum;
		}
		else {
			
			System.out.println("Please Enter number between 0-10");
			guessNum(noofplayer);
		}
		return guessnum;
		
	}
}

//Umpire class to call guesser and player and compare both and provide result
class umpire{
	Scanner sc= new Scanner(System.in);
	int nfg;
	int nfp1;
	int nfp2;
	int nfp3;
	
	void collectNumFromGuesser(){
		Guesser g = new Guesser();
		nfg=g.guessNum();
	}
	
	void collectNumFromPlayers(){
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		nfp1=p1.guessNum(1);
		nfp2=p2.guessNum(2);
		nfp3=p3.guessNum(3);
	}
	
	void compare() {
		if(nfp1==nfg) {
			if(nfp1==nfp2 && nfp1==nfp3) {
				System.out.println("Game tied between all players");
				System.out.println();
			}
			else if(nfp1==nfp2) {
				System.out.println("Game tied between Player1 and Player2");
				System.out.println();
			}
			else if(nfp1==nfp3) {
				System.out.println("Game tied between Player1 and Player3");
				System.out.println();
			}
			else {
				System.out.println("Player1 won the game");
				System.out.println();
			}
		}
		
		else if(nfp2==nfg) {
			if(nfp2==nfp3) {
				System.out.println("Game tied between Player2 and Player3");
				System.out.println();
			}
			else {
				System.out.println("Player2 won the game");
				System.out.println();
			}
		}
		
		else if(nfp3==nfg) {
			System.out.println("Player3 won the game");
			System.out.println();
		}
		
		else {
			System.out.println("No any player won the game");
			System.out.println();
		}
	}
	
}


public class GuesserGame {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int i=1;
		while(i==1) {  //To iterate a loop till player want to play game 
			System.out.println("Let's Start the guesser game");
			umpire um=new umpire();
			um.collectNumFromGuesser();
			um.collectNumFromPlayers();
			um.compare();
			System.out.println("The actual number was : " +um.nfg);
	
			System.out.println("Do you want to play again if yes, then press 1 else any number");
			i=sc.nextInt();
			if(i!=1){
				System.out.println("Exit,Hope you have good experience");
			}
		}
	}
}
