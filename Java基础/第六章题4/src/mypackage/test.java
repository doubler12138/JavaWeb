package mypackage;

public class test {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = new int[arr.length][arr.length];
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr2[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {//遍历数组
                System.out.print(arr2[i][j]);//输出数组
            }
            System.out.println();
        }
    }
}
