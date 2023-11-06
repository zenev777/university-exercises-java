public class Student extends  Human{

    private int facultyNumber;
    private int workingHour;
    public Student(String firstName, String lastName, int facultyNumber) {
        super(firstName, lastName);
        this.facultyNumber = facultyNumber;
        workingHour=4;
    }

    public int getFacultyNumber() {
        return facultyNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return facultyNumber == student.facultyNumber;
    }

    @Override
    int calculateDailyWage() {
        return 0;
    }
}
