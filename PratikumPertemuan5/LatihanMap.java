package PratikumPertemuan5;


import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class LatihanMap {
    public static void main(String[] args) {

       Map<String,String> company = new TreeMap<String,String>();

       company.put("Microsoft","Bill Gates");
       company.put("Apple","Steven Paul Jobs");
       company.put("Linux","Linux Benedict Torvalds");
       company.put("Facebook","Mark Zuckerberg");
       company.put("Twitter","Jack Dorsey");
       company.put("Instagram","Kevin Systrom");


       int index = 1;


       for(Iterator<String> it = company.keySet().iterator(); it.hasNext();) {
            String key = (String) it.next();
            System.out.println(index + ". " + key.toUpperCase() + " Dikembangkan oleh " + company.get(key));
            index++;
       }

    }

}
