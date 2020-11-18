package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> field = new ArrayList<>();
        System.out.print("Enter array length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Random random = new Random();

        for (int i = 0; i < length; i++){
            int num = random.nextInt(100);
            if (num%2==1){
                --i;
                continue;
            }
            field.add(num);
            System.out.print(field.get(i)+" ");
        }

        int i = 0;
        int max = 0;
        int maxNum = 0;
        while (i < length){
            int count = 0;
            int look = field.get(i++);
            for (Integer num : field){
                if (num == look){
                    count -= -1;
                }
                if (count > max) {
                    max = count;
                    maxNum = look;
                }
            }
        }
        System.out.println();
        System.out.println("Number: " + maxNum + " was in field " + max + " times.");
    }

}
