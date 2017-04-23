package Task3;

class Data {
    private int number = 0;


    public void setNumber(int number) {
        this.number = number;
    }

    public String PositiveNegative() {
        if (number >= 0)
            return "This number is positive.";
        else return "This number is negative.";
    }

    public String Prime() {
        if (number == 2 || number == 3 || number == 5)
            return "Entered number is a prime one.";
        else if (number % 2 != 0 & number % 3 != 0 & number % 5 != 0)
            return "Entered number is a prime one.";
        else return "Entered number is not a prime one.";
    }

    public String Division() {
        int array[] = {2, 3, 5, 6, 9};
        String log = "It is possible to devide entered number by the following numbers evenly: ";
        for (int i = 0; i < array.length; i++) {
            if (number % array[i] == 0) {
                log += array[i];
                log += ' ';
            }
        }
        return log;
    }
}
