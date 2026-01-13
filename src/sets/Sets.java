package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;

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

    public Set<String> construirTreeSetConComparador(){
        Set<String> treeSetConComparador = new TreeSet<>((pal1, pal2) -> pal1.compareToIgnoreCase(pal2));
                treeSetConComparador.add("D");
        treeSetConComparador.add("A");
        treeSetConComparador.add("C ");
        treeSetConComparador.add("I");
        treeSetConComparador.add("O");
        treeSetConComparador.add("B");
        treeSetConComparador.add("a");
        return treeSetConComparador;
    }   

    // Clase person
    public Set<Person> personsTreeSet() {

    /*Set<Person> treePersons = new TreeSet<>(
        (p1, p2) -> {
            // SOLO EDAD
            //int comp = Integer.compare(p1.getAge(), p2.getAge());
            //return comp;

            // SOLO NOMBRE
            //return p2.getName().compareTo(p1.getName());

            // NOMBRE Y EDAD
            int comN = p2.getName().compareTo(p1.getName());
            if (comN != 0)
                return comN;
            int comE = Integer.compare(p2.getAge(), p1.getAge());
            return comE;
        }
            
    );*/

    Set<Person> treePersons = new TreeSet<>();
    treePersons.add(new Person("Carlos", 23));
    treePersons.add(new Person("Ana", 30));
    treePersons.add(new Person("Luis", 18));
    treePersons.add(new Person("Ana", 20));
    treePersons.add(new Person("Andres", 23));
    treePersons.add(new Person("Luis", 18));

    return treePersons;
}

}
