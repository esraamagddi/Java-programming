
// util/SortUtil.java
package packt.addressbook.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUtil {
    public <T> List<T> sortList(List<T> list, Comparator<T> comparator) {
        // Placeholder logic to sort the list
        Collections.sort(list, comparator);
        return list;
    }
}
