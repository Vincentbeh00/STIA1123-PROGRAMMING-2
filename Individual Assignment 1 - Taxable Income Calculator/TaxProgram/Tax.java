
public class Tax {
    private Person person;
    private double taxableIncome;
    private String status;
    private double taxAmount;
    private double RATE1 = 0.10;
    private double RATE2 = 0.20;
    private double RATE3 = 0.35;

    public Tax(Person person, double taxableIncome, String status) {
        this.person = person;
        this.taxableIncome = taxableIncome;
        this.status = status;
        this.taxAmount = calculateTax();
    }

    public double calculateTax() {

    if (status.equals("single")) {
        if (taxableIncome <= 21000) {
            taxAmount = taxableIncome * RATE1;
            return taxAmount;
            
        } else if (taxableIncome <= 51000) {
            taxAmount = taxableIncome * RATE2;
            return taxAmount;
        } else {
            taxAmount = taxableIncome * RATE3;
            return taxAmount;
        }
    } else if (status.equals("married")) {
        if (taxableIncome <= 35000) {
            taxAmount = taxableIncome * RATE1;
            return taxAmount;
        } else if (taxableIncome <= 86000) {
            taxAmount = taxableIncome * RATE2;
            return taxAmount;
        } else {
            taxAmount = taxableIncome * RATE3;
            return taxAmount;
        }
    }
    return 0;
    }
    
    
    @Override
    public String toString() {
        return "person= " + person + ", taxableIncome=" + taxableIncome + ", status=" + status + ", taxAmount=" + taxAmount;
    }

    public String getName() {
        return person.getName();
    }

    public String getIcNo() {
        return person.getIcNo();
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public void setRATE1(double RATE1) {
        this.RATE1 = RATE1;
    }

    public void setRATE2(double RATE2) {
        this.RATE2 = RATE2;
    }

    public void setRATE3(double RATE3) {
        this.RATE3 = RATE3;
    }

    public Person getPerson() {
        return person;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public String getStatus() {
        return status;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getRATE1() {
        return RATE1;
    }

    public double getRATE2() {
        return RATE2;
    }

    public double getRATE3() {
        return RATE3;
    }
     
}

