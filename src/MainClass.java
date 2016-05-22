import Animals.*;
import Obstacles.OCross;
import Obstacles.OWall;
import Obstacles.OWater;
import Obstacles.Obstacle;

import java.util.ArrayList;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {

        //   final int n = 4;
                                  // Полоса препятствий
        OCourse ocourse = new OCourse(new Obstacle[]{new OCross(50f, 0f), new OWater(5f, 0f), new OWall(0f, 1f)});
                                  // Команда
        Team team1 = new Team("DreamTeam", new Animal[]{new Human("Stasik"), new Horse("Voronoy"), new Duck("Krya"), new Cat("Backs")});


        team1.teamInfo();      // Команда ИНФО
        team1.doTeam();        //  Отправка на Полосу препятствий
        team1.memberMakeFinishInfo();    //    Смотрим победителя


    }
}
