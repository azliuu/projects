import java.util.Scanner;

public class gt
  {
	Scanner myScanner = new Scanner(System.in);
	String playerName;
	int choice;
	int gameOver;
	int x;
	int y;
public static void main (String[] args)
  {
	gt player;
	player = new gt();
	player.playerInstructions();
	player.playerBeginning();
	player.playerSchool();
  }
public void playerSchool()
  {
	System.out.println("getupgetupgetupgetupgetupgetupgetupgetupgetupgetupgetup get up");
        System.out.println(".   .       .       .");
        System.out.println("GET UP");
        System.out.println("ok dude chill. I am now up.");
  }
public void setChoice(int i)
  {
	choice = i;
  }
public void playerInstructions()
  {
	System.out.println("OMGOMGOGMOGMOGMGOMG YOU'RE PLAYING A GAME MADE BY TROY STUDENTS IN JAVA?");
	System.out.println("");
	System.out.println("sorry I'm talking to you from the CLASS playerInstructions() and I just can't contain myself. omg omg *AHEM*");
	System.out.println("");
	System.out.println("*dramatic drum-line noises* you are playing a text-based narrative game! ENTER which NUMBER you would like to choose to progress the story. That's it!");
  }
public void playerBeginning()
  {
	System.out.println("Please enter your name:");
	playerName = myScanner.nextLine();
	System.out.println ("Hello" + " " + playerName);
	System.out.println("");
	System.out.println("bzhhhhhh... boooop.... *portal noise*... I AM A ROBOT... crrzztt... PLAYER CREATION IS HARD...");
	System.out.println("");
	System.out.println ("SLAM");
	System.out.println ("1.	wake up	" + "	" + "2.	sleep	" +   "3. what's going on?");
	choice = myScanner.nextInt();

if (choice == 1)
  {
	System.out.println ("hol' up you really wanna be waking up right now?");
	System.out.println("just to let you know you're like. totally. tired.");
	System.out.println("1. seriously I want to get up");
	x = myScanner.nextInt();
	if (x == 1)
	  {
		System.out.println("boop beep bap booob bab");
	  }
  }
if (choice == 2)
  {
	System.out.println ("aaaaaahhhhhhhhh.... you rest your eyes and your consciousness slowly falls away....");
	System.out.println(".	.	.	.	.		.	.	.	.	.	.");
	System.out.println("		 .	 .	 .  . .     .   	.		. 	.	.");
	System.out.println("...				...				...			...");
	System.out.println("");
	System.out.println("");
	System.out.println ("GAME OVER");
	System.out.println("1. lol game's over you broke it. I mean what more choices could I even give you? You're totally asleep and won't move anyway.");
	choice = myScanner.nextInt();
	if (choice == 1)
	{
		System.out.println("start over~");
	}
  }
if (choice ==3)
  {
	System.out.println("fhlsdkjfhalkjh.... I don't want to get up... ... ... ...");
	System.out.println(".	.	.	.	.	.");
	System.out.println("	   .		   .				.");
	System.out.println("	.			   .				.");
	System.out.println("1. shake the lifeless body");
	x= myScanner.nextInt();
      if (x == 1)
	{
	System.out.println("get up  get    up  up u p up pu pu p up up u pu p up u pu p up up up pupu pu pu pu pup up .... ... ... get up");
        System.out.println(".   .       .       .");
	System.out.println(".	    .				.   			.");
	System.out.println("1. shake the lifeless body");
	y = myScanner.nextInt();
	if (y == 1)
	  {
        System.out.println("GET UP");
        System.out.println("ok dude chill. I am now up.");	
	  }
	}
}
}
}
