package collections_and_sorting_collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String>{
    private LinkedList<String> urls = new LinkedList<>();

    private class UrlIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return urls.size() > index;
        }

        @Override
        public String next() {

            StringBuilder sb = new StringBuilder();
            try {
                URL url = new URL(urls.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String line;

                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                br.close();

            } catch(Exception e){
                    e.printStackTrace();
                }

                index++;
                return sb.toString();
            }



        @Override
        public void remove() {
            urls.remove(index);
        }
    }

    public UrlLibrary() {
        urls.add("http://bbc.co.uk");
        urls.add("http://caveofprogramming.com");
        urls.add("http://www.linkedin.com");
    }

    //implementing own iterator
    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    /**
     * returns an Iterator which gives access to methods such as
     * hasNext(), remove(), next()
     * @return

    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }*/
}
