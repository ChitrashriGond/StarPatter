class LetterW{
	public static void main(String[]args){

     int h =8;
     int c = h / 2;
		for (int i = 0; i < h; i++){
        System.out.print("*");
        for (int j = 0; j <= h; j++){
            if (j == h)
                System.out.print("*");
            else if ((i >= h / 2)
                    && (j == c
                    || j == h - c - 1))
                System.out.print("*");
            else
                System.out.print(" ");}
        if (i >= h/ 2)
        {
            c++;
        }
        System.out.println();
		}
    }
}