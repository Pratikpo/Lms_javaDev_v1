package com.lgi.lms.repository;

import com.lgi.lms.model.DmsPolicy;
import com.lgi.lms.model.DmsMaster;

public interface DmsMasterRepository {
    void saveDmsMaster(DmsMaster dmsMaster);
    DmsPolicy findPolicyMasterById(int id);
}
