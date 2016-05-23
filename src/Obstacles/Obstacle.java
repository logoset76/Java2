package Obstacles;

import Animals.Animal;

/**
 * Created by FlameXander on 17.05.2016.
 */
public abstract class Obstacle {

    float length;
    float height;
    protected String oname;

    public Obstacle(float length, float height) {
        this.length = length;
        this.height = height;
    }

    public abstract void doIt(Animal a);

    public void infoObstacle(){

        System.out.println(oname);
    }

}
