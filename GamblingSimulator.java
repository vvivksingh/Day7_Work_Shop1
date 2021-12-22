
public class GamblingSimulator{
		//Use Case 1

		public static final int STARTING_BET_STAKE = 100;
		public static final int MINIMUM_BET_PER_GAME = 1;




		//Use case 2
		public void gamblingPerDaySituation(){
        		double random_num = Math.random();
        		int remn_stake = STARTING_BET_STAKE;
        		if (random_num>0.5){
            			remn_stake += MINIMUM_BET_PER_GAME;
            			System.out.println("The Gambler wins the bet and he has $"+remn_stake+ " with him after one bet.");
        		}else{
            			remn_stake -= MINIMUM_BET_PER_GAME;
            			System.out.println("The Gambler loses the bet and he has $"+remn_stake+ " with him after one bet.");
        		}
			return;
    		}

		//Use Case 3
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

		//Use Case 4
    		public void gamblingFor20Days(){
			// Assume 100 bets played every day
        		int NO_OF_BETS = 100;
        		//margin = 50%
        		double max_margin = (0.5*STARTING_BET_STAKE);
        		double min_margin = -(0.5*STARTING_BET_STAKE);
        		double tot_amt_won_lost = 0;

        		// Game played for 20 days
        		for (int i=0;i<20;i++){
            			double daily_amt_won_lost = 0;
            			int bets_played = 0;

            			// Everyday game stops at 50% margin
            			while ((daily_amt_won_lost<max_margin) && (daily_amt_won_lost>min_margin)&& (bets_played < NO_OF_BETS)){
                		double random_num = Math.random();
                			bets_played++;

		                	if (random_num>0.5){
                    				daily_amt_won_lost += MINIMUM_BET_PER_GAME;
                			}else if (random_num<=0.5){
                    				daily_amt_won_lost -= MINIMUM_BET_PER_GAME;
                			}
            			}
            			tot_amt_won_lost += daily_amt_won_lost;
        		}

        		// Print total amount won or last in 20 days
        		if (tot_amt_won_lost>0){
            			System.out.println("The total amount won in 20 days = "+ tot_amt_won_lost);
        		}
        		else if (tot_amt_won_lost==0){
            			System.out.println("There is no net gain in last 20 days");
        		}
        		else{
            			System.out.println("The total amount lost in last 20 days = "+ Math.abs(tot_amt_won_lost));
        		}
    		}
       	 public static void main(String[] args){
		GamblingSimulator player = new GamblingSimulator();
		player.gamblingPerDaySituation();
		player.gamblingConditionForGame();
		player.gamblingFor20Days();
	}
}
