
public class PrintingPatterns{
    public static void main(String[] args) {
        //rectanglePattern(5,7);
        //hollowRengtangle(5,7);
        //halfPyramid(5);
        invertedHalfPyramidWithNumbers(5);
    }

    private static void rectanglePattern(int length, int width){
        for (int i = 1; i<= length; i++){
            for (int j = 1; j<= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void hollowRengtangle(int length, int width){
        for (int i = 1; i<= length; i++){
            for (int j = 1; j<= width; j++){
                if(i==1 || i==length || j==1 || j==width){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void halfPyramid(int n){
        for (int i = 1; i<= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedHalfPyramid(int n){
        for (int i = 0; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

// another way => better approch
        for (int i = n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rotatedInvertedHalfPyramid(int n){
        for (int i = 1; i<=n; i++){
            for (int j= 1; j<=n; j++){
                if(j <= n-i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // another way
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
              System.out.print("%");
            }

            for (int j=1; j<=i; j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void halfPyramidWithNumbers(int n){
        for (int i = 1; i<= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void invertedHalfPyramidWithNumbers(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}