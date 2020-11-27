package expensesheetsystem

/*Controls the creation of transactions*/
class TransactionController {

    TransactionService transactionService
    /*Creates and stores a new transaction in the database
     * Also modifies the user's balance according to the value
     * of the new transaction
     * */
    def newTransaction()
    {
        def user = User.findByUsername(session.user)
        
        def value = params.value as float
        def balance = user.balance as float
        def newBalance = balance - value
        //updates the user's balance
        user.balance = newBalance as float
        user.save flush:true, failOnError:true
        
        def transaction = new Transaction(
            user: user,
            value: params.value,
            date: params.date,
            description: params.description,
            runningBalance: newBalance
        )
        //save transaction to the database
        transaction.save flush: true, failOnError: true
        //redirects to the list of transactions on completion of above code
        redirect action:"list", params:[username:user.username]
    }
    
    def index() { }
    
    def createNew()
    {
        def user = User.findByUsername(session.user)
        [user:user]
    }
    
    //List all the transactions for a user
    def list()
    {
        //gets the registered or logged in user by their username
        def user = User.findByUsername(params.username)
        //gets the list of transactions for the logged in user
        def transactions = Transaction.findAllByUser(user, [sort:"date", order:"desc"])
        //returns the logged in user to the dash
        [user:user, transactions:transactions]
    }
    
    def export()
    {        
        response.setHeader("Content-disposition", "attachment; filename=transaction_list.csv")
        
        def user = User.findByUsername(session.user)
        def transactions = Transaction.findAllByUser(user)
        
        def results = []
        for(transaction in transactions)
        {
             def r = [transaction.id, transaction.description, transaction.date, transaction.value, transactionService.convertCurrency(transaction.value), transaction.runningBalance]
             results << r
        } 
        
        def result = "ID, Description, Date, Value, Dollar Value, Running Balance\n"
        results.each{ row->
            row.each{
                col-> result = result + col + ","
            }
            result = result[0..-2]
            result = result + "\n"
        }
        
        println result
        
        render contentType:"text/csv", text:result
    }
}
