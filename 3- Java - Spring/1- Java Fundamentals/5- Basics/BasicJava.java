import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BasicJava {
    public void print1To255() {
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void printOdd1To255() {
        for (int i = 1; i < 256; i += 2) {
            System.out.println(i);
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 1; i < 256; i++) {
            sum += i;
            System.out.println("New Number:" + i + "Sum= " + sum);
        }
    }

    public void iterateArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max is " + max);
    }

    public void getAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / arr.length;
        System.out.println("Average is " + average);
    }

    public void arrayOddNumbers() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 256; i += 2) {
            list.add(i);
        }
        System.out.println(list);
    }

    public void greaterThanY(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public void squareTheValues(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
            list.add(arr[i]);
        }
        System.out.println(list);
    }

    public void eliminateNegativeNumbers(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            list.add(arr[i]);
        }
        System.out.println(list);
    }

    public void maxMinAvg(int[] arr) {
        double sum = 0;
        double max = arr[0];
        double min = arr[0];
        ArrayList<Double> newArr = new ArrayList<Double>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        double average = (sum / arr.length);
        Collections.addAll(newArr,min, max, average);
        System.out.println(newArr);
    }

    public void shiftingValues(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                newArr.add(0);
            }
            else{
                newArr.add(arr[i+1]);
            }
        }
        System.out.println(newArr);
    }
}
