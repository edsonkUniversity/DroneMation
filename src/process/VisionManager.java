package process;

import config.SimulationParameters;
import data.Drone;
import data.Map;
import data.Position;

public class VisionManager {
    private Map map;
    private Drone drone;
    private Position firstPositionV;
    private Position lastPositionV;

    public VisionManager(Map map, Drone drone) {
        this.map = map;
        this.drone = drone;
        firstPositionV = new Position(drone.getPosition().getColumn()-SimulationParameters.NUMBER_OF_WIDTH_SQUARES,
                drone.getPosition().getColumn()-SimulationParameters.NUMBER_OF_WIDTH_SQUARES);
        lastPositionV = new Position(drone.getPosition().getColumn()+SimulationParameters.NUMBER_OF_WIDTH_SQUARES,
                drone.getPosition().getColumn()+SimulationParameters.NUMBER_OF_WIDTH_SQUARES);
    }

    public void detectionTree (){

    }

}
