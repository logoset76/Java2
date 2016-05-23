import Obstacles.Obstacle;


/**
 * Created by L on 20.05.2016.
 */
public class OCourse {


    private Obstacle[] ocourse;

    public OCourse(Obstacle[] ocourse) {
        this.ocourse = ocourse;

    }

      public void doOCourse(Team t){

          for (int i = 0; i < t.getLength(); i++) {
              for (int j = 0; j < ocourse.length; j++) {
                  System.out.println("===========================");
                  ocourse[j].infoObstacle();
                  ocourse[j].doIt(t.getAnimal(i));
                  if (!t.getAnimal(i).isOnDistance()) break;
              }
          }


      }



}


