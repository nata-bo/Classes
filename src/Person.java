public class Person {
    String name;
    int age;
    String religion;
    String auto;

    Person(String name, int age,String auto){
        this.name = name;
        this.age = age;
        this.auto= auto;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
        this.auto = "";
    }
   // Person(){
    //}
//    Person(String name){
//        this.name = name;
//        this.age =-1;
//        this.auto = "";
//    }
   //     public String toString(){
   //  return name + " "+ ((age==-1)?"нет даных":age)+ " "+ auto;
   //     }
    public String toString(){
        return name + " "+ age+ " "+ auto;
    }

    public void sayHello(){
        System.out.println("Hello! I'am "+name);
    }

}
