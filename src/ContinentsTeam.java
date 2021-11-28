import java.util.ArrayList;
import java.util.List;

public class ContinentsTeam implements Team {
    private String name;
    private Integer NoAthletes;
    private Integer NoGold;

    private List<Team> subTeams;

    public ContinentsTeam(String name, Integer NoAthletes, Integer NoGold){
        this.name = name;
        this.NoAthletes = NoAthletes;
        this.NoGold = NoGold;
        this.subTeams = new ArrayList<>();
    }

    public void addTeam(Team t){
        subTeams.add(t);
    }

    @Override
    public void printTeamName() {
        subTeams.forEach(Team::printTeamName);
    }
    @Override
    public void printTeamNoAthletes(){
        subTeams.forEach(Team::printTeamNoAthletes);
    }
    @Override
    public void printTeamNoGold(){
        subTeams.forEach(Team::printTeamNoGold);
    }
}
