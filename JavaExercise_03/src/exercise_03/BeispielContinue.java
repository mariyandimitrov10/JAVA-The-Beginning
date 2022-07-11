package exercise_03;

public class BeispielContinue{
	
	public static void main(String[] args){

		for (var i = 1; i <= 10; i++){ 
			if (i == 5) {
                            continue;
                        }
			System.out.println(i);
		}
	}
}