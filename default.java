interface A {
   default void show(){}
    default void add(){}
    default void display(){}
    
}
/*class B implements A{ //Adaptor class
   public void show(){}
    public void add(){}
     public void display(){}
    
}*/
class C implements A{
    public void show(){
        System.out.println("HEY MR MARLBORO");
    }
    public void add(){
    System.out.println("Lets get you high today");
    }
} 
class InterfaceExample{
    public static void main(String args[]){
        C c1 = new C();
        c1.show();
        c1.add();

    }
}