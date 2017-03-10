//package com.twogrit.learning.lucene;
//
//import org.apache.lucene.document.Document;
//import org.apache.lucene.document.Field;
//import org.apache.lucene.index.IndexWriter;
//
//import java.io.ByteArrayOutputStream;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.PrintStream;
//import java.nio.charset.Charset;
//import java.nio.file.Path;
//
//import static org.junit.Assert.assertTrue;
//
///**
// * Created by kezhang on 17/3/9.
// */
//public class IndexTest LuceneTestCase {
//
//    private void testOneSearch(Path indexPath, String query, int expectedHitCount) throws Exception {
//        PrintStream outSave = System.out;
//        try {
//            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
//            PrintStream fakeSystemOut = new PrintStream(bytes, false, Charset.defaultCharset().name());
//            System.setOut(fakeSystemOut);
//            SearchFiles.main(new String[] {"-query", query, "-index", indexPath.toString()});
//            fakeSystemOut.flush();
//            String output = bytes.toString(Charset.defaultCharset().name()); // intentionally use default encoding
//            assertTrue("output=" + output, output.contains(expectedHitCount + " total matching documents"));
//        } finally {
//            System.setOut(outSave);
//        }
//    }
//
//    public void testIndexSearch() throws Exception {
//        Path dir = getDataPath("test-files/docs");
//        Path indexDir = createTempDir("ContribDemoTest");
//        IndexFiles.main(new String[] { "-create", "-docs", dir.toString(), "-index", indexDir.toString()});
//        testOneSearch(indexDir, "apache", 3);
//        testOneSearch(indexDir, "patent", 8);
//        testOneSearch(indexDir, "lucene", 0);
//        testOneSearch(indexDir, "gnu", 6);
//        testOneSearch(indexDir, "derivative", 8);
//        testOneSearch(indexDir, "license", 13);
//    }
//}