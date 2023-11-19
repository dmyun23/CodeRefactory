package chapter11.replaceQueryWithParameter;

public class Example {
    HeatingPlan heatingPlan;
    public void client(){
        if(heatingPlan.targetTemperature(Thermostat.selectedTemperature)> Thermostat.currentTemperature) setToHeat();
        else if(heatingPlan.targetTemperature(Thermostat.selectedTemperature) < Thermostat.currentTemperature) setToCool();
        else setOff();
    }
    private void setOff() {
    }

    private void setToCool() {
    }

    private void setToHeat() {
    }
}
