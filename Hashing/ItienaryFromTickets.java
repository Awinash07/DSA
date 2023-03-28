package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ItienaryFromTickets {

    public static void main(String[] args) {
        Map<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");
    }

    
}
