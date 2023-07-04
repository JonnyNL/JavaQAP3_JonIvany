class Student extends Person {
    // Protected variables
    protected String myIdNum;
    protected double myGPA;

    // Constructor for student
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter for student id
    public String getIdNum() {
        return myIdNum;
    }

    // Getter for student gpa
    public double getGPA() {
        return myGPA;
    }

    // Setter for student id
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    // Setter for student gpa num
    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // Student to string
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
