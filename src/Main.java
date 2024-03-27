public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("sds", "hrc", "s432423", "432423@pjwstk.edu.pl",
                "s432423.pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student2 = new Student("sgy", "htd", "s46345", "46345@pjwstk.edu.pl",
                "s46345.pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student3 = new Student("dfg", "daa", "s49583", "49583@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student4 = new Student("dfd", "dfsa", "s234234", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        Student student5 = new Student("fsda", "dsa", "s234234", "s234234@pjwstk.edu.pl",
                ".pjwstk.edu.pl", new double[]{5.0, 5.5, 4.0, 3.5});
        StudentGroup studentGroup = new StudentGroup("group1", new Student[]{student1, student2, student3,
                student4});
        System.out.println(student1.countAGP());
        studentGroup.addStudent(student5);
        System.out.println(studentGroup.students.length);
        for(int i = 0; i < studentGroup.students.length; i++) {
            System.out.println(studentGroup.students[i]);
        }
    }
}