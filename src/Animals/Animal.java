package Animals;

/**
 * Created by FlameXander on 17.05.2016.
 */
public abstract class Animal {
    protected  String name;
    protected  String type;
    protected boolean onDistance;
    protected float maxRunDistance;



    public boolean isOnDistance() {
        return onDistance;
    }





    public Animal(String name) {
        this.name = name;
        onDistance = true;
    }

    public void info() {
        System.out.println("type: " + type + " name: " + name);
    }

    public void printWin() {

        if (onDistance)
        System.out.println(type + " " + name + " WIN!");
    }

    public void getOutFromDistance() {
        onDistance = false;
        System.out.println(type + " " + name + " GET OUT!!!");
    }

    public void cross(float dist) {
        if(maxRunDistance > dist) {
            System.out.println(type + " " + name + " cross ok");
        } else {
            System.out.println(type + " " + name + " TROUBLE cross!!!");
            getOutFromDistance();
        }
    }
}
