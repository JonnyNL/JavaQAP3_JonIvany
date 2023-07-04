class CollegeStudent extends Student {
    // Protected variables
    protected int year;
    protected String major;

    // CollegeStudent Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getter fo the College students grad year
    public int getYear() {
        return year;
    }

    // Getter for the college students major
    public String getMajor() {
        return major;
    }

    // Setter for the college students grad year
    public void setYear(int year) {
        this.year = year;
    }

    // Setter for college students major    
    public void setMajor(String major) {    
        this.major = major;
    }

    // Student in string form
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}