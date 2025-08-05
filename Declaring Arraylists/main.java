import java.util.ArrayList;

public class RecommendationBookManager {
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return title + " by " + author;
        }
    }

    public static void main(String args[]) {
        ArrayList<Book> recommendations = new ArrayList<>();
        recommendations.add(new Book("Effective Java", "Joshua Bloch"));
        recommendations.add(new Book("Clean Code", "Robert C. Martin"));
        recommendations.add(new Book("Java Concurrency", "Brian Goetz"));

        // TODO 1: Add 3 new books to the recommendation list
         recommendations.add(new Book("Programing", "Mathew"));
         recommendations.add(new Book("INTRO ALGORTHIMS", "Shakesphere"));
         recommendations.add(new Book("Intro to data structures", "Gilberto Ojeda"));

        /* TODO 2: Update existing recommendations
         * at index 1 (2nd element)
         * at index 2 (3rd element)
         */
        recommendations.set(1, new Book("Dirty Code", "Robert C. Martin"));
        recommendations.set(2, new Book("Python Concurrency", "Brian Goetz"));


        /* TODO 3: Remove outdated recommendations
         * at index 0 (first place)
         * at index 3 (fourth place)
         */
         recommendations.remove(0);
         recommendations.remove(3);

          System.out.println(recommendations);


    }
}
