##### Основные регулярные выражения http://www.quizful.net/post/Java-RegExp
- \\\после обратных двух сплешей идете специальный символ
- \\\d - обозначает одню любую цифру, так же обазоначается  [0-9]
- \+ - 1 или более
- \* - 0 и более
- ? - 0 или 1 символ до
- . - любой символ (Буква, цифра, знак и т.д.)
- ("-?\\d+")- любое отрицатлеьное число или любое положительное число.
- (a|b|c)  -  a или b или c (проверка на 1 букву в нашей строке String s = "ab"; будет false)
- (a|b|c)+  -  a или b или c (проверка на любые буквы в нашей строке String s = "ab"; будет true)
- [a-c] - (a|b|c)
- [^a-c] - кроме a, b ,c
- ("(-|\\+)?\\d+")) -  - или + (0 или 1 символ до) и любое значение цифр \\+ преобразование в обычный символ
- [a-zA--Z]   все английские буквы одна буква
- [a-zA--Z]+  все английские буквы множество букв
- \\\w+ Анаологично двум примерам сверху 
- {2} - 2 символа (\\d{2})
- {2,} - 2 или более символа (\\d{2,})
- {2,4} - 2 или 3 или 4 символа (\\d{2,4})

#### Метод split() — в Java разделяет данную строку вокруг данного регулярного выражения и имеет два варианта.
- Синтаксис: public String[] split(String regex, int limit) или   public String[] split(String regex)
- параметры: regex — разграничение регулярного выражения; limit — порог, результатом которого означает, как много строк, должно быть возвращено.

#### Метод replace() — возвращает В Java новую строку, в результате, заменив все вхождения oldChar, в данной строке, на newChar, другими словами — метод позволяет заменить символ в строке.
- Синтаксис: public String replace(char oldChar, char newChar)
- Параметры: oldChar — старый символ; и oldChar — старый символ;

#### Метод replaceAll() — заменяет каждую подстроку данной строки, которая соответствует заданному регулярному выражению, с данной заменой, другими словами — метод позволяет заменить слово в строке.
- Синтаксис public String replaceAll(String regex, String replacement)
- Параметры: regex — регулярное выражение, которому данная строка должна соответствовать; eplacement — строка, которая заменит найденное выражение.

#### классы Pattern и Matcher
-Класс Pattern предоставляет нам скомпилированный вариант регулярного выражения.
-Этот класс интерпретирует шаблон и предоставляет определяет совпадения в водимой строке. 
