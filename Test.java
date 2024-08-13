public class Test {
    // Run "java -ea Test" to run with assertions enabled (If you run
    // with assertions disabled, the default, then assert statements
    // will not execute!)

    public static void test1() {
        Board b = Board.theBoard();
        Piece.registerPiece(new PawnFactory());
        Piece p = Piece.createPiece("bp");
        b.addPiece(p, "a3");
            assert b.getPiece("a3") == p;
    }

    public static void test2() {
        Board b = Board.theBoard();
        Piece.registerPiece(new QueenFactory());
        Piece p = Piece.createPiece("bq");
        b.addPiece(p, "a3");
            assert b.getPiece("a3") == p;
        b.movePiece("a3", "b4");
    }
        
    public static void main(String[] args) {
        test1();
    }

}