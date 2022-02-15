import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    // constructor
    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    // calculate average test score
    char calculate() {
        int total = 0;

        for (int testScores : testScores)
            total += testScores;

        int average = total / testScores.length;

        if (average >= 90 && average <= 100)
            return 'O';
        if (average >= 80 && average < 90)
            return 'E';
        if (average >= 70 && average < 80)
            return 'A';
        if (average >= 55 && average < 70)
            return 'P';
        if (average >= 40 && average < 55)
            return 'D';
        return 'T';

    }
}

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int id = scanner.nextInt();
        int numScores = scanner.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scanner.nextInt();
        }

        scanner.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
