public class ParametersAndArguments {

    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;

        // Call calculateArea and store the result
        int area = calculateArea(roomWidth, roomHeight);

        // Print the result
        System.out.println("The calculated area is: " + area);
    }

    // Method to calculate the area
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }
}
