public class University {
    private Instructor[] instructors = new Instructor[3];

    void setInstructors(int num1, Instructor instructor) {
        if (num1 >= 0 || num1 < 3) {
            instructors[num1] = instructor;
        }
        void printInstructor() {
            for (int i = 0; i < instructors.length; i++) {
                System.out.println("Name: " + instructors[i].getName() + "Age: " + instructors[i].getAge() + "Average result" + instructors[i].getAverageResult());


            }
        }
    }