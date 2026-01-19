package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Person;

public class Maps {
    public Map<Person, Integer> printFilter;

    // MAPAS Y DICCIONARIOS
    public Map<String, Integer> construirHashMaps(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 3);
             
        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println("Valor: " + hashMap.values().toArray()[i]);
        }
        for(String key: hashMap.keySet()){
            System.out.println("Key: " + key + ", Valor: " + hashMap.get(key));
        }
        return hashMap;
    }

    public Map<String, Integer> construirLinkedHashMap(){
        Map<String, Integer> LinkedHashMap = new LinkedHashMap<>();
        LinkedHashMap.put("A", 2);
        LinkedHashMap.put("B", 3);
        LinkedHashMap.put("A", 5);
        LinkedHashMap.put("C", 50);
        LinkedHashMap.put("D", 5);
        LinkedHashMap.put("F", 3);
        LinkedHashMap.put("G", 8);
        LinkedHashMap.put("H", 85);
        LinkedHashMap.put("I", 5);
        System.out.println("Valor: " + LinkedHashMap.values());
        System.out.println("Llave: " + LinkedHashMap.keySet());
        return LinkedHashMap;
    }

    public Map<String, Integer> construirTreeMap(){
        Map<String, Integer> treeMap = new  TreeMap<>();
        treeMap.put("B", 3);
        treeMap.put("C", 50);
        treeMap.put("A", 2);
        treeMap.put("I", 5);
        treeMap.put("F", 3);
        treeMap.put("D", 5);
        treeMap.put("G", 8);
        treeMap.put("H", 85);
        treeMap.put("A", 5);

        System.out.println("Valor: " + treeMap.values());
        System.out.println("Lave: " + treeMap.keySet());
        return treeMap;
    }

    public Map<Person, Integer> construirTreeMapPersonsObj() {
        Map<Person, Integer> persons = new TreeMap<>();
        persons.put(new Person("Carlos", 23, 123), 123);
        persons.put(new Person("Ana", 30, 124), 124);
        persons.put(new Person("Luis", 18, 125), 125);
        persons.put(new Person("Ana", 20, 123), 123);
        persons.put(new Person("Andres", 23, 129), 129);
        persons.put(new Person("Luis", 18, 124), 124);
        return persons;
    }

        /// ORDENE POR LA EDAD Y NOMBRE Y
        /// NO PERMITA DUPLICADOS POR LA CEDU;A
        /// Map<CEDULA, PERSONA>
        Map<Integer, Person> persons = new TreeMap<>();
        /// FOR al listado para ingresar todos al mapa
        /// persons.put(cedula_Persona, Persona);
    


    public void printFilter(Map<Person, Integer> mapaPersons) {
    for (Map.Entry<Person, Integer> entry : mapaPersons.entrySet()) {
        Person person = entry.getKey();
        Integer value = entry.getValue();

        if (value > 2000 && person.getAge() >= 20) {
            System.out.println(
                "Nombre: " + person.getName() +
                ", con edad de: " + person.getAge() +
                " y con valor de: " + value
            );
        }
    }
}


}
