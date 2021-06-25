/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GP65
 */
public class Q10 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(6);
        numbers.add(9);
        numbers.add(8);
        numbers.add(4);
        numbers.add(12);
        numbers.add(20);
        numbers.add(3);
        
        System.out.println("Second Mininum : "+findSecMinimum(numbers));
        
    }
    
    public static int findSecMinimum(List<Integer> numbers){
        quickSort(numbers, 0, numbers.size()-1);
        return numbers.get(1);
    }

    static void swap(List<Integer> nums, int i, int j) {
        int temp = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, temp);
    }

    static int partition(List<Integer> nums, int low, int high) {

        int pivot = nums.get(high);

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (nums.get(j) < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return (i + 1);
    }

    static void quickSort(List<Integer> nums, int low, int high) {
        if (low < high) {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }
}
