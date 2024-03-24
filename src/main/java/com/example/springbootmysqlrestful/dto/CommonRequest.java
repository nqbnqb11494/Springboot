package com.example.springbootmysqlrestful.dto;

import java.util.List;
import java.util.Map;

public class CommonRequest {
    private String userId; // userId trong bảng IBS_USERS
    private String contractNo; // số hợp đồng
    private String cusId; // mã khách hàng
    private String cusName;
    private String cusType; // loại khách hàng
    private String cifCode; // mã CIF Code
    private String tranCode;// Tran Code
    private String tranId;
    private String accNo; // số thẻ hoặc số tài khoản
    private String ccyCd;// đơn vị tiền tệ
    private String fromDate;// tu ngay
    private String toDate;// den ngay
    private String status;
    private String beneficiary;
    private String orderField;
    private boolean isASC;
    private String transId;
    private String cardType;
    private String language;
    private String scheduleId;
    private String execDate;
    private String menuType;
    private String serviceType;
    private String branchId;
    private String mailId;
    private String serviceId;
    private String cardNo;
    private String email;
    private String exportType;

    private String templateName;
    private String transferRange;
    private String hintName;
    private String accName;
    private String loanAccount;
    private double total;
    private double currentBalance;

    private String totalPrintamt;
    private String totalPaidamt;
    private String totalPay;
    private String customerCode;
    private String signNo;

    private int transactionType;
    // Sao ke the
    private String cardAccountNo;
    private String creditLimit;
    private String statementDate;
    private String statementNumber;
    private String previousBalance;
    private String paidAmount;
    private String newDebts;
    private String minPaymentDue;
    private String currentBalanceStr;
    private String dueDate;
    private String bonusPoint;
    private String bpExpireDate;
    private String curBalance;
    private String reportMonth;
    private String tranTime;

    //connect wallet
    private String partnerCode;
    private String ewCode;
    private String amount;

    //find child batch
    private String batchRef;

    // For Paging
    private int pageNumber;
    private int pageSize;
    private String searchKey;
    private int maxRecords;
    private String subTranCode;
    private String whoPayFee;
    private String description;

    // For list
    private List<?> reqList; // any list
    private Map<String, Object> reqObj; // any object
    private String reqJson; // any object json
    private int reqSend; // any number
    private String reqId; // any string
    private boolean reqFlag; // any boolean
    private String reqType; // any type of request string
    private boolean hasTransaction;
    private String benAccNo;
    private String cardAccNo;
    private String searchAccNo;
    private String type;
    private double startBalance;
    private String cardNoFull;

    public double getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(double startBalance) {
        this.startBalance = startBalance;
    }

    public String getSearchAccNo() {
        return searchAccNo;
    }

    public void setSearchAccNo(String searchAccNo) {
        this.searchAccNo = searchAccNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTranTime() {
        return tranTime;
    }

    public void setTranTime(String tranTime) {
        this.tranTime = tranTime;
    }

    public boolean isHasTransaction() {
        return hasTransaction;
    }

    public void setHasTransaction(boolean hasTransaction) {
        this.hasTransaction = hasTransaction;
    }

    public String getBatchRef() {
        return batchRef;
    }

    public void setBatchRef(String batchRef) {
        this.batchRef = batchRef;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSignNo() {
        return signNo;
    }

    public void setSignNo(String signNo) {
        this.signNo = signNo;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType;
    }

    public String getCifCode() {
        return cifCode;
    }

    public void setCifCode(String cifCode) {
        this.cifCode = cifCode;
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getCcyCd() {
        return ccyCd;
    }

    public void setCcyCd(String ccyCd) {
        this.ccyCd = ccyCd;
    }

    public List<?> getReqList() {
        return reqList;
    }

    public void setReqList(List<?> reqList) {
        this.reqList = reqList;
    }

    public int getReqSend() {
        return reqSend;
    }

    public void setReqSend(int reqSend) {
        this.reqSend = reqSend;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(String beneficiary) {
        this.beneficiary = beneficiary;
    }

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public boolean isASC() {
        return isASC;
    }

    public void setASC(boolean isASC) {
        this.isASC = isASC;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getExecDate() {
        return execDate;
    }

    public void setExecDate(String execDate) {
        this.execDate = execDate;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public String getEwCode() {
        return ewCode;
    }

    public void setEwCode(String ewCode) {
        this.ewCode = ewCode;
    }

    public String getPartnerCode() {
        return partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Map<String, Object> getReqObj() {
        return reqObj;
    }

    public void setReqObj(Map<String, Object> reqObj) {
        this.reqObj = reqObj;
    }

    public String getReqJson() {
        return reqJson;
    }

    public void setReqJson(String reqJson) {
        this.reqJson = reqJson;
    }

    public int getMaxRecords() {
        return maxRecords;
    }

    public void setMaxRecords(int maxRecords) {
        this.maxRecords = maxRecords;
    }

    public String getSubTranCode() {
        return subTranCode;
    }

    public void setSubTranCode(String subTranCode) {
        this.subTranCode = subTranCode;
    }

    public String getWhoPayFee() {
        return whoPayFee;
    }

    public void setWhoPayFee(String whoPayFee) {
        this.whoPayFee = whoPayFee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTransferRange() {
        return transferRange;
    }

    public void setTransferRange(String transferRange) {
        this.transferRange = transferRange;
    }

    public String getHintName() {
        return hintName;
    }

    public void setHintName(String hintName) {
        this.hintName = hintName;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getLoanAccount() {
        return loanAccount;
    }

    public void setLoanAccount(String loanAccount) {
        this.loanAccount = loanAccount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getCardAccountNo() {
        return cardAccountNo;
    }

    public void setCardAccountNo(String cardAccountNo) {
        this.cardAccountNo = cardAccountNo;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getStatementDate() {
        return statementDate;
    }

    public void setStatementDate(String statementDate) {
        this.statementDate = statementDate;
    }

    public String getStatementNumber() {
        return statementNumber;
    }

    public void setStatementNumber(String statementNumber) {
        this.statementNumber = statementNumber;
    }

    public String getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(String previousBalance) {
        this.previousBalance = previousBalance;
    }

    public String getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(String paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getNewDebts() {
        return newDebts;
    }

    public void setNewDebts(String newDebts) {
        this.newDebts = newDebts;
    }

    public String getMinPaymentDue() {
        return minPaymentDue;
    }

    public void setMinPaymentDue(String minPaymentDue) {
        this.minPaymentDue = minPaymentDue;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getBonusPoint() {
        return bonusPoint;
    }

    public void setBonusPoint(String bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public String getBpExpireDate() {
        return bpExpireDate;
    }

    public void setBpExpireDate(String bpExpireDate) {
        this.bpExpireDate = bpExpireDate;
    }

    public String getCurBalance() {
        return curBalance;
    }

    public void setCurBalance(String curBalance) {
        this.curBalance = curBalance;
    }

    public String getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(String reportMonth) {
        this.reportMonth = reportMonth;
    }

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public boolean isReqFlag() {
        return reqFlag;
    }

    public void setReqFlag(boolean reqFlag) {
        this.reqFlag = reqFlag;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public String getTotalPrintamt() {
        return totalPrintamt;
    }

    public void setTotalPrintamt(String totalPrintamt) {
        this.totalPrintamt = totalPrintamt;
    }

    public String getTotalPaidamt() {
        return totalPaidamt;
    }

    public void setTotalPaidamt(String totalPaidamt) {
        this.totalPaidamt = totalPaidamt;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public String getCurrentBalanceStr() {
        return currentBalanceStr;
    }

    public void setCurrentBalanceStr(String currentBalanceStr) {
        this.currentBalanceStr = currentBalanceStr;
    }

    public String getBenAccNo() {
        return benAccNo;
    }

    public void setBenAccNo(String benAccNo) {
        this.benAccNo = benAccNo;
    }

    public String getCardAccNo() {
        return cardAccNo;
    }

    public void setCardAccNo(String cardAccNo) {
        this.cardAccNo = cardAccNo;
    }

    public String getCardNoFull() {
        return cardNoFull;
    }

    public void setCardNoFull(String cardNoFull) {
        this.cardNoFull = cardNoFull;
    }


}
