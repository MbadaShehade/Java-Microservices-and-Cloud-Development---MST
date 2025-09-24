//Mbada Shehady
public class Student {
    private int studentId;
    private String name;
    private double grade;

    public Student(int studentId, String name, double grade) {
        this.studentId = studentId;
        this.name = name;
        setGrade(grade);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade, must be between 0 and 100");
        }
    }

    public boolean isPassing() {
        return grade >= 60;
    }
}