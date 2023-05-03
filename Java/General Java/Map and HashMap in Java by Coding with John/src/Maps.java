import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        // Map String to Integer
        // Must use wrapper class (e.g String, Integer, Character, etc.)
        HashMap<String, Integer> empIds = new HashMap<>();

        // Insert mappings into a map
        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));
        System.out.println(empIds.containsKey("Jerry"));
        System.out.println(empIds.containsKey("George"));
        System.out.println(empIds.containsValue(6));
        System.out.println(empIds.containsValue(8675309));

        // "put" updates the value if the key already exists
        // "put" insert new mapping if the key does not exists
        empIds.put("John", 98765);
        System.out.println(empIds);

        // "replace" updates the values if the key already exists
        // "replace" do nothing if the key does not exists
        empIds.replace("John", 888);
        empIds.replace("Kramer", 777);
        System.out.println(empIds);

        // "putIfAbsent" only add mapping if the key does not exists
        // Does not change John's value to 222, because John already exists
        empIds.putIfAbsent("John", 222);
        empIds.putIfAbsent("Steve", 222333);
        System.out.println(empIds);

        empIds.remove("Steve");
        System.out.println(empIds);
    }
}