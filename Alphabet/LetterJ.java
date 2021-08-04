class LetterJ{
	public static void main(String[]args){
	
		for(int i=1; i<=8 ; i++){
			for(int j=1; j<=7 ; j++){
				if(i>=1&& i<2||i>=2&&i<=8&&j==3||i>7&&i<=9&&j==1||i>9&&i<=11&&j<=3){
					System.out.print("*");
				}
				else{
					
			System.out.print("  ");
				}

		}
		System.out.println();
		}
	}

}	