package lesson4;

public class Main7 {
    public static void main(String[] args) {
        int[][] nums = new int[8][8];

        for (int i = 0; i < nums.length / 2; i++) {
            for (int j = nums[i].length - 1; j >= 0; j--) {
                if (i >= j) { //левый верхний треугольник
                    nums[i][j] = Integer.parseInt("1");
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            for (int j = 0; j < nums[i].length; j++) {
                if (i >= j) {  // правый верхний треугольник
                    nums[i][j] = Integer.parseInt("1");
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
/*
        for(int i = nums.length - 1; i >= nums.length; i--){
            for (int j = 0; j >= 0; j--){
                //nums[i][j] = Integer.parseInt("1");
                if(i >= j){
                    System.out.print(nums[i][j] + " ");
                }else {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        } */
    }
}
