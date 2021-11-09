package fr.mdtechnology;


import com.restfb.DefaultFacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;

public class CommentOnPost {
    String accessToken = "EAAO2N8wZCGuEBAJFcXZC9WXUxCY61TjNEVsZBBBmcnmqraTtPu8gv9Av2ZBdWzsMbCI4dUWHHGaFkxUMobDzsuZCMKAbah9x2rn9tmqZBinSnmzfAsh0BwT62IYuqJmWc5on8CuNcTt6BFT4IGLDyE5X3vNRTfNaGV8EhkeuZAZCChYuFd6PpxwWrkQ46Fyr2UMZD";
    String postId ="122268866898963";
    DefaultFacebookClient client = new DefaultFacebookClient(accessToken, Version.VERSION_8_0);
    String response = client.publish(postId+"/comments", String.class, Parameter.with("message", "my comment here"));
}
