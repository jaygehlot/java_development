package collections_and_sorting_collections;

public class ImplementingIterable {

    public static void main(String[] args) {
        UrlLibrary urlLibrary = new UrlLibrary();

        for(String html: urlLibrary) {
            System.out.println(html.length());
            System.out.println(html);
        }

    }
}
