//トランプを作成
package card;

public class Card {
    private String mark;
    private String num;

    Card(String num,String mark){
        this.num = num;
        this.mark = mark;
    }

    public void printCard(){
        System.out.println(num+","+mark);
    }

    public String getNum(){
        return this.num;
    }

    public String getMark(){
        return this.mark;
    }

}