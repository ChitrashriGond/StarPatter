class LetterI{
	public static void main(String[]args){
	
		for(int i=1; i<=8 ; i++){
			for(int j=1; j<=10 ; j++){
				if(((i==1||i==8)&& j%2==1)|| j==10/2)
					System.out.print("*");
			else
					System.out.print(" ");
			}	
					System.out.println();
		}
	}
}  