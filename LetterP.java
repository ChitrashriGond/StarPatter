class LetterP{
	public static void main(String[]args){

     int n=7;
        for (int i = 0; i < n; i++){
        System.out.printf("*");
          for (int j = 0; j <n; j++){
            if ((i == 0 || i == n / 2)
                && j < n - 1)
                System.out.print("*");
		  else if (i < n / 2&& j == n - 1 && i != 0)
                System.out.print("*");
		    else
                System.out.print(" ");
        }
        System.out.println();
		}
    }
}