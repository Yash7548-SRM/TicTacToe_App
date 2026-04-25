import java.util.Scanner;

public class UC3 {
    public static int getSlot() {
        Scanner scanner = new Scanner(System.in);
        int slot = scanner.nextInt();
        return slot;
    }

    public static void main(String[] args) {
        int slot = getSlot();
        System.out.println("Selected Slot: " + slot);
    }
}