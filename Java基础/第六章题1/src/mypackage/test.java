package mypackage;

import java.util.Arrays;

public class test {
    public static void main(String[] args){
        int[] i1 = new int[]{1,2,3,4,5};
        int[] i2 = Arrays.copyOfRange(i1,0,3);
        for(int i = 0; i < i1.length; i++){
            System.out.println(i1[i]);
        }
        for(int i = 0; i < i2.length; i++){
            System.out.println(i2[i]);
        }
    }
}
