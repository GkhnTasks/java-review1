package Task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class State {
/*
    Suppose we have a State class that contains list of cities. Create a list
of States and print all the cities.
*/
private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city){
        cities.add(city);
    }

    public List<String> getCity(){
        return this.cities;
    }


}
