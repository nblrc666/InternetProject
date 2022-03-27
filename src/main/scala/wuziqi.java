import java.util.Scanner;
public class wuziqi {
    static String[][] a = new String[10][10];

    public static void main(String[] args) {
        init();
        paint();
        XiaZi();
    }
    public static void init() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
                a[i][j] = "+";
            }
        }
    }
    public static void paint() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[/**/i][j] + "" + "\t");
            }
            System.out.println();
        }
    }
    public static void XiaZi() {
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        int x = 0;
        int y = 0;
        while (true) {
            if (flag) {
                System.out.println("A下");
                System.out.println("请输入x坐标");
                x = s.nextInt();
                System.out.println("请输入y坐标");
                y = s.nextInt();
                if (x > 10 || y > 10 || x < 1 || y < 1) {
                    System.out.println("请输入正确的xy坐标");
                    continue;
                }
                if (isRepeat(x, y)) {
                    a[y - 1][x - 1] = "○";
                    paint();
                } else {
                    continue;
                }
            } else {
                System.out.println("B下");
                System.out.println("请输入x坐标");
                x = s.nextInt();
                System.out.println("请输入y坐标");
                y = s.nextInt();
                if (x > 10 || y > 10 || x < 1 || y < 1) {
                    System.out.println("请输入正确的xy坐标");
                    continue;
                }
                if (isRepeat(x, y)) {
                    a[y - 1][x - 1] = "●";
                    paint();
                } else {
                    continue;
                }
            }
            flag = !flag;
            boolean l = upDown(x - 1, y - 1, a[y - 1][x - 1]);
            if (l) {
                break;
            }
            boolean p = leftRight(x - 1, y - 1, a[y - 1][x - 1]);
            if (p) {
                break;
            }
            boolean o = lurd(x - 1, y - 1, a[y - 1][x - 1]);
            if (o) {
                break;
            }
            boolean f = ruld(x - 1, y - 1, a[y - 1][x - 1]);
            if (f){
                break;
            }
        }
    }

    public static boolean isRepeat(int x, int y) {
        if (!a[y - 1][x - 1].equals("○") && !a[y - 1][x - 1].equals("●")) {
            return true;
        }
        return false;
    }

    public static boolean upDown(int x, int y, String s) {

        int count = 1;
        int i = x;
        int k = y - 1;
        for (; k >= 0; k--) {
            if (a[k][i].equals(s)) {
                count++;
            }else{
                break;
            }
        }
        int j = y + 1;
        for (; j <= 9; j++) {
            if (a[j][i].equals(s)) {
                count++;
            }else{
                break;
            }
        }
        if (count >= 5) {
            System.out.println(s + "Win");
            return true;
        }
        return false;
    }
    public static boolean leftRight(int x, int y, String s) {
        int count = 1;
        int i = x - 1;
        int k = y;
        for (; i >= 0; i--) {
            if (a[k][i].equals(s)) {
                count++;
            }else{
                break;
            }
        }
        int j = x + 1;
        for (; j <= 9; j++) {
            if (a[k][j].equals(s)) {
                count++;
            }else{
                break;
            }
        }
        if (count >= 5) {
            System.out.println(s + "Win");
            return true;
        }
        return false;
    }
    public static boolean lurd(int x, int y, String s) {
        int count = 1;
        int i = x - 1;
        int k = y - 1;
        for (; i >= 0 & k >= 0; i--, k--) {
            if (a[k][i].equals(s)) {
                count++;
            }else{
                break;
            }
        }
        int n = x + 1;
        int m = y + 1;
        for (; n <= 9 & m <= 9; n++, m++) {
            if (a[m][n].equals(s)) {
                count++;
            }else{
                break;
            }
        }
        if (count >= 5) {
            System.out.println(s + "Win");
            return true;
        }
        return false;
    }
    public  static boolean ruld(int x, int y,String s){
        int count = 1;
        int q = x + 1;
        int e = y - 1;
        for (;q<=9&e>=0;q++,e--){
            if (a[e][q].equals(s)){
                count++;
            }else{
                break;
            }
        }
        int r = x - 1;
        int t = y + 1;
        for (;r>=0&t<=9;r--,t++){
            if (a[t][r].equals(s)){
                count++;
            }else{
                break;
            }
        }
        if (count>=5) {
            System.out.println(s+"Win");
            return true;
        }
        return  false;
    }

}
