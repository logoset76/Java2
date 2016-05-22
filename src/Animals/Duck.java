package Animals;

/**
 * Created by FlameXander on 17.05.2016.
 */
public class Duck extends Animal implements Swimable {
    public Duck(String name) {
        super(name);
        type = "Duck";
        maxRunDistance = 400.0f;
    }

    @Override
    public void swim(float dist) {
        if(dist < 500.0f) {
            System.out.println(type + " " + name + " swim ok");
        } else {
            getOutFromDistance();
        }
    }
}
