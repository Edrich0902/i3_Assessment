package expensesheetsystem

class Transaction {

    float value
    Date date
    String description
    float runningBalance
    User user
    
    static belongsTo = [user:User]
    
    static constraints = {
        value blank: false
        date blank: false
        description blank: false
        runningBalance blank: false
    }
    
    static mapping = {
        table 'transactions'
        id column: 'transactionID'
        user column: 'userID' //Allows you to find all transactions specific to one user
    }
}
