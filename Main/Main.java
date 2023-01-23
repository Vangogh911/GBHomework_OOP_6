public class Main {
    public static void main(String[] args) {
        Infrastructure infrastructure = new Infrastructure();

        System.out.println(infrastructure.getAllInfo(1));
        System.out.println(infrastructure.getAllInfo(2));
        System.out.println(infrastructure.getAllInfo(3));
        System.out.println(infrastructure.getAllInfo(33));
        infrastructure.showBirthYear("2008");
        infrastructure.showAddress(7);
        infrastructure.showStatus(2);
        infrastructure.showClass(3);
    }
}