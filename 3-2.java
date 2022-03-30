package com.hdfsclient;
import java.io.IOException;
import java.io.InputStream;
import java.io.net.URL;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.path;
import org.apache.hadoop.io.IOUtils;
 
public class FileSystemCat {
    public static void main(String[]  args) throws IOException{
        String uri ="hdfs://master:9000/user//hadoop/test";
        Configuration conf = new Configuration() ;
        FileSystem fs =FileSystem.get(URL.create(url),conf);
   
        InputStream in = null;
        try {
            in =fs.open(new path(uri));
            IOUtils.copyBytes(in,System.out,4096,false);
        }   finally{
            IOUtils.closeStream(in);
        }
    
    }   
}