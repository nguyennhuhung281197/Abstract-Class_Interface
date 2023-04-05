package comparator;

import comparable.Circle;
import comparable.ComparableCircle;

import java.util.Comparator;

public class CircleComparator implements Comparator<ComparableCircle> {
    @Override
    public int compare(ComparableCircle o1, ComparableCircle o2) {
        if (o1.getRadius() > o2.getRadius()){
            return 1;
        }else if (o1.getRadius() < o2.getRadius()){
            return -1;
        }
        return 0;
    }
}
