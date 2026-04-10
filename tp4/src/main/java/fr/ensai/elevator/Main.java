package fr.ensai.elevator;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {

        // --------------------------------------------------------------------
        // Create Floors, Elevators and Hotel
        // --------------------------------------------------------------------

        final int elevatorCapacity = Config.getInt("hotel.elevator.capacity");
        final int elevatorNumber = Config.getInt("hotel.elevator.number");
        final int floorNumber = Config.getInt("hotel.floor.number");
        final int nbSteps = Config.getInt("steps.count");
        final int msBetweenSteps = Config.getInt("steps.delay");

        List<Floor> floors = new ArrayList<>();
        floors.add(new Floor(0));
        floors.add(new Floor(1));
        floors.add(new Floor(2));
        floors.add(new Floor(3));

        for (int i = 1; i <= elevatorNumber; i++) {
        floors.add(new Floor(i));
        }  

        List<Elevator> elevators = new ArrayList<>();
        elevators.add(new Elevator(1, 0, elevatorCapacity));
        elevators.add(new Elevator(2, 0, elevatorCapacity));

        Hotel hotel = new Hotel(floors, elevators);

        // --------------------------------------------------------------------
        // Run simulation
        // --------------------------------------------------------------------

        for (int step = 1; step <= nbSteps; step++) {
            logger.info("\nStep: {}\n--------", step);

            hotel.update();
            hotel.spawnPerson();
            hotel.display(step);
            Thread.sleep(msBetweenSteps);
        }
        

        for (int step = 1; step <= nbSteps; step++) {
            logger.info("\nStep: {}\n--------", step);

            hotel.update();
            hotel.spawnPerson();
            hotel.display(step);
            Thread.sleep(msBetweenSteps);
        }
        {
            init: function(elevators, floors) {
                var elevator = elevators[0]; // Let's use the first elevator

                // Whenever the elevator is idle (has no more queued destinations) ...
                elevator.on("idle", function() {
                    // let's go to all the floors (or did we forget one?)
                    elevator.goToFloor(0);
                    elevator.goToFloor(1);
                });
            },
            update: function(dt, elevators, floors) {
                // We normally don't need to do anything here
            }
        }
    }

}