package ru.kdv;

public class t1000 implements robot {
    private Hand hand;
    private Leg leg;
    private Head head;

    String color;

    int year;

    boolean soundEnabled;
    public t1000(String color, int year, boolean soundEnabled) {
        this.color = color;
        this.year = year;
        this.soundEnabled = soundEnabled;
    }

    public t1000() {
    }

    public t1000(Hand hand, Leg leg, Head head) {
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
        System.out.printf("color:%s year:%d soundEnabled:%s",this.color, this.year, this.soundEnabled);

    }

    @Override
    public void dance() {
        System.out.println("make dance");
    }

    public void initMethod(){
        System.out.println("init method t1000!");
    }
    public void destroyMethod(){
        System.out.println("destroy method t1000!");
    }
    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isSoundEnabled() {
        return soundEnabled;
    }

    public void setSoundEnabled(boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
    }
}
