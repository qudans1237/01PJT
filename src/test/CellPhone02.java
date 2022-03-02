package test;

public class CellPhone02 {
    
    protected String model;
    private double battery;

    
    public CellPhone02() {}

    public CellPhone02(final String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public void call(int time) {
        if(time < 0) {
            throw new IllegalArgumentException("��ȭ�ð��Է¿���");
        }

        battery -= time * 0.5;
        battery = battery < 0 ? 0 : battery;

        System.out.println("��ȭ �ð� : "+time+" ��");
    }

    public void charge(int time) {
        if(time < 0) {
            throw new IllegalArgumentException("�����ð��Է¿���");
        }

        battery += time * 3;
        battery = battery > 100 ? 100 : battery;

        System.out.println("���� �ð� : "+time+" ��");
    }

    public void printBattery() {
        System.out.println("���� ���͸� �� : "+battery);
    }

    public boolean equals(Object otherObject) { //upCasting�� �� �͸� downCasting ���� : ������
        if(otherObject instanceof CellPhone02) {
            return ((CellPhone02) otherObject).model.equals(this.model);
        }

        return false;
    }
}