import java.util.Scanner;

public class Book {
    String title = "";
    String author = "";
    private static int count = 0;
    private int id = 0;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        count++;

        id = count;
    }

    boolean includeTitle(String subTitle) {
        return (title.indexOf(subTitle) != -1);
    }

    boolean includeAuthor(String subAuthor) {
        return (author.indexOf(subAuthor) != -1);
    }

    boolean includeTitleOrAuthor(String subWord) {
        return (title.indexOf(subWord) != -1 || author.indexOf(subWord) != -1);
    }

    public String toString() {
        return id + " 제목 : " + title + " 저자 : " + author;
    }

    static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Book[] books = new Book[10];
        Scanner scanner = new Scanner(System.in);

        String title;
        String author;
        System.out.println("책의 제목과 저자를 입력하세요(저자를 모를 경우, 작자미상으로 기록하세요).");
        for (int i = 0; i < books.length; i++) {
            title = scanner.next();
            author = scanner.next();
            books[i] = new Book(title, author);
        }

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].title + ": " + books[i].author);
        }
        scanner.close();
    }
}