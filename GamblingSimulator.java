
public class GamblingSimulator{

		public static final int STARTING_BET_STAKE = 100;
		public static final int MINIMUM_BET_PER_GAME = 1;
		public static final int MAXIMUM_DAY = 30;




		public void gamblingPerDaySituation(){
        		double random_num = Math.random();
        		int remn_stake = STARTING_BET_STAKE;
        		if (random_num>0.5){
            			remn_stake += MINIMUM_BET_PER_GAME;
            			System.out.println("The Gambler wins the bet and he has $"
            				+remn_stake+ " with him after one bet.");
        		}else{
            			remn_stake -= MINIMUM_BET_PER_GAME;
            			System.out.println("The Gambler loses the bet and he has $"
            				+remn_stake+ " with him after one bet.");
        		}
			return;
    		}

		public void gamblingConditionForGame(){
        		double max_margin = STARTING_BET_STAKE + (0.5*STARTING_BET_STAKE);
        		double min_margin = STARTING_BET_STAKE - (0.5*STARTING_BET_STAKE);
        		double avail_amt = STARTING_BET_STAKE;
        		while ((avail_amt<max_margin) && (avail_amt>min_margin)){
            			double random_num = Math.random();
            			if (random_num>0.5){
                			avail_amt += MINIMUM_BET_PER_GAME;
            			}else if (random_num<=0.5){
                			avail_amt -= MINIMUM_BET_PER_GAME;
            			}
        		}
        		System.out.println("The gambler resigns for the day after he has $"
        			+ avail_amt + " with him.");
			return;
    		}
	 public static void main(String[] args){
		GamblingSimulator player = new GamblingSimulator();
		player.gamblingPerDaySituation();
		player.gamblingConditionForGame();
	}
}
