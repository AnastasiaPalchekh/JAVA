package HOMEWORK2;

public class TASK3 {
    public static void main(String[] args) {

        String myString = "This is my string, there are many like it but this one is mine";
        int length = myString.length();
        System.out.println(length); //длина строки

        String TEST = "t";
        System.out.println(TEST.isEmpty()); // Возвращает true, если строка пустая, false - если нет

        System.out.print("Java".charAt(0)); // Возвраûает символ строки по индексу (тип char)
        System.out.print("Java".charAt(1));
        System.out.print("Java".charAt(2));
        System.out.print("Java".charAt(3));

        String some = "some string";
        String other = "sing";
        boolean equal = some.equals(other);

        String str = String.format("Привет - %s! Как дела %s?", "Настя", "на работе");
        System.out.println(str);
        
    }

}


