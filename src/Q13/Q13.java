package Q13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GP65
 */
public class Q13 {
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(12);
        numbers.add(1);
        
        int number = 11;
        System.out.println(checkSum(number, numbers));
        System.out.println("----------------------------------");
        for (Integer number1 : numbers) {
            System.out.println("number : " + number1);
        }
    }
    
    public static boolean checkSum(int number, List<Integer> numbers) {
        quickSort(numbers, 0, numbers.size()-1);
        for (int i = 0, j = numbers.size() - 1; i < j;) {
            int sum = numbers.get(i) + numbers.get(j);
            if (sum < number) {
                i++;
            } else if (sum > number) {
                j--;
            } else {
                return true;
            }
        }
        return false;
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
