/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test_twitter.integration;

import java.util.List;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;


public class TwitterHandler {

    public List<Status> getTweets(Twitter twitter) throws TwitterException {
        List<Status> statuses, retweets;
        statuses = twitter.getUserTimeline();
        retweets = twitter.getRetweetedByMe();
        statuses.addAll(retweets);
        return statuses;
    }

    public List<Status> getFriendsTweets(Twitter twitter) throws TwitterException {
        List<Status> statuses;
        statuses = twitter.getFriendsTimeline();
        return statuses;
    }
    
    public void updateStatus(Twitter twitter,String updateText) throws TwitterException
    {
        Status update = twitter.updateStatus(updateText);  
    }
}
