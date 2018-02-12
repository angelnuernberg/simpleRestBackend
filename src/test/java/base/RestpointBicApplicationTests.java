package test.java.base;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=RestpointBicApplicationTests.class)
// Read for configuration of @SpringBootTest:
// https://stackoverflow.com/questions/39084491/unable-to-find-a-springbootconfiguration-when-doing-a-jpatest
public class RestpointBicApplicationTests {

	@Ignore
	@Test
	public void contextLoads() {
		
	}

}
