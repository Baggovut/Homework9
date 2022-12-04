public class Main {
    public static void main(String[] args) {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int[] arr = generateRandomArray();
        int totalSpending = 0, minSpending = arr[0], maxSpending=0;
        double averageSpending;
        //Задание 1
        for (int current : arr){
            totalSpending+=current;
        }
        System.out.println("Сумма трат за месяц составила "+totalSpending+" рублей");

        //Задание 2
        for (int current : arr){
            if (minSpending > current) minSpending = current;
            if (maxSpending < current) maxSpending = current;
        }
        System.out.println("Минимальная сумма трат за день составила "+minSpending+" рублей. Максимальная сумма трат за день составила "+maxSpending+" рублей");
        //Задание 3
        averageSpending=(double)totalSpending/30;
        System.out.println("Средняя сумма трат за месяц составила "+averageSpending+" рублей");

        //Задание 4
        for(int j=0;j < reverseFullName.length;j++){
            //слева направо последовательно меняем местами по 2 буквы, пока не доходим до последнего нужного значения
            for (int i=0; i < reverseFullName.length - 1-j;i++){
                reverseFullName[i]=(char)((int)reverseFullName[i]+(int)reverseFullName[i+1]);
                reverseFullName[i+1]=(char)((int)reverseFullName[i]-(int)reverseFullName[i+1]);
                reverseFullName[i]=(char)((int)reverseFullName[i]-(int)reverseFullName[i+1]);
            }
        }

        System.out.println(reverseFullName);
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}