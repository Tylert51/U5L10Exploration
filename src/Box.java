public class Box
{
    private double length, width, height;

    public Box(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // creates a cube
    public Box(double side)
    {
        this(side, side, side);
    }

    public static double feetToInches(double feet)
    {
        return feet * 12;
    }

    public static double metersToInches(double meters)
    {
        double metersToFeet = meters * 3.2808399;
        double inches = feetToInches(metersToFeet);
        return inches;
    }

    public double volume()
    {
        return this.length * this.width * this.height;
    }

    public double volumeInCubicInches()
    {
        double vol = this.volume();
        double volCubicIn = this.metersToInches(vol * 12 * 12 * 12);
        return volCubicIn;
    }
}
