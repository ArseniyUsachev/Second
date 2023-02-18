public class Instructor {
    private String name;

    private Student[] students = new Student[3];

    public Instructor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    void setStudent(int num, Student student) {
        if (num >= 0 || num < 3) {
            students[num] = student;
        }

    }

    void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getName() + " Age: " + students[i].getAge() + " Average result: " + students[i].getAverageResult());


        }
    }


}
