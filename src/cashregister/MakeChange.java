package cashregister;

public class MakeChange {
	public static void main(String[] args) {
		int[] register = { 2000, 1000, 500, 100, 25, 10, 5, 1 };
		int[] cashBack = new int[8];
		String[][] plurals = {
				{"twenty dollar bill","twenty dollar bills"} , {"ten dollar bill","ten dollar bills"} ,
				{"five dollar bill","five dollar bills"} , {"one dollar bill","one dollar bills"} ,
				{"quarter","quarters"} , {"dime","dimes"} , {"nickel","nickels"} , {"penny","pennies"} , 
		};
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Please enter the cost of the item: ");
		double cost = scanner.nextDouble()*100;
		System.out.print("Please enter cash recieved: ");
		double cash = scanner.nextDouble()*100;
		int iCents = (int)(cash-cost);
		scanner.close();
	
		if(iCents<0){
			System.out.println("That is not enough money.");
		}else{
			System.out.print("Your change is ");
			for(int i = 0 ; iCents>0 ; i++){
				cashBack[i] = iCents/register[i];
				iCents = iCents % register[i];
				
				if(cashBack[i]==1){
					System.out.print(cashBack[i]+" "+plurals[i][0]);
				}else if(cashBack[i]>1){
					System.out.print(cashBack[i]+" "+plurals[i][1]);
				}
				
				if(iCents==0 && cashBack[i]==0){
				System.out.print(".");
				}else{
					System.out.print(", ");
				}
			}
			System.out.println("\b\b.");
		}
		
		
		
		
	}

}
