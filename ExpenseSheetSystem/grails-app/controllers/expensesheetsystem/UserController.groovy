package expensesheetsystem
/*Controls the creation of users*/
class UserController {

    def index() { }
    
    //Registers a new user
    def register() 
    { 
        def user = new User(params)
        user.save flush: true, failOnError: true
        session["user"] = user.username
        //passes the username of the registered user
        redirect action:'dash', params:[username:user.username]
    }
    
    //Logs in an existing user
    def login() 
    {
        //checks if username exists
        if(User.findByUsername(params.username))
        {
            session["user"] = params.username
            //moves to user dash if exists
            redirect action:'dash', params:[username:params.username]
        }
        else
        {
            //stays on login screen if false
            redirect controller:'home', action:'index'
        }
    }
    
    //Method to handle all redirections
    //Ensures that the required params are sent to the correct methods
    def redirect()
    {
        //get the user by their session
        def user = User.findByUsername(session.user)
        
        if(params.destination == 'home')
        {
            redirect action:'dash', params:[username:user.username]
        }
        else if(params.destination == "transactions")
        {
            redirect controller:'transaction', action:'list', params:[username:user.username]
        }
    }
    
    def dash()
    {
        //gets the registered or logged in user by their username
        def user = User.findByUsername(params.username)
        //gets the 3 most recent transactions by a user
        def transactions = Transaction.findAllByUser(user, [sort:"date", order:"desc", max:3])

        //returns the logged in user to the dash
        [user:user, transactions:transactions]
    }
}
