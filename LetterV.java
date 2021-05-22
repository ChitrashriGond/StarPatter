class LetterV{
	public static void main(String[]args){
	
	 int h=8;
     int c = 0;
	 int b =15;
    for (int i = 0; i < h; i++) {
        for (int j = 0; j <= b; j++) {
            if (j == c|| j == b - c - 1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        c++;
        System.out.println();
    }
}

}	