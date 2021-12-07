package net.javaguides.bms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.bms.entity.Donor;
import net.javaguides.bms.repository.DonorRepository;

@SpringBootApplication
public class BloodBankManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BloodBankManagementSystemApplication.class, args);
	}

	@Autowired
	private DonorRepository donorRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Donor donor1 = new Donor("Ramesh", "Fadatare", "ramesh@gmail.com",O+,9999999999);
		 * donorRepository.save(donor1);
		 * 
		 * Donor donor2 = new Donor("Sanjay", "Jadhav", "sanjay@gmail.com",AB+,9999999998);
		 * donorRepository.save(donor2);
		 * 
		 * Donor donor3 = new Donor("tony", "stark", "tony@gmail.com",B+,9999999997);
		 * donorRepository.save(donor3);
		 */
		
	}

}


