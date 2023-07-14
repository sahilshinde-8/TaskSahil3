import java.util.Scanner;
class Water{
	public static void main(String args[]){
		System.out.println("Read No of units consumed ");
		Scanner sc = new Scanner(System.in);
		int metercharger = 75;
		int unitconsume = sc.nextInt();
		int charge = 0;
		
		if(unitconsume <= 100){
			charge = unitconsume * 5;
			int total = charge + metercharger;
			System.out.println("Total Water Bill " + total);
			}
		else{
		if(unitconsume <= 250){
			charge = unitconsume * 10;
			int total = charge + metercharger;
			System.out.println("Total Water Bill " + total);
			}
			
		else{
			charge = unitconsume * 20;
			
			int total = charge + metercharger;
			System.out.println("Total Water Bill " + total);
		}
			}
			}
}
