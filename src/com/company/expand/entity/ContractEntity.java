package com.company.expand.entity;

import java.util.Objects;

/**
 * <b> 此处简要描述此类功能 </b>
 * <p>
 * 此处添加类的描述信息
 * </p>
 * 创建日期:2018-6-29
 *
 * @author
 */

public class ContractEntity implements Cloneable {

    private static final long serialVersionUID = 2000000000000000082L;
    private static ContractEntity entity = null;

    private ContractEntity() {
    }

    public static ContractEntity getInstance() throws CloneNotSupportedException {
        if (entity == null) {
            synchronized (ContractEntity.class) {
                if (entity == null) {
                    entity = new ContractEntity();
                    return entity;
                }
            }
        }
        return (ContractEntity) entity.clone();
    }

    private String pk_lease_calculator;

    private String pk_contract;

    private String pk_project;

    private String if_together_lessee;

    private String if_guarantee;

    private String guarantee_way;

    private java.math.BigDecimal loan_cash;

    private String cont_mode;

    private String rent_type;

    private String prj_amount_purpose;

    private String other_lessor;

    private String cont_code;

    private String cont_name;

    private String cont_year;

    private String cont_number;

    private java.util.Date lease_date_predict;

    private java.util.Date cont_signed_date;

    private java.util.Date cont_end_date;

    private java.util.Date cont_start_date;

    private java.util.Date appoint_cont_date;

    private String cont_address;

    private java.util.Date plan_loan_predict;

    private java.util.Date value_dated_predict;

    private java.math.BigDecimal machine_amount;

    private java.math.BigDecimal cont_amount;

    private String pk_currency;

    private String is_canrefund;

    private Integer refund_times;

    private Double refund_rate;

    private String exchg_rate;

    private Integer cont_batch;

    private String cont_status;

    private String lease_flow;

    private String pk_sign;

    private String cont_describe;

    private String pk_customer_lessor;

    private String pk_lessor_contact;

    private String pk_customer_lessee;

    private String pk_lessee_contact;

    private String cont_loan_method;

    private java.util.Date face_plan_date;

    private String is_spv;

    private String is_rent_project;

    private String is_joint_lease;

    private String is_entrust_branch_warrant;

    private String part_start_rent_method;

    private String is_rent_thing_insure;

    private String fund_payment_method;

    private String equipment_transfer_payment;

    private String value_rent_day;

    private String legal_personnel;

    private String if_adjust;

    private String adjust_type;

    private String adjust_time;

    private String invoice_method;

    private String invoice_condition;

    private Integer invoice_advance_days;

    private String billstatus;

    private String pk_initial;

    private String pk_prj_manager;

    private String cont_type;

    private String adjust_start_date;

    private String pk_cust_help;

    private String pk_lessor_acct;

    private String pk_lessee_acct;

    private Integer lease_times;

    private String interest_adjustments;

    private String tax_rate;

    private String leaseback_type;

    private java.util.Date plan_loan_fact;

    private java.util.Date value_dated_fact;

    private java.util.Date active_date;

    private java.util.Date lease_date_fact;

    private String lease_period;

    private Integer grace_period;

    private java.math.BigDecimal fact_cash_loan;

    private java.util.Date appoint_rent_date;

    private Integer grace_days;

    private String assets_classify;

    private String bad_flag;

    private String if_send_credit;

    private java.math.BigDecimal plan_con_irr;

    private String if_link_cust;

    private java.math.BigDecimal amount_fact_balance;

    private java.math.BigDecimal amount_cont_balance;

    private String cont_loan_batch;

    private String source_billtype;

    private String cont_source_bill;

    private String version_no;

    private String if_new;

    private String pk_cust_main;

    private String pk_group;

    private String pk_org;

    private String creator;

    private String creationtime;

    private String modifier;

    private String modifiedtime;

    private String def1;
    //数据迁移-原项目经理
    private String def2;
    //数据迁移-原所属部门
    private String def3;
    //合同变更类型（高端/市场）
    private String def4;

    private String def5;

    private String def6;
    //资产管理部判断是否上会  
    private String def7;
    //合同变更风险合规部判定是否上会  
    private String def8;

    private String def9;

    private String def10;

    private String pk_dept;

    private String pk_checker;

    private String check_time;

    private String change_type;

    private String business_line;

    private String pk_contract_old;

    private String change_content;

    private String if_signed_supplementary;

    private String change_class;

    private String pk_contractref;

    private Double irr_revenue;

    private Double irr_revenue_notax;

    private Double irr_actual;

    private Double irr_actual_notax;

    private Double irr_contr;

    private Double irr_contr_notax;

    private Double irr_contr_actual;

    private Double irr_contr_actual_notax;

    private String sealed_info;

    private String free_status;

    private String is_shareholder_bus;

    private String lease_mold;

    private Double surplus_amount;

    private String is_face;

    private String lease_thing_class;

    private String business_unit;

    private String creditcontr;

    private String country;

    private String province;

    private String city;

    private String district;

    private String bill_type;

    private String is_lock;

    private String business_department;

    private String seal_type;

    private Integer dr = 0;

    private java.util.Date ts;

    private String lease_item_description;
    private String pksecondbank;

    private String is_pledge;
    private String is_upload;
    private String is_finance;

    private String other_seal;

    private String legal_seal_time;

    private String conmon_seal_time;

    private String cont_seal_time;

    private String other_seal_time;

    private String if_use_legal;

    private String if_use_conmon;

    private String if_use_cont;

    private String if_use_other;

    private java.util.Date use_legal_time;

    private java.util.Date use_conmon_time;

    private java.util.Date use_cont_time;

    private java.util.Date use_other_time;

    private String is_face_online;

    /**
     * 合同结清财务结清标识
     */
    private String gather_settle_status;

    /**
     * 推广协议类型
     */
    private String generalize_type;

    private Boolean can_edit;

    private String credit_type;


    private String change_content_before;

    private String if_intertemporal;

    private String intertemporal_type;

    private String intertemporal_reason;


    public String getChange_content_before() {
        return change_content_before;
    }

    public void setChange_content_before(String change_content_before) {
        this.change_content_before = change_content_before;
    }

    public String getCredit_type() {
        return credit_type;
    }

    public void setCredit_type(String credit_type) {
        this.credit_type = credit_type;
    }

    public String getIs_pledge() {
        return is_pledge;
    }

    public void setIs_pledge(String is_pledge) {
        this.is_pledge = is_pledge;
    }

    public String getIs_upload() {
        return is_upload;
    }

    public void setIs_upload(String is_upload) {
        this.is_upload = is_upload;
    }

    public String getIs_finance() {
        return is_finance;
    }

    public void setIs_finance(String is_finance) {
        this.is_finance = is_finance;
    }

    public String getPksecondbank() {
        return pksecondbank;
    }

    public void setPksecondbank(String pksecondbank) {
        this.pksecondbank = pksecondbank;
    }

    /**
     * 承租人信息
     */
    /**
     * 供应商信息
     */
    /**
     * 保证担保
     */

    /**
     * 抵押担保
     */

    /**
     * 收益权质押担保
     */

    /**
     * 股权质押担保
     */

    /**
     * 账户监管
     */

    /**
     * 担保-其他
     */

    /**
     * 成交条件
     */

    /**
     * 租赁物
     */

    /**
     * 保险信息
     */

    /**
     * 合同相关方
     */
    /**
     * 开票方案
     */
    /**
     * 开票条件
     */
    /**
     * 合同签订条件
     */
    /**
     * 资金下款条件
     */
    /**
     * 租后管理条件
     */
    /**
     * 项目组成员
     */
    /**
     * 逾期利率信息
     */
    /**
     * 视频面签
     */
    /**
     * 实际收支计划
     */

    //主承租人，客户类型
    private String customerType;

    //主承租人客户主键
    private String pk_mainBothLessee;

    //主承租人主键
    private String pk_prj_both_lessee;


    public String getPk_prj_both_lessee() {
        return pk_prj_both_lessee;
    }

    public void setPk_prj_both_lessee(String pk_prj_both_lessee) {
        this.pk_prj_both_lessee = pk_prj_both_lessee;
    }

    public String getPk_mainBothLessee() {
        return pk_mainBothLessee;
    }

    public void setPk_mainBothLessee(String pk_mainBothLessee) {
        this.pk_mainBothLessee = pk_mainBothLessee;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * 属性 pk_lease_calculator的Getter方法.属性名：报价测算主键
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_lease_calculator() {
        return pk_lease_calculator;
    }

    /**
     * 属性pk_lease_calculator的Setter方法.属性名：报价测算主键
     * 创建日期:2018-6-29
     *
     * @param newPk_lease_calculator java.lang.String
     */
    public void setPk_lease_calculator(String newPk_lease_calculator) {
        this.pk_lease_calculator = newPk_lease_calculator;
    }

    /**
     * 属性 pk_contract的Getter方法.属性名：合同主键
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_contract() {
        return pk_contract;
    }

    /**
     * 属性pk_contract的Setter方法.属性名：合同主键
     * 创建日期:2018-6-29
     *
     * @param newPk_contract java.lang.String
     */
    public void setPk_contract(String newPk_contract) {
        this.pk_contract = newPk_contract;
    }

    /**
     * 属性 pk_project的Getter方法.属性名：项目名称
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_project() {
        return pk_project;
    }

    /**
     * 属性pk_project的Setter方法.属性名：项目名称
     * 创建日期:2018-6-29
     *
     * @param newPk_project java.lang.String
     */
    public void setPk_project(String newPk_project) {
        this.pk_project = newPk_project;
    }

    /**
     * 属性 if_together_lessee的Getter方法.属性名：是否有共同承租人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIf_together_lessee() {
        return if_together_lessee;
    }

    /**
     * 属性if_together_lessee的Setter方法.属性名：是否有共同承租人
     * 创建日期:2018-6-29
     *
     * @param newIf_together_lessee java.lang.String
     */
    public void setIf_together_lessee(String newIf_together_lessee) {
        this.if_together_lessee = newIf_together_lessee;
    }

    /**
     * 属性 if_guarantee的Getter方法.属性名：是否担保
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIf_guarantee() {
        return if_guarantee;
    }

    /**
     * 属性if_guarantee的Setter方法.属性名：是否担保
     * 创建日期:2018-6-29
     *
     * @param newIf_guarantee java.lang.String
     */
    public void setIf_guarantee(String newIf_guarantee) {
        this.if_guarantee = newIf_guarantee;
    }

    /**
     * 属性 guarantee_way的Getter方法.属性名：担保方式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getGuarantee_way() {
        return guarantee_way;
    }

    /**
     * 属性guarantee_way的Setter方法.属性名：担保方式
     * 创建日期:2018-6-29
     *
     * @param newGuarantee_way java.lang.String
     */
    public void setGuarantee_way(String newGuarantee_way) {
        this.guarantee_way = newGuarantee_way;
    }

    /**
     * 属性 loan_cash的Getter方法.属性名：投放金额
     * 创建日期:2018-6-29
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getLoan_cash() {
        return loan_cash;
    }

    /**
     * 属性loan_cash的Setter方法.属性名：投放金额
     * 创建日期:2018-6-29
     *
     * @param newLoan_cash java.math.BigDecimal
     */
    public void setLoan_cash(java.math.BigDecimal newLoan_cash) {
        this.loan_cash = newLoan_cash;
    }

    /**
     * 属性 cont_mode的Getter方法.属性名：合同模式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_mode() {
        return cont_mode;
    }

    /**
     * 属性cont_mode的Setter方法.属性名：合同模式
     * 创建日期:2018-6-29
     *
     * @param newCont_mode java.lang.String
     */
    public void setCont_mode(String newCont_mode) {
        this.cont_mode = newCont_mode;
    }

    /**
     * 属性 rent_type的Getter方法.属性名：租赁模式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getRent_type() {
        return rent_type;
    }

    /**
     * 属性rent_type的Setter方法.属性名：租赁模式
     * 创建日期:2018-6-29
     *
     * @param newRent_type java.lang.String
     */
    public void setRent_type(String newRent_type) {
        this.rent_type = newRent_type;
    }

    /**
     * 属性 prj_amount_purpose的Getter方法.属性名：项目资金用途
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPrj_amount_purpose() {
        return prj_amount_purpose;
    }

    /**
     * 属性prj_amount_purpose的Setter方法.属性名：项目资金用途
     * 创建日期:2018-6-29
     *
     * @param newPrj_amount_purpose java.lang.String
     */
    public void setPrj_amount_purpose(String newPrj_amount_purpose) {
        this.prj_amount_purpose = newPrj_amount_purpose;
    }

    /**
     * 属性 other_lessor的Getter方法.属性名：其他出租人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getOther_lessor() {
        return other_lessor;
    }

    /**
     * 属性other_lessor的Setter方法.属性名：其他出租人
     * 创建日期:2018-6-29
     *
     * @param newOther_lessor java.lang.String
     */
    public void setOther_lessor(String newOther_lessor) {
        this.other_lessor = newOther_lessor;
    }

    /**
     * 属性 cont_code的Getter方法.属性名：合同编号
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_code() {
        return cont_code;
    }

    /**
     * 属性cont_code的Setter方法.属性名：合同编号
     * 创建日期:2018-6-29
     *
     * @param newCont_code java.lang.String
     */
    public void setCont_code(String newCont_code) {
        this.cont_code = newCont_code;
    }

    /**
     * 属性 cont_name的Getter方法.属性名：合同名称
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_name() {
        return cont_name;
    }

    /**
     * 属性cont_name的Setter方法.属性名：合同名称
     * 创建日期:2018-6-29
     *
     * @param newCont_name java.lang.String
     */
    public void setCont_name(String newCont_name) {
        this.cont_name = newCont_name;
    }

    /**
     * 属性 cont_year的Getter方法.属性名：合同年份
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_year() {
        return cont_year;
    }

    /**
     * 属性cont_year的Setter方法.属性名：合同年份
     * 创建日期:2018-6-29
     *
     * @param newCont_year java.lang.String
     */
    public void setCont_year(String newCont_year) {
        this.cont_year = newCont_year;
    }

    /**
     * 属性 cont_number的Getter方法.属性名：合同号
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_number() {
        return cont_number;
    }

    /**
     * 属性cont_number的Setter方法.属性名：合同号
     * 创建日期:2018-6-29
     *
     * @param newCont_number java.lang.String
     */
    public void setCont_number(String newCont_number) {
        this.cont_number = newCont_number;
    }

    /**
     * 属性 lease_date_predict的Getter方法.属性名：合同计划起租日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getLease_date_predict() {
        return lease_date_predict;
    }

    /**
     * 属性lease_date_predict的Setter方法.属性名：合同计划起租日
     * 创建日期:2018-6-29
     *
     * @param newLease_date_predict java.util.Date
     */
    public void setLease_date_predict(java.util.Date newLease_date_predict) {
        this.lease_date_predict = newLease_date_predict;
    }

    /**
     * 属性 cont_signed_date的Getter方法.属性名：合同签订日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getCont_signed_date() {
        return cont_signed_date;
    }

    /**
     * 属性cont_signed_date的Setter方法.属性名：合同签订日
     * 创建日期:2018-6-29
     *
     * @param newCont_signed_date java.util.Date
     */
    public void setCont_signed_date(java.util.Date newCont_signed_date) {
        this.cont_signed_date = newCont_signed_date;
    }

    /**
     * 属性 cont_end_date的Getter方法.属性名：合同截止日期
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getCont_end_date() {
        return cont_end_date;
    }

    /**
     * 属性cont_end_date的Setter方法.属性名：合同截止日期
     * 创建日期:2018-6-29
     *
     * @param newCont_end_date java.util.Date
     */
    public void setCont_end_date(java.util.Date newCont_end_date) {
        this.cont_end_date = newCont_end_date;
    }

    /**
     * 属性 cont_start_date的Getter方法.属性名：合同起始日期
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getCont_start_date() {
        return cont_start_date;
    }

    /**
     * 属性cont_start_date的Setter方法.属性名：合同起始日期
     * 创建日期:2018-6-29
     *
     * @param newCont_start_date java.util.Date
     */
    public void setCont_start_date(java.util.Date newCont_start_date) {
        this.cont_start_date = newCont_start_date;
    }

    /**
     * 属性 appoint_cont_date的Getter方法.属性名：合同预计签订日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getAppoint_cont_date() {
        return appoint_cont_date;
    }

    /**
     * 属性appoint_cont_date的Setter方法.属性名：合同预计签订日
     * 创建日期:2018-6-29
     *
     * @param newAppoint_cont_date java.util.Date
     */
    public void setAppoint_cont_date(java.util.Date newAppoint_cont_date) {
        this.appoint_cont_date = newAppoint_cont_date;
    }

    /**
     * 属性 cont_address的Getter方法.属性名：合同签订地址
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_address() {
        return cont_address;
    }

    /**
     * 属性cont_address的Setter方法.属性名：合同签订地址
     * 创建日期:2018-6-29
     *
     * @param newCont_address java.lang.String
     */
    public void setCont_address(String newCont_address) {
        this.cont_address = newCont_address;
    }

    /**
     * 属性 plan_loan_predict的Getter方法.属性名：预计投放日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getPlan_loan_predict() {
        return plan_loan_predict;
    }

    /**
     * 属性plan_loan_predict的Setter方法.属性名：预计投放日
     * 创建日期:2018-6-29
     *
     * @param newPlan_loan_predict java.util.Date
     */
    public void setPlan_loan_predict(java.util.Date newPlan_loan_predict) {
        this.plan_loan_predict = newPlan_loan_predict;
    }

    /**
     * 属性 value_dated_predict的Getter方法.属性名：预计起息日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getValue_dated_predict() {
        return value_dated_predict;
    }

    /**
     * 属性value_dated_predict的Setter方法.属性名：预计起息日
     * 创建日期:2018-6-29
     *
     * @param newValue_dated_predict java.util.Date
     */
    public void setValue_dated_predict(java.util.Date newValue_dated_predict) {
        this.value_dated_predict = newValue_dated_predict;
    }

    /**
     * 属性 machine_amount的Getter方法.属性名：设备金额
     * 创建日期:2018-6-29
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getMachine_amount() {
        return machine_amount;
    }

    /**
     * 属性machine_amount的Setter方法.属性名：设备金额
     * 创建日期:2018-6-29
     *
     * @param newMachine_amount java.math.BigDecimal
     */
    public void setMachine_amount(java.math.BigDecimal newMachine_amount) {
        this.machine_amount = newMachine_amount;
    }

    /**
     * 属性 cont_amount的Getter方法.属性名：合同金额
     * 创建日期:2018-6-29
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCont_amount() {
        return cont_amount;
    }

    /**
     * 属性cont_amount的Setter方法.属性名：合同金额
     * 创建日期:2018-6-29
     *
     * @param newCont_amount java.math.BigDecimal
     */
    public void setCont_amount(java.math.BigDecimal newCont_amount) {
        this.cont_amount = newCont_amount;
    }

    /**
     * 属性 pk_currency的Getter方法.属性名：币种
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_currency() {
        return pk_currency;
    }

    /**
     * 属性pk_currency的Setter方法.属性名：币种
     * 创建日期:2018-6-29
     *
     * @param newPk_currency java.lang.String
     */
    public void setPk_currency(String newPk_currency) {
        this.pk_currency = newPk_currency;
    }

    /**
     * 属性 is_canrefund的Getter方法.属性名：是否允许提前还款
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_canrefund() {
        return is_canrefund;
    }

    /**
     * 属性is_canrefund的Setter方法.属性名：是否允许提前还款
     * 创建日期:2018-6-29
     *
     * @param newIs_canrefund java.lang.String
     */
    public void setIs_canrefund(String newIs_canrefund) {
        this.is_canrefund = newIs_canrefund;
    }

    /**
     * 属性 refund_times的Getter方法.属性名：提前还款期限
     * 创建日期:2018-6-29
     *
     * @return java.lang.Integer
     */
    public Integer getRefund_times() {
        return refund_times;
    }

    /**
     * 属性refund_times的Setter方法.属性名：提前还款期限
     * 创建日期:2018-6-29
     *
     * @param newRefund_times java.lang.Integer
     */
    public void setRefund_times(Integer newRefund_times) {
        this.refund_times = newRefund_times;
    }

    /**
     * 属性 refund_rate的Getter方法.属性名：提前还款手续费率
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getRefund_rate() {
        return refund_rate;
    }

    /**
     * 属性refund_rate的Setter方法.属性名：提前还款手续费率
     * 创建日期:2018-6-29
     *
     * @param newRefund_rate java.lang.Double
     */
    public void setRefund_rate(Double newRefund_rate) {
        this.refund_rate = newRefund_rate;
    }

    /**
     * 属性 exchg_rate的Getter方法.属性名：汇率
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getExchg_rate() {
        return exchg_rate;
    }

    /**
     * 属性exchg_rate的Setter方法.属性名：汇率
     * 创建日期:2018-6-29
     *
     * @param newExchg_rate java.lang.String
     */
    public void setExchg_rate(String newExchg_rate) {
        this.exchg_rate = newExchg_rate;
    }

    /**
     * 属性 cont_batch的Getter方法.属性名：合同批次
     * 创建日期:2018-6-29
     *
     * @return java.lang.Integer
     */
    public Integer getCont_batch() {
        return cont_batch;
    }

    /**
     * 属性cont_batch的Setter方法.属性名：合同批次
     * 创建日期:2018-6-29
     *
     * @param newCont_batch java.lang.Integer
     */
    public void setCont_batch(Integer newCont_batch) {
        this.cont_batch = newCont_batch;
    }

    /**
     * 属性 cont_status的Getter方法.属性名：合同状态
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_status() {
        return cont_status;
    }

    /**
     * 属性cont_status的Setter方法.属性名：合同状态
     * 创建日期:2018-6-29
     *
     * @param newCont_status java.lang.String
     */
    public void setCont_status(String newCont_status) {
        this.cont_status = newCont_status;
    }

    /**
     * 属性 lease_flow的Getter方法.属性名：起租流程
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getLease_flow() {
        return lease_flow;
    }

    /**
     * 属性lease_flow的Setter方法.属性名：起租流程
     * 创建日期:2018-6-29
     *
     * @param newLease_flow java.lang.String
     */
    public void setLease_flow(String newLease_flow) {
        this.lease_flow = newLease_flow;
    }

    /**
     * 属性 pk_sign的Getter方法.属性名：合同签订人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_sign() {
        return pk_sign;
    }

    /**
     * 属性pk_sign的Setter方法.属性名：合同签订人
     * 创建日期:2018-6-29
     *
     * @param newPk_sign java.lang.String
     */
    public void setPk_sign(String newPk_sign) {
        this.pk_sign = newPk_sign;
    }

    /**
     * 属性 cont_describe的Getter方法.属性名：合同签订描述
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_describe() {
        return cont_describe;
    }

    /**
     * 属性cont_describe的Setter方法.属性名：合同签订描述
     * 创建日期:2018-6-29
     *
     * @param newCont_describe java.lang.String
     */
    public void setCont_describe(String newCont_describe) {
        this.cont_describe = newCont_describe;
    }

    /**
     * 属性 pk_customer_lessor的Getter方法.属性名：出租人客户主键
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_customer_lessor() {
        return pk_customer_lessor;
    }

    /**
     * 属性pk_customer_lessor的Setter方法.属性名：出租人客户主键
     * 创建日期:2018-6-29
     *
     * @param newPk_customer_lessor java.lang.String
     */
    public void setPk_customer_lessor(String newPk_customer_lessor) {
        this.pk_customer_lessor = newPk_customer_lessor;
    }

    /**
     * 属性 pk_lessor_contact的Getter方法.属性名：出租人联系人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_lessor_contact() {
        return pk_lessor_contact;
    }

    /**
     * 属性pk_lessor_contact的Setter方法.属性名：出租人联系人
     * 创建日期:2018-6-29
     *
     * @param newPk_lessor_contact java.lang.String
     */
    public void setPk_lessor_contact(String newPk_lessor_contact) {
        this.pk_lessor_contact = newPk_lessor_contact;
    }

    /**
     * 属性 pk_customer_lessee的Getter方法.属性名：承租人客户主键
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_customer_lessee() {
        return pk_customer_lessee;
    }

    /**
     * 属性pk_customer_lessee的Setter方法.属性名：承租人客户主键
     * 创建日期:2018-6-29
     *
     * @param newPk_customer_lessee java.lang.String
     */
    public void setPk_customer_lessee(String newPk_customer_lessee) {
        this.pk_customer_lessee = newPk_customer_lessee;
    }

    /**
     * 属性 pk_lessee_contact的Getter方法.属性名：承租人联系人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_lessee_contact() {
        return pk_lessee_contact;
    }

    /**
     * 属性pk_lessee_contact的Setter方法.属性名：承租人联系人
     * 创建日期:2018-6-29
     *
     * @param newPk_lessee_contact java.lang.String
     */
    public void setPk_lessee_contact(String newPk_lessee_contact) {
        this.pk_lessee_contact = newPk_lessee_contact;
    }

    /**
     * 属性 cont_loan_method的Getter方法.属性名：合同起租方式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_loan_method() {
        return cont_loan_method;
    }

    /**
     * 属性cont_loan_method的Setter方法.属性名：合同起租方式
     * 创建日期:2018-6-29
     *
     * @param newCont_loan_method java.lang.String
     */
    public void setCont_loan_method(String newCont_loan_method) {
        this.cont_loan_method = newCont_loan_method;
    }

    /**
     * 属性 face_plan_date的Getter方法.属性名：合同计划面签日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getFace_plan_date() {
        return face_plan_date;
    }

    /**
     * 属性face_plan_date的Setter方法.属性名：合同计划面签日
     * 创建日期:2018-6-29
     *
     * @param newFace_plan_date java.util.Date
     */
    public void setFace_plan_date(java.util.Date newFace_plan_date) {
        this.face_plan_date = newFace_plan_date;
    }

    /**
     * 属性 is_spv的Getter方法.属性名：经营主体是否spv
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_spv() {
        return is_spv;
    }

    /**
     * 属性is_spv的Setter方法.属性名：经营主体是否spv
     * 创建日期:2018-6-29
     *
     * @param newIs_spv java.lang.String
     */
    public void setIs_spv(String newIs_spv) {
        this.is_spv = newIs_spv;
    }

    /**
     * 属性 is_rent_project的Getter方法.属性名：是否转租赁项目
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_rent_project() {
        return is_rent_project;
    }

    /**
     * 属性is_rent_project的Setter方法.属性名：是否转租赁项目
     * 创建日期:2018-6-29
     *
     * @param newIs_rent_project java.lang.String
     */
    public void setIs_rent_project(String newIs_rent_project) {
        this.is_rent_project = newIs_rent_project;
    }

    /**
     * 属性 is_joint_lease的Getter方法.属性名：是否联合租赁
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_joint_lease() {
        return is_joint_lease;
    }

    /**
     * 属性is_joint_lease的Setter方法.属性名：是否联合租赁
     * 创建日期:2018-6-29
     *
     * @param newIs_joint_lease java.lang.String
     */
    public void setIs_joint_lease(String newIs_joint_lease) {
        this.is_joint_lease = newIs_joint_lease;
    }

    /**
     * 属性 is_entrust_branch_warrant的Getter方法.属性名：是否属于委托分行代保管权证类项目
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_entrust_branch_warrant() {
        return is_entrust_branch_warrant;
    }

    /**
     * 属性is_entrust_branch_warrant的Setter方法.属性名：是否属于委托分行代保管权证类项目
     * 创建日期:2018-6-29
     *
     * @param newIs_entrust_branch_warrant java.lang.String
     */
    public void setIs_entrust_branch_warrant(String newIs_entrust_branch_warrant) {
        this.is_entrust_branch_warrant = newIs_entrust_branch_warrant;
    }

    /**
     * 属性 part_start_rent_method的Getter方法.属性名：分批起租租赁期限计算方式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPart_start_rent_method() {
        return part_start_rent_method;
    }

    /**
     * 属性part_start_rent_method的Setter方法.属性名：分批起租租赁期限计算方式
     * 创建日期:2018-6-29
     *
     * @param newPart_start_rent_method java.lang.String
     */
    public void setPart_start_rent_method(String newPart_start_rent_method) {
        this.part_start_rent_method = newPart_start_rent_method;
    }

    /**
     * 属性 is_rent_thing_insure的Getter方法.属性名：租赁物是否强制投保
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_rent_thing_insure() {
        return is_rent_thing_insure;
    }

    /**
     * 属性is_rent_thing_insure的Setter方法.属性名：租赁物是否强制投保
     * 创建日期:2018-6-29
     *
     * @param newIs_rent_thing_insure java.lang.String
     */
    public void setIs_rent_thing_insure(String newIs_rent_thing_insure) {
        this.is_rent_thing_insure = newIs_rent_thing_insure;
    }

    /**
     * 属性 fund_payment_method的Getter方法.属性名：资金支付方式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getFund_payment_method() {
        return fund_payment_method;
    }

    /**
     * 属性fund_payment_method的Setter方法.属性名：资金支付方式
     * 创建日期:2018-6-29
     *
     * @param newFund_payment_method java.lang.String
     */
    public void setFund_payment_method(String newFund_payment_method) {
        this.fund_payment_method = newFund_payment_method;
    }

    /**
     * 属性 equipment_transfer_payment的Getter方法.属性名：租赁设备转让价款支付方式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getEquipment_transfer_payment() {
        return equipment_transfer_payment;
    }

    /**
     * 属性equipment_transfer_payment的Setter方法.属性名：租赁设备转让价款支付方式
     * 创建日期:2018-6-29
     *
     * @param newEquipment_transfer_payment java.lang.String
     */
    public void setEquipment_transfer_payment(String newEquipment_transfer_payment) {
        this.equipment_transfer_payment = newEquipment_transfer_payment;
    }

    /**
     * 属性 value_rent_day的Getter方法.属性名：约定租金到账日
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getValue_rent_day() {
        return value_rent_day;
    }

    /**
     * 属性value_rent_day的Setter方法.属性名：约定租金到账日
     * 创建日期:2018-6-29
     *
     * @param newValue_rent_day java.lang.String
     */
    public void setValue_rent_day(String newValue_rent_day) {
        this.value_rent_day = newValue_rent_day;
    }

    /**
     * 属性 legal_personnel的Getter方法.属性名：法务人员
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getLegal_personnel() {
        return legal_personnel;
    }

    /**
     * 属性legal_personnel的Setter方法.属性名：法务人员
     * 创建日期:2018-6-29
     *
     * @param newLegal_personnel java.lang.String
     */
    public void setLegal_personnel(String newLegal_personnel) {
        this.legal_personnel = newLegal_personnel;
    }

    /**
     * 属性 if_adjust的Getter方法.属性名：是否调息
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIf_adjust() {
        return if_adjust;
    }

    /**
     * 属性if_adjust的Setter方法.属性名：是否调息
     * 创建日期:2018-6-29
     *
     * @param newIf_adjust java.lang.String
     */
    public void setIf_adjust(String newIf_adjust) {
        this.if_adjust = newIf_adjust;
    }

    /**
     * 属性 adjust_type的Getter方法.属性名：调息渠道
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getAdjust_type() {
        return adjust_type;
    }

    /**
     * 属性adjust_type的Setter方法.属性名：调息渠道
     * 创建日期:2018-6-29
     *
     * @param newAdjust_type java.lang.String
     */
    public void setAdjust_type(String newAdjust_type) {
        this.adjust_type = newAdjust_type;
    }

    /**
     * 属性 adjust_time的Getter方法.属性名：调息响应方式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getAdjust_time() {
        return adjust_time;
    }

    /**
     * 属性adjust_time的Setter方法.属性名：调息响应方式
     * 创建日期:2018-6-29
     *
     * @param newAdjust_time java.lang.String
     */
    public void setAdjust_time(String newAdjust_time) {
        this.adjust_time = newAdjust_time;
    }

    /**
     * 属性 invoice_method的Getter方法.属性名：开票方式
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getInvoice_method() {
        return invoice_method;
    }

    /**
     * 属性invoice_method的Setter方法.属性名：开票方式
     * 创建日期:2018-6-29
     *
     * @param newInvoice_method java.lang.String
     */
    public void setInvoice_method(String newInvoice_method) {
        this.invoice_method = newInvoice_method;
    }

    /**
     * 属性 invoice_condition的Getter方法.属性名：开票条件
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getInvoice_condition() {
        return invoice_condition;
    }

    /**
     * 属性invoice_condition的Setter方法.属性名：开票条件
     * 创建日期:2018-6-29
     *
     * @param newInvoice_condition java.lang.String
     */
    public void setInvoice_condition(String newInvoice_condition) {
        this.invoice_condition = newInvoice_condition;
    }

    /**
     * 属性 invoice_advance_days的Getter方法.属性名：开票提前天数
     * 创建日期:2018-6-29
     *
     * @return java.lang.Integer
     */
    public Integer getInvoice_advance_days() {
        return invoice_advance_days;
    }

    /**
     * 属性invoice_advance_days的Setter方法.属性名：开票提前天数
     * 创建日期:2018-6-29
     *
     * @param newInvoice_advance_days java.lang.Integer
     */
    public void setInvoice_advance_days(Integer newInvoice_advance_days) {
        this.invoice_advance_days = newInvoice_advance_days;
    }

    /**
     * 属性 billstatus的Getter方法.属性名：单据状态
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getBillstatus() {
        return billstatus;
    }

    /**
     * 属性billstatus的Setter方法.属性名：单据状态
     * 创建日期:2018-6-29
     *
     * @param newBillstatus java.lang.String
     */
    public void setBillstatus(String newBillstatus) {
        this.billstatus = newBillstatus;
    }

    /**
     * 属性 pk_initial的Getter方法.属性名：初始主键
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_initial() {
        return pk_initial;
    }

    /**
     * 属性pk_initial的Setter方法.属性名：初始主键
     * 创建日期:2018-6-29
     *
     * @param newPk_initial java.lang.String
     */
    public void setPk_initial(String newPk_initial) {
        this.pk_initial = newPk_initial;
    }

    /**
     * 属性 pk_prj_manager的Getter方法.属性名：项目经理
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_prj_manager() {
        return pk_prj_manager;
    }

    /**
     * 属性pk_prj_manager的Setter方法.属性名：项目经理
     * 创建日期:2018-6-29
     *
     * @param newPk_prj_manager java.lang.String
     */
    public void setPk_prj_manager(String newPk_prj_manager) {
        this.pk_prj_manager = newPk_prj_manager;
    }

    /**
     * 属性 cont_type的Getter方法.属性名：合同类型
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_type() {
        return cont_type;
    }

    /**
     * 属性cont_type的Setter方法.属性名：合同类型
     * 创建日期:2018-6-29
     *
     * @param newCont_type java.lang.String
     */
    public void setCont_type(String newCont_type) {
        this.cont_type = newCont_type;
    }

    /**
     * 属性 adjust_start_date的Getter方法.属性名：调息起始日
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getAdjust_start_date() {
        return adjust_start_date;
    }

    /**
     * 属性adjust_start_date的Setter方法.属性名：调息起始日
     * 创建日期:2018-6-29
     *
     * @param newAdjust_start_date java.lang.String
     */
    public void setAdjust_start_date(String newAdjust_start_date) {
        this.adjust_start_date = newAdjust_start_date;
    }

    /**
     * 属性 pk_cust_help的Getter方法.属性名：协办人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_cust_help() {
        return pk_cust_help;
    }

    /**
     * 属性pk_cust_help的Setter方法.属性名：协办人
     * 创建日期:2018-6-29
     *
     * @param newPk_cust_help java.lang.String
     */
    public void setPk_cust_help(String newPk_cust_help) {
        this.pk_cust_help = newPk_cust_help;
    }

    /**
     * 属性 pk_lessor_acct的Getter方法.属性名：出租方账户
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_lessor_acct() {
        return pk_lessor_acct;
    }

    /**
     * 属性pk_lessor_acct的Setter方法.属性名：出租方账户
     * 创建日期:2018-6-29
     *
     * @param newPk_lessor_acct java.lang.String
     */
    public void setPk_lessor_acct(String newPk_lessor_acct) {
        this.pk_lessor_acct = newPk_lessor_acct;
    }

    /**
     * 属性 pk_lessee_acct的Getter方法.属性名：承租方账户
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_lessee_acct() {
        return pk_lessee_acct;
    }

    /**
     * 属性pk_lessee_acct的Setter方法.属性名：承租方账户
     * 创建日期:2018-6-29
     *
     * @param newPk_lessee_acct java.lang.String
     */
    public void setPk_lessee_acct(String newPk_lessee_acct) {
        this.pk_lessee_acct = newPk_lessee_acct;
    }

    /**
     * 属性 lease_times的Getter方法.属性名：租赁期限(月)
     * 创建日期:2018-6-29
     *
     * @return java.lang.Integer
     */
    public Integer getLease_times() {
        return lease_times;
    }

    /**
     * 属性lease_times的Setter方法.属性名：租赁期限(月)
     * 创建日期:2018-6-29
     *
     * @param newLease_times java.lang.Integer
     */
    public void setLease_times(Integer newLease_times) {
        this.lease_times = newLease_times;
    }

    /**
     * 属性 interest_adjustments的Getter方法.属性名：调息对象
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getInterest_adjustments() {
        return interest_adjustments;
    }

    /**
     * 属性interest_adjustments的Setter方法.属性名：调息对象
     * 创建日期:2018-6-29
     *
     * @param newInterest_adjustments java.lang.String
     */
    public void setInterest_adjustments(String newInterest_adjustments) {
        this.interest_adjustments = newInterest_adjustments;
    }

    /**
     * 属性 tax_rate的Getter方法.属性名：税率
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getTax_rate() {
        return tax_rate;
    }

    /**
     * 属性tax_rate的Setter方法.属性名：税率
     * 创建日期:2018-6-29
     *
     * @param newTax_rate java.lang.String
     */
    public void setTax_rate(String newTax_rate) {
        this.tax_rate = newTax_rate;
    }

    /**
     * 属性 leaseback_type的Getter方法.属性名：租赁类别
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getLeaseback_type() {
        return leaseback_type;
    }

    /**
     * 属性leaseback_type的Setter方法.属性名：租赁类别
     * 创建日期:2018-6-29
     *
     * @param newLeaseback_type java.lang.String
     */
    public void setLeaseback_type(String newLeaseback_type) {
        this.leaseback_type = newLeaseback_type;
    }

    /**
     * 属性 plan_loan_fact的Getter方法.属性名：实际投放日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getPlan_loan_fact() {
        return plan_loan_fact;
    }

    /**
     * 属性plan_loan_fact的Setter方法.属性名：实际投放日
     * 创建日期:2018-6-29
     *
     * @param newPlan_loan_fact java.util.Date
     */
    public void setPlan_loan_fact(java.util.Date newPlan_loan_fact) {
        this.plan_loan_fact = newPlan_loan_fact;
    }

    /**
     * 属性 value_dated_fact的Getter方法.属性名：实际起息日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getValue_dated_fact() {
        return value_dated_fact;
    }

    /**
     * 属性value_dated_fact的Setter方法.属性名：实际起息日
     * 创建日期:2018-6-29
     *
     * @param newValue_dated_fact java.util.Date
     */
    public void setValue_dated_fact(java.util.Date newValue_dated_fact) {
        this.value_dated_fact = newValue_dated_fact;
    }

    /**
     * 属性 active_date的Getter方法.属性名：合同生效日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getActive_date() {
        return active_date;
    }

    /**
     * 属性active_date的Setter方法.属性名：合同生效日
     * 创建日期:2018-6-29
     *
     * @param newActive_date java.util.Date
     */
    public void setActive_date(java.util.Date newActive_date) {
        this.active_date = newActive_date;
    }

    /**
     * 属性 lease_date_fact的Getter方法.属性名：合同实际起租日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getLease_date_fact() {
        return lease_date_fact;
    }

    /**
     * 属性lease_date_fact的Setter方法.属性名：合同实际起租日
     * 创建日期:2018-6-29
     *
     * @param newLease_date_fact java.util.Date
     */
    public void setLease_date_fact(java.util.Date newLease_date_fact) {
        this.lease_date_fact = newLease_date_fact;
    }

    /**
     * 属性 lease_period的Getter方法.属性名：支付频率
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getLease_period() {
        return lease_period;
    }

    /**
     * 属性lease_period的Setter方法.属性名：支付频率
     * 创建日期:2018-6-29
     *
     * @param newLease_period java.lang.String
     */
    public void setLease_period(String newLease_period) {
        this.lease_period = newLease_period;
    }

    /**
     * 属性 grace_period的Getter方法.属性名：延迟期（日）
     * 创建日期:2018-6-29
     *
     * @return java.lang.Integer
     */
    public Integer getGrace_period() {
        return grace_period;
    }

    /**
     * 属性grace_period的Setter方法.属性名：延迟期（日）
     * 创建日期:2018-6-29
     *
     * @param newGrace_period java.lang.Integer
     */
    public void setGrace_period(Integer newGrace_period) {
        this.grace_period = newGrace_period;
    }

    /**
     * 属性 fact_cash_loan的Getter方法.属性名：实际投放金额
     * 创建日期:2018-6-29
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getFact_cash_loan() {
        return fact_cash_loan;
    }

    /**
     * 属性fact_cash_loan的Setter方法.属性名：实际投放金额
     * 创建日期:2018-6-29
     *
     * @param newFact_cash_loan java.math.BigDecimal
     */
    public void setFact_cash_loan(java.math.BigDecimal newFact_cash_loan) {
        this.fact_cash_loan = newFact_cash_loan;
    }

    /**
     * 属性 appoint_rent_date的Getter方法.属性名：约定固定起租日
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getAppoint_rent_date() {
        return appoint_rent_date;
    }

    /**
     * 属性appoint_rent_date的Setter方法.属性名：约定固定起租日
     * 创建日期:2018-6-29
     *
     * @param newAppoint_rent_date java.util.Date
     */
    public void setAppoint_rent_date(java.util.Date newAppoint_rent_date) {
        this.appoint_rent_date = newAppoint_rent_date;
    }

    /**
     * 属性 grace_days的Getter方法.属性名：宽限天数
     * 创建日期:2018-6-29
     *
     * @return java.lang.Integer
     */
    public Integer getGrace_days() {
        return grace_days;
    }

    /**
     * 属性grace_days的Setter方法.属性名：宽限天数
     * 创建日期:2018-6-29
     *
     * @param newGrace_days java.lang.Integer
     */
    public void setGrace_days(Integer newGrace_days) {
        this.grace_days = newGrace_days;
    }

    /**
     * 属性 assets_classify的Getter方法.属性名：资产五级分类
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getAssets_classify() {
        return assets_classify;
    }

    /**
     * 属性assets_classify的Setter方法.属性名：资产五级分类
     * 创建日期:2018-6-29
     *
     * @param newAssets_classify java.lang.String
     */
    public void setAssets_classify(String newAssets_classify) {
        this.assets_classify = newAssets_classify;
    }

    /**
     * 属性 bad_flag的Getter方法.属性名：坏账标示
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getBad_flag() {
        return bad_flag;
    }

    /**
     * 属性bad_flag的Setter方法.属性名：坏账标示
     * 创建日期:2018-6-29
     *
     * @param newBad_flag java.lang.String
     */
    public void setBad_flag(String newBad_flag) {
        this.bad_flag = newBad_flag;
    }

    /**
     * 属性 if_send_credit的Getter方法.属性名：是否报送征信
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIf_send_credit() {
        return if_send_credit;
    }

    /**
     * 属性if_send_credit的Setter方法.属性名：是否报送征信
     * 创建日期:2018-6-29
     *
     * @param newIf_send_credit java.lang.String
     */
    public void setIf_send_credit(String newIf_send_credit) {
        this.if_send_credit = newIf_send_credit;
    }

    /**
     * 属性 plan_con_irr的Getter方法.属性名：计划合同IRR
     * 创建日期:2018-6-29
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPlan_con_irr() {
        return plan_con_irr;
    }

    /**
     * 属性plan_con_irr的Setter方法.属性名：计划合同IRR
     * 创建日期:2018-6-29
     *
     * @param newPlan_con_irr java.math.BigDecimal
     */
    public void setPlan_con_irr(java.math.BigDecimal newPlan_con_irr) {
        this.plan_con_irr = newPlan_con_irr;
    }

    /**
     * 属性 if_link_cust的Getter方法.属性名：是否关联客户
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIf_link_cust() {
        return if_link_cust;
    }

    /**
     * 属性if_link_cust的Setter方法.属性名：是否关联客户
     * 创建日期:2018-6-29
     *
     * @param newIf_link_cust java.lang.String
     */
    public void setIf_link_cust(String newIf_link_cust) {
        this.if_link_cust = newIf_link_cust;
    }

    /**
     * 属性 amount_fact_balance的Getter方法.属性名：实际未投放金额
     * 创建日期:2018-6-29
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getAmount_fact_balance() {
        return amount_fact_balance;
    }

    /**
     * 属性amount_fact_balance的Setter方法.属性名：实际未投放金额
     * 创建日期:2018-6-29
     *
     * @param newAmount_fact_balance java.math.BigDecimal
     */
    public void setAmount_fact_balance(java.math.BigDecimal newAmount_fact_balance) {
        this.amount_fact_balance = newAmount_fact_balance;
    }

    /**
     * 属性 amount_cont_balance的Getter方法.属性名：合同未投放金额
     * 创建日期:2018-6-29
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getAmount_cont_balance() {
        return amount_cont_balance;
    }

    /**
     * 属性amount_cont_balance的Setter方法.属性名：合同未投放金额
     * 创建日期:2018-6-29
     *
     * @param newAmount_cont_balance java.math.BigDecimal
     */
    public void setAmount_cont_balance(java.math.BigDecimal newAmount_cont_balance) {
        this.amount_cont_balance = newAmount_cont_balance;
    }

    /**
     * 属性 cont_loan_batch的Getter方法.属性名：投放批次号
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_loan_batch() {
        return cont_loan_batch;
    }

    /**
     * 属性cont_loan_batch的Setter方法.属性名：投放批次号
     * 创建日期:2018-6-29
     *
     * @param newCont_loan_batch java.lang.String
     */
    public void setCont_loan_batch(String newCont_loan_batch) {
        this.cont_loan_batch = newCont_loan_batch;
    }

    /**
     * 属性 source_billtype的Getter方法.属性名：来源类型
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getSource_billtype() {
        return source_billtype;
    }

    /**
     * 属性source_billtype的Setter方法.属性名：来源类型
     * 创建日期:2018-6-29
     *
     * @param newSource_billtype java.lang.String
     */
    public void setSource_billtype(String newSource_billtype) {
        this.source_billtype = newSource_billtype;
    }

    /**
     * 属性 cont_source_bill的Getter方法.属性名：来源主键
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCont_source_bill() {
        return cont_source_bill;
    }

    /**
     * 属性cont_source_bill的Setter方法.属性名：来源主键
     * 创建日期:2018-6-29
     *
     * @param newCont_source_bill java.lang.String
     */
    public void setCont_source_bill(String newCont_source_bill) {
        this.cont_source_bill = newCont_source_bill;
    }

    /**
     * 属性 version_no的Getter方法.属性名：版本号
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getVersion_no() {
        return version_no;
    }

    /**
     * 属性version_no的Setter方法.属性名：版本号
     * 创建日期:2018-6-29
     *
     * @param newVersion_no java.lang.String
     */
    public void setVersion_no(String newVersion_no) {
        this.version_no = newVersion_no;
    }

    /**
     * 属性 if_new的Getter方法.属性名：是否最新
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIf_new() {
        return if_new;
    }

    /**
     * 属性if_new的Setter方法.属性名：是否最新
     * 创建日期:2018-6-29
     *
     * @param newIf_new java.lang.String
     */
    public void setIf_new(String newIf_new) {
        this.if_new = newIf_new;
    }

    /**
     * 属性 pk_cust_main的Getter方法.属性名：项目主办人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_cust_main() {
        return pk_cust_main;
    }

    /**
     * 属性pk_cust_main的Setter方法.属性名：项目主办人
     * 创建日期:2018-6-29
     *
     * @param newPk_cust_main java.lang.String
     */
    public void setPk_cust_main(String newPk_cust_main) {
        this.pk_cust_main = newPk_cust_main;
    }

    /**
     * 属性 pk_group的Getter方法.属性名：集团
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_group() {
        return pk_group;
    }

    /**
     * 属性pk_group的Setter方法.属性名：集团
     * 创建日期:2018-6-29
     *
     * @param newPk_group java.lang.String
     */
    public void setPk_group(String newPk_group) {
        this.pk_group = newPk_group;
    }

    /**
     * 属性 pk_org的Getter方法.属性名：组织
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_org() {
        return pk_org;
    }

    /**
     * 属性pk_org的Setter方法.属性名：组织
     * 创建日期:2018-6-29
     *
     * @param newPk_org java.lang.String
     */
    public void setPk_org(String newPk_org) {
        this.pk_org = newPk_org;
    }

    /**
     * 属性 creator的Getter方法.属性名：创建人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 属性creator的Setter方法.属性名：创建人
     * 创建日期:2018-6-29
     *
     * @param newCreator java.lang.String
     */
    public void setCreator(String newCreator) {
        this.creator = newCreator;
    }

    /**
     * 属性 creationtime的Getter方法.属性名：创建时间
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCreationtime() {
        return creationtime;
    }

    /**
     * 属性creationtime的Setter方法.属性名：创建时间
     * 创建日期:2018-6-29
     *
     * @param newCreationtime java.lang.String
     */
    public void setCreationtime(String newCreationtime) {
        this.creationtime = newCreationtime;
    }

    /**
     * 属性 modifier的Getter方法.属性名：修改人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 属性modifier的Setter方法.属性名：修改人
     * 创建日期:2018-6-29
     *
     * @param newModifier java.lang.String
     */
    public void setModifier(String newModifier) {
        this.modifier = newModifier;
    }

    /**
     * 属性 modifiedtime的Getter方法.属性名：修改时间
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getModifiedtime() {
        return modifiedtime;
    }

    /**
     * 属性modifiedtime的Setter方法.属性名：修改时间
     * 创建日期:2018-6-29
     *
     * @param newModifiedtime java.lang.String
     */
    public void setModifiedtime(String newModifiedtime) {
        this.modifiedtime = newModifiedtime;
    }

    /**
     * 属性 def1的Getter方法.属性名：自定义项1
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef1() {
        return def1;
    }

    /**
     * 属性def1的Setter方法.属性名：自定义项1
     * 创建日期:2018-6-29
     *
     * @param newDef1 java.lang.String
     */
    public void setDef1(String newDef1) {
        this.def1 = newDef1;
    }

    /**
     * 属性 def2的Getter方法.属性名：自定义项2
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef2() {
        return def2;
    }

    /**
     * 属性def2的Setter方法.属性名：自定义项2
     * 创建日期:2018-6-29
     *
     * @param newDef2 java.lang.String
     */
    public void setDef2(String newDef2) {
        this.def2 = newDef2;
    }

    /**
     * 属性 def3的Getter方法.属性名：自定义项3
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef3() {
        return def3;
    }

    /**
     * 属性def3的Setter方法.属性名：自定义项3
     * 创建日期:2018-6-29
     *
     * @param newDef3 java.lang.String
     */
    public void setDef3(String newDef3) {
        this.def3 = newDef3;
    }

    /**
     * 属性 def4的Getter方法.属性名：自定义项4
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef4() {
        return def4;
    }

    /**
     * 属性def4的Setter方法.属性名：自定义项4
     * 创建日期:2018-6-29
     *
     * @param newDef4 java.lang.String
     */
    public void setDef4(String newDef4) {
        this.def4 = newDef4;
    }

    /**
     * 属性 def5的Getter方法.属性名：自定义项5
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef5() {
        return def5;
    }

    /**
     * 属性def5的Setter方法.属性名：自定义项5
     * 创建日期:2018-6-29
     *
     * @param newDef5 java.lang.String
     */
    public void setDef5(String newDef5) {
        this.def5 = newDef5;
    }

    /**
     * 属性 def6的Getter方法.属性名：自定义项6
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef6() {
        return def6;
    }

    /**
     * 属性def6的Setter方法.属性名：自定义项6
     * 创建日期:2018-6-29
     *
     * @param newDef6 java.lang.String
     */
    public void setDef6(String newDef6) {
        this.def6 = newDef6;
    }

    /**
     * 属性 def7的Getter方法.属性名：自定义项7
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef7() {
        return def7;
    }

    /**
     * 属性def7的Setter方法.属性名：自定义项7
     * 创建日期:2018-6-29
     *
     * @param newDef7 java.lang.String
     */
    public void setDef7(String newDef7) {
        this.def7 = newDef7;
    }

    /**
     * 属性 def8的Getter方法.属性名：自定义项8
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef8() {
        return def8;
    }

    /**
     * 属性def8的Setter方法.属性名：自定义项8
     * 创建日期:2018-6-29
     *
     * @param newDef8 java.lang.String
     */
    public void setDef8(String newDef8) {
        this.def8 = newDef8;
    }

    /**
     * 属性 def9的Getter方法.属性名：自定义项9
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef9() {
        return def9;
    }

    /**
     * 属性def9的Setter方法.属性名：自定义项9
     * 创建日期:2018-6-29
     *
     * @param newDef9 java.lang.String
     */
    public void setDef9(String newDef9) {
        this.def9 = newDef9;
    }

    /**
     * 属性 def10的Getter方法.属性名：自定义项10
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDef10() {
        return def10;
    }

    /**
     * 属性def10的Setter方法.属性名：自定义项10
     * 创建日期:2018-6-29
     *
     * @param newDef10 java.lang.String
     */
    public void setDef10(String newDef10) {
        this.def10 = newDef10;
    }

    /**
     * 属性 pk_dept的Getter方法.属性名：部门
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_dept() {
        return pk_dept;
    }

    /**
     * 属性pk_dept的Setter方法.属性名：部门
     * 创建日期:2018-6-29
     *
     * @param newPk_dept java.lang.String
     */
    public void setPk_dept(String newPk_dept) {
        this.pk_dept = newPk_dept;
    }

    /**
     * 属性 pk_checker的Getter方法.属性名：审核人
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_checker() {
        return pk_checker;
    }

    /**
     * 属性pk_checker的Setter方法.属性名：审核人
     * 创建日期:2018-6-29
     *
     * @param newPk_checker java.lang.String
     */
    public void setPk_checker(String newPk_checker) {
        this.pk_checker = newPk_checker;
    }

    /**
     * 属性 check_time的Getter方法.属性名：审核时间
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCheck_time() {
        return check_time;
    }

    /**
     * 属性check_time的Setter方法.属性名：审核时间
     * 创建日期:2018-6-29
     *
     * @param newCheck_time java.lang.String
     */
    public void setCheck_time(String newCheck_time) {
        this.check_time = newCheck_time;
    }

    /**
     * 属性 change_type的Getter方法.属性名：变更类型
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getChange_type() {
        return change_type;
    }

    /**
     * 属性change_type的Setter方法.属性名：变更类型
     * 创建日期:2018-6-29
     *
     * @param newChange_type java.lang.String
     */
    public void setChange_type(String newChange_type) {
        this.change_type = newChange_type;
    }

    /**
     * 属性 business_line的Getter方法.属性名：业务条线
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getBusiness_line() {
        return business_line;
    }

    /**
     * 属性business_line的Setter方法.属性名：业务条线
     * 创建日期:2018-6-29
     *
     * @param newBusiness_line java.lang.String
     */
    public void setBusiness_line(String newBusiness_line) {
        this.business_line = newBusiness_line;
    }

    /**
     * 属性 pk_contract_old的Getter方法.属性名：合同台账主键
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_contract_old() {
        return pk_contract_old;
    }

    /**
     * 属性pk_contract_old的Setter方法.属性名：合同台账主键
     * 创建日期:2018-6-29
     *
     * @param newPk_contract_old java.lang.String
     */
    public void setPk_contract_old(String newPk_contract_old) {
        this.pk_contract_old = newPk_contract_old;
    }

    /**
     * 属性 change_content的Getter方法.属性名：变更原因
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getChange_content() {
        return change_content;
    }

    /**
     * 属性change_content的Setter方法.属性名：变更原因
     * 创建日期:2018-6-29
     *
     * @param newChange_content java.lang.String
     */
    public void setChange_content(String newChange_content) {
        this.change_content = newChange_content;
    }

    /**
     * 属性 if_signed_supplementary的Getter方法.属性名：是否签订补充协议
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIf_signed_supplementary() {
        return if_signed_supplementary;
    }

    /**
     * 属性if_signed_supplementary的Setter方法.属性名：是否签订补充协议
     * 创建日期:2018-6-29
     *
     * @param newIf_signed_supplementary java.lang.String
     */
    public void setIf_signed_supplementary(String newIf_signed_supplementary) {
        this.if_signed_supplementary = newIf_signed_supplementary;
    }

    /**
     * 属性 change_class的Getter方法.属性名：变更类别
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getChange_class() {
        return change_class;
    }

    /**
     * 属性change_class的Setter方法.属性名：变更类别
     * 创建日期:2018-6-29
     *
     * @param newChange_class java.lang.String
     */
    public void setChange_class(String newChange_class) {
        this.change_class = newChange_class;
    }

    /**
     * 属性 pk_contractref的Getter方法.属性名：合同参照
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getPk_contractref() {
        return pk_contractref;
    }

    /**
     * 属性pk_contractref的Setter方法.属性名：合同参照
     * 创建日期:2018-6-29
     *
     * @param newPk_contractref java.lang.String
     */
    public void setPk_contractref(String newPk_contractref) {
        this.pk_contractref = newPk_contractref;
    }

    /**
     * 属性 irr_revenue的Getter方法.属性名：收益IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_revenue() {
        return irr_revenue;
    }

    /**
     * 属性irr_revenue的Setter方法.属性名：收益IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_revenue java.lang.Double
     */
    public void setIrr_revenue(Double newIrr_revenue) {
        this.irr_revenue = newIrr_revenue;
    }

    /**
     * 属性 irr_revenue_notax的Getter方法.属性名：收益去税IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_revenue_notax() {
        return irr_revenue_notax;
    }

    /**
     * 属性irr_revenue_notax的Setter方法.属性名：收益去税IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_revenue_notax java.lang.Double
     */
    public void setIrr_revenue_notax(Double newIrr_revenue_notax) {
        this.irr_revenue_notax = newIrr_revenue_notax;
    }

    /**
     * 属性 irr_actual的Getter方法.属性名：实际IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_actual() {
        return irr_actual;
    }

    /**
     * 属性irr_actual的Setter方法.属性名：实际IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_actual java.lang.Double
     */
    public void setIrr_actual(Double newIrr_actual) {
        this.irr_actual = newIrr_actual;
    }

    /**
     * 属性 irr_actual_notax的Getter方法.属性名：实际去税IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_actual_notax() {
        return irr_actual_notax;
    }

    /**
     * 属性irr_actual_notax的Setter方法.属性名：实际去税IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_actual_notax java.lang.Double
     */
    public void setIrr_actual_notax(Double newIrr_actual_notax) {
        this.irr_actual_notax = newIrr_actual_notax;
    }

    /**
     * 属性 irr_contr的Getter方法.属性名：合同IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_contr() {
        return irr_contr;
    }

    /**
     * 属性irr_contr的Setter方法.属性名：合同IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_contr java.lang.Double
     */
    public void setIrr_contr(Double newIrr_contr) {
        this.irr_contr = newIrr_contr;
    }

    /**
     * 属性 irr_contr_notax的Getter方法.属性名：合同去税IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_contr_notax() {
        return irr_contr_notax;
    }

    /**
     * 属性irr_contr_notax的Setter方法.属性名：合同去税IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_contr_notax java.lang.Double
     */
    public void setIrr_contr_notax(Double newIrr_contr_notax) {
        this.irr_contr_notax = newIrr_contr_notax;
    }

    /**
     * 属性 irr_contr_actual的Getter方法.属性名：合同实际IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_contr_actual() {
        return irr_contr_actual;
    }

    /**
     * 属性irr_contr_actual的Setter方法.属性名：合同实际IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_contr_actual java.lang.Double
     */
    public void setIrr_contr_actual(Double newIrr_contr_actual) {
        this.irr_contr_actual = newIrr_contr_actual;
    }

    /**
     * 属性 irr_contr_actual_notax的Getter方法.属性名：合同实际去税IRR
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getIrr_contr_actual_notax() {
        return irr_contr_actual_notax;
    }

    /**
     * 属性irr_contr_actual_notax的Setter方法.属性名：合同实际去税IRR
     * 创建日期:2018-6-29
     *
     * @param newIrr_contr_actual_notax java.lang.Double
     */
    public void setIrr_contr_actual_notax(Double newIrr_contr_actual_notax) {
        this.irr_contr_actual_notax = newIrr_contr_actual_notax;
    }

    /**
     * 属性 sealed_info的Getter方法.属性名：封存理由
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getSealed_info() {
        return sealed_info;
    }

    /**
     * 属性sealed_info的Setter方法.属性名：封存理由
     * 创建日期:2018-6-29
     *
     * @param newSealed_info java.lang.String
     */
    public void setSealed_info(String newSealed_info) {
        this.sealed_info = newSealed_info;
    }

    /**
     * 属性 free_status的Getter方法.属性名：免押状态
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getFree_status() {
        return free_status;
    }

    /**
     * 属性free_status的Setter方法.属性名：免押状态
     * 创建日期:2018-6-29
     *
     * @param newFree_status java.lang.String
     */
    public void setFree_status(String newFree_status) {
        this.free_status = newFree_status;
    }

    /**
     * 属性 is_shareholder_bus的Getter方法.属性名：是否股东业务
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_shareholder_bus() {
        return is_shareholder_bus;
    }

    /**
     * 属性is_shareholder_bus的Setter方法.属性名：是否股东业务
     * 创建日期:2018-6-29
     *
     * @param newIs_shareholder_bus java.lang.String
     */
    public void setIs_shareholder_bus(String newIs_shareholder_bus) {
        this.is_shareholder_bus = newIs_shareholder_bus;
    }

    /**
     * 属性 lease_mold的Getter方法.属性名：租赁类型
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getLease_mold() {
        return lease_mold;
    }

    /**
     * 属性lease_mold的Setter方法.属性名：租赁类型
     * 创建日期:2018-6-29
     *
     * @param newLease_mold java.lang.String
     */
    public void setLease_mold(String newLease_mold) {
        this.lease_mold = newLease_mold;
    }

    /**
     * 属性 surplus_amount的Getter方法.属性名：项目剩余可用金额
     * 创建日期:2018-6-29
     *
     * @return java.lang.Double
     */
    public Double getSurplus_amount() {
        return surplus_amount;
    }

    /**
     * 属性surplus_amount的Setter方法.属性名：项目剩余可用金额
     * 创建日期:2018-6-29
     *
     * @param newSurplus_amount java.lang.Double
     */
    public void setSurplus_amount(Double newSurplus_amount) {
        this.surplus_amount = newSurplus_amount;
    }

    /**
     * 属性 is_face的Getter方法.属性名：是否面签
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_face() {
        return is_face;
    }

    /**
     * 属性is_face的Setter方法.属性名：是否面签
     * 创建日期:2018-6-29
     *
     * @param newIs_face java.lang.String
     */
    public void setIs_face(String newIs_face) {
        this.is_face = newIs_face;
    }

    /**
     * 属性 lease_thing_class的Getter方法.属性名：租赁资产分类
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getLease_thing_class() {
        return lease_thing_class;
    }

    /**
     * 属性lease_thing_class的Setter方法.属性名：租赁资产分类
     * 创建日期:2018-6-29
     *
     * @param newLease_thing_class java.lang.String
     */
    public void setLease_thing_class(String newLease_thing_class) {
        this.lease_thing_class = newLease_thing_class;
    }

    /**
     * 属性 business_unit的Getter方法.属性名：事业部
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getBusiness_unit() {
        return business_unit;
    }

    /**
     * 属性business_unit的Setter方法.属性名：事业部
     * 创建日期:2018-6-29
     *
     * @param newBusiness_unit java.lang.String
     */
    public void setBusiness_unit(String newBusiness_unit) {
        this.business_unit = newBusiness_unit;
    }

    /**
     * 属性 creditcontr的Getter方法.属性名：授信协议
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCreditcontr() {
        return creditcontr;
    }

    /**
     * 属性creditcontr的Setter方法.属性名：授信协议
     * 创建日期:2018-6-29
     *
     * @param newCreditcontr java.lang.String
     */
    public void setCreditcontr(String newCreditcontr) {
        this.creditcontr = newCreditcontr;
    }

    /**
     * 属性 country的Getter方法.属性名：国家
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCountry() {
        return country;
    }

    /**
     * 属性country的Setter方法.属性名：国家
     * 创建日期:2018-6-29
     *
     * @param newCountry java.lang.String
     */
    public void setCountry(String newCountry) {
        this.country = newCountry;
    }

    /**
     * 属性 province的Getter方法.属性名：省
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getProvince() {
        return province;
    }

    /**
     * 属性province的Setter方法.属性名：省
     * 创建日期:2018-6-29
     *
     * @param newProvince java.lang.String
     */
    public void setProvince(String newProvince) {
        this.province = newProvince;
    }

    /**
     * 属性 city的Getter方法.属性名：市
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getCity() {
        return city;
    }

    /**
     * 属性city的Setter方法.属性名：市
     * 创建日期:2018-6-29
     *
     * @param newCity java.lang.String
     */
    public void setCity(String newCity) {
        this.city = newCity;
    }

    /**
     * 属性 district的Getter方法.属性名：县
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 属性district的Setter方法.属性名：县
     * 创建日期:2018-6-29
     *
     * @param newDistrict java.lang.String
     */
    public void setDistrict(String newDistrict) {
        this.district = newDistrict;
    }

    /**
     * 属性 bill_type的Getter方法.属性名：单据办理来源
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getBill_type() {
        return bill_type;
    }

    /**
     * 属性bill_type的Setter方法.属性名：单据办理来源
     * 创建日期:2018-6-29
     *
     * @param newBill_type java.lang.String
     */
    public void setBill_type(String newBill_type) {
        this.bill_type = newBill_type;
    }

    /**
     * 属性 is_lock的Getter方法.属性名：业务锁
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getIs_lock() {
        return is_lock;
    }

    /**
     * 属性is_lock的Setter方法.属性名：业务锁
     * 创建日期:2018-6-29
     *
     * @param newIs_lock java.lang.String
     */
    public void setIs_lock(String newIs_lock) {
        this.is_lock = newIs_lock;
    }

    /**
     * 属性 business_department的Getter方法.属性名：业务合作单位
     * 创建日期:2018-6-29
     *
     * @return java.lang.String
     */
    public String getBusiness_department() {
        return business_department;
    }

    /**
     * 属性business_department的Setter方法.属性名：业务合作单位
     * 创建日期:2018-6-29
     *
     * @param newBusiness_department java.lang.String
     */
    public void setBusiness_department(String newBusiness_department) {
        this.business_department = newBusiness_department;
    }

    /**
     * 属性 legal_seal_time的Getter方法.属性名：法人章用印时间
     * 创建日期:2020-10-21
     *
     * @return java.lang.String
     */
    public String getLegal_seal_time() {
        return legal_seal_time;
    }

    /**
     * 属性legal_seal_time的Setter方法.属性名：法人章用印时间
     * 创建日期:2020-10-21
     *
     * @param newLegal_seal_time java.lang.String
     */
    public void setLegal_seal_time(String newLegal_seal_time) {
        this.legal_seal_time = newLegal_seal_time;
    }

    /**
     * 属性 conmon_seal_time的Getter方法.属性名：公章用印时间
     * 创建日期:2020-10-21
     *
     * @return java.lang.String
     */
    public String getConmon_seal_time() {
        return conmon_seal_time;
    }

    /**
     * 属性conmon_seal_time的Setter方法.属性名：公章用印时间
     * 创建日期:2020-10-21
     *
     * @param newConmon_seal_time java.lang.String
     */
    public void setConmon_seal_time(String newConmon_seal_time) {
        this.conmon_seal_time = newConmon_seal_time;
    }

    /**
     * 属性 cont_seal_time的Getter方法.属性名：合同章用印时间
     * 创建日期:2020-10-21
     *
     * @return java.lang.String
     */
    public String getCont_seal_time() {
        return cont_seal_time;
    }

    /**
     * 属性cont_seal_time的Setter方法.属性名：合同章用印时间
     * 创建日期:2020-10-21
     *
     * @param newCont_seal_time java.lang.String
     */
    public void setCont_seal_time(String newCont_seal_time) {
        this.cont_seal_time = newCont_seal_time;
    }

    /**
     * 属性 if_use_legal的Getter方法.属性名：是否使用法人章
     * 创建日期:2020-10-21
     *
     * @return java.lang.String
     */
    public String getIf_use_legal() {
        return if_use_legal;
    }

    /**
     * 属性if_use_legal的Setter方法.属性名：是否使用法人章
     * 创建日期:2020-10-21
     *
     * @param newIf_use_legal java.lang.String
     */
    public void setIf_use_legal(String newIf_use_legal) {
        this.if_use_legal = newIf_use_legal;
    }

    /**
     * 属性 if_use_conmon的Getter方法.属性名：是否使用公章
     * 创建日期:2020-10-21
     *
     * @return java.lang.String
     */
    public String getIf_use_conmon() {
        return if_use_conmon;
    }

    /**
     * 属性if_use_conmon的Setter方法.属性名：是否使用公章
     * 创建日期:2020-10-21
     *
     * @param newIf_use_conmon java.lang.String
     */
    public void setIf_use_conmon(String newIf_use_conmon) {
        this.if_use_conmon = newIf_use_conmon;
    }

    /**
     * 属性 if_use_cont的Getter方法.属性名：是否使用合同章
     * 创建日期:2020-10-21
     *
     * @return java.lang.String
     */
    public String getIf_use_cont() {
        return if_use_cont;
    }

    /**
     * 属性if_use_cont的Setter方法.属性名：是否使用合同章
     * 创建日期:2020-10-21
     *
     * @param newIf_use_cont java.lang.String
     */
    public void setIf_use_cont(String newIf_use_cont) {
        this.if_use_cont = newIf_use_cont;
    }

    /**
     * 属性 use_legal_time的Getter方法.属性名：法人章使用时间
     * 创建日期:2020-10-21
     *
     * @return java.util.Date
     */
    public java.util.Date getUse_legal_time() {
        return use_legal_time;
    }

    /**
     * 属性use_legal_time的Setter方法.属性名：法人章使用时间
     * 创建日期:2020-10-21
     *
     * @param newUse_legal_time java.util.Date
     */
    public void setUse_legal_time(java.util.Date newUse_legal_time) {
        this.use_legal_time = newUse_legal_time;
    }

    /**
     * 属性 use_conmon_time的Getter方法.属性名：公章使用时间
     * 创建日期:2020-10-21
     *
     * @return java.util.Date
     */
    public java.util.Date getUse_conmon_time() {
        return use_conmon_time;
    }

    /**
     * 属性use_conmon_time的Setter方法.属性名：公章使用时间
     * 创建日期:2020-10-21
     *
     * @param newUse_conmon_time java.util.Date
     */
    public void setUse_conmon_time(java.util.Date newUse_conmon_time) {
        this.use_conmon_time = newUse_conmon_time;
    }

    /**
     * 属性 use_cont_time的Getter方法.属性名：合同章使用时间
     * 创建日期:2020-10-21
     *
     * @return java.util.Date
     */
    public java.util.Date getUse_cont_time() {
        return use_cont_time;
    }

    /**
     * 属性use_cont_time的Setter方法.属性名：合同章使用时间
     * 创建日期:2020-10-21
     *
     * @param newUse_cont_time java.util.Date
     */
    public void setUse_cont_time(java.util.Date newUse_cont_time) {
        this.use_cont_time = newUse_cont_time;
    }

    /**
     * 属性 dr的Getter方法.属性名：dr
     * 创建日期:2018-6-29
     *
     * @return java.lang.Integer
     */
    public Integer getDr() {
        return dr;
    }

    /**
     * 属性dr的Setter方法.属性名：dr
     * 创建日期:2018-6-29
     *
     * @param newDr java.lang.Integer
     */
    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    /**
     * 属性 ts的Getter方法.属性名：ts
     * 创建日期:2018-6-29
     *
     * @return java.util.Date
     */
    public java.util.Date getTs() {
        return ts;
    }

    /**
     * 属性ts的Setter方法.属性名：ts
     * 创建日期:2018-6-29
     *
     * @param newTs java.util.Date
     */
    public void setTs(java.util.Date newTs) {
        this.ts = newTs;
    }

    /**
     * 属性 lease_item_description的Getter方法.属性名：租赁物描述
     * 创建日期:2018-12-7
     *
     * @return java.lang.String
     */
    public String getLease_item_description() {
        return lease_item_description;
    }

    /**
     * 属性lease_item_description的Setter方法.属性名：租赁物描述
     * 创建日期:2018-12-7
     *
     * @param newCreator java.lang.String
     */
    public void setLease_item_description(String lease_item_description) {
        this.lease_item_description = lease_item_description;
    }

    /**
     * 合同结清财务结清状态
     *
     * @return
     */
    public String getGather_settle_status() {
        return gather_settle_status;
    }

    /**
     * 合同结清财务结清状态
     *
     * @param gather_settle_status
     */
    public void setGather_settle_status(String gather_settle_status) {
        this.gather_settle_status = gather_settle_status;
    }

    /**
     * 推广协议类型
     *
     * @param generalize_type
     */
    public void setGeneralize_type(String generalize_type) {
        this.generalize_type = generalize_type;
    }

    /**
     * 推广协议类型
     *
     * @return
     */
    public String getGeneralize_type() {
        return generalize_type;
    }

    public Boolean getCan_edit() {
        return can_edit;
    }

    public void setCan_edit(Boolean can_edit) {
        this.can_edit = can_edit;
    }

    /**
     * 属性 seal_type的Getter方法.属性名：用印类型
     * 创建日期:2020-10-12
     *
     * @return java.lang.String
     */
    public String getSeal_type() {
        return seal_type;
    }

    /**
     * 属性seal_type的Setter方法.属性名：用印类型
     * 创建日期:2020-10-12
     *
     * @param newSeal_type java.lang.String
     */
    public void setSeal_type(String newSeal_type) {
        this.seal_type = newSeal_type;
    }

    public String getIs_face_online() {
        return is_face_online;
    }

    public void setIs_face_online(String is_face_online) {
        this.is_face_online = is_face_online;
    }

    public String getOther_seal() {
        return other_seal;
    }

    public void setOther_seal(String other_seal) {
        this.other_seal = other_seal;
    }

    public String getOther_seal_time() {
        return other_seal_time;
    }

    public void setOther_seal_time(String other_seal_time) {
        this.other_seal_time = other_seal_time;
    }

    public String getIf_use_other() {
        return if_use_other;
    }

    public void setIf_use_other(String if_use_other) {
        this.if_use_other = if_use_other;
    }

    public java.util.Date getUse_other_time() {
        return use_other_time;
    }

    public void setUse_other_time(java.util.Date use_other_time) {
        this.use_other_time = use_other_time;
    }

    public String getIf_intertemporal() {
        return if_intertemporal;
    }

    public void setIf_intertemporal(String if_intertemporal) {
        this.if_intertemporal = if_intertemporal;
    }

    public String getIntertemporal_type() {
        return intertemporal_type;
    }

    public void setIntertemporal_type(String intertemporal_type) {
        this.intertemporal_type = intertemporal_type;
    }

    public String getIntertemporal_reason() {
        return intertemporal_reason;
    }

    public void setIntertemporal_reason(String intertemporal_reason) {
        this.intertemporal_reason = intertemporal_reason;
    }

    private String is_new_to_old;

    /**
     * 属性 is_new_to_old的Getter方法.属性名：是否存在借新还旧
     * 创建日期:2021-9-10
     *
     * @return java.lang.String
     */
    public String getIs_new_to_old() {
        return is_new_to_old;
    }

    /**
     * 属性is_new_to_old的Setter方法.属性名：是否存在借新还旧
     * 创建日期:2021-9-10
     *
     * @param newIs_new_to_old java.lang.String
     */
    public void setIs_new_to_old(String newIs_new_to_old) {
        this.is_new_to_old = newIs_new_to_old;
    }
}