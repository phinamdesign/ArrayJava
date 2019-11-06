public class Circle implements Resizeable {
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getAre(){
        System.out.println("Diện tích hình tron ban đầu là : "+getRadius() * getRadius() *Math.PI);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình tron random là : "+getRadius() * getRadius() * (Math.PI * Math.floor(Math.random() * percent)) / 100);
    }
}
