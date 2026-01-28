package arrays.exercises;

public class smallest_largest {
    public static void main(String[] args) {
        int[] numbers = {45, 22, 89, 16, 90, 33};
        int smallest = numbers[0];
        int largest = numbers[0];

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] > largest){
                largest = numbers[index];
            }
            if(numbers[index] < smallest){
                smallest = numbers[index];
            }
        }
        System.out.println("Smallest: " + largest);
        System.out.println("Largest: " + smallest);
    }
}
