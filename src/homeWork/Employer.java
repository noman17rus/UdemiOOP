package homeWork;

public class Employer {
    String name;
    String title;
    int salary;

    public Employer(String name, String title, int salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public void showInfo(){
        System.out.println("Name " + name + " Title " + title + " salary "+ salary);
    }
}
