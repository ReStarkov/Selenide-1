public class Main {
    public static void main(String[] args) {
        // примитивные типы
        byte varByte = 127;     // from -128 to 127
        short varShort = 32766; // from  -32 768 to 32767
        int varInt = 2147483647; // 2^31 ... 2^31-1
        long varLong = 2147483648L; // -2^63 ... 2^63-1
        float varFloat = 15.11111f;
        double varDouble = 15.1;
        boolean varBoolean = true; // or false
        char varChar='x';

        // операции с притивными типами данных
        System.out.println(varByte - 1);
        System.out.println(varShort + 1);
        System.out.println(varInt / 2);
        System.out.println(varLong * 2);
        System.out.println(varFloat % 2);
        System.out.println(varDouble % 2);

        // переполнение
        System.out.println(varInt + 1);

        // сравнение
        System.out.println(varByte == 127); //true
        System.out.println(varByte != 126); // true
        System.out.println(varByte >= 126); // true
        System.out.println(varByte <= 126); // false
        System.out.println(varByte < 126); // false
        System.out.println(varByte > 126); // true

        // Логические операторы
        //&& и
        if (varByte == 127 && varShort == 32766) {
            System.out.println("правда"); // правда
        }
        else {
            System.out.println("ложь");
        }

        // || или
        if (varByte == 127 || varBoolean == true) {
            System.out.println("правда"); // правда
        }
        else {
            System.out.println("ложь");
        }

        // ! не
        if (!(varByte == 127)) {
            System.out.println("правда");
        }
        else {
            System.out.println("ложь"); //ложь
        }
    }
}
