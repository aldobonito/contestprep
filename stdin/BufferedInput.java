import java.io.*;

public class BufferedInput {

	// This is the actual solution. The exception isn't used anywhere
    public static void main(String args[] ) throws Exception {

        /* A buffered reader isn't necessary here, but, in theory, it sets a
         * fixed space for input values, so passing in a 1TB string doesn't
         * force you to read the entire thing into memory at once, which will
         * probably cause an exception
         *
         * Similarly, an inputstreamreader allows it to be sliced up into
         * discrete chunks
         *
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /* readLine() will grab the input until a \n is encountered
         * (or \r\n on older versions of Windows, or \r on MacOS < 10
        */
        String line = br.readLine();
        /* The variable naming should be lowercase here, but
         * Integer is a class which adds some convenience methods to the 'int'
         * primitive
         *
         * Integer.parseInt() tries to convert the actual input to an Integer
         * (which can be directly cast as (int), throwing an exception if
         * the actual input is cannot be converted, such as "foo"
        */
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
    }
}
