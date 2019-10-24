public class Dealer extends Player {
    public Dealer(String name) {
        super(name);
    }

    @Override
    public int nextAction() {
        if (hand.hardValue() >= 17) {
            return Player.STAY;

        } else {
            return Player.HIT;
        }
    }

}