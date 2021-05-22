class LetterO{
 public static void main(String[]args){
   

    int h = 5;
    int s = (h / 3);
    int b = h / 2 + h / 5 + s + s;
    for (int i = 0; i < h; i++)  {
        for (int j = 0; j <= b; j++) {
            if (j == b - (s)
                || j == (s))
                System.out.printf("*");
            else if ((i == 0
                    || i == h - 1) && j > 
					(s) && j < b - (s))
                System.out.print("*");
            else
                System.out.print(" ");
        }
        if (s != 0 && i < h / 2) 
        {
            s--;
        }
        else if (i >= (h / 2 + h / 5))
            s--;
        System.out.println();
    }
}
}
  