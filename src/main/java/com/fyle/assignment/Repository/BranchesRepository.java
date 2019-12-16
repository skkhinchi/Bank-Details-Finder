package com.fyle.assignment.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fyle.assignment.model.Branches;
;


public interface BranchesRepository extends JpaRepository<Branches, String>
{
	@Query
	 public Branches  findByIfsc(String id);

//	 List<Branches> findAll();
//	public List<Branches> showBankByCityAndBank(city);


//	@Query("SELECT b.bank_id, b.address, b.city, b.district, ba.name FROM Branches b INNER JOIN Banks ba WHERE b.city=?1 AND b.bank_id=ba.id")
//	@Query("SELECT b from Branches b where b.city=?1") new


//	public List<Branches> findAllByCity(String city, Pageable pageable);

//	Page<Branches> findByCityName(String city, Pageable pageable);





	Page<Branches> findByCity(String city, Pageable pageable);

//	@Query("SELECT e FROM Employee e WHERE e.name LIKE :name ORDER BY e.id")



//	@Query("SELECT b from Branches b where b.city LIKE :city ORDER BY b.bank_id ")
//	public List<Branches> findAllByCity(@Param("name") String name, Pageable pageable);


//	 public List<Branches> findAllByCity(String city, PageRequest pageRequest);

//	public Branches findById(long id);

}