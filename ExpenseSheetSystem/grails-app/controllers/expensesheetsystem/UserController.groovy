package expensesheetsystem
/*Controls the creation of users*/
class UserController {

    def index() { }
    
    //Registers a new user
    def register() 
    { 
        def user = new User(params)
        user.save flush: true, failOnError: true
        //passes the username of the registered user
        redirect action:'dash', params:[username:user.username]
    }
    
    //Logs in an existing user
    def login() 
    {
        //checks if username exists
        if(User.findByUsername(params.username))
        {
            //moves to user dash if exists
            redirect action:'dash', params:[username:params.username]
        }
        else
        {
            //stays on login screen if false
            redirect controller:'home', action:'index'
        }
    }
    
    def dash()
    {
        //gets the registered or logged in user by their username
        def user = User.findByUsername(params.username)
        //gets the list of transactions for the logged in user
        def transactions = Transaction.findAllByUser(user)
        //returns the logged in user to the dash
        [user:user, transactions:transactions]
    }
}
