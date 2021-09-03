package serverwofacade;

class StartServer {
    public void StartServerFunc () {
        ScheduleServer obj = new ScheduleServer();
        obj.startBooting();
        obj.readSystemConfigFile();
        obj.init();
        obj.initializeContext();
        obj.initializeListeners();
        obj.createSystemObjects();
        System.out.println("Start working......");
    }
}