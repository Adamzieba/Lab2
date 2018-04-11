import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class App {
    public static String format(double number) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.UK);
        DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
        decimalFormat.applyPattern("#.##");
        return decimalFormat.format(number);
    }

    public static void main(String[] args) {
        System.out.println("Presentation of objects created separately");
        Cylinder cylinder = new Cylinder(3.0, 2.4);
        Ball ball = new Ball(2.0, 3.6);
        Rod rod = new Rod(5.0, 1.2);

        cylinder.present();
        ball.present();
        rod.present();

        System.out.println("\n" + "Presentation of objects inside an array");
        ArrayList<MaterialPoint> objects = new ArrayList<>(Arrays.asList(cylinder, ball, rod));

        for (MaterialPoint object : objects) {
            object.present();
        }

        System.out.println("\n" + "Moment of inertia (parallel axis)");
        for (MaterialPoint object : objects) {
            String parallel = format(object.getParallelMomentOfInertia(1.0));
            System.out.println("  " + object.toString() + ": " + parallel);
        }
    }
}
