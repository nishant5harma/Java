
class  empl{
    String name;
    int age;

// No argument constructor

    // empl(){
    //     System.out.println("Hello world");
    // }

// Paramaterized constructor

 empl(String name, int age){
    this.name=name;
    this.age=age;

 }

    public static void main(String[] args) {

        empl e1 = new empl("Nishant",1);
        System.out.println(e1.name+""+e1.age);


    }
}