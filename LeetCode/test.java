package LeetCode;//package LeetCode;//package LeetCode;
////
////import java.lang.reflect.Array;
////import java.util.Arrays;
//////
//////public class test {
//////    public static void main(String[] args) {
//////        int[] arr = {1, 2, 3, 4,23,3,23,234,2342,342,2};
//////        int value = 5;
//////        System.out.println(isPresent(arr, value));
//////    }
//////
//////    static boolean isPresent(int[] arr, int value) {
//////        for (int num: arr){
//////            if (value == num) {
//////                return true;
//////            }
//////        }
//////        return false;
//////    }
//////}
////public class test {
////    public static void main(String[] args) {
////        int[][] arr =   {{1, 2, 3},
////                        {4, 5, 6,},
////                        {7, 8, 9}};
////
////        int target = 9;
////        System.out.println(Arrays.toString(isPresent(target, arr)));
////    }
////
////    static int[] isPresent(int target, int[][] arr) {
////        for(int row=0; row<arr.length; row++){
////            for (int col=0; col<arr[row].length; col++){
////                if (arr[row][col] == target){
////                    return new int[] {row, col};
////                }
////            }
////        }
////        return new int[] {-1, -1};
////    }
////}
//
//public class test {
//    public static void main(String[] args) {
//        int[][] matrix = {{1, 2,5},
//                {4, 5, 6,},
//                {7, 8, 9}};
//        System.out.println(matrix.length);
////        int[][] result = new int[matrix.length][matrix.length];
////        for(int row = 0; row < matrix.length; row++){
////            for (int col = 0; col < matrix.length; col++){
////                result[row][col] = matrix[col][row];
////            }
////
//
//    }
//}

//public class test {
//    public static void main(String[] args) {
//        pattern(5);
//    }
//
//    static void pattern(int a){
//        int i = a;
//        while(i >= 0){
//            int j = 0;
//            while ( j < i){
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//            i--;
//        }
//    }
//}


import java.util.ArrayList;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int l = nums.length - 1;
        int mid = (s + l) / 2;

        while (s < l){
            if (target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                s = mid + 1;
            }else{
                l = mid - 1;
            }
        }
        return mid;
    }
}

public class test {
    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int l = nums.length - 1;
        int ans = 0;
        while (s <= l){
            int mid = (s + l) / 2;
            if (target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                s = mid + 1;
                ans = s;
            }else{
                l = mid - 1;
                ans = l + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]){
//        System.out.println(checkArray(new int[]{2, 3, 5, 3}, 0));
//        int[] arr = {1, 2, 3, 4, 5};
//        int target = 9;
//        System.out.println(linearSearchUsingRecursion(arr,  0, arr.length - 1, target));
        System.out.println(testArrayList(0, new ArrayList<Integer>()));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String operation : operations) {
            if (operation.equals("--X") || operation.equals("X--")) {
                ans--;
            } else {
                ans++;
            }
        }
        return ans;
    }


    public static boolean checkArray(int[] arr, int index){
        if (index == arr.length - 1){
            return true;
        }
        boolean check = arr[index] < arr[index + 1];
        if (check) {
            return checkArray(arr, index + 1);
        }
        return false;
    }


    public static boolean linearSearchUsingRecursion(int[] arr, int s, int e, int target){
        if (s > e){
            return false;
        }
        int mid = (s + e) / 2;
        if (arr[mid] == target){
            return true;
        }else if(arr[mid] > target){
            return linearSearchUsingRecursion(arr, s, mid - 1, target);
        }
        return linearSearchUsingRecursion(arr, mid + 1, e, target);
    }


    public static ArrayList<Integer> testArrayList(int i, ArrayList<Integer> list){
        if (i == 10){
            return list;
        }
        list.add(i);
        return testArrayList(i+1, list);
    }
}

