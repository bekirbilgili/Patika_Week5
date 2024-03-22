import java.util.HashMap;
import java.util.Map;

public class Teams {
    private Integer number;
    private String name;

    public Teams(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public void teamSet(){
        Map<Integer, String> teams = new HashMap<>();
        teams.put(1,"Galatasaray");
        teams.put(2,"Bursaspor");
        teams.put(3,"Fenerbahçe");
        teams.put(4,"Beşiktaş");
        teams.put(5,"Başakşehir");
        teams.put(6,"Trabzonspor");
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
