public class Car {
    int speed;
    int odometer;
    int time;
    public Car(int speed) {
        this.speed = speed;
        odometer = 0;
        time = 0;

    }
    public int getSpeed() {
        return speed;
    }
    public void sayState() {
        if (speed > 0)
            System.out.println(" Едем ");
        else
            System.out.println(" Стою ");
    }
    public void gaz() {
        speed += 5;

    }
    public void tormoz() {
        speed -= 5;
        if(speed < 0);
            speed = 0;

    }
    public void step() {
        odometer += speed;
        time++;


    }
    public int km() {
        return odometer;
    }
    public double average() {
        return (double)odometer/time;
    }
    public void sayKm() {
        System.out.println(odometer);
    }
    public void sayAv() {
        System.out.println(average());
    }
}
