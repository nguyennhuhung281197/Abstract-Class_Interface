package comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle [] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(4,"black",false);

        System.out.println("Pre-sorted : ");
        for (ComparableCircle circle : circles){
            System.out.println(Arrays.toString(new ComparableCircle[]{circle}));
        }
        Arrays.sort(circles);

        System.out.println("After-sorted :");
        for (ComparableCircle circle : circles){
            System.out.println(Arrays.toString(new ComparableCircle[]{circle}));
        }

    }
}
