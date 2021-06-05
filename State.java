public class State {
    private State(){}
    private static State state;
    public static State stateMaker(){
        if (state == null){
            state=new State();
        }
        return state;
    }
    CurrentStates currentStates;
}
enum CurrentStates{
    AUTHENTICATOR_LOGIN,
    AUTHENTICATOR_SIGNUP,
    MAIN_MENU,
}
