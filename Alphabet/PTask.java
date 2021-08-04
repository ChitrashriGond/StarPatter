import java.util.Scanner;
class PTask{
	
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("no of rows");
		int row=scanner.nextInt();
	for(int i=0;i<=row;++i){
			
			for(int j=0;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		row++;
 }
}
