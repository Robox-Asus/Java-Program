public class TowerOfHanoi {
    //Recursive Method for Solving the Tower of hanoi.

    static int count = 0; // Number of step = (2 to the power numofDisk) - 1
    // Suppose if num of disk is 3 then (2^3) - 1 = 7
    private static void TOH(char source, char auxiliary, char destination, int numOfDisk) {
        if (numOfDisk > 0)
        {
            TOH(source, destination, auxiliary, numOfDisk-1);
            System.out.println(++count +" : " +"Move 1 disk from "+source+" to "+destination+" using "+auxiliary+".");
            TOH(auxiliary, source, destination,numOfDisk-1);
        }
    }
    public static void main(String[] args) {

        TOH('A','B','C', 3);
    }
}
