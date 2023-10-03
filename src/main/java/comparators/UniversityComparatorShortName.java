package comparators;

import subjects.University;
import org.apache.commons.lang3.StringUtils;

public class UniversityComparatorShortName implements UniversityComparator{
    @Override
    public int compare(University o1, University o2) {
        return StringUtils.compare(o1.getShortName(), o2.getShortName());
    }
}
