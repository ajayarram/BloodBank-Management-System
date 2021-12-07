package net.javaguides.bms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.bms.entity.Donor;

public interface DonorRepository extends JpaRepository<Donor, Long>{

}
