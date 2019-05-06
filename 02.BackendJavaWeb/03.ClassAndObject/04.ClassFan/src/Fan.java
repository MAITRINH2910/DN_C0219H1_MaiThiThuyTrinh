public class Fan {

    final int Slow = 1;
    final int Medium = 2;
    final int Fast = 3;
    private int speed = Slow;
    boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSlow() {
        return Slow;
    }

    public int getMedium() {
        return Medium;
    }

    public int getFast() {
        return Fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void isOn() {
        on = true;
    }

    public void isOff() {
        on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (on == true) {
            return "\nFan is on" + " with speed is " + getSpeed() + ", color is " + getColor() + " and radius is " + getRadius();

        } else {
            return "\nFan is off" + " with speed is " + getSpeed() + ", color is " + getColor() + " and radius is " + getRadius();
        }
    }
}
