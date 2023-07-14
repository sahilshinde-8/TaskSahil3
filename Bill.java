import java.util.Scanner;

class Bill{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Height ");
		int height = sc.nextInt();
		int x = 0;
		if(height < 120){
			System.out.println("Can't ride ");
		}
		else{
			System.out.println("Can Ride ");
	
			System.out.println("Enter your age ");
			int age = sc.nextInt();
			if(age < 12){
				//System.out.println("+$5 ");
				x += 5;
			}
			else if( 18 > age && age >= 12){
				//System.out.println("+$7 ");
				x += 7;
			}
			else if ( 45 > age && age >= 18){
				//System.out.println("+$12 ");
				x += 12;
			}
			else if (55 > age && age >= 45){
				//System.out.println("+$0 ");
				x += 0;
			}
			else{
				System.out.println("Invalid Input ");
			}
			System.out.println("Want Photos? ");
			Scanner n = new Scanner(System.in);
			String photos = n.nextLine();
			if(photos.equalsIgnoreCase("No")){
				System.out.println("The Total bill is " + "$" + x);
			}
			else if(photos.equalsIgnoreCase("Yes")){
				x += 3;
				System.out.println("The Total bill is " + "$" + x);
			}
			else{
				System.out.println("Invalid Input ");
			}
		}
	}
}
		
	
	
	
	