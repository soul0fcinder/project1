package util;

import comparators.*;
import subjects.StudentComparatorType;
import subjects.UniversityComparatorType;

public class ComparatorUtil {

    private ComparatorUtil() {
    }

    public static StudentComparator getStudentComparator(StudentComparatorType studentComparatorType) {

        switch (studentComparatorType) {

            case UNIVERSITY_ID:
                return new StudentComparatorUniID();
            case FULL_NAME:
                return new StudentComparatorFullName();
            case COURSE:
                return new StudentComparatorCCN();
            case AVG_SCORE:
                return new StudentComparatorAVG();
            default:
                return new StudentComparatorFullName();
        }
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorType universityComparatorType) {

        switch (universityComparatorType) {

            case ID:
                return new UniversityComparatorID();
            case FULL_NAME:
                return new UniversityComparatorFullName();
            case SHORT_NAME:
                return new UniversityComparatorShortName();
            case MAIN_PROFILE:
                return new UniversityComparatorMainProfile();
            case YEARS_OF_FOUNDATION:
                return new UniversityComparatorYears();
            default:
                return new UniversityComparatorFullName();
        }
    }
}
