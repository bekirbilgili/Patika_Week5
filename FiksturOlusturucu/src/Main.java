import java.util.*;
import java.util.HashMap;

public class Main extends Teams{
    public Main(Integer number, String name) {
        super(number, name);
    }

    public static void main(String[] args) {
        Teams teamsList = new Teams();

        for (Teams teams: teamsList){
            System.out.println(teamsList.getName());
        }

    }
}