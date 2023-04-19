package Testing.progect.test2;

public class switch_expression {
    public static void main(String[] args) {
        System.out.println(switchExpression(0));
    }
    public static  int switchExpression(int m){
    int n = 16;
         m = switch( n) {
            case 1,2,3 -> 10;
            case 4,5   ->  20;
            default    ->  { int a=1; yield n+2*a; }
        };
    return m;
    }
}
