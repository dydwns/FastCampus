public class MovieTest {
    public static void main(String[] args) {

        Movie m = new Movie();
        m.mtitle = "아바타";
        m.mday = "2월2일";
        m.mmajor = "메시";
        m.mpart = "스포츠";
        m.mtime = 3;
        m.mlevel = 12;

        System.out.println(m.mtitle + "\t" + m.mday + "\t" + m.mmajor + "\t" + m.mpart + "\t" + m.mtime + "\t" + m.mlevel);


    }
}
