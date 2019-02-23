package by.bntu.tarazenko.model;

public abstract class SmartHouse {
    private TurnBehavior turnBehavior;

    public void setTurnBehavior(TurnBehavior turnBehavior) {
        this.turnBehavior = turnBehavior;
    }

    public String performTurnOn() {
       return turnBehavior.turnOn();
    }

    public String performTurnOff(){
        return turnBehavior.turnOff();
    }

    public String choose(String s){
        String ans = performTurnOff();
        if(s.equals("On")){
            ans = performTurnOn();
        }
        return ans;
    }

    public abstract String display();

}
