import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {
    public static void main(String[] args) {
        String url = "https://www.google.com";
        System.out.println(url.matches("https://www\\..+\\.(ru|com)")); //проверка на сайт
        // https://www(все сайты начинаются с этих символов)
        // \\. (преобразование специального символа точка в обычный символ)
        // .+(название сайта может иметь любые символы)
        // (ru|com) (ru или com)

        String s1 = "Hello.there.hey";
        String[] words1 = s1.split("\\."); //  (преобразование специального символа точка в обычный символ)
        System.out.println(Arrays.toString(words1));
        //Вывоодим наш массив все строки без точки.

        String s2 = "Hello123here567hey789now";
        String[] words2 = s2.split("\\d+"); //  (1 или более цифр)
        System.out.println(Arrays.toString(words2));
        //Вывоодим наш массив строк. Удаляя все цифры.

        String s3 = "Hello.there.hey";
        String c3 = s3.replace(".", "-");
        System.out.println(c3);
        //заменяем нашу строку все точки на тире.

        String s4 = "Hello123here567hey789now";
        String c4 = s4.replaceAll("\\d+", "-");
        System.out.println(c4);
        // Метод replaceAll()- используем в параметрах регулярное выражение и выводим нашу строку заменяя все цифры на тире

        String s5 = "Hello123here567hey";
        String c5 = s5.replaceFirst("\\d+", "-");
        System.out.println(c5);
        // Метод replaceFirst() - Аналогично, как сверху, только заменяем только первое совпадение на тире.

        String text = "Hello, Guys! I send you email joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I'm sending you\n" +
                "my address: tim@yandex.ru. Let's stay in touch....";
        Pattern email =Pattern.compile("\\w+@(gmail|yandex)\\.(ru|com)"); //(gmail|yandex) -(group 1);  (ru|com)- (group 2)
        // Этот Pattern будет обозначать наш email
        Matcher matcher = email.matcher(text);
        while (matcher.find()) { // public boolean find() Ищет подстроку вводной строки, которая совпадает с шаблоном.
            System.out.println(matcher.group()); //выводит все совпадающие строки
            System.out.println(matcher.group(1)); //выводит (group 1)
        }
    }
}
