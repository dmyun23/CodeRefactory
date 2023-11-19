package chapter11.replaceQueryWithParameter;

public class HeatingPlan {
    int max;
    int min;

    public int targetTemperature(int selectedTemperature){
        if(selectedTemperature > this.max) return this.max;
        else if(selectedTemperature < this.min) return this.min;
        else return selectedTemperature;
    }
}
