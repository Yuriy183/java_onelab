package onelab;

public class Contract {
    Depositor depositor; // ФИО вкладчика
    int contractNumber; // номер договора
    Address address; // домашний адрес
    int depositAmount; // сумма вклада
    int term; // срок заключённого договора

    public Contract() {

    }

    public Contract(Depositor depositor, int contractNumber, Address address, int depositAmount, int term) {
        this.depositor = depositor;
        this.contractNumber = contractNumber;
        this.address = address;
        this.depositAmount = depositAmount;
        this.term = term;
    }


    public Depositor getDepositor() {
        return depositor;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public Address getAddress() {
        return address;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public int getTerm() {
        return term;
    }


    public void setDepositor(Depositor depositor) {
        this.depositor = depositor;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;

    }

    public void setTerm(int term) {
        this.term = term;
    }


    @Override
    public String toString() {
        return
                "ФИО - " + depositor + '\n' +
                "Контракт №" + contractNumber + '\n' +
                "Адрес - " + address + '\n' +
                "Сумма вклада - " + depositAmount + " у.е" + '\n' +
                "Срок заключения договора - " + term + " месяцев" + '\n' +
                "--------------------------------------------\n";
    }
}
