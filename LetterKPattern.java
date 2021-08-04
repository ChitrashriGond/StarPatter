import java.util.Scanner;
class LetterK{
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("no of rows");
		int row=scanner.nextInt();
		
		for(int i=0; i<=11 ; i++){
			for(int j=0; j<1 ; j++){
				
					System.out.print("** ");
			}
				for(int k=1; k<=5 ; k++){
					if(k==row)
					{
				System.out.print("**");
		}
				else{
					System.out.print("  ");
				}
				}
				if(i<=5)
				{
				row--;
					}
					else if(i<=11)
			{
			row++;
					}
				
		System.out.println();
		}
	}
}