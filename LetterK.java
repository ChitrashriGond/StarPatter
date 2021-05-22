class LetterK{
	public static void main(String[]args){
	int i,j,k,count=6;
		for( i=0; i<=11 ; i++){
			for( j=0; j<1 ; j++){
				
					System.out.print("* ");
			}
				for( k=1; k<=5 ; k++){
					if(k==count)
					{
				System.out.print("*");
		}
				else{
					System.out.print("  ");
				}
				}
				if(i<=5)
				{
				count--;
					}
					else if(i<=11)
			{
			count++;
					}
				
		System.out.println();
		}
	}
}
