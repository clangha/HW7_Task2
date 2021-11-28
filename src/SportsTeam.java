import java.util.ArrayList;
import java.util.List;

public class SportsTeam implements Team {
    private String name;
    private Integer NoAthletes;
    private Integer NoGold;

    public SportsTeam(String name, Integer NoAthletes, Integer NoGold){
        this.name = name;
        this.NoAthletes = NoAthletes;
        this.NoGold = NoGold;
    }

    @Override
    public void printTeamName() {
        System.out.println(this.name);
    }

    @Override
    public void printTeamNoAthletes() {
        System.out.println(this.NoAthletes);
    }

    @Override
    public void printTeamNoGold() {
        System.out.println(this.NoGold);
    }

}
