
public class Main {
	public static void main(String[] args) {
	  int[] devices_scenario = {25, 30, 35};
    int[] aps_scenario = {10, 15};
    int rep = 32;
    SimulationSetup simulation = new SimulationSetup(rep, aps_scenario, devices_scenario);
    simulation.runSimulation();
	}
}
