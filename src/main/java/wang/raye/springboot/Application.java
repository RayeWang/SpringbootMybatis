package wang.raye.springboot;

import javax.servlet.MultipartConfigElement;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.pool.DruidDataSource;

@MapperScan("wang.raye.springboot.model.mapper")
@SpringBootApplication
@ServletComponentScan
public class Application extends SpringBootServletInitializer {
	@Bean
	public MultipartConfigElement multipartConfigElement() {
		MultipartConfigFactory factory = new MultipartConfigFactory();
		factory.setMaxFileSize("5MB");
		factory.setMaxRequestSize("5MB");
		return factory.createMultipartConfig();
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	//
	//
//	@Bean
//	public DataSource dataSource() {
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://192.168.157.131:3306/springboot");
//		dataSource.setUsername("code");
//		dataSource.setMaxActive(30);
//		dataSource.setPassword("123456");
//		DatabaseDriver databaseDriver = DatabaseDriver.fromJdbcUrl("jdbc:mysql://192.168.157.131:3306/springboot");
//		String validationQuery = databaseDriver.getValidationQuery();
//		try {
//			dataSource.setFilters("stat, wall");
//			if (validationQuery != null) {
//				dataSource.setTestOnBorrow(true);
//				dataSource.setValidationQuery(validationQuery);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return dataSource;
//	}
//
//	@Bean
//	public SqlSessionFactory sqlSessionFactory() throws Exception {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//		bean.setDataSource(dataSource());
//		return bean.getObject();
//
//	}

}
