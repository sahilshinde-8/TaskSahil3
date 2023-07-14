import java.util.Scanner;
class Island{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the direction right or left ");
		String direction = sc.next();
		if(direction.equalsIgnoreCase("left")){
			System.out.println("Enter the Activity wait or Swin ");
			String activity = sc.next();
			if(activity.equalsIgnoreCase("wait")){
				System.out.println("Enter the Door  color Red, Blue, Yellow or Anything else ");
				String door = sc.next();
				if(door.equalsIgnoreCase("red"))
				{
					System.out.println("Burned by fire");
				}
				else if(door.equalsIgnoreCase("blue")){
					System.out.println("eaten by beassts");
				}	
				else if(door.equalsIgnoreCase("yellow")){
					System.out.println("YOu Win");
				}
				else{
					System.out.println("Game Over");
				}
				
			}
			else{
				System.out.println("Attacked by trout");
		}
		}
		else{
			System.out.println("Fall into a hole");
			}
	}
}