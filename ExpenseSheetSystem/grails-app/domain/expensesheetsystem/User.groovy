package expensesheetsystem

class User {

    String name
    String surname
    float balance
    String username
    
    static hasMany = [transactions: Transaction]
    
    static constraints = {
        name blank: false
        surname blank: false
        balance blank: false
        username blank: false
    }
    
    static mapping = {
        table 'users'
        id column: 'userID'
    }
    
    String toString()
    {
        name
    }
}
