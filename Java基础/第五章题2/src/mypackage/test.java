package mypackage;

public class test {
    public static void main(String[] args){
        int begin = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        String str1 = args[2].substring(begin,end);
        String str2 = args[3].substring(begin,end);
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(args[2] + "from " + args[0] + " to " + args[1] + " is equql to " + args[3] );
        }else{
            System.out.println("Not equals");
        }
    }
}
