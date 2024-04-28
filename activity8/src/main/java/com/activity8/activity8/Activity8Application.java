package com.activity8.activity8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import java.security.Timestamp;

@SpringBootApplication
public class Activity8Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Activity8Application.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override

	public void run(String... args) throws Exception {
		jdbcTemplate.query("SELECT id, actif, compte_creation, compte_maj, date_creation, date_maj, nom_arabe, nom_latin, nom_tamazight FROM wilaya",
				(rs, rowNum) -> new wilaya(rs.getLong("id"), rs.getBoolean("actif"), rs.getLong("compte_creation"),
						rs.getLong("compte_maj"), rs.getTimestamp("date_creation"), rs.getTimestamp("date_maj"),
						rs.getString("nom_arabe"), rs.getString("nom_latin"), rs.getString("nom_tamazight"))
		).forEach(wilaya -> System.out.println(wilaya));
	}
}
