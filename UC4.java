public class UC4 {
    public static int[] getPosition(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int slot = 5;
        int[] position = getPosition(slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}