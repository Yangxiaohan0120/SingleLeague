package com.example.SingleLeague.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.image.BufferedImage;
import java.util.Properties;

/**
 * @author Chris Yang
 * created 2022-08-22 11:19
 **/

@Configuration
public class KaptchaConfig {

    @Bean
    public Producer kaptchaProducer(){
        // 创建属性
        Properties properties = new Properties();
        properties.setProperty("kaptcha.image.width","100");
        properties.setProperty("kaptcha.image.height","40");
        properties.setProperty("kaptcha.textproducer.font.size","32");
        properties.setProperty("kaptcha.textproducer.font.color","0,0,0");
        properties.setProperty("kaptcha.textproducer.char.string","012345678ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        properties.setProperty("kaptcha.textproducer.char.length","4");
        properties.setProperty("kaptcha.noise.impl","com.google.code.kaptcha.impl.NoNoise");

        // 创建kaptcha
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        // 使用Config 传递配置
        Config config = new Config(properties);
        // kaptcha添加配置
        kaptcha.setConfig(config);
        return kaptcha;
    }


}
