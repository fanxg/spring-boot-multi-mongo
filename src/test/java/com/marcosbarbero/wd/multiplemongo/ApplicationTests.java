package com.marcosbarbero.wd.multiplemongo;

import com.marcosbarbero.wd.multiplemongo.repository.primary.PrimaryModel;
import com.marcosbarbero.wd.multiplemongo.repository.primary.PrimaryRepository;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private PrimaryRepository primaryRepository;

	@Autowired
	private MongoTemplate mongoTemplate;

	@Test
	public void contextLoads() {
		List<PrimaryModel> list = this.primaryRepository.findAll();
		System.out.println(list);

		List<PrimaryModel> list2 = mongoTemplate.findAll(PrimaryModel.class);
		System.out.println(list2);
	}

}
