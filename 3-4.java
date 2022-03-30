package com.hdfsclient;
import java.io.IOException;
import java.net.URI;
import java.nio.file.FileSystems;

import javax.naming.ConfigurationException;
import javax.tools.StandardJavaFileManager.PathFactory;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class CreateDir{
    public static void main(String[] args){
        String uri = "hdfs;//master:9000/user/test";
        Configuration conf = new Configuration();
        try{
            FileSystem fs =FileSystem.get(URI.create(uri),conf);
            PathFactory dfs =new Path("hdfs://master:9000/user/test");
            fs.mkdirs(dfs);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
