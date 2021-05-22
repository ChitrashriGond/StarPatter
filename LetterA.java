
import java.util.Scanner;
class LetterA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LetterA a = new LetterA();
      
    int row = sc.nextInt();
       
        for (int i = 0; i < row; i++) {
 
            for (int j = 0; j <= row / 2; j++) {
 
             
                if ((j == 0 || j == row / 2) && i != 0 ||
 
                    
                    i == 0 && j != 0 && j != row / 2 ||
 
                    
                    i == row / 2)
 
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
 
            System.out.println();
	}
   }
 }
 

 