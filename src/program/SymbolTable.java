package program;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private static Map<String, Double> variables = new HashMap<>();
    
    public static void set(String name, double value) {
        variables.put(name, value);
    }
    
    public static double get(String name) {
        if (!variables.containsKey(name)) {
            throw new RuntimeException("Variable non définie: " + name);
        }
        return variables.get(name);
    }
}
