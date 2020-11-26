package expensesheetsystem
/*Controls the creation of transactions*/
class TransactionController {

    /*Creates and stores a new transaction in the database
     * Also modifies the user's balance according to the value
     * of the new transaction
     * */
    def newTransaction()
    {
        def user = User.findByUsername(session.user)
        
        def transaction = new Transaction(
            user: user,
            value: params.value,
            date: params.date,
            description: params.description
        )
        //save transaction to the database
        transaction.save flush: true, failOnError: true

        def value = params.value as float
        def balance = user.balance as float
        def newBalance = balance - value
        //updates the user's balance
        user.balance = newBalance as float
        user.save flush:true, failOnError:true
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
        def transactions = Transaction.findAllByUser(user)
        //returns the logged in user to the dash
        [user:user, transactions:transactions]
    }
}
