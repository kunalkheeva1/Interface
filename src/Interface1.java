class Kunal{
    interface Kheeva{
        void show();
    }
}
class Nav implements Kunal.Kheeva{
    public void show(){
        System.out.println("kheeva saab");
    }
    public class Interface1{
        public static void main(String[] args) {
            Kunal.Kheeva kkk;
            Nav kk = new Nav();
            kkk= kk;
            kk.show();
        }
    }

}