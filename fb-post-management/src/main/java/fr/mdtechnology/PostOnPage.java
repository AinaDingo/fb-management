package fr.mdtechnology;


import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;

public class PostOnPage {
    String accessToken = "EAAO2N8wZCGuEBAJFcXZC9WXUxCY61TjNEVsZBBBmcnmqraTtPu8gv9Av2ZBdWzsMbCI4dUWHHGaFkxUMobDzsuZCMKAbah9x2rn9tmqZBinSnmzfAsh0BwT62IYuqJmWc5on8CuNcTt6BFT4IGLDyE5X3vNRTfNaGV8EhkeuZAZCChYuFd6PpxwWrkQ46Fyr2UMZD";
    FacebookClient fbClient = new DefaultFacebookClient(accessToken, Version.VERSION_8_0);
}
