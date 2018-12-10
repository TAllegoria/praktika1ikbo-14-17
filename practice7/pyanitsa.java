import java.util.ArrayDeque;
import java.util.Scanner;

public class pyanitsa {

    public static void main(String Args[]){
        Scanner in = new Scanner(System.in);
        ArrayDeque<Integer> first = new ArrayDeque<>();
        ArrayDeque<Integer> second = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 4; i++){
            first.add(in.nextInt());
            if (first.getLast() > max){
                max = first.getLast();
            }
            if (first.getLast() < min){
                min = first.getLast();
            }
        }
        System.out.println();
        for (int i = 0; i <= 4; i++){
            second.add(in.nextInt());
            if (second.getLast() > max){
                max = second.getLast();
            }
            if (second.getLast() < min){
                min = second.getLast();
            }
        }
        System.out.println();

        int step = 1;
        do {
            if (first.getFirst() > second.getFirst() &&
                    ((first.getFirst() != max)) && (second.getFirst() != min)){
                first.add(first.removeFirst());
                first.add(second.removeFirst());
            } else {
                second.add(first.removeFirst());
                second.add(second.removeFirst());
            }
            /* System.out.println(first.toString());
            System.out.println(second.toString());
            System.out.println(); */
            if (first.size() == 10) {
                System.out.println("first " + step);
                break;
            }
            if (second.size() == 10) {
                System.out.println("second " + step);
                break;
            }
            step++;
        } while (step <= 106);
        if (step == 105) {
            System.out.println("botva");
        }
    }
}
