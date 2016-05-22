package Obstacles;

import Animals.Animal;
import Animals.Jumpable;

/**
 * Created by FlameXander on 17.05.2016.
 */
public class OWall extends Obstacle {
    public OWall(float length, float height) {
        super(length, height);
    }

    @Override
    public void doIt(Animal a) {
        if(a instanceof Jumpable) {
            ((Jumpable) a).jump(height);
        } else {
            System.out.println(" " + " TROUBLE Jumpable!!!");
            a.getOutFromDistance();
        }
    }
}
