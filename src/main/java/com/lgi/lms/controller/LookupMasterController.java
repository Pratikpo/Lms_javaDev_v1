package com.lgi.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lgi.lms.model.AssignProduct;
import com.lgi.lms.model.Branch;
import com.lgi.lms.model.BranchCovered;
import com.lgi.lms.model.CampaignMaster;
import com.lgi.lms.model.Desposition;
import com.lgi.lms.model.DistrictCovered;
import com.lgi.lms.model.ImdCode;
import com.lgi.lms.model.InsuranceVerticalMaster;
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
import com.lgi.lms.service.LookupMasterService;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/lookups")
public class LookupMasterController {

	@Autowired
	 private LookupMasterService lookupMasterService;
	    
	
	@GetMapping("/policyType")
	public ResponseEntity<List<PolicyType>> getPolicyTypeList() {
		try {
			List<PolicyType> policyTypeList = lookupMasterService.findAllPolicyType();

			if (policyTypeList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(policyTypeList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	 @GetMapping("/policyType/{id}")
	    public ResponseEntity<PolicyType> getPolicyById(@PathVariable("id") Long id) {
	        PolicyType policyType = lookupMasterService.findPolicyById(id);

	        if (policyType != null) {
	            return new ResponseEntity<>(policyType, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	
	@GetMapping("/leadVertical")
	public ResponseEntity<List<LeadVertical>> getLeadVerticalList() {
		try {
			List<LeadVertical> leadVerticalList = lookupMasterService.findAllLeadVertical();
			
			if (leadVerticalList.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(leadVerticalList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	  @GetMapping("/source")
	    public ResponseEntity<List<SourceMaster>> getSourceMasterList() {
	        try {
	            List<SourceMaster> sourceMaster = lookupMasterService.findAllSourceMaster();
	            
	            if (sourceMaster.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(sourceMaster, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	  
	  @GetMapping("/source/{id}")
	    public ResponseEntity<SourceMaster> getSourceById(@PathVariable("id") Long id) {
	        SourceMaster sourceMaster = lookupMasterService.findSourceById(id);

	        if (sourceMaster != null) {
	            return new ResponseEntity<>(sourceMaster, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

	  
	  @GetMapping("/publisher")
	    public ResponseEntity<List<PublisherMaster>> getPublisherMasterList() {
	        try {
	            List<PublisherMaster> publisherMasters = lookupMasterService.findAllPublisherMaster();
	            
	            if (publisherMasters.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(publisherMasters, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	  
	  @GetMapping("/publisher/{id}")
	    public ResponseEntity<PublisherMaster> getPublisherById(@PathVariable("id") Long id) {
	        PublisherMaster publisherMaster = lookupMasterService.findPublisherById(id);

	        if (publisherMaster != null) {
	            return new ResponseEntity<>(publisherMaster, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	    
	  @GetMapping("/publisherBySource/{id}")
	    public ResponseEntity<List<PublisherMaster>> getPublisherMasterListBySource(@PathVariable("id") Long id) {
	        try {
	            List<PublisherMaster> publisherMasters = lookupMasterService.findAllPublisherMasterBySourceId(id);
	            
	            if (publisherMasters.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(publisherMasters, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	  
	  @GetMapping("/campaign")
	    public ResponseEntity<List<CampaignMaster>> getCampaignMasterList() {
	        try {
	            List<CampaignMaster> campaignMasters = lookupMasterService.findAllCampaignMaster();
	            
	            if (campaignMasters.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(campaignMasters, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	  
	  @GetMapping("/campaign/{id}")
	    public ResponseEntity<CampaignMaster> getCampaignById(@PathVariable("id") Long id) {
		  	CampaignMaster campaignMasters = lookupMasterService.findCampaignById(id);

	        if (campaignMasters != null) {
	            return new ResponseEntity<>(campaignMasters, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/campaignBySourcePublisher/{id}/{subID}")
	    public ResponseEntity<List<CampaignMaster>> getCampaignMasterListBySourcePublisher(@PathVariable("id") Long id, @PathVariable("id") Long subId) {
	        try {
	            List<CampaignMaster> campaignMasters = lookupMasterService.findAllCampaignMasterListBySourcePublisherId(id,subId);
	            
	            if (campaignMasters.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(campaignMasters, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	  
	  @GetMapping("/disposition")
	    public ResponseEntity<List<Desposition>> getDesposition() {
	        try {
	            List<Desposition> desposition = lookupMasterService.findAllDesposition();
	            
	            if (desposition.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(desposition, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	  
	  }  
	  
	  @GetMapping("/disposition/{id}")
	    public ResponseEntity<Desposition> getDespositionById(@PathVariable("id") Long id) {
		  Desposition desposition = lookupMasterService.findDespositionById(id);

	        if (desposition != null) {
	            return new ResponseEntity<>(desposition, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/subDispositions")
	    public ResponseEntity<List<SubDesposition>> getSubDesposition() {
	        try {
	            List<SubDesposition> subDesposition = lookupMasterService.findAllSubDesposition();
	            
	            if (subDesposition.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(subDesposition, HttpStatus.OK);
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
     }
	  
	  @GetMapping("/subDispositions/{id}")
	    public ResponseEntity<SubDesposition> getSubDespositionById(@PathVariable("id") Long id) {
		  SubDesposition subDesposition = lookupMasterService.findSubDespositionById(id);

	        if (subDesposition != null) {
	            return new ResponseEntity<>(subDesposition, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/subDispositionsByDispositions/{id}")
	    public ResponseEntity<List<SubDesposition>> findAllDespositionByDispositionID(@PathVariable("id") Long id) {
	    	try {
	    		List<SubDesposition> subDespositions = lookupMasterService.findAllDespositionByDispositionID(id);

	    	    if (subDespositions.isEmpty()) {
	    	    	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    	    }
	    	    return new ResponseEntity<>(subDespositions, HttpStatus.OK);

	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	  
	  @GetMapping("/branch")
	    public ResponseEntity<List<Branch>> getBranch() {
	        try {
	            List<Branch> branch = lookupMasterService.findAllBranch();
	            
	            if (branch.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(branch, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/branch/{id}")
	    public ResponseEntity<Branch> getBranchById(@PathVariable("id") Long id) {
		  Branch branch = lookupMasterService.findBranchById(id);

	        if (branch != null) {
	            return new ResponseEntity<>(branch, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/userDesignation")
	    public ResponseEntity<List<UserDesignation>> getUserDesignation() {
	        try {
	            List<UserDesignation> userDesignation = lookupMasterService.findAllUserDesignation();
	            
	            if (userDesignation.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(userDesignation, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/userDesignation/{id}")
	    public ResponseEntity<UserDesignation> getUserDesignationById(@PathVariable("id") Long id) {
		  UserDesignation userDesignation = lookupMasterService.findUserDesignationById(id);

	        if (userDesignation != null) {
	            return new ResponseEntity<>(userDesignation, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/userDesignationByVerticleId/{id}")
	    public ResponseEntity<List<UserDesignation>> getUserDesignationByVerticleId(@PathVariable("id") Long id) {
	        try {
	            List<UserDesignation> userDesignation = lookupMasterService.findAllUserDesignationByVerticleID(id);
	            
	            if (userDesignation.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(userDesignation, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
      }
	  
	  
	  
	  @GetMapping("/vertical")
	    public ResponseEntity<List<Vertical>> getVertical() {
	        try {
	            List<Vertical> vertical = lookupMasterService.findAllVertical();
	            
	            if (vertical.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(vertical, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
      }
	  
	  @GetMapping("/vertical/{id}")
	    public ResponseEntity<Vertical> getVerticalById(@PathVariable("id") Long id) {
		  Vertical vertical = lookupMasterService.findVerticalById(id);

	        if (vertical != null) {
	            return new ResponseEntity<>(vertical, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  
	  @GetMapping("/insuranceVertical")
	    public ResponseEntity<List<InsuranceVerticalMaster>> findAllInsuranceVerticalMaster() {
	        try {
	            List<InsuranceVerticalMaster> insuranceVerticalMaster  = lookupMasterService.findAllInsuranceVerticalMaster();
	            
	            if (insuranceVerticalMaster .isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(insuranceVerticalMaster , HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
      }
	  
	  @GetMapping("/insuranceVertical/{id}")
	    public ResponseEntity<InsuranceVerticalMaster> findInsuranceVerticalMasterById(@PathVariable("id") Long id) {
		  InsuranceVerticalMaster insuranceVerticalMaster = lookupMasterService.findInsuranceVerticalMasterById(id);

	        if (insuranceVerticalMaster  != null) {
	            return new ResponseEntity<>(insuranceVerticalMaster , HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/stateCovered")
	    public ResponseEntity<List<StateCovered>> getStateCovered() {
	        try {
	            List<StateCovered> stateCovered = lookupMasterService.findAllStateCovered();
	            
	            if (stateCovered.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(stateCovered, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/stateCovered/{id}")
	    public ResponseEntity<StateCovered> getStateCoveredById(@PathVariable("id") Long id) {
		  StateCovered stateCovered = lookupMasterService.findStateCoveredById(id);

	        if (stateCovered != null) {
	            return new ResponseEntity<>(stateCovered, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/languageCovered")
	    public ResponseEntity<List<LanguageCovered>> getLanguageCovered() {
	        try {
	            List<LanguageCovered> languageCovered = lookupMasterService.findAllLanguageCovered();
	            
	            if (languageCovered.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(languageCovered, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/languageCovered/{id}")
	    public ResponseEntity<LanguageCovered> getLanguageCoveredById(@PathVariable("id") Long id) {
		  LanguageCovered languageCovered = lookupMasterService.findLanguageCoveredById(id);

	        if (languageCovered != null) {
	            return new ResponseEntity<>(languageCovered, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/districtCovered")
	    public ResponseEntity<List<DistrictCovered>> getDistrictCovered() {
	        try {
	            List<DistrictCovered> districtCovered = lookupMasterService.findAllDistrictCovered();
	            
	            if (districtCovered.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(districtCovered, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
      }
	  
	  @GetMapping("/districtCovered/{id}")
	    public ResponseEntity<DistrictCovered> getDistrictCoveredById(@PathVariable("id") Long id) {
		  DistrictCovered districtCovered = lookupMasterService.findDistrictCoveredById(id);

	        if (districtCovered != null) {
	            return new ResponseEntity<>(districtCovered, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/districtByState")
	    public ResponseEntity<List<DistrictCovered>> getDistrictsByStateId(@RequestParam Long stateId) {
	        List<DistrictCovered> districts = lookupMasterService.getDistrictsByStateId(stateId);
	        return ResponseEntity.ok(districts);
	    }
	  
	  @GetMapping("/branchCovered")
	    public ResponseEntity<List<BranchCovered>> getBranchCovered() {
	        try {
	            List<BranchCovered> branchCovered = lookupMasterService.findAllBranchCovered();
	            
	            if (branchCovered.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(branchCovered, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/branchCovered/{id}")
	    public ResponseEntity<BranchCovered> getBranchCoveredById(@PathVariable("id") Long id) {
		  BranchCovered branchCovered = lookupMasterService.findBranchCoveredById(id);

	        if (branchCovered != null) {
	            return new ResponseEntity<>(branchCovered, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/branchByDistrictState")
	    public ResponseEntity<List<BranchCovered>> getAllBranchByDistrictStateId(@RequestParam Long districtStateId) {
	        List<BranchCovered> branchCovered = lookupMasterService.getAllBranchByDistrictStateId(districtStateId);
	        return ResponseEntity.ok(branchCovered);
	    }
	  
	  
	   
	  @GetMapping("/team")
	    public ResponseEntity<List<Team>> getTeam() {
	        try {
	            List<Team> team = lookupMasterService.findAllTeam();
	            
	            if (team.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(team, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/team/{id}")
	    public ResponseEntity<Team> getTeamById(@PathVariable("id") Long id) {
		  Team team = lookupMasterService.findTeamById(id);

	        if (team != null) {
	            return new ResponseEntity<>(team, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/reportingPerson")
	    public ResponseEntity<List<ReportingPerson>> getReportingPerson() {
	        try {
	            List<ReportingPerson> reportingPerson = lookupMasterService.findAllReportingPerson();
	            
	            if (reportingPerson.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(reportingPerson, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/reportingPerson/{id}")
	    public ResponseEntity<ReportingPerson> getReportingPersonById(@PathVariable("id") Long id) {
		  ReportingPerson reportingPerson = lookupMasterService.findReportingPersonById(id);

	        if (reportingPerson != null) {
	            return new ResponseEntity<>(reportingPerson, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	   
	  @GetMapping("/reportingPersonByRole")
	    public ResponseEntity<List<ReportingPerson>> getReportingPersonByRoleId(@RequestParam Long roleId) {
	        List<ReportingPerson> reportingPerson = lookupMasterService.getReportingPersonByRoleId(roleId);
	        return ResponseEntity.ok(reportingPerson);
	    }
	
	  @GetMapping("/imdCode")
	    public ResponseEntity<List<ImdCode>> getImdCode() {
	        try {
	            List<ImdCode> imdCode = lookupMasterService.findAllImdCode();
	            
	            if (imdCode.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(imdCode, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/imdCode/{id}")
	    public ResponseEntity<ImdCode> getImdCodeById(@PathVariable("id") Long id) {
		  ImdCode imdCode = lookupMasterService.findImdCodeById(id);

	        if (imdCode != null) {
	            return new ResponseEntity<>(imdCode, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }
	  
	  @GetMapping("/assignProduct")
	    public ResponseEntity<List<AssignProduct>> getAssignProduct() {
	        try {
	            List<AssignProduct> assignProduct = lookupMasterService.findAllAssignProduct();
	            
	            if (assignProduct.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            
	            return new ResponseEntity<>(assignProduct, HttpStatus.OK); 
	        } catch (Exception e) {
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }  
        }
	  
	  @GetMapping("/assignProduct/{id}")
	    public ResponseEntity<AssignProduct> getAssignProductById(@PathVariable("id") Long id) {
		  AssignProduct assignProduct = lookupMasterService.findAssignProductById(id);

	        if (assignProduct != null) {
	            return new ResponseEntity<>(assignProduct, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    }

} 
