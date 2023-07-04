class Teacher extends Person {
    // Protected variables
    protected String subject;
    protected double salary;

    // Teacher constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getter for the teachers teaching subject
    public String getSubject() {
        return subject;
    }

    // Getter for the teachers salary
    public double getSalary() {
        return salary;
    }

    // Setter for the teachers teaching subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Setter for teachers salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // String representation of a teacher
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}
