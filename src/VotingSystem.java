import java.util.ArrayList;

public class VotingSystem {
    private   ArrayList<Voting> votingList ;
    public VotingSystem(){
      votingList = new ArrayList<>();
    }
    public void createVoting(String question ,int type,ArrayList<String> vote){
        Voting newvoting=new Voting(type,question);
        for (String ex:vote){
        newvoting.createpoll(ex);}
        votingList.add(newvoting);
    }

    public void getVotingList() {
        int i=1;
        for (Voting ex:votingList){
        System.out.println(i+")"+ex.getQuestion());
        i++;}
    }
    public void vote(int number,Person p,ArrayList<String> vote){

        votingList.get(number-1).vote(p,vote);
    }
    public void getResult(int number){
        votingList.get(number-1).printVotes();
    }
    public void getVoting(int number){
    System.out.println(  votingList.get(number-1).getPolls());
    }
    public void removeVote(int number){
        votingList.remove(number-1);
    }
}
