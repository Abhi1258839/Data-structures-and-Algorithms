public class Pattern {
    public static void patternL1(int r, int c){
        for(int i =0;i <r;i++){
            for(int j = 0; j < c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        patternL1(4, 5);
    }
}
