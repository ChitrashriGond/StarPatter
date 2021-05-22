class LetterY{
 public static void main(String[]args){

int c= 0;
int h= 8;
int b= 15;
    for (int i = 0; i <h; i++) 
    {
        for (int j = 0; j <= b; j++) 
        {
            if (j == c || j == h- c && i<=h/2)
                System.out.print("*");
            else
                System.out.print(" ");
        }
       
        System.out.println();
		if (i < h/ 2)
            c++;
    }
}
}