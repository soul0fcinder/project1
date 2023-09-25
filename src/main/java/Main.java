import Comparators.StudentComparator;
import Comparators.UniversityComparator;
import Subjects.StudentComparatorType;
import Subjects.UniversityComparatorType;
import Util.UtilClass;
import Subjects.Student;
import Subjects.University;
import Util.ComparatorUtil;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<University> universities =
                UtilClass.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator =
                ComparatorUtil.getUniversityComparator(UniversityComparatorType.YEARS_OF_FOUNDATION);
        universities.stream()
                .sorted(universityComparator)
                .forEach(System.out::println);

        List<Student> students =
                UtilClass.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator =
                ComparatorUtil.getStudentComparator(StudentComparatorType.AVG_SCORE);
        students.stream()
                .sorted(studentComparator)
                .forEach(System.out::println);
    }
}