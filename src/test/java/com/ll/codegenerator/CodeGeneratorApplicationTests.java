package com.ll.codegenerator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@SpringBootTest
class CodeGeneratorApplicationTests {

    @Test
    void contextLoads() throws IOException, TemplateException {
        Configuration config = new Configuration();
        config.setDirectoryForTemplateLoading(new File("D:\\study\\code-generator\\src\\main\\resources\\templates"));
        //创建数据模型
        Map<String, String> m = new HashMap<String, String>();
        m.put("welcome", "ls");
        //载入模板文件
        Template t = config.getTemplate("index.ftl");
        //显示生成后的数据
        Writer w = new OutputStreamWriter(System.out);
        t.process(m, w);
        w.close();
    }

    @Test
    void zipTest() throws IOException, TemplateException {

        Configuration config = new Configuration();
        config.setDirectoryForTemplateLoading(new File("D:\\study\\code-generator\\src\\main\\resources\\templates"));
        //创建数据模型
        Map<String, String> m = new HashMap<String, String>();
        m.put("welcome", "李帅");
        //载入模板文件
        Template t = config.getTemplate("index.ftl");
        //显示生成后的数据
        Writer w = new StringWriter();
        t.process(m, w);

        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("E:\\1.zip"));
        ZipEntry zipEntry = new ZipEntry("aa/aa.txt");
        zipEntry.setComment("Jerval's test");
        zipOutputStream.putNextEntry(zipEntry);

        IOUtils.write(w.toString(), zipOutputStream, "UTF-8");
        IOUtils.closeQuietly(w);

        zipOutputStream.closeEntry();
        zipOutputStream.close();


        w.close();
    }
}
