class LetterR{
	public static void main(String[]args){
	
    int n = 7;       
    int half = (n / 2);
	int b=(2*n)-1;
    for (int i = 0; i < n; i++) {
        System.out.print("*");
        for (int j = 0; j < b; j++) {
            if ((i == 0 || i == half)&& j < (b- 2))
                System.out.print("*");
            else if (j == (b - 2)
                    && !(i == 0 || i == half))
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
	}
}