package com.lgi.lms.service;

import java.util.List;

import com.lgi.lms.model.AssignProduct;
import com.lgi.lms.model.Branch;
import com.lgi.lms.model.BranchCovered;
import com.lgi.lms.model.CampaignMaster;
import com.lgi.lms.model.Desposition;
import com.lgi.lms.model.DistrictCovered;
import com.lgi.lms.model.ImdCode;
import com.lgi.lms.model.LanguageCovered;
import com.lgi.lms.model.LeadVertical;
import com.lgi.lms.model.PolicyType;
import com.lgi.lms.model.PublisherMaster;
import com.lgi.lms.model.ReportingPerson;
import com.lgi.lms.model.SourceMaster;
import com.lgi.lms.model.StateCovered;
import com.lgi.lms.model.SubDesposition;
import com.lgi.lms.model.Team;
import com.lgi.lms.model.UserDesignation;
import com.lgi.lms.model.Vertical;
import com.lgi.lms.model.InsuranceVerticalMaster;

public interface LookupMasterService {

    List<PolicyType> findAllPolicyType();
    
	PolicyType findPolicyById(Long id);
	
	List<LeadVertical> findAllLeadVertical();
	
	List<SourceMaster> findAllSourceMaster();
		
	SourceMaster findSourceById(Long id);
	
	List<PublisherMaster>   findAllPublisherMaster();
	
	PublisherMaster findPublisherById(Long id);
	
	List<PublisherMaster> findAllPublisherMasterBySourceId(Long id);

	List<CampaignMaster>  findAllCampaignMaster();
	
	CampaignMaster findCampaignById(Long id);
	
	List<CampaignMaster> findAllCampaignMasterListBySourcePublisherId(Long id,Long subId);

	List<Desposition>   findAllDesposition();
	
	Desposition findDespositionById(Long id);
	
	List<SubDesposition>   findAllSubDesposition();
	
	List<SubDesposition> findAllDespositionByDispositionID(Long id);
	
	SubDesposition findSubDespositionById(Long id);
	
	List<Branch> findAllBranch();
	
	Branch findBranchById(Long id);  
	
    List<UserDesignation> findAllUserDesignation();
    
    List<UserDesignation> findAllUserDesignationByVerticleID(Long id);
	
	UserDesignation findUserDesignationById(Long id);

    List<Vertical> findAllVertical();
	
	Vertical findVerticalById(Long id);
	
	List<StateCovered> findAllStateCovered();
		
    StateCovered findStateCoveredById(Long id);
    
    List<LanguageCovered> findAllLanguageCovered();
	
    LanguageCovered findLanguageCoveredById(Long id);
    
    List<DistrictCovered> findAllDistrictCovered();
 
    DistrictCovered findDistrictCoveredById(Long id);
    
    List<DistrictCovered> getDistrictsByStateId(Long stateId);
    
    List<BranchCovered> findAllBranchCovered();
	
    BranchCovered findBranchCoveredById(Long id);
    
    List<BranchCovered> getAllBranchByDistrictStateId(Long districtStateId);
    
    List<Team> findAllTeam();
	
    Team   findTeamById(Long id);
    
    List<ReportingPerson> findAllReportingPerson();
	
    ReportingPerson   findReportingPersonById(Long id);
    
    List<ReportingPerson> getReportingPersonByRoleId(Long roleId);
    
    List<ImdCode> findAllImdCode();
	
    ImdCode   findImdCodeById(Long id);
    
    List<AssignProduct> findAllAssignProduct();
	
    AssignProduct   findAssignProductById(Long id);

    List<InsuranceVerticalMaster> findAllInsuranceVerticalMaster();
	
    InsuranceVerticalMaster   findInsuranceVerticalMasterById(Long id);	
	
}
	


	
