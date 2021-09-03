package serverwofacade;

class StopServer {
    public void StopServerFunc () {
        ScheduleServer obj = new ScheduleServer();
        System.out.println("After work done.........");
	    obj.releaseProcesses();
	    obj.destory();
	    obj.destroySystemObjects();
	    obj.destoryListeners();
	    obj.destoryContext();
	    obj.shutdown();
    }
}
