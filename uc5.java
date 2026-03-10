public class BannerAppUC5 {

    public static void main(String[] args) {

        String[] banner = {

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        " ******* ",
                        " ******* "
                ),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        " *     * ",
                        " *     * "
                ),

                String.join(" ",
                        "*       *",
                        "*       *",
                        "*       *",
                        "*        "
                ),

                String.join(" ",
                        "*       *",
                        "*       *",
                        " ******* ",
                        "  *****  "
                ),

                String.join(" ",
                        "*       *",
                        "*       *",
                        "*        ",
                        "        *"
                ),

                String.join(" ",
                        " *     * ",
                        " *     * ",
                        "*        ",
                        " *     * "
                ),

                String.join(" ",
                        "  *****  ",
                        "  *****  ",
                        "*        ",
                        "  *****  "
                )
        };

        // Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}