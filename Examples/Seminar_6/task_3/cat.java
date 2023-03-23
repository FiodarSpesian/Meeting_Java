package Examples.Seminar_6.task_3;

public class cat {
    public String name;
    public int age;
    public String breed;
    public boolean vacctination;
    public boolean isHungry;
    public Person owner;

    public cat(String name, int age, String breed, boolean vacctination, Person owner){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.vacctination = vacctination;
        this.isHungry = true;
        this.owner = owner;
    }
    public void meow(int times) {
        System.out.printf("Cat %s meow %d times.\n", this.name, times);
    }
    public void vacctination() {
        if(!this.vacctination){
            this.vacctination = true;
            System.out.printf("Cat %s has been vaccinated.\n", this.name);
        }
        else{
            System.out.printf("Cat %s has already vaccinated.\n", this.name);
        }
    }
    public void feed() {
        if(!this.isHungry){
            System.out.printf("You feed %s.\n", this.name);
        }else{
            System.out.printf("Cat %s doesn't want your Wiskas!\n", this.name);
        }
    }
}
