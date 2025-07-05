package com.ragheb.shop;

import com.ragheb.shop.model.User;
import com.ragheb.shop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class CartShieldServerApplication /*implements CommandLineRunner*/ {

	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CartShieldServerApplication.class, args);
	}


//	@Override
//	public void run(String... args) throws Exception {
//		// Create test users only if the database is empty
//		if (userRepository.count() == 0) {
//			createTestUsers();
//		}
//	}
//
//	private void createTestUsers()
//	{
//		// User 1 - Admin
//		User admin = new User();
//		admin.setFirstName("Admin");
//		admin.setLastName("User");
//		admin.setEmail("admin@cartshield.com");
//		admin.setPassword("Admin@123");
//		userRepository.save(admin);
//
//		// User 2 - Regular User
//		User user1 = new User();
//		user1.setFirstName("Ahmed");
//		user1.setLastName("Amr");
//		user1.setEmail("ahmed.amr@example.com");
//		user1.setPassword("ahmed@123");
//		userRepository.save(user1);
//
//		// User 3 - Regular User
//		User user2 = new User();
//		user2.setFirstName("Jane");
//		user2.setLastName("omar");
//		user2.setEmail("jane.omar@example.com");
//		user2.setPassword("Jane@123");
//		userRepository.save(user2);
//
//		// User 4 - Regular User
//		User user3 = new User();
//		user3.setFirstName("Robert");
//		user3.setLastName("Ragheb");
//		user3.setEmail("robert.r@example.com");
//		user3.setPassword("Robert@123");
//		userRepository.save(user3);
//
//		// User 5 - Regular User
//		User user4 = new User();
//		user4.setFirstName("Emily");
//		user4.setLastName("Williams");
//		user4.setEmail("emily.w@example.com");
//		user4.setPassword("Emily@123");
//		userRepository.save(user4);
//
//		System.out.println("Created 5 test users");
//	}
}
