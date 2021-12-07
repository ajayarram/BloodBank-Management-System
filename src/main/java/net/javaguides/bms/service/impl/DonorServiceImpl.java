package net.javaguides.bms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.bms.entity.Donor;
import net.javaguides.bms.repository.DonorRepository;
import net.javaguides.bms.service.DonorService;

@Service
public class DonorServiceImpl implements DonorService{

	private DonorRepository donorRepository;
	
	public DonorServiceImpl(DonorRepository donorRepository) {
		super();
		this.donorRepository = donorRepository;
	}

	@Override
	public List<Donor> getAllDonors() {
		return donorRepository.findAll();
	}

	@Override
	public Donor saveDonor(Donor donor) {
		return donorRepository.save(donor);
	}

	@Override
	public Donor getDonorById(Long id) {
		return donorRepository.findById(id).get();
	}

	@Override
	public Donor updateDonor(Donor donor) {
		return donorRepository.save(donor);
	}

	@Override
	public void deleteDonorById(Long id) {
		donorRepository.deleteById(id);	
	}

}
