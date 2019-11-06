public class Square implements Resizeable{
    private double height ;

    public Square(){

    }

    public Square(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void getAre(){
        System.out.println("Diện tích hình vuông ban đầu là : "+getHeight()*getHeight());
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình vuông random là : "+getHeight()*getHeight()*(Math.PI * Math.floor(Math.random() * percent)) / 100);
    }
}
