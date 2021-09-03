/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
public class ServerWOFacade {
    public static void main(String[] args) throws InterruptedException{
		Facade obj = Facade.getObj();
		obj.StartServer();
		System.out.println();
		Thread.sleep(2000);
		obj.StopServer();
    }
}
