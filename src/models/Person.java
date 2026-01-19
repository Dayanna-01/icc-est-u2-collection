package models;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int cedula;

    public Person(String name, int age, int cedula) {
        this.name = name;
        this.age = age;
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return  "\n" + name + " con edad: " + age ;
    }

    @Override
    public int compareTo(Person o) {
        int comN = this.name.compareTo(o.getName());
            if (comN != 0)
                return comN;
            int comE = Integer.compare(this.age, o.getAge()); //para comparar edades se usa integer
            return comE;
    }
}