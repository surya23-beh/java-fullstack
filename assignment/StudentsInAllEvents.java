package assignment;

import java.util.*;

public class StudentsInAllEvents {
    public static void main(String[] args) {

        Map<String, Set<String>> events = new HashMap<>();

        events.put("event1", new HashSet<>(Arrays.asList("A", "B", "C")));
        events.put("event2", new HashSet<>(Arrays.asList("B", "C")));
        events.put("event3", new HashSet<>(Arrays.asList("A", "C")));
        Iterator<Set<String>> it = events.values().iterator();
        Set<String> common = new HashSet<>(it.next());
        while (it.hasNext()) {
            common.retainAll(it.next());
        }

        System.out.println("Students who attended ALL events: " + common);
    }
}

