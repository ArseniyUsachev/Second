public class Student {
    private int age;
    private String name;
    private int numberOfAttempts;
    private int[] resultOfAttempts;

    public Student(int age, String name, int numberOfAttempts) {
        this.age = age;
        this.name = name;
        this.numberOfAttempts = numberOfAttempts;
        resultOfAttempts = new int[numberOfAttempts];
        for (int i = 0; i < numberOfAttempts; i++) {
            resultOfAttempts[i] = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    boolean setTestResult(int attempt, int grade) {
        if (attempt > numberOfAttempts) {
            return false;
        } else {
            resultOfAttempts[attempt] = grade;
            return true;
        }
    }

    int getAverageResult() {
        int averageResult = 0;
        for (int i = 0; i < numberOfAttempts; i++) {
            averageResult = averageResult + resultOfAttempts[i];
        }
        return averageResult / numberOfAttempts;
    }
}

