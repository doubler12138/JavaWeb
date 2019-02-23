package mypackage;
import java.util.Arrays;

public class test {
    public static void main(String[] args){
        String[] s1 = new String[]{"aa","bb","cc","dd"};
        for(int i = 0; i < s1.length; i++){
            System.out.println(s1[i]);
        }
        Arrays.fill(s1,2,3,"bb");
        for(int i = 0; i < s1.length; i++){
            System.out.println(s1[i]);
        }
    }
}
