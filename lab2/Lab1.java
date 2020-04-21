import static com.company.Point3d.*;

import java.util.Scanner;

public class Lab1 {

    private static double computeArea(Point3d a, Point3d b, Point3d c) {
        // Ищем вектора по координатам точек
        double ABx = b.getX() - a.getX();
        double ABy = b.getY() - a.getY();
        double ABz = b.getZ() - a.getZ();

        double ACx = c.getX() - a.getX();
        double ACy = c.getY() - a.getY();
        double ACz = c.getZ() - a.getZ();

        // Ищем векторное произведение векторов
        double ABACx = (ABy * ACz - ABz * ACy);
        double ABACy = (ABx * ACz - ABz * ACx);
        double ABACz = (ABx * ACy - ABy * ACx);

        // Ищем модуль векторного произведения
        double ABAC = Math.sqrt((ABACx * ABACx) + (ABACy * ABACy) + (ABACz * ABACz));
        return ABAC / 2; // Площадь = половина модульного произведения
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты 1 точки: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Point3d firstPoint = new Point3d(x, y, z);

        System.out.print("Введите координаты 2 точки: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d secondPoint = new Point3d(x, y, z);

        if (firstPoint.compare(x, y, z)) {
            System.out.println("Введите точки, у которых различаются координаты!");
            return;
        }

        System.out.print("Введите координаты 3 точки: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d thirdPoint = new Point3d(x, y, z);
        in.close();

        if (secondPoint.compare(x, y, z)) {
            System.out.println("Введите точки, у которых различаются координаты!");
            return;
        }

        System.out.println(computeArea(firstPoint, secondPoint, thirdPoint));
    }
}
