import test.MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList emloyees = getEmployees();
        emloyees.add("James");
        emloyees.remove("Emma");
        for (int i = 0; i < emloyees.getSize(); i++) {
            System.out.println(emloyees.get(i));
        }
    }

    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }
}