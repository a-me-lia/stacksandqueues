import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static int binToInt(String binNum){
        int toNum = 0;
        for(int i = binNum.length() - 1; i > 0; i--){
            toNum += (int) ((binNum.charAt(i) - 48 ) * Math.pow(2, binNum.length()- (i+1)))
        }
        return toNum;
    }

    /**
     * 6) A deck of cards is represented in a program as a stack of Card objects.
     * Write a method that takes the n-th card in the deck (counting the top card
     * as the first one) and moves it to the top of the deck. The method returns
     * true if the deck has n or more cards; otherwise it leaves the deck unchanged
     * and returns false. Your method may use a temporary stack, but no other arrays or lists.
     * @param deck
     * @param n
     * @return
     */
    public static boolean moveToTop(Stack<Card> deck, int n){
        Stack<Card> temp = new Stack<>();
        int cardCount = 0;
        while(cardCount < n && !deck.isEmpty()){
            temp.push(deck.pop());
            cardCount++;
        }
        if(cardCount == n){
            Card tempCard = deck.pop();
            while(!temp.isEmpty()){
                deck.push(temp.pop());
            }
            deck.push(tempCard);
            return true;
        }
        else{
            while(!temp.isEmpty()){
                deck.push(temp.pop());
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Test moveToTop()
        Stack<Card> deck = new Stack<>();
        for(int i = 0; i < 10; i++){
            Card temp = new Card(i);
            deck.push(temp);
        }
        System.out.println(deck);
        moveToTop(deck, 13);
        System.out.println(deck);

    }
}