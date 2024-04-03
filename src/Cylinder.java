public class Cylinder extends Circle{
    private double cao;

    public Cylinder() {
    }

    public Cylinder(double cao) {
        this.cao = cao;
    }

    public Cylinder(double bk, double cao) {
        super(bk);
        this.cao = cao;
    }

    public Cylinder(double bk, String color, double cao) {
        super(bk, color);
        this.cao = cao;
    }

    public double gettheTich(){
        return cao*super.getDienTich();
    }

    public double getCao() {
        return cao;
    }

    public void setCao(double cao) {
        this.cao = cao;
    }
    @Override
    public String toString(){
        return "Một trụ có chiều cao = "
                + getCao()
                + ", có thể tích = "
                + gettheTich();
    }

}
