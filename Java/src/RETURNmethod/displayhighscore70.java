package RETURNmethod;

public class displayhighscore70 {

	public static void main(String[] args) {
		int x = calculatehighscoreposition(1500);
    displayhighscore("joe",x);
    calculatehighscoreposition(1000);
	}
   public static void displayhighscore(String name, int highscoreposition) {
	   System.out.println(name+ "managed to get higher position" + highscoreposition + "on the high score table");
   }
   public static int calculatehighscoreposition(int playerscore) {
	   if (playerscore>=1000) {
		   return 1;
		   
	   }else if(playerscore>=500 && playerscore<1000) {
		   return 2;
		   
		   
	   }else if(playerscore>=100 && playerscore<500) {
		   return 3;
		   
	   }else {
		   return 4;
	   }
   }
}
