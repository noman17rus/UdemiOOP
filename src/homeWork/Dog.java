package homeWork;

public class Dog {
    public String name;
    public String breed;
    public int weight;

    public double speed;

    public String getInfo () {
        return "Собаку зовут " + name + " Её порода: " + breed + "  её вес: " + weight;
    }

    public void run () {
        for (int i = 0; i <= speed-1; i++){
           System.out.println("Бегу ");
        }
    }
}
