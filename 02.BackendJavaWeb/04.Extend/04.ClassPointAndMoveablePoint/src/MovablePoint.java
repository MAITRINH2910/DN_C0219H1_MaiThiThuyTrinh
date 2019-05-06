public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float x, float y) {
        super(x, y);
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {this.xSpeed,this.ySpeed};
        return arr;
    }


    @Override
    public String toString(){
        return super.toString()+"\nXSpeed = "+getxSpeed()+" and YSpeed = "+getySpeed();
    }

    public void move(){
        float x= super.getX();
        x+=getxSpeed();
        float y = super.getY();
        y+=getySpeed();
        System.out.print("x = "+x +" and y = "+ y);
    }

}
