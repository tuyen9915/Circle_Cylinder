//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle =  new Circle();

        circle = new Circle(4);
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();

        cylinder = new Cylinder(6,4);
        System.out.println(cylinder);

    }

}