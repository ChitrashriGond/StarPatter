class LetterD{
	public static void main(String[]args){
	
    for (int i = 0; i < 6; i++) {
       System.out. print("*");
        for (int j = 0; j < 6; j++) {
            if ((i == 0 || i ==6 - 1)&& j < 6 - 1)
               System.out. print("*");
            else if (j == 6 - 1 && i != 0
                     && i != 6 - 1)
               System.out. print("*");
            else
                System.out.print(" ");
        }
       System.out.println();
    }
}
  
	}

	