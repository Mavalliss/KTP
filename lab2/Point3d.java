import java.text.DecimalFormat;
import java.util.IllegalFormatPrecisionException;

public class Point3d {
    /** координата X **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;
    /** координата Z **/
    private double zCoord;

    /** Конструктор инициализации **/
    public Point3d (double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /** Конструктор по умолчанию. **/
    public Point3d () {
    //Вызовите конструктор с двумя параметрами и определите источник.
        this(0.0, 0.0, 0.0);
    }
    /** Возвращение координаты X **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты X. **/
    public void setX (double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y. **/
    public void setY (double val) {
        yCoord = val;
    }
    /** Установка значения координаты Z. **/
    public void setZ (double val) {
        zCoord = val;
    }
    /** Метод для сравнения значений двух объектов  **/
    public boolean compare(double x, double y, double z) {
        return this.xCoord == x && this.yCoord == y && this.zCoord == z;
    }
    /** Метод, вычисляющий расстояние между двумя точками **/
    public double distanceTo(double x, double y, double z) {
        return Math.sqrt(
                ((x - this.xCoord) * (x - this.xCoord)) *
                        ((y - this.yCoord) * (y - this.yCoord)) *
                        ((z - this.zCoord) * (z - this.zCoord)));
    }
}
