package com.fyle.assignment.service;

import com.fyle.assignment.Repository.BranchesRepository;
import com.fyle.assignment.model.Branches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class BranchService {
    @Autowired
    private BranchesRepository branchesRepository;

    @PersistenceContext
    private EntityManager entityManager;


    public Branches showMyBank(String id) {
        return branchesRepository.findByIfsc(id);
    }

//	public List<Branches> showBankByCity(String city, int offset, int limit)
//	{
//	    int page=offset/limit;
//		System.out.println("In the service");
//		return branchesRepository.findAllByCity(city, PageRequest.of(limit, offset));
//	}

//	public List<Branches> showBankByCityAndBank(LimitAdd limitAdd){
////		String query = "select b from branches b where city = "+"'"+limitAdd.getCity()+"'"+" limit "+ limitAdd.getLimit() + " offset "+ limitAdd.getOffset();
//		String query= "select ifsc from branches where city = 'AJMER'";
//		return entityManager.createQuery(query).getResultList();

    public List<Branches> showBankByCity(String city, PageRequest pageRequest) {
        Page<Branches> result = branchesRepository.findByCity(city, pageRequest);
        return result.getContent();

//		return branchesRepository.findAll(pageRequest).getContent();


    }


//
//	@Override
//	public List<Branches> findAllByCity(String name, int offset, int limit) {
//		return branchesRepository.findAllByCity(name, new PageRequest(offset, limit);
//	}


}
