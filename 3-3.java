package com.hdfsclient;

import java.io.BUfferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.uri;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.path;
import org.apache.hadoop.io.IOUtils;
 
public class FileCopyFromLocal {
    public static main(String() args) throws IOException {
        String source ="/home/hadoop/test";
        String destination ="hdfs://master:9000/user/hadoop/test2";
        InputStream in = new BUfferedInputStream( new FileInputStream(source));
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(destination),conf);
        OutputStream out = fs.create(new Path(destination));
        IOUtils.copyBytes(in out,4096,true);
        }
}