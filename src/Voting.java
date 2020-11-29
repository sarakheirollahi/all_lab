import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.lang.*;
import java.util.*;
import java.util.Queue;

public class Voting {
  private   int type ;
  private  String question;
  private   ArrayList<Person> person;
  private   HashMap<String, HashSet<Vote>> polls;
  public Voting (int type,String q){
      this.type = type;
      question =q;
     person = new ArrayList<>();
     polls = new HashMap<>();

  }

    public String getQuestion() {
        return question;
    }
    public void createpoll(String key){
      HashSet<Vote> n =new HashSet<>();
      polls.put(key,n);
    }
    public void vote(Person person,ArrayList<String> choose){
      String date ="lp";

      Vote newvote = new  Vote(person,date);

     if (type>1){for(String ex:choose){
         polls.get(ex).add(newvote);
     }}
     else
         polls.get( choose.get(0)).add(newvote);
  }
    public void printVotes(){
        polls.forEach((k, v) -> {
          System.out.println(k+"   ->  "+v.size());
        });
    }

    public void getVoters() {
       HashSet<Vote> voter = new HashSet<>();
        polls.forEach((k, v) -> {
            for (Vote ex:v)
          voter.add(ex);
        });
        for (Vote ex :voter){
       System.out.println(ex.getPerson());
    }}

    public ArrayList<String> getPolls() {
      ArrayList<String> polls = new ArrayList(this.polls.keySet());
      return polls;
    }
}

