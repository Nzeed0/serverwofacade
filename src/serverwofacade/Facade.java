package serverwofacade;

public class Facade{
    private static Facade MyfacadeObj = null;
    private Facade() {}
    public static Facade getObj() {
        if(MyfacadeObj == null) { 
            MyfacadeObj = new Facade();
        }
        return MyfacadeObj;
    }

    public void StartServer(){
        StartServer obj = new StartServer();
        obj.StartServerFunc();
    }

    public void StopServer(){
        StopServer obj = new StopServer();
        obj.StopServerFunc();
    }
}