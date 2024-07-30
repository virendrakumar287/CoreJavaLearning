public class Person {
 String name;
 int age;
 
 public Person (int age, String name) {
 this.age = age;
 this.name = name;
 }
 public String toString() {
  return "My name is " + this.name + " and my age is " + this.age;
 }
}

class  Runner {
 public static void main(String[] args) {
  Person person = new Person(18, "John");
  System.out.println(person);
 }
}