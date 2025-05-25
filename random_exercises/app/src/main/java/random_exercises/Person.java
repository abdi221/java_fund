package random_exercises;

public class Person {
    private String name;
    private int personID;

    public Person (String name, int personID) {
        this.name = name;
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        System.out.println("My name is " + name);
    }

    public int getPersonID() {
        return personID;
    } 

    public void setPersonID() {
        System.out.println("PersonID: " + personID);
    }
    
}
