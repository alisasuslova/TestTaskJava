# Тестовое задание

## Входные данные:
Тестовое задание

Есть множество (массив, где порядок не важен) целых чисел в диапазоне от 1 до 300. 
Количество чисел - до 1000. Напишите функцию сериализации / десериализации в строку, чтобы итоговая строка была компактной.
Цель задачи - максимально сжать данные относительно простой сериализации без алгоритма сжатия (хотя бы 50% в среднем). 
Сериализованная строка должна содержать только ASCII символы. Можно использовать любой язык программирования.
Вместе с решением нужно прислать набор тестов  - исходная строка, сжатая строка, коэффициент сжатия.
Примеры тестов: простейшие короткие, случайные - 50 чисел, 100 чисел, 500 чисел, 1000 чисел, граничные - все числа 1 знака, все числа из 2х знаков, все числа из 3х знаков, каждого числа по 3 - всего чисел 900.


## Реализация:

1. В Main задала входные параметры, верхнюю и нижнюю границу диапазона, в котором будут генерироваться числа случайным образом. Подключила функцию Random:
```java
    int lowBorder = 1;
    int upBorder = 299;
    int count = (int) (Math.random() * (1000 - 1));
```
2. Создала метод, который в случайном порядке будет заполнять массив числами:
```java
    public static int[] createArray(int count, int lowBorder, int upBorder) {
        return IntStream
                .generate(() -> lowBorder + new Random().nextInt(upBorder - lowBorder + 1))
                .limit(count)
                .toArray();
    }
```
3. Создала метод, который конвертирует массив чисел в строку символов, и на выходе возращает длину этой строки:
```java
    public static int convertToString(int[] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.
                    append(arr[i]);
        }
        return sb.length();
    }
```
4. Создала метод аналогичный предыдущему, но только вместо цифр соотвествующие им символы из таблицы ASCII:
```java
    public static int convertToASCII(int[] arr) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char ch = (char) arr[i];
            sb.append(ch);
        }
        return sb.length();
    }
```
5. Последний метод, позволяющий наглядно продемострировать изменение длины строки в процентах:
```java
    public static double compressionRatio(int stringLength, int stringLengthASCII) {

        double result = ((double) stringLengthASCII / (double) stringLength) * 100;
        System.out.println("исходная строка " + stringLength + " символов");
        System.out.println("сжатая строка " + stringLengthASCII + " символов");
        System.out.println("коэффициент сжатия " + result + "%");
        return result;
    }
```
6. К методу `compressionRatio()` написаланесколько автотестов:
```java
    @Test
    public void compressionRatio50() {
        int stringLength = convertToString(createArray((int) (Math.random() * (1000 - 1)), 1, 50));
        int stringLengthASCII = convertToASCII(createArray((int) (Math.random() * (1000 - 1)), 1, 50));
        compressionRatio(stringLength, stringLengthASCII);
    }

    ....

    @Test
    public void compressionRatioLast900() {
        int stringLength = convertToString(createArray(900, 100, 999));
        int stringLengthASCII = convertToASCII(createArray(900, 100, 999));
        compressionRatio(stringLength, stringLengthASCII);
    }
```
## Выходные данные:

[Скрин_1](https://github.com/alisasuslova/TestTaskJava/blob/main/res_1.JPG)

[Скрин_2](https://github.com/alisasuslova/TestTaskJava/blob/main/res_2.JPG)

