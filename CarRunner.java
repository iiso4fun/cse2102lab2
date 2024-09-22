
public class CarRunner {

    public static void main(String[] args) {
        HybridVehicle hybridCar = new HybridVehicle();

        
        hybridCar.setCostPerGallon(3.50);
        hybridCar.setCostPerKWh(0.24);

       
        hybridCar.setMilesfromGas(120);  
        hybridCar.setGallonsfromGas(6);  
        double gasMPG = hybridCar.calcGasMPG();  
        double gasCost = 6 * hybridCar.getCostPerGallon();
        System.out.println("Gasoline mode MPG: " + gasMPG);
        System.out.println("Cost of gasoline trip: $" + gasCost);

       
        hybridCar.setElectricMiles(300);  
        hybridCar.setTotalkWh(70);        
        double mpge = hybridCar.calcMPGe();  
        double electricCost = 70 * hybridCar.getCostPerKWh();
        System.out.println("Electric mode MPGe: " + mpge);
        System.out.println("Cost of electric trip: $" + electricCost);

        
        double hybridAverageMPG = hybridCar.calcHybridAverageMPG();
        System.out.println("Hybrid mode average MPG: " + hybridAverageMPG);
    }
}

