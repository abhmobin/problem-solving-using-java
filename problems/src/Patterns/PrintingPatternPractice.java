class PrintingPatternPractice {
    public static void main(String[] args) {
        //
    }

    private static void rectangle(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=7; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void hollowRectangle(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=7; j++){
                if ( i==1 || i== 5 || j==1 || j==7) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void halfPyramid(int n){
        for(int i = 1; i <=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedHalfPyramid(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rotatedInvertedHalfPyramid(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}