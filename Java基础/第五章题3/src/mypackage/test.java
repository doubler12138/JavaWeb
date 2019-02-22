package mypackage;

public class test {
    public static void main(String[] args){
        String regex = "^(\\d{11})$";
        if(args[0].matches(regex)){
            System.out.println(args[0] + " is a phone number");
        }else{
            System.out.println(args[0] + " is not a phone number");
        }
    }
}
