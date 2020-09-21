package onelab;

public class Depositor {
    private String Name;
    private String Surname;
    private String Patronymic;

    public Depositor() {

    }

    public Depositor(String name, String surname, String patronymic) {
        Name = name;
        Surname = surname;
        Patronymic = patronymic;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }


    @Override
    public String toString() {
        return Surname + ' ' + Name + Patronymic ;
    }

}
