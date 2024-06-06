package com.test1;

public class FlatFileUploadApprover {
	private Integer referenceTableId;
	private String dsName;
	private String apprGrp;
	private String apprType;
	private String apprScope;
	private Integer apprSequence;
	private Integer grpTypeSequence;
	private String custodianGrp;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FlatFileUploadApprover() {

	}

	public FlatFileUploadApprover(Integer referenceTableId, String dsName, String apprGrp, String apprType,
			String apprScope, Integer apprSequence, Integer grpTypeSequence, String custodianGrp, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.referenceTableId = referenceTableId;
		this.dsName = dsName;
		this.apprGrp = apprGrp;
		this.apprType = apprType;
		this.apprScope = apprScope;
		this.apprSequence = apprSequence;
		this.grpTypeSequence = grpTypeSequence;
		this.custodianGrp = custodianGrp;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getReferenceTableId() {
		return referenceTableId;
	}

	public void setReferenceTableId(Integer referenceTableId) {
		this.referenceTableId = referenceTableId;
	}

	public String getDsName() {
		return dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public String getApprGrp() {
		return apprGrp;
	}

	public void setApprGrp(String apprGrp) {
		this.apprGrp = apprGrp;
	}

	public String getApprType() {
		return apprType;
	}

	public void setApprType(String apprType) {
		this.apprType = apprType;
	}

	public String getApprScope() {
		return apprScope;
	}

	public void setApprScope(String apprScope) {
		this.apprScope = apprScope;
	}

	public Integer getApprSequence() {
		return apprSequence;
	}

	public void setApprSequence(Integer apprSequence) {
		this.apprSequence = apprSequence;
	}

	public Integer getGrpTypeSequence() {
		return grpTypeSequence;
	}

	public void setGrpTypeSequence(Integer grpTypeSequence) {
		this.grpTypeSequence = grpTypeSequence;
	}

	public String getCustodianGrp() {
		return custodianGrp;
	}

	public void setCustodianGrp(String custodianGrp) {
		this.custodianGrp = custodianGrp;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
