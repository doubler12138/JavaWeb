package mypackage;

public class test {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        if(x%2 == 0){
            System.out.println(args[0] + "是偶数");
        }else{
            System.out.println(args[0] + "是奇数");
        }
    }
}