package lesson4;

public class Main5 {
    public static void main(String[] args) {
        // верхний треугольник
        int[][] nums = new int[8][8];
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[i].length; j++){
                if(i < j){
                    nums[i][j] = Integer.parseInt("1");
                    System.out.print(nums[i][j] + " ");
                } else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
