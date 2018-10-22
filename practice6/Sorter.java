package practice6;

import java.util.Random;

public class Sorter {

    public static void sort(Student[] arr){     //insertion sort
        for (int i = 1; i < arr.length; i++) {
            Student currElem = arr[i];
            int prevKey = i - 1;
            while (prevKey >= 0 && arr[prevKey].getID() > currElem.getID()) {
                arr[prevKey + 1] = arr[prevKey];
                prevKey--;
            }
            arr[prevKey + 1] = currElem;
        }
    }

    public static void main(String[] args) {
	    final Random random = new Random();

	    Student[]iDNumber = new Student[10];
	    for (int i = 0; i < 10; i++) {
	        iDNumber[i] = new Student(random.nextInt(2219));
            System.out.print(iDNumber[i].getID() + " ");
        }

        sort(iDNumber);

        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(iDNumber[i].getID() + " ");
        }
    }
}
