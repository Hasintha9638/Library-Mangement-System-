/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
/**
 *
 * @author Hasintha
 */
public class internetconnection{

	public static void main(String[] args){
		try {       notifictionCenter z=new notifictionCenter();
			try {
				URL url = new URL("http://www.google.com");
				//System.out.println(url.getHost());
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.connect();
				if (con.getResponseCode() == 200){
					System.out.println("Connection established!!");
                                       
				}
			} catch (Exception exception) {
				System.out.println("No Connection");
                                
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

