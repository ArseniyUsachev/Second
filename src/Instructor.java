public class Instructor {
    private int age;
    private String name;

    public Instructor(int age, String name) {
        this.age = age;
        this.name = name;
        }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private Student[] students = new Student[3];

    void setStudent(int num, Student student) {
        if (num >= 0 || num < 3) {
            students[num] = student;
        }

    }

    void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].getName() + "Age: "students[i].getAge() + "Average result" + students[i].getAverageResult());


        }
    }


}
