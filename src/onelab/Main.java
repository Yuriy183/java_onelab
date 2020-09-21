package onelab;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Depositors depositors = new Depositors();
        depositors.contracts.add(new Contract(new Depositor("О.", "Иванов", "С."), 1, new Address("Киев", "ул.Крымская", 4), 100, 5));
        depositors.contracts.add(new Contract(new Depositor("А.", "Кондратьев", "П."), 2, new Address("Харьков", "ул.Центральная", 24), 1000, 11));
        depositors.contracts.add(new Contract(new Depositor("В.", "Павлов", "Д."), 3, new Address("Херсон", "ул. Крымская", 7), 5000, 16));
        depositors.contracts.add(new Contract(new Depositor("Н.", "Вишняков", "И."), 4, new Address("Одесса", "ул.Молдаванка", 38), 150, 5));
        depositors.contracts.add(new Contract(new Depositor("З.", "Наумов", "В."), 5, new Address("Киев", "ул.Пушкина", 12), 300, 7));

        System.out.println(depositors.contracts);

        //а) выдачу сведений о каждом из вкладчиков (по фамилии, введенной по запросу);
        System.out.println("Введите фамилию: ");
        String surname = in.next();
        for (Contract contract : depositors.contracts) {
            if (contract.depositor.getSurname().equals(surname)) {
                System.out.println(contract);
            }
        }

        //б) выдачу сведений о вкладчиках, вклад которых превышает заданную сумму;
        System.out.println("Введите сумму, дабы получить сведенья о вкладчиках, вклад которых превышает её: ");
        int temp = in.nextInt();
        for (Contract contract : depositors.contracts) {
            if (contract.getDepositAmount() > temp) {
                System.out.println(contract);
            }
        }

        //в) выдачу сведений о вкладчиках, у которых срок договора свыше 12 месяцев.
        System.out.println('\n' + "Выдача сведений о вкладчиках, у которых срок договора свыше 12 месяцев: ");
        for (Contract contract : depositors.contracts) {
            if (contract.getTerm() > 12) {
                System.out.println(contract);
            }
        }

        //г) удаление записей о вкладчиках с заданной фамилией
        System.out.println("Удаление записей о вкладчиках с заданной фамилией: ");
        surname = in.next();
        Iterator<Contract> contractIterator = depositors.contracts.iterator();
        while (contractIterator.hasNext()) {
            Contract contract = contractIterator.next();
            if (contract.depositor.getSurname().equals(surname)) {
                contractIterator.remove();
            }
        }
        System.out.println("Новый список: \n" + depositors.contracts);
    }
}
