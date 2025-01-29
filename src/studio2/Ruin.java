package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Starting amount: ");
		int startAmount = in.nextInt();
		
		System.out.println("Win chance: ");
		double winChance = in.nextDouble();
		
		System.out.println("Win limit: ");
		int winLimit = in.nextInt();
		
		System.out.println("Total simulations: ");
		int totalSimulations = in.nextInt();
		
		int currentAmount = startAmount;
		
		int wins = 0;
		
		int losses = 0;
		

		for (int i = 1; i <= totalSimulations; i++) {
			
			int counter = 0;
			currentAmount = startAmount;
			
			while (currentAmount < winLimit && currentAmount > 0) {
				
				counter ++;
				
				if (winChance < Math.random()) {
					currentAmount --;
				}
				else {
					currentAmount ++;
				}
			}
			
			if (currentAmount == 0) {
				System.out.println("Simulation " + i + ": " + counter + " LOSE");
				losses ++;
			}
			else if (currentAmount == winLimit) {
				System.out.println("Simulation " + i + ": " + counter + " WIN");
				wins ++;
			}		
		}
		System.out.println("Losses: " + losses + " Simulations: " + totalSimulations);
		double ruinRate = losses/totalSimulations;
		System.out.println("Ruin Rate from Simulation: " + ruinRate);
	}
}




