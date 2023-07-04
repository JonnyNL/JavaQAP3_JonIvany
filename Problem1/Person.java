class Person {
    // Protected variables
    protected String myName;
    protected int myAge;
    protected String myGender;

    // Constructor for persons
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getter for person name
    public String getName() {
        return myName;
    }

    // Getter for person age
    public int getAge() {
        return myAge;
    }

    // Getter for person gender
    public String getGender() {
        return myGender;
    }

    // Setter for the persons name
    public void setName(String name) {
        myName = name;
    }

    // Setter for the persons age
    public void setAge(int age) {
        myAge = age;
    }

    // Setter for the persons gender
    public void setGender(String gender) {
        myGender = gender;
    }

    // Person to string form
    public String toString() {
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }
}