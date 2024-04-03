public class Circle {
    private double bk;
    private String color;

    public Circle() {
    }

    public Circle(double bk) {
        this.bk = bk;
    }

    public Circle(double bk, String color) {
        this.bk = bk;
        this.color = color;
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDienTich(){
        return bk*bk*Math.PI;
    }


    @Override
    public String toString(){
        return "Một hình tròn có bán kính = "
                + getBk()
                + ", có diện tích = "
                + getDienTich();
    }
}
