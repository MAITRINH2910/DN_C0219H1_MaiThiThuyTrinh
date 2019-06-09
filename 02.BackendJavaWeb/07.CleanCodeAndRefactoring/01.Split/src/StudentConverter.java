public class StudentConverter {

    private static final int NAMEPART = 0;
    private static final int AGEPART = 1;
    private static final int YEARPART = 2;
    private static final String SPLIT_REGEX = "\\s";

    private static Student convertStudent (String StudentText) {

        String[] word = StudentText.split(SPLIT_REGEX);
        Student student = new Student();
        student.setName(word[NAMEPART]);
        student.setAge(Integer.parseInt(word[AGEPART]));
        student.setYear(Integer.parseInt(word[YEARPART]));
        return student;

    }
}
