package Animals;

/**
 * Created by FlameXander on 17.05.2016.
 */
public class Human extends Animal implements Swimable, Jumpable {

    private float endurance;

    public Human(String name) {
        super(name);
        type = "Human";
        maxRunDistance = 2000.0f;
        endurance = 1000.0f;
    }

    @Override
    public void jump(float height) {
        float endNeeded = height * 50.0f;
        if(height < 2.0f && endurance > endNeeded) {
            endurance -= endNeeded;
            System.out.println(type + " " + name + " jump ok");
        } else {
            getOutFromDistance();
        }
    }

    @Override
    public void swim(float dist) {
        float endNeeded = dist * 100.0f;
        if(dist < 100.0f && endurance > endNeeded) {
            endurance -= endNeeded;
            System.out.println(type + " " + name + " swim ok");
        } else {
            getOutFromDistance();
        }
    }

    @Override
    public void cross(float dist) {
        float endNeeded = dist * 0.5f;
        if(endurance > endNeeded) {
            endurance -= endNeeded;
            super.cross(dist);
        } else {
            getOutFromDistance();
        }
    }
}
