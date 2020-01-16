class Yacht {
    public int [] dice;
    public YachtCategory yachtCategory;
    Yacht(int[] dice, YachtCategory yachtCategory) {
      this.dice = dice;
      this.yachtCategory = yachtCategory;
    }

    int score() {

        switch(yachtCategory) {

            case YACHT:
                return yacht();

            case ONES:
                return ones();

            case TWOS:
                return twos();

            case THREES:
                return threes();
            case FOURS:
                return  fours();

            case FIVES:
                return fives();
            case SIXES:
                return sixes();
            case FULL_HOUSE:
                return fullHouses();
            case FOUR_OF_A_KIND:
                return fourOfAkind();
            case LITTLE_STRAIGHT:
                return littleStraight();
            case BIG_STRAIGHT:
                return bigStraight();
            case CHOICE:
                return choice();


        }
        if(yachtCategory == YachtCategory.YACHT){

        }
        return 6;
        //categoryYacht();
    }

    private int choice() {
        return 0;
    }

    private int fives() {
        int count = 0;
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] == 5){
                count++;
            }
        }
        int score = 5 * count;
        return score;
    }

    private int sixes() {
        int count = 0;
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] == 6){
                count++;
            }
        }
        int score = 6 * count;
        return score;
    }

    private int littleStraight() {
        int [] hash = new hash(dice.length);
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] != index + 1){
                return 0;
            }
            String y = "yeah, this is the new line";
        }
        return 30;
    }

    private int bigStraight() {
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] != index + 2){
                return 0;
            }
        }
        return 30;
    }

    private int fourOfAkind() {
        return 0;
    }

    private int fullHouses() {
        return 0;
    }

    private int fours() {
        int count = 0;
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] == 4){
                count++;
            }
        }
        int score = 4 * count;
        return score;
    }

    private int threes() {
        int count = 0;
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] == 3){
                count++;
            }
        }
        int score = 3 * count;
        return score;
    }

    private int twos() {
        int count = 0;
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] == 2){
                count++;
            }
        }
        int score = 2 * count;
        return score;
    }

    private int ones() {
        int count = 0;
        for(int index = 0; index < dice.length  ; index++ ){
            if(dice[index] == 1){
                count++;
            }
        }
        return count;
    }

    private int yacht() {

        for(int index = 0; index < dice.length - 1 ; index++ ){
            if(dice[index] != dice[index+1]){
                return 0;
            }
        }
        return 50;
    }


}
