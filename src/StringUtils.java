public class StringUtils {
    /**
     * makePurdueUsername -- <= 4-letter-long lowercase username creator
     * Usernames may be AT MOST 4 letters in length, and should
     * consist of the first letter of one's first name, and the 
     * amount of their last name that will fit into the remaining
     * 3 characters. All should be lowercase.
     * Ex: a = "Sean ", b = "Flannery", returns "sfla"
     */
    public static String makePurdueUsername(String firstName, String lastName) {
        /* Generate the long version of the name first:
            Ex: firstName = "Sean", lastName = "Flannery"
                    --> res = "SFlannery"
         */

        String firstLetter = firstName.substring(0,2);

        String res = firstLetter + lastName;

        res = shortenUsername(res, 4);

        /* Convert the name to lower-case
            Ex: res = "SFlanner"
                    --> res = "sfla"
         */
        res.toLowerCase();

        /* return the result of our calculation */
        return res;
    }

    public static String shortenUsername(String username, int len) {
        /* Shorten the string to <len> characters
            Ex: res = "SFlannery"
                    --> res = "SFla"
         */
        if(username.length() > len) {
            username = username.substring(0, len);
        }

        return username;
    }

    /**
     * replaceStudentUsername -- replace student usernames in sensitive text
     * We want to make sure student information is expunged from sensitive
     * documents as much as possible. 
     * Ex: text = "jframes was among the students whose SSNs were leaked.",
     * username = "[DATA EXPUNGED] was among the students whose SSNs were leaked.",
     */
    public static String replaceStudentUsername(String text, String username) {
        /* Replace every instance of the username with proper message */
        return text.replaceAll(username, "[DATA EXPUNGED]");
    }
}