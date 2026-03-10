public class BannerAppUC6 {

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    oPattern[i],
                    oPattern[i],
                    pPattern[i],
                    sPattern[i]
            );
        }

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // ---------- O Pattern ----------
    public static String[] getOPattern() {
        return new String[] {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };
    }

    // ---------- P Pattern ----------
    public static String[] getPPattern() {
        return new String[] {
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // ---------- S Pattern ----------
    public static String[] getSPattern() {
        return new String[] {
                " ******* ",
                " *       ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        };
    }
}