package comparators;

import subjects.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityComparatorFullName implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getFullName(), o2.getFullName());
    }
}
