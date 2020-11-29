import java.util.ArrayList;

public class Main {

    public static void main(String... args) {
        ArrayList<String>vot=new ArrayList<>();
        ArrayList<String>voter=new ArrayList<>();
        Person p1=new Person("sara","kheirollahi");
        Person p2=new Person("nima","kheirollahi");
        Person p3=new Person("sheida","kheirollahi");
        vot.add("aaa");
        vot.add("bbb");
        vot.add("ccc");
        voter.add("aaa");
        voter.add("ccc");
        voter.add("aaa");
        voter.add("bbb");
        VotingSystem system1=new VotingSystem();
        system1.createVoting("which one",1,vot);
        system1.createVoting("how many",3,vot);
        system1.getVotingList();
        system1.vote(1,p1,voter);
        system1.vote(2,p2,voter);
        system1.getVoting(1);
        system1.getResult(1);
        system1.getResult(2);
        system1.removeVote(1);
        system1.getVotingList();

    }
}
