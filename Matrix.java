import java.util.Scanner;

class Matrix{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No of Rows of 1st Matrix");
		int i1 = sc.nextInt();
		System.out.println("Enter the No of Column of 1st Matrix");
		int i2 = sc.nextInt();
		System.out.println("Enter the No of Rows of 2nd Matrix");
		int j1 = sc.nextInt();
		System.out.println("Enter the No of Column of 2nd Matrix");
		int j2 = sc.nextInt();
		
		int [][] a = new int[i1][j1];
		int [][] b = new int[i2][j2];
		int [][] c = new int[i1][j2];
		
		for(int i=0; i < i1; i++){
				for(int j=0; j<j1; j++){
					System.out.println("In 1st Matrix Enter the Value of " +i +" and " + j + " position");
					a[i][j] = sc.nextInt();
					//System.out.println(a[i][j] + " ");
				}
		}
		for(int i=0; i < i2; i++){
			for(int j=0; j<j2; j++){
				System.out.println("In 2nd Matrix Enter the Value of " +i +" and " + j + " position");
				b[i][j] = sc.nextInt();
				//System.out.print(b[i][j] + " ");
			}
		}			
		for(int i=0; i < i2; i++){
			for(int j=0; j<j2; j++){
		c[i][j] = 0;
		
			
		 for (int k = 0; k < j1; k++) {
          c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
        
        }
		System.out.print(c[i][j] + " ");
		}
	
	System.out.println();
		}
	}

}