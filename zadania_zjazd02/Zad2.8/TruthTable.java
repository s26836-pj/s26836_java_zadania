class TruthTable {

    boolean p;
    boolean q;


    public TruthTable(boolean p, boolean q) {
        this.p = p;
        this.q = q;
    }
    public void PrintTable(){
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT" );
        //first row
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&&q) + "\t" + (p||q) + " \t");
        System.out.println((p^q) + "\t" + !p );
        //second row
        System.out.print(p + "\t" + !q + "\t");
        System.out.print(!(p&&q) + "\t" + (p||q) + " \t");
        System.out.println((p == q) + "\t" + !p );
        //third row
        System.out.print(!p + "\t" + q + "\t");
        System.out.print((p&&q) + "\t" + !(p||q) + " \t");
        System.out.println((p == q) + "\t" + p );
        ///fourth row
        System.out.print(!p + "\t" + !q + "\t");
        System.out.print((p&&q) + "\t" + (p||q) + " \t");
        System.out.print((p^q) + "\t" + p );
    }


}
