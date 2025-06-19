public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public int compareTo(Student otherStudent) {

        return this.age-otherStudent.age;

    }


}
