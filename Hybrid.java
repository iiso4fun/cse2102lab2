
public class Hybrid implements ElectricInterface, GasolineInterface {

    private double miles;
    private double gallons;
    private double kWh;

    
    private double costPerGallon;
    private double costPerKWh;

    private final double MPG_E = 33.7;

    
    @Override
    public double calcGasMPG() {
        return miles / gallons;
    }

    @Override
    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    @Override
    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    public double getGasolineCost() {
        return gallons * costPerGallon;  
    }

    public void setCostPerGallon(double costPerGallon) {
        this.costPerGallon = costPerGallon;  
    }

   
    @Override
    public double calcMPGe() {
        return (miles / kWh) * MPG_E;
    }

    @Override
    public void setElectricMiles(double totalElectricMiles) {
        this.miles = totalElectricMiles;
    }

    @Override
    public void setTotalkWh(double totalkWh) {
        this.kWh = totalkWh;
    }

    public double getElectricCost() {
        return kWh * costPerKWh;  
    }

    public void setCostPerKWh(double costPerKWh) {
        this.costPerKWh = costPerKWh;  
    }

    
    public double calcHybridAverageMPG() {
        return (calcGasMPG() + calcMPGe()) / 2;
    }
}
