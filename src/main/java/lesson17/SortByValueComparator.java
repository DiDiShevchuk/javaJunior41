package lesson17;

import java.util.Comparator;

public class SortByValueComparator implements Comparator<Xolodilnik> {
    @Override
    public int compare(Xolodilnik o1, Xolodilnik o2) {
        if(o1.getValueForComparator() != o2.getValueForComparator()){
           return o1.getValueForComparator() - o2.getValueForComparator();
        }
        return Integer.compare(o1.valueForComparator, o2.valueForComparator);
    }
}
