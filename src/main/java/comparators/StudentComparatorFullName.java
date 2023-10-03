package comparators;

import subjects.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentComparatorFullName implements StudentComparator{

    @Override
    public int compare(Student o1, Student o2) {
        return StringUtils.compare(o1.getFullName(), o2.getFullName());
    }
}
