

package net.javaguides.bms.service;

import java.util.List;

import net.javaguides.bms.entity.Donor;

public interface DonorService {
	List<Donor> getAllDonors();
	
	Donor saveDonor(Donor donor);
	
	Donor getDonorById(Long id);
	
	Donor updateDonor(Donor donor);
	
	void deleteDonorById(Long id);
}