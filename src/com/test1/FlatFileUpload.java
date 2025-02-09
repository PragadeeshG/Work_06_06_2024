package com.test1;

public class FlatFileUpload {
	private Integer uploadId;
	private String dsName;
	private String fileName;
	private String uploadedBy;
	private String remarks;
	private String nextAction;
	private boolean approvalRequired;
	private String autoAppproval;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public FlatFileUpload() {

	}

	public FlatFileUpload(Integer uploadId, String dsName, String fileName, String uploadedBy, String remarks,
			String nextAction, boolean approvalRequired, String autoAppproval, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.uploadId = uploadId;
		this.dsName = dsName;
		this.fileName = fileName;
		this.uploadedBy = uploadedBy;
		this.remarks = remarks;
		this.nextAction = nextAction;
		this.approvalRequired = approvalRequired;
		this.autoAppproval = autoAppproval;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getUploadId() {
		return uploadId;
	}

	public void setUploadId(Integer uploadId) {
		this.uploadId = uploadId;
	}

	public String getDsName() {
		return dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getUploadedBy() {
		return uploadedBy;
	}

	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getNextAction() {
		return nextAction;
	}

	public void setNextAction(String nextAction) {
		this.nextAction = nextAction;
	}

	public boolean isApprovalRequired() {
		return approvalRequired;
	}

	public void setApprovalRequired(boolean approvalRequired) {
		this.approvalRequired = approvalRequired;
	}

	public String getAutoAppproval() {
		return autoAppproval;
	}

	public void setAutoAppproval(String autoAppproval) {
		this.autoAppproval = autoAppproval;
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
