package com.emoji.country_emoji_generate.repository;

import com.emoji.country_emoji_generate.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
