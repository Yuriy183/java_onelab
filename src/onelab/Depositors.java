package onelab;

import java.util.ArrayList;

public class Depositors {
    public ArrayList<Contract> contracts  = new ArrayList<>();

    public Depositors(){

    }

    @Override
    public String toString() {
        String result = "Depositors list:\n";

        for (Contract contract : contracts) {
            result += contract + "\n";
        }

        return result;
    }
}
