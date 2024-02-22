//Write a program to sum up all the elements of an array. 
class ArraySum {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of the elements in the array: " + sum);
    }
}