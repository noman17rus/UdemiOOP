public class Box {
    private double length;
    private double width;
    private double height;

    public Box(){
        this.length = 10;
        this.width = 10;
        this.height = 10;
    }

    public Box (double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setDimens (double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    private double getVolume() {
        return length * width * height;
    }

    public void showVolume (){
        System.out.println(getVolume());
    }


}


