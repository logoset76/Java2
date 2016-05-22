package Animals;

/**
 * Created by FlameXander on 17.05.2016.
 */
public class Dog extends Animal implements Swimable, Jumpable {

    private float mood;

    public Dog(String name) {
        super(name);
        type = "Dog";
        mood = 1.0f + (float)Math.random();
        maxRunDistance = 800.0f;
    }

    @Override
    public void swim(float dist) {
        if(dist < 50.0f * mood) {
            System.out.println(type + " " + name + " swim ok");
        } else {
            System.out.println(type + " " + name + " TROUBLE SWIM!!!");
            getOutFromDistance();
        }
    }

    @Override
    public void jump(float height) {
        if(height < 0.5f * mood) {
            System.out.println(type + " " + name + " jump ok");
        } else {
            System.out.println(type + " " + name + " TROUBLE JUMP!!!");
            getOutFromDistance();
        }
    }
}
