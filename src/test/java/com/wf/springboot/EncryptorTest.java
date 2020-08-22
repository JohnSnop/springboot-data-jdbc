package com.wf.springboot;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * @author wf
 * @create 2020-08-22 10:24
 * @desc
 **/
@SpringBootTest
public class EncryptorTest {

    @Resource
    private ApplicationContext applicationContext;
    @Resource(name = "wfEncryptorBean")
    private StringEncryptor stringEncryptor;

    @Test
    public void getPwd() {
        Environment environment = applicationContext.getBean(Environment.class);

        // 首先获取配置文件里的原始明文信息
        String mysqlOriginPswd = environment.getProperty("spring.datasource.password");
        String mysqlEncryptedPswd = encrypt(mysqlOriginPswd);
        System.out.println("MySQL原始明文密码加密后的结果为：" + mysqlEncryptedPswd);

        String decrypt = decrypt(mysqlEncryptedPswd);
        System.out.println("MySQL原始明文密码为：" + decrypt);

    }

    private String encrypt(String originPassord) {
        return stringEncryptor.encrypt(originPassord);
    }

    private String decrypt(String encryptedPassword) {
        return stringEncryptor.decrypt(encryptedPassword);
    }
}
