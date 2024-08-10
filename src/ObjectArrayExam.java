public class ObjectArrayExam {
    public static void main(String[] args) {
        //  영화 3편을 저장 할 [배열을 생성]하고 영오하 3편의 데이타를 저장하고 출력하세요.
        Movie[] m = new Movie[3];

        m[0] = new Movie();
        m[0].mtitle = "A영화";
        m[0].mmajor = "메시";
        m[0].mtime = 160;
        m[0].mlevel = 15;
        m[0].mday = "2023-01-15";

        m[1] = new Movie();
        m[1].mtitle = "B영화";
        m[1].mmajor = "손흥민";
        m[1].mtime = 150;
        m[1].mlevel = 12;
        m[1].mday = "2023-01-11";


        m[2] = new Movie();
        m[2].mtitle = "C영화";
        m[2].mmajor = "마르셀루";
        m[2].mtime = 140;
        m[2].mlevel = 18;
        m[2].mday = "2023-11-12";

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].mtitle + "\t" + m[i].mmajor + "\t" + m[i].mtime + "\t" + m[i].mlevel + "\t" + m[i].mday);
        }

    }
}
