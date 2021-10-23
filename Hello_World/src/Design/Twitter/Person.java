package Design.Twitter;

import java.util.ArrayList;

public class Person extends Thread{
    public String name;
    public ArrayList<Person> followers;

    public Person(String name){
        this.name  = name;
        followers = new ArrayList<>();

    }


    public void Tweet(String tweetMessage){
        for(Person follower : followers){
            follower.getTweet(this, tweetMessage);
        }

    }

    public void addFollower(Person person){
        if(!followers.contains(person)){
            followers.add(person);
        }

    }

    public void removeFollower(Person person){
        if(followers.contains(person)){
            followers.remove(person);
        }

    }

    public void follow(Person person){
        person.addFollower(this);
    }
    public void unFollow(Person person){
        person.removeFollower(this);
    }

    public void getTweet(Person person, String tweetMessage){
        System.out.println(person + tweetMessage);
    }
}
