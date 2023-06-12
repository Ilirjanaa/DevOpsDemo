package ch.zhaw.iwi.devops.demo;

import java.util.ArrayList;
import java.util.List;
import java.lang.IllegalArgumentException;

public class liftkata {
    private int currentFloor;
    private List<Integer> destinations;

    public void Lift() {
        currentFloor = 0;
        destinations = new ArrayList<>();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void callLift(int sourceFloor, String direction) {
        validateFloor(sourceFloor);
        destinations.add(sourceFloor);
        moveLift();
    }

    public void goToFloor(int destinationFloor) {
        validateFloor(destinationFloor);
        destinations.add(destinationFloor);
        moveLift();
    }

    private void moveLift() {
        while (!destinations.isEmpty()) {
            int destinationFloor = destinations.get(0);
            if (destinationFloor > currentFloor) {
                System.out.println("Moving up...");
                while (currentFloor < destinationFloor) {
                    currentFloor++;
                    System.out.println("Current floor: " + currentFloor);
                }
            } else if (destinationFloor < currentFloor) {
                System.out.println("Moving down...");
                while (currentFloor > destinationFloor) {
                    currentFloor--;
                    System.out.println("Current floor: " + currentFloor);
                }
            }
            System.out.println("Reached destination: Floor " + currentFloor);
            destinations.remove(0);
        }
    }

    /**
     * @param floor
     */
    private void validateFloor(int floor) {
        if (floor < 0) {
            throw new IllegalArgumentException("Invalid floor number");
        }
    }
}