//package com.fyle.assignment.Repository;
//
//import com.fyle.assignment.model.Banks;
//import com.fyle.assignment.model.Branches;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.List;
//
//public interface BothRepository<Branches> extends CrudRepository<Banks,Integer> {
//
////    @Query("SELECT b FROM Branches b WHERE b.city = ?1  ")
//
//
//    @Query("SELECT b.bank_id, b.address, b.city, b.district, ba.name FROM Branches b INNER JOIN Banks ba WHERE b.city=?1 AND b.bank_id=ba.id")
//    public List<Branches> findAllByCity(String city);
//
//}
//
