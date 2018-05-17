import java.util.ArrayList;

public class Koch {
    public static void main(String[] args) {
        System.out.println("Resultat dlya massiva {0, 1, 3, 5, 6, 8, 12, 17} " + Shet(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
    }

    public static String Shet(int[] mas) {
        System.out.printf(new String(String.valueOf(mas.equals(mas[2]))));
        int k = 1;
        Positions position = new Positions();
        ArrayList<Positions> listPos = new ArrayList<Positions>();
        String result = "false";
        position.setPisitions(0, 1);
        listPos.add(position);

        for (int i = 0; i < mas.length - 1; i++) {

            for (int j = 0; j < listPos.size(); j++ ) {//for (int j = listPos.get(listPos.indexOf(new Positions(i, k))).getPosition(); j <= listPos.get(listPos.lastIndexOf(new Positions(i, k))).getPosition(); j++) {
                if(i == listPos.get(j).getPosition()) {
                    if (mas.equals(mas[j] + k)) {
                        listPos.add(new Positions(i+1,k));
                    }

                    if (mas.equals(mas[j] + k + 1)) {
                        k += 1;
                        position.setPisitions(i + 1, k);
                        listPos.add(position);
                    }

                    if (k > 1 && mas.equals(mas[j] + k - 1)) {
                        k -= 1;
                        position.setPisitions(i - 1, k);
                        listPos.add(position);
                    }
                }

            }//for j
        }

        if (listPos.get(listPos.size()-1).getPosition() == mas[mas.length-1])
            result = "true";
        return result;
    }
}
