package mypackage;

public class test {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder(args[0]);
        for(int i = 1; i <=10; i++){
            builder.append(i);
        }
        System.out.println(builder);
    }
}
