package Examples.Seminar_6.task_3;

public class main {
    public static void main(String[] args) {
        Person Ivan = new Person("Ivan");
        Person Fedor = new Person("Fedor");
        cat Tom = new cat("Tom", 5, "Undefined", false, Ivan);
        Tom.meow(6);
        Tom.vacctination();
        Tom.vacctination();
        Tom.feed();
        Ivan.petCat(Tom);
        Fedor.petCat(Tom);
    }
    /*
    Создайте структуру класса Кот. Продумать какие поля и методы будут актуальны для приложения, которое является
    информационной системой ветеринарной клиники

    Поля:
        Имя
        Возраст
        Порода
        Прививка =false

    Метод:
        Кот(имя) мякнул 5 раз
        Прививка
     */

}
//     public static void main(String[] args) {
        
//     }
// }

// public class Cat {
//     private String name;
//     String poroda;
//     private Integer age;

//     public Cat(String name, Integer age){
//         this.name = name;
//         this.age = age;
//     }

//     public Cat(String name, Integer age, String poroda){
//         this.name = name;
//         this.age = age;
//         this.poroda = poroda;
//     }

//     public Integer getAge() {
//         return age;
//     }

//     public void setAge(Integer age) {
//         this.age = age;
//     }

//     public void golos(){
//         System.out.println(this.name + " say mur");
//     }

//     @Override
//     public String toString() {
//         return name +" <-Имя  Возраст-> " + age;
//     }
// }

// // Cat barsik = new Cat("Barsik", 3)
// // barsik.toString()