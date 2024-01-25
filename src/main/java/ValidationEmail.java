//Проверить соответствуют ли элементы массива шаблону email-а с помощью регулярных выражений
//String[] emailsList = { "test@mail.ru", "123-kkdf@gmail.com", "123@343.com",
//"qwerty@.com", "123123@yandex.com", "test.test@gmail.com", "sdfsdfs@gmail."};

import java.util.regex.Pattern;

public class ValidationEmail {
    public static void main(String[] args) {
        String[] emailsList = {
                "test@mail.ru",
                "123-kkdf@gmail.com",
                "123@343.com",
                "qwerty@.com",
                "123123@yandex.com",
                "test.test@gmail.com",
                "sdfsdfs@gmail."
        };
        String emailPattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailPattern);

        for (String email : emailsList) {
            boolean isValidation = pattern.matcher(email).matches();
            System.out.println(email + "-" + (isValidation ? "Validation" : "NoValidation"));
        }
    }
}
