public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.isOn();
        fan1.setSpeed(fan1.getFast());
        fan1.setColor("yello");
        fan1.setRadius(10);

        Fan fan2 = new Fan();
        fan2.isOff();
        fan2.setSpeed(fan2.getMedium());
        fan2.setColor("blue");
        fan2.setRadius(5);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
