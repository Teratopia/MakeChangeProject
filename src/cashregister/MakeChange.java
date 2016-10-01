package cashregister;

public class MakeChange {
	public static void main(String[] args) {
		int[] register = { 2000, 1000, 500, 100, 25, 10, 5, 1 };
		int[] cashBack = new int[8];
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Please enter the cost of the item: ");
		double cost = scanner.nextDouble()*100;
		System.out.print("Please enter cash recieved: ");
		double cash = scanner.nextDouble()*100;
		int iCents = (int)(cost-cash);
		scanner.close();
	

			for(int i = 0 ; iCents>0 ; i++){
				cashBack[i] = iCents/register[i];
				iCents = iCents % register[i];
			}
				
		System.out.println("Your change is: "+cashBack[0]+" twenties, "+cashBack[1]+" tens, "
				+cashBack[2]+" fives, "+cashBack[3]+" ones, "+cashBack[4]+" quarters, "
				+cashBack[5]+" dimes, "+cashBack[6]+" nickels, "+cashBack[7]+" pennies.");
		
		
		
		
		
	}

}
