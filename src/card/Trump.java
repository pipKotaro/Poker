package card;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Trump {
    private String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] mark = {"Haert","Spade","Diamond","Club"};
    private ArrayList<Card> trump = new ArrayList<>();

    //カード作成し、シャッフルを行う
    public Trump(){
        for(String m:mark){
            for(String n:num){
                Card card = new Card(n,m);
                trump.add(card);
            }
        }
        Collections.shuffle(trump);
    }

    public void printTrump(int n){
        Card card = trump.get(n);
        card.printCard();
    }

    public void printAllTrump(){
        for(int i = 0; i< 52;i++){
            printTrump(i);
        }
    }

    public void drawCard(){
        trump.remove(0);
    }

    public void getHowManyCard(){
        System.out.println(trump.size());
    }
}