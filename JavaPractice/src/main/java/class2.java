public class class2 extends class1{

    public static void main(String args[]){

        class2 cl2 = new class2();
        class1 cl1 = new class1();
        class1 cl = new class2();
        cl2.run();
        cl1.run();
        cl.run();

    }

    public void run(){

        System.out.println("running in class2");
        super.run();
    }

    public void exe(){
        System.out.println("exe in class2");
    }
}
