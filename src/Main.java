public class Main {
    public static void main(String[] args) {

        Person jack = new Person("Jack",20);
        Person ann = new Person("Ann",22,"BMW");
        Person nick = new Person("Nick",33);
       // Person noNamePerson = new Person();

        ann.sayHello();
        System.out.println(ann);
        System.out.println(jack);
        System.out.println(nick);

        // System.out.println(ann.auto.length());
        // System.out.println(jack.auto.length());
        // System.out.println(noNamePerson.auto.length());


        Account account=  new Account(jack,"DE23143",10000);
        System.out.println(account);

        //account.balance = -10;

        System.out.println(account.getBalance());
       account.setBalance(20000);
        System.out.println(account);
        account.setBalance(-2000);
        System.out.println(account);
    }
}