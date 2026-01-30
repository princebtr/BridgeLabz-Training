// Validate a Username
// A valid username:
// Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
// Must start with a letter
// Must be between 5 to 15 characters long
// 🔹 Example Inputs & Outputs
// ✅ "user_123" → Valid
// ❌ "123user" → Invalid (starts with a number)
// ❌ "us" → Invalid (too short)

import java.util.regex.Pattern;
public class ValidateUsername {
    private static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);

    public static boolean isValid(String username) {
        return pattern.matcher(username).matches();
    }
    public static void main(String[] args) {
        String[] testUsernames = {"user_123", "123user", "us", "valid_User1", "too_long_username_123"};
        for (String username : testUsernames) {
            System.out.println(username + " → " + (isValid(username) ? "Valid" : "Invalid"));
        }
    }
}