package card;
import java.util.ArrayList;
import java.util.Arrays;

public class Trump {
    private String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] mark = {"Haert","Spade","Diamond","Club"};
    private ArrayList<Card> Trump = new ArrayList<>();

    public Trump(){
        for(String m:mark){
            for(String n:num){
                Card card = new Card(n,m);
                Trump.add(card);
            }
        }
    }

    
    public void printTrump(int n){
        Card card = Trump.get(n);
        card.printCard();
    }

    public void printAllTrump(){
        for(int i = 0; i< 52;i++){
            printTrump(i);
        }
    }

    

}