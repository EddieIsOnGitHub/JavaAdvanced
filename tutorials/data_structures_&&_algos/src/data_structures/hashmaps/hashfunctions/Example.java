package data_structures.hashmaps.hashfunctions;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Fez"), new Diamond("VVS"));

        System.out.println(new Person("Fez").hashCode());
        System.out.println(new Person("dede").hashCode());
        System.out.println(map.get(new Person("Fez")));
    }

    static class Person{
        String name;

        public Person(String name){
            this.name=name;
        }

        @Override
        public String toString(){
            return "Person{"+
                    "name='"+ name+'\''+
                    '}';
        }

        @Override
        public boolean equals(Object o){
            if(this==o)return true;
            if(o==null||getClass()!=o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name){}
}
