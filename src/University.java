public class University {
    private Instructor[] instructors;

    public University() {
    }

    void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    void printInstructors() {
        for (int i = 0; i < instructors.length; i++) {

            System.out.println("Instructor's name: " + instructors[i].getName());
            instructors[i].printStudents();


        }
    }
}
