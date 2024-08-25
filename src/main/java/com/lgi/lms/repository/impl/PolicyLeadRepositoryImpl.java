package com.lgi.lms.repository.impl;

import com.lgi.lms.model.policyMasterLeadDetails.PolicyLeadDetails;
import com.lgi.lms.model.rowmapper.PolicyLeadRawMapper;
import com.lgi.lms.repository.PolicyLeadRepository;
import org.springframework.dao.EmptyResultDataAccessException;


import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolicyLeadRepositoryImpl implements PolicyLeadRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public PolicyLeadRepositoryImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }


    @Override
    public PolicyLeadDetails findPolicyLeadById(Long id) {
        String sql = "SELECT pm.id, pm.lead_id, pm.tellecaller_user_id, pm.policy_Number, " +
                "pm.product_name, pm.biztype, pm.policy_end_date, pm.insured_name, " +
                "pm.customer_address1, pm.customer_address2, pm.customer_address3, " +
                "pm.customer_city, pm.customer_district, pm.customer_pincode, pm.state, " +
                "pm.mobile1, pm.mobile2, pm.mobile3, pm.emailId, pm.customerId, " +
                "pm.sales_vertical_id, pm.servicing_branch, pm.sales_manager_code_name, " +
                "pm.sales_manager_name, pm.diff_date_count, pm.sales_manager_code, " +
                "pm.branch_add1, pm.branch_add2, pm.branch_add3, pm.branch_pincode, " +
                "pm.branch_locality, pm.branch_city, pm.Banch_telephone, pm.location_code, " +
                "pm.agent_code, pm.agent_code1, pm.agent_name, pm.business_channeltype, " +
                "pm.renewal_noticedate, pm.policy_start_date, pm.renewalpolicy_start_date, " +
                "pm.regi_number1, pm.regi_no, pm.yom, pm.regi_date, pm.age, " +
                "pm.special_model_age, pm.age_bracket, pm.engine_no, pm.chassis_no, " +
                "pm.make, pm.model, pm.model_variant, pm.body_type, pm.cubic_capacity, " +
                "pm.LCC_driver, pm.fuel_type, pm.cover_type, pm.rto_location, pm.zone, " +
                "pm.veh_idv, pm.trailer_idv, pm.sidecar_idv, pm.nonelectrical_idv, " +
                "pm.renewal_nonelectrical_idv, pm.electrical_si, pm.renewal_electrical_si, " +
                "pm.cng_premium, pm.cng, pm.cng_inbuilt, pm.cng_si, pm.renewal_cng_idv, " +
                "pm.total_idv, pm.highend_model_idv, pm.od_rate, pm.basic_od, " +
                "pm.lastyear_claim, pm.lastyear_ncb, pm.renewal_ncb, pm.ncb_amount, " +
                "pm.od_prem_post_ncb, pm.basic_od_without_cng_elect, pm.ncb_without_cng_elect, " +
                "pm.postncb_od_without_cng_elect, pm.detariff_dis_lastyear, pm.last_year_dis, " +
                "pm.detariff_loading, pm.current_dis_grid_ncb, pm.current_dis_grid_withoutncb, " +
                "pm.postncb_od_without_cng_electpostncb, pm.premium_after_dis, pm.nil_dept, " +
                "pm.passenger_assist, pm.consumable_cover, pm.engine_safe_cover, " +
                "pm.read_assistance, pm.key_loss, pm.total_od, pm.basic_tp, pm.ttpd_premium, " +
                "pm.cng_tp_premium, pm.pa_owner_driver, pm.pa_to_unnamed, pm.pa_driver_cleaner, " +
                "pm.ll_to_paid_driver, pm.pa_named_pass, pm.total_tp, pm.premium_before_tax, " +
                "pm.gst, pm.total_premium_payable, pm.premium_payable_withoutncb, " +
                "pm.financier_name, pm.claim_amount_total, pm.no_of_claim, " +
                "pm.depreciation_cover_ex, pm.consumable_cover_ex, pm.gap_value_cover_ex, " +
                "pm.passanger_assist_ex, pm.roadside_assis_ex, pm.engine_safe_cover_ex, " +
                "pm.key_loss_cover_ex, pm.key_loss_cover_si, pm.ncb_percent_prevyear, " +
                "pm.endorsement_no, pm.days, pm.veh_segment, pm.newsales_manager_code, " +
                "pm.newsales_manager_name, pm.new_rms_name, pm.new_branch_name, pm.new_vertical, " +
                "pm.category, pm.applicable_dis_withncb, pm.applicable_dis_withoutncb, " +
                "pm.post_withoutncb_od_without_cng_elect, pm.premium_after_dis_withoutncb, " +
                "pm.total_od_withoutncb, pm.premium_before_tax_withoutncb, pm.gst_withoutncb, " +
                "pm.ncb_falsification, pm.roadside_assis, " +
                "pm.zerodepconsum_keyloss_roadsideassist_passengerassist, " +
                "pm.zerodepconsum_enginesafe_keyloss_roadsideassist_passengerassist, " +
                "pm.zerodepreciation_passengerassist, " +
                "pm.zerodepreciation_passengerassist_consumable, " +
                "pm.zerodepreciation_passengerassist_consumable_roadsideassistance, " +
                "pm.bi_status, pm.bi_leadid, pm.bi_initiated_by, pm.bi_sms_link_status, " +
                "pm.bi_created_on, pm.is_bimessage_send, pm.bi_initiated_on, pm.bi_completed_on, " +
                "pm.dispositions_id, pm.status, pm.sub_status_id, pm.priority, pm.sources, " +
                "pm.nc_status, pm.created_on, pm.isRenewed, pm.isReceived, pm.type_of_call, " +
                "pm.campaign, pm.TyreProtectionCoveEX, pm.LibertyCompleteAssistanceEX, " +
                "pm.is_smslink_created, pm.customer_id, pm.email_id, pm.is_received, " +
                "pm.is_renewed, pm.liberty_complete_assistanceex, pm.tyre_protection_coveex, " +
                "ld.id AS lead_id, ld.product_lead_id, ld.insurance_vertical_id, ld.first_name, " +
                "ld.middle_name, ld.last_name, ld.last_updated_date_time, ld.product_type_id, " +
                "ld.policy_type_id, ld.policy_status, ld.last_insurance_copmany, ld.lead_disposition_id, ld.lead_sub_disposition_id, " +
                "ld.lead_device, ld.manufacturing_month, ld.ad_on_covers, ld.source_id, " +
                "ld.publisher_id, ld.campaign_id, ld.vertical_id " +
                "FROM policy_master pm " +
                "JOIN lead_details ld ON pm.id = ld.product_lead_id " +
                "WHERE pm.id = :id";
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        try {
            return namedParameterJdbcTemplate.queryForObject(
                    sql,
                    params,
                    new PolicyLeadRawMapper()
            );
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}