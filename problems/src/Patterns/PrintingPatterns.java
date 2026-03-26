
public class PrintingPatterns{
    public static void main(String[] args) {
        hollowRhombus(5);
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

    private static void floyadsTriangle(int n){
        int number = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number +  " ");
                number++;
            }
            System.err.println();
        }
    }

    private static void O1Triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.err.println();
        }
    }


    private static void butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }

    private static void solidRhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            int space = n-i;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }

            // stars
            for(int j=1; j<=n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void hollowRhombus(int n){
        for(int i=1; i<=n; i++){
            //space
            int space = n-i;
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }

            // stars
            for(int j=1; j<=n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}