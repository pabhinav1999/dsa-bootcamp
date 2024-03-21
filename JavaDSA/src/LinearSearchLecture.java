import java.util.Scanner;

class LinearSearchLecture {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements of array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched");
        int searchNum = sc.nextInt();

        System.out.println("The element " + searchNum + " is found at index " + linearSearch(a, n, searchNum));

        // Consume the newline character left after previous nextInt()
        sc.nextLine();

        System.out.println("Enter the string in which character should be searched");
        String targetString = sc.nextLine();

        System.out.println("Enter the character to be searched");
        char toSearch = sc.next().charAt(0);

        System.out.println("The character " + toSearch + " is found at index " + charSearchInString(targetString, toSearch));
    }

    static int linearSearch(int[] a, int n, int searchNum) {
        for (int i = 0; i < n; i++) {
            if (a[i] == searchNum) {
                return i;
            }
        }
        return -1;
    }

    static int charSearchInString(String targetStr, char searchChar) {
        for (int i = 0; i < targetStr.length(); i++) {
            if (targetStr.charAt(i) == searchChar) {
                return i;
            }
        }
        return -1;
    }
}
