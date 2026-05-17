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
    public static void main(String[] args) {
        //patternL1(4, 5);
        //patternL2(7, 10);
        patternL3(5);
    }
}
