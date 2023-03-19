import test.MyArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = getEmployees();
        ArrayList<Integer> numbers = getNumbers();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add((numbers.get(i)) + " - " + names.get(i));
        }
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> getEmployees() {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Olivia");
        employees.add("Emma");
        employees.add("Max");
        employees.add("Nick");
        return employees;
    }

    private static ArrayList<Integer> getNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        return numbers;
    }

}