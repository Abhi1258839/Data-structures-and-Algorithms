public class Pattern {
    public static void patternL1(int r, int c){
        for(int i =0;i <r;i++){
            for(int j = 0; j < c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternL2(int r, int c){
        for(int i =0;i <r;i++){
            for(int j = 0; j < c; j++){
                if(i == 0 || i == r-1 || j == 0 || j == c-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void patternL3(int r){
        for(int i =0;i <r;i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternL4(int r){
        for(int i =1;i <=r;i++){
            for(int j= r-i; j>0;j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void patternL5(int r){
        for(int i =1;i <=r;i++){
            for(int j= 1; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void patternL6(int r){
        int number = 1;
        for(int i =1;i <=r;i++){
            for(int j= 1; j<=i;j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //patternL1(4, 5);
        //patternL2(7, 10);
        //patternL3(5);
        //patternL4(10);
        //patternL5(10);
        //patternL6(5);

    }
}
