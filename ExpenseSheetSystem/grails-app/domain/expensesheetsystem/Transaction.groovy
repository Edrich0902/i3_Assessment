package expensesheetsystem

class Transaction {

    float value
    Date date
    String description
    
    static constraints = {
        value blank: false
        date blank: false
        description blank: false
    }
}
