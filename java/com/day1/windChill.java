package com.gedigitalday1;

public class windChill {
    public static void main(String[] args) {
        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two double command-line arguments (temperature and wind speed).");
            return;
        }

        // Parse command-line arguments
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        // Check if the provided values are in the valid range
        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Invalid input. Temperature should be between -50 and 50 (in absolute value), "
                    + "and wind speed should be between 3 and 120.");
            return;
        }

        // Calculate wind chill
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        // Print the result
        System.out.println("Wind Chill: " + w);
    }
}
