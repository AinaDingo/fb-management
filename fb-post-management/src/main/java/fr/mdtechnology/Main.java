package fr.mdtechnology;

import com.restfb.Parameter;
import com.restfb.types.FacebookType;

public class Main {
    public static void main(String[] args){
        PostOnPage page =  new PostOnPage();
        FacebookType response = page.fbClient.publish("gasynetwork/feed", FacebookType.class, //
                Parameter.with("message", "Access on app"));
        System.out.println("Mande");

    }
}
