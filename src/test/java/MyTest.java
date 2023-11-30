import static org.junit.jupiter.api.Assertions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MyTest {

    // UC9: testing with all sample strings
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    public void testEmails(String email) {
        String emailRegex = "^[a-zA-Z0-9.$&%_+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        assertTrue(matcher.matches());
    }

    // UC10: testing all other fields
    @ParameterizedTest
    @ValueSource(strings = { "Chinmay", "chinmay", "ab", "aB", "abc", "Abc" })
    public void testNames(String name) {
        String nameRegex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(name);
        assertTrue(matcher.matches());
    }

    @ParameterizedTest
    @ValueSource(strings = { "91 9313402393", "+91 9313402393", "9313402393", "93134 02393", "919313402393" })
    public void testPhoneNumbers(String phone) {
        String phoneRegex = "^[0-9]{1,4} [0-9]{5,15}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phone);
        assertTrue(matcher.matches());
    }

    @ParameterizedTest
    @ValueSource(strings = { "Hello", "helloworld", "HelloWorld", "HelloWorld123", "HelloWorld@123" })
    public void testPassword(String pasword) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z\\d]).{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(pasword);
        assertTrue(matcher.matches());
    }
}
