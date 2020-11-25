package expensesheetsystem

class Transaction {

    float value
    Date date
    String description
    User user
    
    static belongsTo = [user:User]
    
    static constraints = {
        value blank: false
        date blank: false
        description blank: false
    }
    
    static mapping = {
        table 'transactions'
        id column: 'transactionID'
        user column: 'userID'
    }
}
