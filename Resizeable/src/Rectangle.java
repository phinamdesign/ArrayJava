public class Rectangle implements Resizeable {
    private double height ;
    private double weight ;

    public Rectangle (){

    }

    public Rectangle(double height, double weight){
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void getAre(){
        System.out.println("Diện tích hình chữ nhật ban đầu là : "+getWeight()*getHeight());
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình chữ nhật random là : "+getHeight()*getWeight()*(Math.PI * Math.floor(Math.random() * percent)) / 100);
    }
}
