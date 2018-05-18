import java.util.ArrayList;
import java.util.Arrays;

public class Koch {
    public static void main(String[] args) {
        System.out.println("Resultat dlya massiva {0, 1, 3, 5, 6, 8, 12, 17} " + Shet(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
        System.out.println("Resultat dlya massiva {0, 1, 2, 3, 4, 8, 9, 11} " + Shet(new int[]{0, 1, 2, 3, 4, 8, 9, 11}));
    }

    public static String Shet(int[] mas) {

        int k = 1;

        ArrayList<Integer> masList = new ArrayList<>();

        for(int b: mas) {
            masList.add(new Integer(b));
        }

        ArrayList<Positions> posList = new ArrayList<>();
        posList.add(new Positions(0, k));

        for (int i = 0; i < mas.length - 1; i++) {

            for (int j = 0; j < posList.size(); j++ ) {

                if(i == posList.get(j).getPosition()) {

                    int bufPos = posList.get(j).getPosition();
                    int bufK =  posList.get(j).getK();

                    if (masList.contains(mas[bufPos] + bufK)) {
                        posList.add(new Positions(masList.indexOf(mas[bufPos]+bufK),bufK));
                    }

                    if (masList.contains(mas[bufPos] + bufK + 1)) {
                        posList.add(new Positions(masList.indexOf(mas[bufPos] + bufK + 1),bufK+1));
                    }

                    if (k > 1 && masList.contains(mas[bufPos] + bufK - 1)) {
                        posList.add(new Positions(masList.indexOf(mas[bufPos] + bufK - 1),bufK - 1));
                    }
                }

            }//for j
        }

        if (posList.get(posList.size()-1).getPosition() == mas.length-1)
            return "true";
        return "false";
    }
}
