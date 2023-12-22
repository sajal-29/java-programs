 class Main {
     public static void main(String[] args) {
         A a  = new C();
         a.print();
     }
 }
 class A {
    public void print(){
        System.out.println("A");
    }
 }
 class B extends A{
     public void print(){
         System.out.println("B");
     }
 }
 class C extends B {
     public void print(){
         System.out.println("C");
     }
 }
