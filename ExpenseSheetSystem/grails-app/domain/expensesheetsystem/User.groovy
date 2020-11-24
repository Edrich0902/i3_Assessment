package expensesheetsystem

class User {

    String name
    String surname
    float balance
    String username
    
    static constraints = {
        name blank: false
        surname blank: false
        balance blank: false
        username blank: false
    }
}
