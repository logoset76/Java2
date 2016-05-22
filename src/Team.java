import Animals.Animal;


/**
 * Created by L on 20.05.2016.
 */
public class Team {
    // private int n = 4;
    private String nameTeam;
    private Animal[] team;


    public Team(String nameTeam, Animal[] team) {
        this.nameTeam = nameTeam;
        this.team = team;
    }


    public void teamInfo() {

        System.out.println("===========================");
        System.out.println("Team: " + nameTeam + '\n' + team);

        for (int i = 0; i < team.length; i++) {
            System.out.println(team[i]);
        }

    }
    public void doTeam() {


        for (int i = 0; i < team.length; i++) {
            for (int j = 0; j < OCourse.ocourse.length; j++) {
                System.out.println("===========================");
                System.out.println(OCourse.ocourse[j]);
                OCourse.ocourse[j].doIt(team[i]);
                if(!team[i].isOnDistance()) break;
            }
        }

    }



    public void memberMakeFinishInfo() {
        System.out.println("===========================");
        for (int i = 0; i < team.length; i++) {
            if (team[i].isOnDistance()) team[i].printWin();
        }
        System.out.println("===========================");
    }


}
