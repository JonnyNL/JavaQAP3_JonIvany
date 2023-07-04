public class Demo {
    public static void main(String[] args) {

        // Sample Test from doc
        System.out.println("Start of sample test from doc");
        System.out.println(" ");
        System.out.println("Created Person");
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println("Person toString: " + bob);

        System.out.println(" ");
        System.out.println("Created Student");
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println("Student toString: " + lynne);

        System.out.println(" ");
        System.out.println("Created Teacher");
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println("Teacher toString: " + 
        mrJava);

        System.out.println(" ");
        System.out.println("Created College Student");
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println("College Student toString(): " + ima);

        System.out.println(" ");
        System.out.println("End Of Sample Test...");
        System.out.println("vv Additonal Tests vv");
         
        // Update Person details using setters
        System.out.println(" ");
        System.out.println("Using setName() to change person Bob to Robert");
        bob.setName("Robert");
        System.out.println(bob);
        
        System.out.println(" ");
        System.out.println("Using setAge() to change person Robert's age to 30");
        bob.setAge(30);
        System.out.println(bob);
        
        System.out.println(" ");
        System.out.println("Using setGender() to change person Robert's gender to Male");
        bob.setGender("Male");
        System.out.println(bob);
        
        // Update Student details using setters
        System.out.println(" ");
        System.out.println("Using setIdNum() to change student Lynne's ID to HS12345");
        lynne.setIdNum("HS12345");
        System.out.println(lynne);
        
        System.out.println(" ");
        System.out.println("Using setGPA() to change student Lynne's GPA to 4.2");
        lynne.setGPA(4.2);
        System.out.println(lynne);
        
        // Update Teacher details using setters
        System.out.println(" ");
        System.out.println("Using setSubject() to change teacher Duke Java's subject to Physics");
        mrJava.setSubject("Physics");
        System.out.println(mrJava);
        
        System.out.println(" ");
        System.out.println("Using setSalary() to change teacher Duke Java's salary to 60000");
        mrJava.setSalary(60000);
        System.out.println(mrJava);
        
        // Update CollegeStudent details using setters
        System.out.println(" ");
        System.out.println("Using setYear() to change college student Ima Frosh's year to 2");
        ima.setYear(2);
        System.out.println(ima);
        
        System.out.println(" ");
        System.out.println("Using setMajor() to change college student Ima Frosh's major to Computer Science");
        ima.setMajor("Computer Science");
        System.out.println(ima);

        System.out.println(" ");
        System.out.println("End of Additional Testing");
    }
}