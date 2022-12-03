package deshaw.ascend.session3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// See https://blog.jdriven.com/2019/10/loop/
public class Streams {

    class Person {
        private String name;
        private int age;

        private String gender;
        private List<Person> siblings;

        public Person(String name, int age, String gender, List<Person> siblings) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.siblings = siblings;
        }

        public String getGender() {
            return gender;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public List<Person> getSiblings() {
            return siblings;
        }
    }
    
    // Given a list of Persons, give me the names of everyone who is older than 18
    private void forLoop1() {
        List<Person> persons = List.of();
        List<String> result = new ArrayList<>();
        for(Person person : persons){
            if(person.getAge() > 18){
                result.add(person.getName());
            }
        }
    }

    private void streaming1() {
        List<Person> persons = List.of();
        List<String> result = persons.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }
    
    // Given a list of Persons, give me the names of everyone who is between 19 and 65 whose name is not null and starts with a 'B'
    private void forLoop2(){
        List<Person> persons = List.of();
        List<String> result = new ArrayList<>();

        for(Person person : persons){
            if(person.getAge() > 18 && person.getAge() <= 65 && person.getName() != null && person.getName().startsWith("B")){
                result.add(person.getName());
            }
        }
    }

    private void streaming2() {
        List<Person> persons = List.of();
        List<String> result = persons.stream()
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() <= 65)
                .filter(person -> person.getName() != null)
                .filter(person -> person.getName().startsWith("B"))
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }

    // Given a list of Persons, give me the names of all male siblings who are between 19 and 65 whose name is not null and starts with a 'B'
    private void forLoop3() {
        List<Person> persons = List.of();
        List<String> result = new ArrayList<>();

        for (Person person : persons) {
            for (Person sibling : person.getSiblings()) {
                if (sibling.getGender().equals("M") && sibling.getAge() > 18 && sibling.getAge() <= 65 && sibling.getName() != null && sibling.getName().startsWith("B")) {
                    result.add(sibling.getName());
                }
            }
        }
    }

    private void streaming3() {
        List<Person> persons = List.of();
        List<String> result = persons.stream()
                .flatMap(person -> person.getSiblings().stream())
                .filter(person -> person.getGender().equals("M"))
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() <= 65)
                .filter(person -> person.getName() != null)
                .filter(person -> person.getName().startsWith("B"))
                .map(person -> person.getName())
                .collect(Collectors.toList());
    }
}
