package Examples.Seminar_6.task_3;

public class Person {
    public String name;

    public Person(String name){
        this.name = name;
    }
    public void petCat(cat cat) {
        if (cat.owner == this){
            System.out.printf("%s linking %s, cat very happy!\n", this.name, cat.name);
        }else System.out.printf("%s linking %s.\n", this.name, cat.name);
    }
}
