import java.util.ArrayList;
import java.util.List;

public class SILab2 {

    public static List<String> function(List<String> list) {
        if (list.size() <= 0) { //A
            throw new IllegalArgumentException("List length should be greater than 0"); //B
        }
        int n = list.size(); //C
        int rootOfN = (int) Math.sqrt(n); //D
        if (rootOfN * rootOfN  != n) { //E
            throw new IllegalArgumentException("List length should be a perfect square"); //F
        }
        List<String> numMines = new ArrayList<>(); //G
        for (int i = 0; i < n; i++) { //H
            if (!list.get(i).equals("#")) { //I
                int num = 0; //J
                if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) || (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ) { //K  //levo ili desno
                    if ( (i % rootOfN != 0 && list.get(i - 1).equals("#")) && (i % rootOfN != rootOfN - 1 && list.get(i + 1).equals("#")) ){ //L //i levo i desno
                        num += 2; //M
                    }
                    else {
                        num  += 1; //O
                    }
                }
                if (i - rootOfN >= 0 && list.get(i - rootOfN).equals("#")){ //P
                    num++; //Q //gore
                }
                if (i + rootOfN < n && list.get(i + rootOfN).equals("#")){ //R
                    num++; //S //dole
                }
                numMines.add(String.valueOf(num)); //T
            }
            else { //U
                numMines.add(list.get(i)); //V
            }
        }
        return numMines; //W
    }
}
