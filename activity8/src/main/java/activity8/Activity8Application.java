package activity8;

import model.Wilaya;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import java.util.List;

@SpringBootApplication
public class Activity8Application implements CommandLineRunner {
	@Autowired
	JdbcTemplate jb;
	@Autowired

	private Wilaya w;
	public static void main(String[] args) {
		SpringApplication.run(Activity8Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		List<Wilaya> wilayas = jb.query("SELECT * FROM wilaya", new WilayaMapper());
		for (Wilaya wilaya : wilayas) {
			System.out.println(wilaya);
		}
	}
}
class WilayaMapper implements RowMapper<Wilaya> {
	@Override
	public Wilaya mapRow(ResultSet rs, int rowNum) throws SQLException {
		Wilaya wilaya = new Wilaya();
		wilaya.setId(rs.getInt("id"));
		wilaya.setNom(rs.getString("nom"));
		wilaya.setCode(rs.getInt("code"));
		return wilaya;
	}
}
