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

    public static void main(String[] args) {
        //patternL1(4, 5);
        System.out.println();
        patternL2(7, 10);

    }
}
