package com.datastax.fixmessage.model;

import java.util.Date;

import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "datastax_fixmessage_demo", name = "messages")
public class SmallMessage {
	
	@PartitionKey
	private int id;

	private String  clientsClOrdId;
	private Date acceptTime;
	private String  account;
	private double benchmarkPrice;
	private int  businessType;
	private Date cancelTime;
	private double capital;
	private int  childCount;
	private String  clOrdId;
	private String  clearingAccount;
	private String  clearingFirm;
	private String  clientAccount;
	private String  clientSubId;
	private int  closingCross;
	private int  controlAction;
	private int  controlReason;
	private String  controlText;
	private int  covered;
	private Date createTime;
	private double cumQty;
	private String  currency;
	private double cxlQty;
	private int  descendantCount;
	private String  destination;
	private int  discretionInst;
	private double discretionOffset;
	private double displayRange;
	private Date effectiveTime;
	private String  exDestination;
	private String  execInst;
	private Date execTime;
	private Date expirationTime;
	private boolean external;
	private int  groupId;
	private double insertedNotional;
	private double insertedShares;
	private int  internalCrossingInst;
	private int  isElectronic;
	private int  lastChildId;
	private int  location;
	private String  locationConfirm;
	private String  locationConfirmBroker;
	private double masterId;
	private double maxFloor;
	private double maxShow;
	private double minQty;
	private int  openingCross;
	private int  orderCapacity;
	private int  orderCreationReason;
	private int  orderType;
	private String  origGroup;
	private String  origSource;
	private String  owner;
	private int  parentId;
	private double participationRate;
	private double pegOffset;
	private int  previousSiblingId;
	private double price;
	private int  productType;
	private double qty;
	private int  qtyType;
	private int  rejectReason;
	private int  cancelReason;
	private int  cancelRejectReason;
	private double refId;
	private Date rejectTime;
	private int  revisionNumber;
	private Date dataRevision;
	private int  riskAversion;
	private int  rollUp;
	private int  rootOrderId;
	private int  ruleId;
	private int  securityIdSource;
	private String  securityIdType;
	private double seqNo;
	private int  settlementDate;
	private int  settlementType;
	private int  side;
	private int  solicitedFlag;
	private String  source;
	private double splitQty;
	private int  state;
	private double stopPx;
	private int  stratType;
	private String  strategyParameter;
	private String  textmsg;
	private int  timeInForce;
	private double unavailable;
	private int  waitState;
	private int  notesCount;
	private int  noteType;
	private String  latestNoteText;
	private String  latestNoteSource;
	private boolean hasCorrection;
	private int  customerOrFirm;
	private int  openClose;
	private double legRatioQty;
	private String  legCFICode;
	private double spreadNetPrice;
	private double spreadOrderQty;
	private String  errorText;
	private String  orderText;
	private double entitlement;
	private boolean hasCancelRejected;
	
	public SmallMessage(){}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getClientsClOrdId() {
		return clientsClOrdId;
	}

	public void setClientsClOrdId(String clientsClOrdId) {
		this.clientsClOrdId = clientsClOrdId;
	}

	public Date getAcceptTime() {
		return acceptTime;
	}

	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBenchmarkPrice() {
		return benchmarkPrice;
	}

	public void setBenchmarkPrice(double benchmarkPrice) {
		this.benchmarkPrice = benchmarkPrice;
	}

	public int getBusinessType() {
		return businessType;
	}

	public void setBusinessType(int businessType) {
		this.businessType = businessType;
	}

	public Date getCancelTime() {
		return cancelTime;
	}

	public void setCancelTime(Date cancelTime) {
		this.cancelTime = cancelTime;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public String getClOrdId() {
		return clOrdId;
	}

	public void setClOrdId(String clOrdId) {
		this.clOrdId = clOrdId;
	}

	public String getClearingAccount() {
		return clearingAccount;
	}

	public void setClearingAccount(String clearingAccount) {
		this.clearingAccount = clearingAccount;
	}

	public String getClearingFirm() {
		return clearingFirm;
	}

	public void setClearingFirm(String clearingFirm) {
		this.clearingFirm = clearingFirm;
	}

	public String getClientAccount() {
		return clientAccount;
	}

	public void setClientAccount(String clientAccount) {
		this.clientAccount = clientAccount;
	}

	public String getClientSubId() {
		return clientSubId;
	}

	public void setClientSubId(String clientSubId) {
		this.clientSubId = clientSubId;
	}

	public int getClosingCross() {
		return closingCross;
	}

	public void setClosingCross(int closingCross) {
		this.closingCross = closingCross;
	}

	public int getControlAction() {
		return controlAction;
	}

	public void setControlAction(int controlAction) {
		this.controlAction = controlAction;
	}

	public int getControlReason() {
		return controlReason;
	}

	public void setControlReason(int controlReason) {
		this.controlReason = controlReason;
	}

	public String getControlText() {
		return controlText;
	}

	public void setControlText(String controlText) {
		this.controlText = controlText;
	}

	public int getCovered() {
		return covered;
	}

	public void setCovered(int covered) {
		this.covered = covered;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public double getCumQty() {
		return cumQty;
	}

	public void setCumQty(double cumQty) {
		this.cumQty = cumQty;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getCxlQty() {
		return cxlQty;
	}

	public void setCxlQty(double cxlQty) {
		this.cxlQty = cxlQty;
	}

	public int getDescendantCount() {
		return descendantCount;
	}

	public void setDescendantCount(int descendantCount) {
		this.descendantCount = descendantCount;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDiscretionInst() {
		return discretionInst;
	}

	public void setDiscretionInst(int discretionInst) {
		this.discretionInst = discretionInst;
	}

	public double getDiscretionOffset() {
		return discretionOffset;
	}

	public void setDiscretionOffset(double discretionOffset) {
		this.discretionOffset = discretionOffset;
	}

	public double getDisplayRange() {
		return displayRange;
	}

	public void setDisplayRange(double displayRange) {
		this.displayRange = displayRange;
	}

	public Date getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getExDestination() {
		return exDestination;
	}

	public void setExDestination(String exDestination) {
		this.exDestination = exDestination;
	}

	public String getExecInst() {
		return execInst;
	}

	public void setExecInst(String execInst) {
		this.execInst = execInst;
	}

	public Date getExecTime() {
		return execTime;
	}

	public void setExecTime(Date execTime) {
		this.execTime = execTime;
	}

	public Date getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}

	public boolean isExternal() {
		return external;
	}

	public void setExternal(boolean external) {
		this.external = external;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public double getInsertedNotional() {
		return insertedNotional;
	}

	public void setInsertedNotional(double insertedNotional) {
		this.insertedNotional = insertedNotional;
	}

	public double getInsertedShares() {
		return insertedShares;
	}

	public void setInsertedShares(double insertedShares) {
		this.insertedShares = insertedShares;
	}

	public int getInternalCrossingInst() {
		return internalCrossingInst;
	}

	public void setInternalCrossingInst(int internalCrossingInst) {
		this.internalCrossingInst = internalCrossingInst;
	}

	public int getIsElectronic() {
		return isElectronic;
	}

	public void setIsElectronic(int isElectronic) {
		this.isElectronic = isElectronic;
	}

	public int getLastChildId() {
		return lastChildId;
	}

	public void setLastChildId(int lastChildId) {
		this.lastChildId = lastChildId;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public String getLocationConfirm() {
		return locationConfirm;
	}

	public void setLocationConfirm(String locationConfirm) {
		this.locationConfirm = locationConfirm;
	}

	public String getLocationConfirmBroker() {
		return locationConfirmBroker;
	}

	public void setLocationConfirmBroker(String locationConfirmBroker) {
		this.locationConfirmBroker = locationConfirmBroker;
	}

	public double getMasterId() {
		return masterId;
	}

	public void setMasterId(double masterId) {
		this.masterId = masterId;
	}

	public double getMaxFloor() {
		return maxFloor;
	}

	public void setMaxFloor(double maxFloor) {
		this.maxFloor = maxFloor;
	}

	public double getMaxShow() {
		return maxShow;
	}

	public void setMaxShow(double maxShow) {
		this.maxShow = maxShow;
	}

	public double getMinQty() {
		return minQty;
	}

	public void setMinQty(double minQty) {
		this.minQty = minQty;
	}

	public int getOpeningCross() {
		return openingCross;
	}

	public void setOpeningCross(int openingCross) {
		this.openingCross = openingCross;
	}

	public int getOrderCapacity() {
		return orderCapacity;
	}

	public void setOrderCapacity(int orderCapacity) {
		this.orderCapacity = orderCapacity;
	}

	public int getOrderCreationReason() {
		return orderCreationReason;
	}

	public void setOrderCreationReason(int orderCreationReason) {
		this.orderCreationReason = orderCreationReason;
	}

	public int getOrderType() {
		return orderType;
	}

	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}

	public String getOrigGroup() {
		return origGroup;
	}

	public void setOrigGroup(String origGroup) {
		this.origGroup = origGroup;
	}

	public String getOrigSource() {
		return origSource;
	}

	public void setOrigSource(String origSource) {
		this.origSource = origSource;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public double getParticipationRate() {
		return participationRate;
	}

	public void setParticipationRate(double participationRate) {
		this.participationRate = participationRate;
	}

	public double getPegOffset() {
		return pegOffset;
	}

	public void setPegOffset(double pegOffset) {
		this.pegOffset = pegOffset;
	}

	public int getPreviousSiblingId() {
		return previousSiblingId;
	}

	public void setPreviousSiblingId(int previousSiblingId) {
		this.previousSiblingId = previousSiblingId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getProductType() {
		return productType;
	}

	public void setProductType(int productType) {
		this.productType = productType;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public int getQtyType() {
		return qtyType;
	}

	public void setQtyType(int qtyType) {
		this.qtyType = qtyType;
	}

	public int getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(int rejectReason) {
		this.rejectReason = rejectReason;
	}

	public int getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(int cancelReason) {
		this.cancelReason = cancelReason;
	}

	public int getCancelRejectReason() {
		return cancelRejectReason;
	}

	public void setCancelRejectReason(int cancelRejectReason) {
		this.cancelRejectReason = cancelRejectReason;
	}

	public double getRefId() {
		return refId;
	}

	public void setRefId(double refId) {
		this.refId = refId;
	}

	public Date getRejectTime() {
		return rejectTime;
	}

	public void setRejectTime(Date rejectTime) {
		this.rejectTime = rejectTime;
	}

	public int getRevisionNumber() {
		return revisionNumber;
	}

	public void setRevisionNumber(int revisionNumber) {
		this.revisionNumber = revisionNumber;
	}

	public Date getDataRevision() {
		return dataRevision;
	}

	public void setDataRevision(Date dataRevision) {
		this.dataRevision = dataRevision;
	}

	public int getRiskAversion() {
		return riskAversion;
	}

	public void setRiskAversion(int riskAversion) {
		this.riskAversion = riskAversion;
	}

	public int getRollUp() {
		return rollUp;
	}

	public void setRollUp(int rollUp) {
		this.rollUp = rollUp;
	}

	public int getRootOrderId() {
		return rootOrderId;
	}

	public void setRootOrderId(int rootOrderId) {
		this.rootOrderId = rootOrderId;
	}

	public int getRuleId() {
		return ruleId;
	}

	public void setRuleId(int ruleId) {
		this.ruleId = ruleId;
	}

	public int getSecurityIdSource() {
		return securityIdSource;
	}

	public void setSecurityIdSource(int securityIdSource) {
		this.securityIdSource = securityIdSource;
	}

	public String getSecurityIdType() {
		return securityIdType;
	}

	public void setSecurityIdType(String securityIdType) {
		this.securityIdType = securityIdType;
	}

	public double getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(double seqNo) {
		this.seqNo = seqNo;
	}

	public int getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(int settlementDate) {
		this.settlementDate = settlementDate;
	}

	public int getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(int settlementType) {
		this.settlementType = settlementType;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSolicitedFlag() {
		return solicitedFlag;
	}

	public void setSolicitedFlag(int solicitedFlag) {
		this.solicitedFlag = solicitedFlag;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public double getSplitQty() {
		return splitQty;
	}

	public void setSplitQty(double splitQty) {
		this.splitQty = splitQty;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public double getStopPx() {
		return stopPx;
	}

	public void setStopPx(double stopPx) {
		this.stopPx = stopPx;
	}

	public int getStratType() {
		return stratType;
	}

	public void setStratType(int stratType) {
		this.stratType = stratType;
	}

	public String getStrategyParameter() {
		return strategyParameter;
	}

	public void setStrategyParameter(String strategyParameter) {
		this.strategyParameter = strategyParameter;
	}

	public String getTextmsg() {
		return textmsg;
	}

	public void setTextmsg(String textmsg) {
		this.textmsg = textmsg;
	}

	public int getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(int timeInForce) {
		this.timeInForce = timeInForce;
	}

	public double getUnavailable() {
		return unavailable;
	}

	public void setUnavailable(double unavailable) {
		this.unavailable = unavailable;
	}

	public int getWaitState() {
		return waitState;
	}

	public void setWaitState(int waitState) {
		this.waitState = waitState;
	}

	public int getNotesCount() {
		return notesCount;
	}

	public void setNotesCount(int notesCount) {
		this.notesCount = notesCount;
	}

	public int getNoteType() {
		return noteType;
	}

	public void setNoteType(int noteType) {
		this.noteType = noteType;
	}

	public String getLatestNoteText() {
		return latestNoteText;
	}

	public void setLatestNoteText(String latestNoteText) {
		this.latestNoteText = latestNoteText;
	}

	public String getLatestNoteSource() {
		return latestNoteSource;
	}

	public void setLatestNoteSource(String latestNoteSource) {
		this.latestNoteSource = latestNoteSource;
	}

	public boolean isHasCorrection() {
		return hasCorrection;
	}

	public void setHasCorrection(boolean hasCorrection) {
		this.hasCorrection = hasCorrection;
	}

	public int getCustomerOrFirm() {
		return customerOrFirm;
	}

	public void setCustomerOrFirm(int customerOrFirm) {
		this.customerOrFirm = customerOrFirm;
	}

	public int getOpenClose() {
		return openClose;
	}

	public void setOpenClose(int openClose) {
		this.openClose = openClose;
	}

	public double getLegRatioQty() {
		return legRatioQty;
	}

	public void setLegRatioQty(double legRatioQty) {
		this.legRatioQty = legRatioQty;
	}

	public String getLegCFICode() {
		return legCFICode;
	}

	public void setLegCFICode(String legCFICode) {
		this.legCFICode = legCFICode;
	}

	public double getSpreadNetPrice() {
		return spreadNetPrice;
	}

	public void setSpreadNetPrice(double spreadNetPrice) {
		this.spreadNetPrice = spreadNetPrice;
	}

	public double getSpreadOrderQty() {
		return spreadOrderQty;
	}

	public void setSpreadOrderQty(double spreadOrderQty) {
		this.spreadOrderQty = spreadOrderQty;
	}

	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String getOrderText() {
		return orderText;
	}

	public void setOrderText(String orderText) {
		this.orderText = orderText;
	}

	public double getEntitlement() {
		return entitlement;
	}

	public void setEntitlement(double entitlement) {
		this.entitlement = entitlement;
	}

	public boolean isHasCancelRejected() {
		return hasCancelRejected;
	}

	public void setHasCancelRejected(boolean hasCancelRejected) {
		this.hasCancelRejected = hasCancelRejected;
	}
	
	
}
