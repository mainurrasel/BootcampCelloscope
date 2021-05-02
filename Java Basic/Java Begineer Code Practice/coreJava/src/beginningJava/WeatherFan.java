package beginningJava;

public class WeatherFan {
    public static void main(String[] args) {
        float[][] temperature = new float[10][365];
        // Generate random temperatures
        for (int i = 0; i < temperature.length; ++i) {
            for (int j = 0; j < temperature[i].length; ++j) {
                temperature[i][j] = (float) (45.0 * Math.random() - 10.0);
            }
        }
        // Calculate the average per location
        for (int i = 0; i < temperature.length; ++i) {
            float average = 0.0f;
            for (int j = 0; j < temperature[i].length; ++j) {
                average += temperature[i][j];
            }
            System.out.println("Avg temp at location" + (i + 1) + " = " + average / (float) temperature[i].length);
        }
    }
}