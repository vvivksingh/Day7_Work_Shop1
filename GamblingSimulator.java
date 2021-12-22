public class GamblingSimulator{

		public static final int STARTING_BET_STAKE = 100;
		public static final int MINIMUM_BET_PER_GAME = 1;
		public static final int MAXIMUM_DAY = 30;


		public void gamblingSituationProblemUC2(){
        		double random_num = Math.random();
        		int remn_stake = STARTING_BET_STAKE;
        		if (random_num>0.5){
            			remn_stake += STARTING_BET_STAKE;
            			System.out.println("The Gambler wins the bet and he has $"
            				+remn_stake+ " with him after one bet.");
        		}else if (random_num<=0.5){
            			remn_stake -= STARTING_BET_STAKE;
            			System.out.println("The Gambler loses the bet and he has $"
            				+remn_stake+ " with him after one bet.");
        		}
    		}
	public static void main(String[] args){

	}
}
