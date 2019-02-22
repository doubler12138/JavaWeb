package mypackage;

public class test {
    public static void main(String[] args){
        String x = args[0];
        if( x == "0"){
            System.out.println(args[1] + " toLowerCase is:");
            System.out.println(args[1].toLowerCase());
        }else{
            System.out.println(args[1] + " toUpperCase is;");
            System.out.println(args[1].toUpperCase());
        }
    }
}
