public class main {
    public static void main(String[] args) {
        Student student = new Student("Ivan Ivanov Ivanovich", "2", 4, 4.5F);
        University university = new University("5", "DelovoyOchenOchenMydri", "DOOM", 2024, StudyProfile.PROGRAMMER);

        System.out.println(student);
        System.out.println(university);
    }
}
