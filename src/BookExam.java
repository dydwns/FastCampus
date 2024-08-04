public class BookExam {
    public static void main(String[] args) {
        //정수 1개를 저장할 [변수를 선언]하시오.
        int a;

        //책 1권을 저장할 변수를 선언하시오.
//        Book b;
//        b = new Book();

        //한권의 책 데이터를 저장하기 위해서 객체를 생성하시오.(인스턴스를 만드시오)
        Book book = new Book();

        book.title = "자바";
        book.price = 30000;
        book.company = "패스트캠퍼스";
        book.author = "박매일";
        book.page = 700;
        book.isbn = "123456";

        System.out.println(book.title + "\t" + book.price + "\t" + book.company + "\t" + book.author + "\t" + book.page + "\t" + book.isbn);


    }

}
