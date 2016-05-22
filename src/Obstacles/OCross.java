package Obstacles;

import Animals.Animal;

/**
 * Created by FlameXander on 17.05.2016.
 */
public class OCross extends Obstacle {
    public OCross(float length, float height) {
        super(length, height);
    }

    @Override
    public void doIt(Animal a) {
        a.cross(length);
    }
}
