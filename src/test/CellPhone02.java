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
            throw new IllegalArgumentException("통화시간입력오류");
        }

        battery -= time * 0.5;
        battery = battery < 0 ? 0 : battery;

        System.out.println("통화 시간 : "+time+" 분");
    }

    public void charge(int time) {
        if(time < 0) {
            throw new IllegalArgumentException("충전시간입력오류");
        }

        battery += time * 3;
        battery = battery > 100 ? 100 : battery;

        System.out.println("충전 시간 : "+time+" 분");
    }

    public void printBattery() {
        System.out.println("남은 배터리 양 : "+battery);
    }

    public boolean equals(Object otherObject) { //upCasting이 된 것만 downCasting 가능 : 안전성
        if(otherObject instanceof CellPhone02) {
            return ((CellPhone02) otherObject).model.equals(this.model);
        }

        return false;
    }
}