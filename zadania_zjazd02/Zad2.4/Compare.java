public class Compare {

    private String word = "napis";
    private String word2 = "napis";

    public String getWord(){
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public String getWord2(){
        return word2;
    }
    public void setWord2(String word2){
        this.word2 = word2;
    }

    public boolean areEqual() {
        return word.equals(word2);
    }
}




