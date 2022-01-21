package com.example.jasypt;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JasyptApplication.class)
class JasyptApplicationTests {

    @Autowired
    private StringEncryptor encryptor;

    @Test
    void contextLoads() {
    }

    @Test
    public void getPass() {
        String url = encryptor.encrypt("jdbc:mysql://rm-bp1c7o760p1eyn0czfo.mysql.rds.aliyuncs.com:3306/saa_cbb?useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8");
        String name = encryptor.encrypt("hushuai");
        String password = encryptor.encrypt("Hs19910521");
        System.out.println("database url: ENC(" + url + ")");
        System.out.println("database name: ENC(" + name + ")");
        System.out.println("database password: ENC(" + password + ")");
        Assert.isTrue(url.length() > 0,"url加密错误");
        Assert.isTrue(name.length() > 0,"name加密错误");
        Assert.isTrue(password.length() > 0,"password加密错误");
    }
}
