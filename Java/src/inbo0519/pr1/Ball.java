package inbo0519.pr1;

public class Ball {
    private String type;
    private int radius;

    public Ball(String t, int r){
        type = t;
        radius = r;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public String getType(){
        return type;
    }
    public int getRadius(){
        return radius;
    }
    public String toString(){
        return "Type: "+this.type+", radius: "+this.radius;
    }
}
