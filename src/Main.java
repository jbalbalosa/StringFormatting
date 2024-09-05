public class Main {
    public static void main(String[] args) {
   System.out.println("String Formatting!\n\n");
        String bulletIt = "Print a Bulleted List \n" +
                "\t\u2022 First \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);
        System.out.println();

        String textBlock = """
                Print a Bulleted List:
                            \u2022 First Point
                                \u2022 Sub Point""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d", age);
        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age );
        System.out.println(formattedString);

        formattedString = "your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
