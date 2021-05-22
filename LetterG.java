class LetterG{
	public static void main(String[]args){
		for(int i=1; i<=10 ; i++){
			for(int j=1; j<=1 ; j++){
				
					System.out.print("*");
			}
				for(int k=1; k<=5 ; k++){
					if(i>=0&& i<2||i>4&&i<7&&k>3&&k<=5||i>=6&&i<=9&&k==5||i>9&&i<=10)
			{
				System.out.print("*");
			}
				else{
					
			System.out.print(" ");
				}
					}
		System.out.println();
		}
	}

}