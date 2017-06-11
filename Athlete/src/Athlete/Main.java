package Athlete;

public class Main {

    public static void main(String[] args) {
	 Quarterback FootbballPlayer1 = new Quarterback("George","football",48,14);
	 FootbballPlayer1.updateScore(1);
	 Golfer GolfPayer1=new Golfer("Tim","golf",9);


	 System.out.println(FootbballPlayer1.getName().toString()+" is playing "+FootbballPlayer1.getSport());
//	 System.out.print(FootbballPlayer1.getName().toString()+"'s Score was "+FootbballPlayer1.updateScore(3));
	 System.out.println(GolfPayer1.getName().toString()+"'s stroke is "+GolfPayer1.determinePoint("bogey",2));
    }
}
