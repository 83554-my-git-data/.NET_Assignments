package com.sunbeam.beans;

import java.util.ArrayList;
import java.util.List;

import com.sunbeam.daos.CandidateDao;
import com.sunbeam.daos.CandidateDaoImpl;
import com.sunbeam.pojos.Candidate;

public class CandListBean {
	public List<Candidate> candlist()
    {
    	List<Candidate> list=new ArrayList<Candidate>();
    	try 
    	{
			CandidateDao cnd=new CandidateDaoImpl();
			list=cnd.findAll();
			System.out.println(cnd);
			return list;
		} catch (Exception e) {
		
			e.printStackTrace();
		}
    	
    	return null;
    }

}
