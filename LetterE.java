class LetterE{
	public static void main(String[]args){
	
		for(int i=1; i<=8 ; i++){
			for(int j=1; j<=4 ; j++){
				if(j==1||i==1||i==8/2||i==8)
					System.out.print(" * ");
			else
					System.out.print(" ");
			}	
					System.out.println();
		}
	}
}