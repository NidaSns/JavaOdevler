package Kodlama.io.Devs.odev.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlama.io.Devs.odev.entities.conctretes.Technology;

public interface TechnologyRepository extends JpaRepository<Technology, Integer> {

}
