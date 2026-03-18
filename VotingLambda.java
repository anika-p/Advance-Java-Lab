class VoterList{
    void checkVoterName(int age){
        if(age>=18){
                System.out.println("you can vote");
            }
            else{
                System.out.println("you can not vote");
            }
    }
}
@FunctionalInterface
interface Voting{
    void vote(int n1);
}
public class VotingLambda {
    public static void main(String[] args) {
        Voting v=n1->{
            if(n1>=18){
                System.out.println("you can vote");
            }
            else{
                System.out.println("you can not vote");
            }
        };
        v.vote(30);
        VoterList vl=new VoterList();
        Voting v1=vl::checkVoterName; //reference of checkvotername of class voterlist to voting interface 
        v1.vote(13);
    }
}
