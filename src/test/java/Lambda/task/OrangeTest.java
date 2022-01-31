package Lambda.task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory=new ArrayList<>();

        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(100).color(Color.RED).build());
        inventory.add(Orange.builder().weight(500).color(Color.GREEN).build());
        inventory.add(Orange.builder().weight(300).color(Color.RED).build());

        OrangeFormatter simpleFormatter=(Orange orange)-> "An orange of "+ orange.getWeight()+ " g";
        //OrangeFormatter simpleFormatter1=orange-> "An orange of "+ orange.getWeight()+ " g";
      //  prettyPrintApple(inventory, simpleFormatter);
        prettyPrintApple(inventory,orange-> "An orange of "+ orange.getWeight()+ " g");
        System.out.println("---------------------------------");
        OrangeFormatter fancyFormatter= orange -> {
            String characterictic=orange.getWeight()>150 ?"Heavy":"Light";
            return  "A "+ characterictic+ " "+orange.getColor()+" orange";
        };

        prettyPrintApple(inventory,fancyFormatter);
    }


    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter orangeFormatter){
        for (Orange orange: inventory){
            String output=orangeFormatter.accept(orange);
            System.out.println(output);
        }

    }
}
