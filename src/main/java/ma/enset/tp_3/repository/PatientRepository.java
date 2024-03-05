package ma.enset.tp_3.repository;

import jakarta.transaction.Transactional;
import ma.enset.tp_3.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface PatientRepository extends JpaRepository<Patient,Long> {

}
