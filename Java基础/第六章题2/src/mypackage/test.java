package mypackage;

public class test {
    public static void main(String[] args){
        int arr[] = new int[]{515,461,431,7641,6796,1649,716,4612,321};
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
