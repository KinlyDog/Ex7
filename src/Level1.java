public class Level1 {
    public static int[] UFO(int n, int[] data, boolean octal) {
        int[] ma = new int[n];

        for (int i = 0; i < n; i++) {
            String str = String.valueOf(data[i]);

            if (octal) {
                ma[i] = Integer.parseInt(str, 8);
            } else {
                ma[i] = Integer.parseInt(str, 16);
            }
        }

        return ma;
    }
}
