package Task_32_33_34.card;

public class Main {
    public static void main(String[] args) {
        BankCard bankCard = new BankCard("Номер карты: 1234 5678 4321 8765 \n", "Belinvest",  333, "09/23", "Ivan Ivanov");
        System.out.println("Наименование банка: " + bankCard.bankName);
        System.out.println("Имя держателя карты: " + bankCard.appellation);
        System.out.println("Персональный код: " + bankCard.code);
        System.out.println("Срок действия: " + bankCard.date);
        System.out.println("\n");
        System.out.println(bankCard.getDataChip() + "Данные прочитаны с помощью чипа");
        System.out.println(bankCard.getDataStripe() + "Данные прочитаны с помощью магнитной полосы");
    }
}
