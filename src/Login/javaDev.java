package Login;

import java.util.Random;

public class javaDev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rand= new Random();
	

		
		String [] mystudent= {"Ahmad","Ali","Khalil","Laith","Yaser"};
		int mynumber = rand.nextInt(mystudent.length);
		
System.out.print(mystudent[mynumber]);
		
	}

}
