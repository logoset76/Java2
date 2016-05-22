package Obstacles;

import Animals.Animal;
import Animals.Swimable;

/**
 * Created by FlameXander on 17.05.2016.
 */
public class OWater extends Obstacle {

    public OWater(float length, float height) {
        super(length, height);
    }

    public void doIt(Animal a) {
        if(a instanceof Swimable) {
            ((Swimable) a).swim(length);
        } else {
            System.out.println(" " + " TROUBLE Swimable!!!");
            a.getOutFromDistance();
        }
    }
}
