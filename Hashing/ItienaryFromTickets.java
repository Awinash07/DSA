package Hashing;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ItienaryFromTickets {
    public static String getStart(HashMap<String,String> tickets){
        String start = "";
        Map<String, String> reverseMap = new HashMap<>();
        for(String key : tickets.keySet()){
            reverseMap.put(tickets.get(key), key);
        }
        for(String ticket : tickets.keySet()){
            if(!reverseMap.containsKey(ticket)){
                start = ticket;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start+"->");
            start = tickets.get(start);
        }
        System.out.print(start);
    }

    
}
