package com.lgi.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.lgi.lms.repository.LookupMasterRepository;
import com.lgi.lms.service.LookupMasterService;


@Service
public class LookupMasterServiceImpl implements LookupMasterService {

	@Autowired
	LookupMasterRepository lookupMasterRepository;

	@Override
	public List<PolicyType> findAllPolicyType() {
		return lookupMasterRepository.findAllPolicyType();
	}
	
	 @Override
	 public PolicyType findPolicyById(Long id) {
		 return lookupMasterRepository.findPolicyById(id);
	 }

	@Override
	public List<LeadVertical> findAllLeadVertical() {
		return lookupMasterRepository.findAllLeadVertical();
	}
	
	@Override
	public List<SourceMaster> findAllSourceMaster(){
		return lookupMasterRepository.findAllSourceMaster();
	}
	
	 @Override
	    public SourceMaster findSourceById(Long id) {
		 return lookupMasterRepository.findSourceById(id);
	    }
	
	@Override
	public List<PublisherMaster> findAllPublisherMaster(){
		return lookupMasterRepository.findAllPublisherMaster();
	}
	
	@Override
    public PublisherMaster findPublisherById(Long id) {
        return lookupMasterRepository.findPublisherById(id);
    }

	@Override
	public List<PublisherMaster> findAllPublisherMasterBySourceId(Long id){
		return lookupMasterRepository.findAllPublisherMasterBySourceId(id);
	}
	
	@Override
	public List<CampaignMaster> findAllCampaignMaster() {
		return lookupMasterRepository.findAllCampaignMaster();
	}
	
	@Override
    public CampaignMaster findCampaignById(Long id) {
        return lookupMasterRepository.findCampaignById(id);
    }
	
	@Override
	public List<CampaignMaster> findAllCampaignMasterListBySourcePublisherId(Long id, Long subId) {
		return lookupMasterRepository.findAllCampaignMasterListBySourcePublisherId(id,subId);
	}
	
	@Override
	public List<Desposition> findAllDesposition() {
		return lookupMasterRepository.findAllDesposition();
	}
	
	@Override
    public Desposition findDespositionById(Long id) {
        return lookupMasterRepository.findDespositionById(id);
    }
	
	@Override
	public List<SubDesposition> findAllSubDesposition() {
		return lookupMasterRepository.findAllSubDesposition();
   }
	
	@Override
    public SubDesposition findSubDespositionById(Long id) {
        return lookupMasterRepository.findSubDespositionById(id);
    }
	
	@Override
	public List<SubDesposition> findAllDespositionByDispositionID(Long id) {
		return lookupMasterRepository.findAllDespositionByDispositionID(id);
	}
	
	
	@Override
	public List<Branch> findAllBranch() {
		return lookupMasterRepository.findAllBranch();
   }
	
	@Override
    public Branch findBranchById(Long id) {
        return lookupMasterRepository.findBranchById(id);
    }
	
	
	
	@Override
	public List<UserDesignation> findAllUserDesignation() {
		return lookupMasterRepository.findAllUserDesignation();
   }
	
	@Override
    public UserDesignation findUserDesignationById(Long id) {
        return lookupMasterRepository.findUserDesignationById(id);
    }
	
	@Override
    public List<UserDesignation> findAllUserDesignationByVerticleID(Long id) {
        return lookupMasterRepository.findAllUserDesignationByVerticleID(id);
    }
	
	@Override
	public List<Vertical> findAllVertical() {
		return lookupMasterRepository.findAllVertical();
   }
	
	@Override
    public Vertical findVerticalById(Long id) {
        return lookupMasterRepository.findVerticalById(id);
    }
	
	@Override
	public List<InsuranceVerticalMaster> findAllInsuranceVerticalMaster() {
		return lookupMasterRepository.findAllInsuranceVerticalMaster();
   }
	
	@Override
    public InsuranceVerticalMaster findInsuranceVerticalMasterById(Long id) {
        return lookupMasterRepository.findInsuranceVerticalMasterById(id);
    }
	
	@Override
	public List<StateCovered> findAllStateCovered() {
		return lookupMasterRepository.findAllStateCovered();
   }
	
	@Override
    public StateCovered findStateCoveredById(Long id) {
        return lookupMasterRepository.findStateCoveredById(id);
    }
	
	@Override
	public List<LanguageCovered> findAllLanguageCovered() {
		return lookupMasterRepository.findAllLanguageCovered();
   }
	
	@Override
    public LanguageCovered findLanguageCoveredById(Long id) {
        return lookupMasterRepository.findLanguageCoveredById(id);
    }
	
	@Override
	public List<DistrictCovered> findAllDistrictCovered() {
		return lookupMasterRepository.findAllDistrictCovered();
   }

	
	@Override
    public DistrictCovered findDistrictCoveredById(Long id) {
        return lookupMasterRepository.findDistrictCoveredById(id);
    }
	
	@Override
    public List<DistrictCovered> getDistrictsByStateId(Long stateId) {
        return lookupMasterRepository.findDistrictsByStateId(stateId);
    }
	
	@Override
	public List<BranchCovered> findAllBranchCovered() {
		return lookupMasterRepository.findAllBranchCovered();
   }
	
	@Override
    public BranchCovered findBranchCoveredById(Long id) {
        return lookupMasterRepository.findBranchCoveredById(id);
    }
	
	@Override
    public List<BranchCovered> getAllBranchByDistrictStateId(Long  districtStateId) {
        return lookupMasterRepository.findAllBranchByDistrictStateId(districtStateId);
    }
	
	@Override
	public List<Team> findAllTeam() {
		return lookupMasterRepository.findAllTeam();
   }
	
	@Override
    public Team findTeamById(Long id) {
        return lookupMasterRepository.findTeamById(id);
    }
	
	@Override
	public List<ReportingPerson> findAllReportingPerson() {
		return lookupMasterRepository.findAllReportingPerson();
   }
	
	@Override
    public ReportingPerson findReportingPersonById(Long id) {
        return lookupMasterRepository.findReportingPersonById(id);
    }
	
	@Override
	public List<ReportingPerson> getReportingPersonByRoleId(Long roleId) {
		return lookupMasterRepository.findAllReportingPersonByRoleId(roleId);
   }

	
	@Override
	public List<ImdCode> findAllImdCode() {
		return lookupMasterRepository.findAllImdCode();
   }
	
	@Override
    public ImdCode findImdCodeById(Long id) {
        return lookupMasterRepository.findImdCodeById(id);
    }
	
	@Override
	public List<AssignProduct> findAllAssignProduct() {
		return lookupMasterRepository.findAllAssignProduct();
   }
	
	@Override
    public AssignProduct findAssignProductById(Long id) {
        return lookupMasterRepository.findAssignProductById(id);
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
