package expensesheetsystem
/*Controls the creation of transactions*/
class TransactionController {

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
    
    //Create a new transaction
    def test() 
    {
        render "Test"
    }
}
