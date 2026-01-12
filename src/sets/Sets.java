package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> LinkedhashSet = new LinkedHashSet<>();
        LinkedhashSet.add("A");
        LinkedhashSet.add("B");
        LinkedhashSet.add("C");
        LinkedhashSet.add("A");
        LinkedhashSet.add("D");
        LinkedhashSet.add("E");
        LinkedhashSet.add("F");
        return LinkedhashSet;
    }
    
    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;
        }

    public void construirTreeSetConComparador() {
        // INVESTIGAR PARA PRUEBA
    }   
}
