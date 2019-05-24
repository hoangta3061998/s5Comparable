import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableSquare[] squares = new ComparableSquare[3];
        squares[0] = new ComparableSquare(9);
        squares[1]= new ComparableSquare();
        squares[2] = new ComparableSquare(5,"red",false);
        System.out.println("pre sorted:");
        for(ComparableSquare square:squares){
            System.out.println(square);
        }
        Arrays.sort(squares);
        System.out.println("After sorted:");
        for(ComparableSquare square:squares){
            System.out.println(square);
        }
    }
}
