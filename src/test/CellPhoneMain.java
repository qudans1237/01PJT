package test;

public class CellPhoneMain {
    public static void main(String[] args) {
        CellPhone02 myPhone = new CellPhone02("SCH-600");

        myPhone.charge(20);
        myPhone.printBattery();

        myPhone.call(300);
        myPhone.printBattery();

        myPhone.charge(50);
        myPhone.printBattery();

        myPhone.call(40);
        myPhone.printBattery();

        try{
            myPhone.call(-20);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        CellPhone02 yourPhone = new CellPhone02("SCH-600");

        if(myPhone.equals(yourPhone)) {
            System.out.println("���� ���Դϴ�");
        } else {
            System.out.println("�ٸ� ���Դϴ�");
        }
    }
}