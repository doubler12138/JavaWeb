package mypackage;

public class test {
    public static void main(String[] args){
        int leng = Integer.parseInt(args[0]);
        int x = leng/2 + 1;
        for( int i = 1; i <= x; i++){
            for( int j = 1; j <= x-i ; j++){
                System.out.print(" ");
            }
            for( int k = 1; k <= 2*i-1 ; k++){//找规律，i是 1 3 5 7 9基数
                System.out.print('*');
            }
            System.out.println();
        }
        for( int i = 1; i <= x-1; i++){
            for( int j = 1;j <= i; j++){
                System.out.print(" ");
            }
            for( int k = 1; k <= 2*(x - i)-1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
