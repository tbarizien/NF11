package logoparsing;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JeanV on 22/04/2016.
 */
public class SymTable {
    private Map<String, Integer> symTable;
    
    public SymTable() {
        symTable = new HashMap<>();
    }
    
    public SymTable(SymTable s) {
        symTable = new HashMap<>(s.getSymTableMap());
    }
    
    public Map<String, Integer> getSymTableMap() {
        return symTable;
    }

    public void donne(String s, int n) {
        symTable.put(s, n);
    }

    public int valueOf(String s) throws RuntimeException {
        Integer res = symTable.get(s);
        if (res == null)
            throw new RuntimeException("variable '"+s+"' non définie");
        else
            return res;
    }
}
