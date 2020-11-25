package expensesheetsystem
/*Controls the creation of transactions*/
class TransactionController {

    def index() { }
    
    //Create a new transaction
    def newTransaction() 
    {
        def transaction = new Transaction(
            user: params.user,
            value: params.value,
            date: params.date,
            description: params.description
        )
        
        transaction.save flush: true, failOnError: true
        def user = User.findByUsername(session.user)
        
        redirect action:'list', params:[username:user.username]
    }
    
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
