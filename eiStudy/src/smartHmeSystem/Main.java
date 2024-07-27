package smartHmeSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeSystem smartHome = new SmartHomeSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Add device");
            System.out.println("2. Remove device");
            System.out.println("3. Turn on device");
            System.out.println("4. Turn off device");
            System.out.println("5. Set schedule");
            System.out.println("6. Add trigger");
            System.out.println("7. Get status report");
            System.out.println("8. Get scheduled tasks");
            System.out.println("9. Get automated triggers");
            System.out.println("10. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter device type (light, thermostat, door):");
                    String type = scanner.nextLine();
                    System.out.println("Enter device ID:");
                    String id = scanner.nextLine();
                    int initialTemperature = 0;
                    if (type.equalsIgnoreCase("thermostat")) {
                        System.out.println("Enter initial temperature:");
                        initialTemperature = scanner.nextInt();
                        scanner.nextLine(); 
                    }
                    smartHome.addDevice(type, id, initialTemperature);
                    System.out.println(type.substring(0, 1).toUpperCase() + type.substring(1) + " added!");
                    break;

                case 2:
                    System.out.println("Enter device ID to remove:");
                    String removeId = scanner.nextLine();
                    if (smartHome.getDevices().containsKey(removeId)) {
                        smartHome.removeDevice(removeId);
                        System.out.println("Device " + removeId + " removed!");
                    } else {
                        System.out.println("Error: Device with ID " + removeId + " not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter device ID to turn on:");
                    String turnOnId = scanner.nextLine();
                    Device deviceToTurnOn = smartHome.getDevices().get(turnOnId);
                    if (deviceToTurnOn != null) {
                        deviceToTurnOn.turnOn();
                        System.out.println("Device " + turnOnId + " turned on!");
                    } else {
                        System.out.println("Error: Device with ID " + turnOnId + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter device ID to turn off:");
                    String turnOffId = scanner.nextLine();
                    Device deviceToTurnOff = smartHome.getDevices().get(turnOffId);
                    if (deviceToTurnOff != null) {
                        deviceToTurnOff.turnOff();
                        System.out.println("Device " + turnOffId + " turned off!");
                    } else {
                        System.out.println("Error: Device with ID " + turnOffId + " not found.");
                    }
                    break;

                case 5:
                    System.out.println("Enter device ID to set schedule:");
                    String scheduleId = scanner.nextLine();
                    if (smartHome.getDevices().containsKey(scheduleId)) {
                        System.out.println("Enter time (HH:MM):");
                        String time = scanner.nextLine();
                        System.out.println("Enter command (Turn On/Turn Off):");
                        String command = scanner.nextLine();
                        smartHome.setSchedule(scheduleId, time, command);
                        System.out.println("Schedule set for device " + scheduleId + " at " + time + " to " + command + "!");
                    } else {
                        System.out.println("Error: Device with ID " + scheduleId + " not found.");
                    }
                    break;

                case 6:
                    System.out.println("Enter condition (e.g., temperature > 75):");
                    String condition = scanner.nextLine();
                    System.out.println("Enter action (e.g., turnOff(1)):");
                    String action = scanner.nextLine();
                    smartHome.addTrigger(condition, action);
                    System.out.println("Trigger added: When " + condition + ", then " + action + "!");
                    break;

                case 7:
                    System.out.println("Status Report:");
                    System.out.print(smartHome.getStatusReport());
                    break;

                case 8:
                    System.out.println("Scheduled Tasks:");
                    System.out.println(smartHome.getScheduledTasks());
                    break;

                case 9:
                    System.out.println("Automated Triggers:");
                    System.out.println(smartHome.getAutomatedTriggers());
                    break;

                case 10:
                    scanner.close();
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}






