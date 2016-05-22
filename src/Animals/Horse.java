package Animals;

/**
 * Created by FlameXander on 17.05.2016.
 */
public class Horse extends Animal implements Swimable, Jumpable {


    public Horse(String name) {
        super(name);
        type = "Horse";
        maxRunDistance = 5000.0f;
    }

    @Override
    public void swim(float dist) {
        if (dist < 10.0f) {
            System.out.println(type + " " + name + " swim ok");
        } else {
            System.out.println(type + " " + name + " TROUBLE swim!!!");
            getOutFromDistance();
        }
    }

    @Override
    public void jump(float height) {
        if (height < 2.0f) {
            System.out.println(type + " " + name + " jump ok");
        } else {
            System.out.println(type + " " + name + " TROUBLE JUMP!!!");
            getOutFromDistance();
        }
    }
}

