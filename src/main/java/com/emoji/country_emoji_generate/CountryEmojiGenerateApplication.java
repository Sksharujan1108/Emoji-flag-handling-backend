package com.emoji.country_emoji_generate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan("com.emoji.country_emoji_generate.model")
public class CountryEmojiGenerateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryEmojiGenerateApplication.class, args);
	}

}
