package homeWork;

public class Rect {
    int length;
    int width;

    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }
}
