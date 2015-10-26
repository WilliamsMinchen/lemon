package com.mossle.humantask.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TaskInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "TASK_INFO")
public class TaskInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private TaskInfo taskInfo;

    /** null. */
    private String businessKey;

    /** null. */
    private String code;

    /** null. */
    private String name;

    /** null. */
    private String description;

    /** null. */
    private Integer priority;

    /** null. */
    private String category;

    /** null. */
    private String form;

    /** null. */
    private String tenantId;

    /** null. */
    private String status;

    /** null. */
    private String suspendStatus;

    /** null. */
    private String delegateStatus;

    /** null. */
    private String completeStatus;

    /** null. */
    private String skipStatus;

    /** null. */
    private String escalateStatus;

    /** null. */
    private String copyStatus;

    /** null. */
    private String copyTaskId;

    /** null. */
    private String presentationName;

    /** null. */
    private String presentationSubject;

    /** null. */
    private Date createTime;

    /** null. */
    private Date activationTime;

    /** null. */
    private Date claimTime;

    /** null. */
    private Date completeTime;

    /** null. */
    private Date expirationTime;

    /** null. */
    private Date lastModifiedTime;

    /** null. */
    private String duration;

    /** null. */
    private String creator;

    /** null. */
    private String initiator;

    /** null. */
    private String assignee;

    /** null. */
    private String owner;

    /** null. */
    private String lastModifier;

    /** null. */
    private String swimlane;

    /** null. */
    private String taskId;

    /** null. */
    private String executionId;

    /** null. */
    private String processInstanceId;

    /** null. */
    private String processDefinitionId;

    /** null. */
    private String attr1;

    /** null. */
    private String attr2;

    /** null. */
    private String attr3;

    /** null. */
    private String attr4;

    /** null. */
    private String attr5;

    /** null. */
    private String processBusinessKey;

    /** . */
    private Set<TaskDeadline> taskDeadlines = new HashSet<TaskDeadline>(0);

    /** . */
    private Set<TaskInfo> taskInfos = new HashSet<TaskInfo>(0);

    /** . */
    private Set<TaskParticipant> taskParticipants = new HashSet<TaskParticipant>(
            0);

    /** . */
    private Set<TaskLog> taskLogs = new HashSet<TaskLog>(0);

    public TaskInfo() {
    }

    public TaskInfo(TaskInfo taskInfo, String businessKey, String code,
            String name, String description, Integer priority, String category,
            String form, String tenantId, String status, String suspendStatus,
            String delegateStatus, String completeStatus, String skipStatus,
            String escalateStatus, String copyStatus, String copyTaskId,
            String presentationName, String presentationSubject,
            Date createTime, Date activationTime, Date claimTime,
            Date completeTime, Date expirationTime, Date lastModifiedTime,
            String duration, String creator, String initiator, String assignee,
            String owner, String lastModifier, String swimlane, String taskId,
            String executionId, String processInstanceId,
            String processDefinitionId, String attr1, String attr2,
            String attr3, String attr4, String attr5,
            String processBusinessKey, Set<TaskDeadline> taskDeadlines,
            Set<TaskInfo> taskInfos, Set<TaskParticipant> taskParticipants,
            Set<TaskLog> taskLogs) {
        this.taskInfo = taskInfo;
        this.businessKey = businessKey;
        this.code = code;
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.category = category;
        this.form = form;
        this.tenantId = tenantId;
        this.status = status;
        this.suspendStatus = suspendStatus;
        this.delegateStatus = delegateStatus;
        this.completeStatus = completeStatus;
        this.skipStatus = skipStatus;
        this.escalateStatus = escalateStatus;
        this.copyStatus = copyStatus;
        this.copyTaskId = copyTaskId;
        this.presentationName = presentationName;
        this.presentationSubject = presentationSubject;
        this.createTime = createTime;
        this.activationTime = activationTime;
        this.claimTime = claimTime;
        this.completeTime = completeTime;
        this.expirationTime = expirationTime;
        this.lastModifiedTime = lastModifiedTime;
        this.duration = duration;
        this.creator = creator;
        this.initiator = initiator;
        this.assignee = assignee;
        this.owner = owner;
        this.lastModifier = lastModifier;
        this.swimlane = swimlane;
        this.taskId = taskId;
        this.executionId = executionId;
        this.processInstanceId = processInstanceId;
        this.processDefinitionId = processDefinitionId;
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
        this.attr4 = attr4;
        this.attr5 = attr5;
        this.processBusinessKey = processBusinessKey;
        this.taskDeadlines = taskDeadlines;
        this.taskInfos = taskInfos;
        this.taskParticipants = taskParticipants;
        this.taskLogs = taskLogs;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARENT_ID")
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    /**
     * @param taskInfo
     *            null.
     */
    public void setTaskInfo(TaskInfo taskInfo) {
        this.taskInfo = taskInfo;
    }

    /** @return null. */
    @Column(name = "BUSINESS_KEY", length = 100)
    public String getBusinessKey() {
        return this.businessKey;
    }

    /**
     * @param businessKey
     *            null.
     */
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
    }

    /** @return null. */
    @Column(name = "CODE", length = 100)
    public String getCode() {
        return this.code;
    }

    /**
     * @param code
     *            null.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "DESCRIPTION", length = 200)
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description
     *            null.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** @return null. */
    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     *            null.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** @return null. */
    @Column(name = "CATEGORY", length = 100)
    public String getCategory() {
        return this.category;
    }

    /**
     * @param category
     *            null.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /** @return null. */
    @Column(name = "FORM", length = 100)
    public String getForm() {
        return this.form;
    }

    /**
     * @param form
     *            null.
     */
    public void setForm(String form) {
        this.form = form;
    }

    /** @return null. */
    @Column(name = "TENANT_ID", length = 100)
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @param tenantId
     *            null.
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /** @return null. */
    @Column(name = "STATUS", length = 50)
    public String getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** @return null. */
    @Column(name = "SUSPEND_STATUS", length = 50)
    public String getSuspendStatus() {
        return this.suspendStatus;
    }

    /**
     * @param suspendStatus
     *            null.
     */
    public void setSuspendStatus(String suspendStatus) {
        this.suspendStatus = suspendStatus;
    }

    /** @return null. */
    @Column(name = "DELEGATE_STATUS", length = 50)
    public String getDelegateStatus() {
        return this.delegateStatus;
    }

    /**
     * @param delegateStatus
     *            null.
     */
    public void setDelegateStatus(String delegateStatus) {
        this.delegateStatus = delegateStatus;
    }

    /** @return null. */
    @Column(name = "COMPLETE_STATUS", length = 50)
    public String getCompleteStatus() {
        return this.completeStatus;
    }

    /**
     * @param completeStatus
     *            null.
     */
    public void setCompleteStatus(String completeStatus) {
        this.completeStatus = completeStatus;
    }

    /** @return null. */
    @Column(name = "SKIP_STATUS", length = 50)
    public String getSkipStatus() {
        return this.skipStatus;
    }

    /**
     * @param skipStatus
     *            null.
     */
    public void setSkipStatus(String skipStatus) {
        this.skipStatus = skipStatus;
    }

    /** @return null. */
    @Column(name = "ESCALATE_STATUS", length = 50)
    public String getEscalateStatus() {
        return this.escalateStatus;
    }

    /**
     * @param escalateStatus
     *            null.
     */
    public void setEscalateStatus(String escalateStatus) {
        this.escalateStatus = escalateStatus;
    }

    /** @return null. */
    @Column(name = "COPY_STATUS", length = 50)
    public String getCopyStatus() {
        return this.copyStatus;
    }

    /**
     * @param copyStatus
     *            null.
     */
    public void setCopyStatus(String copyStatus) {
        this.copyStatus = copyStatus;
    }

    /** @return null. */
    @Column(name = "COPY_TASK_ID", length = 64)
    public String getCopyTaskId() {
        return this.copyTaskId;
    }

    /**
     * @param copyTaskId
     *            null.
     */
    public void setCopyTaskId(String copyTaskId) {
        this.copyTaskId = copyTaskId;
    }

    /** @return null. */
    @Column(name = "PRESENTATION_NAME", length = 200)
    public String getPresentationName() {
        return this.presentationName;
    }

    /**
     * @param presentationName
     *            null.
     */
    public void setPresentationName(String presentationName) {
        this.presentationName = presentationName;
    }

    /** @return null. */
    @Column(name = "PRESENTATION_SUBJECT", length = 200)
    public String getPresentationSubject() {
        return this.presentationSubject;
    }

    /**
     * @param presentationSubject
     *            null.
     */
    public void setPresentationSubject(String presentationSubject) {
        this.presentationSubject = presentationSubject;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "ACTIVATION_TIME", length = 26)
    public Date getActivationTime() {
        return this.activationTime;
    }

    /**
     * @param activationTime
     *            null.
     */
    public void setActivationTime(Date activationTime) {
        this.activationTime = activationTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CLAIM_TIME", length = 26)
    public Date getClaimTime() {
        return this.claimTime;
    }

    /**
     * @param claimTime
     *            null.
     */
    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "COMPLETE_TIME", length = 26)
    public Date getCompleteTime() {
        return this.completeTime;
    }

    /**
     * @param completeTime
     *            null.
     */
    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EXPIRATION_TIME", length = 26)
    public Date getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @param expirationTime
     *            null.
     */
    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED_TIME", length = 26)
    public Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @param lastModifiedTime
     *            null.
     */
    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /** @return null. */
    @Column(name = "DURATION", length = 50)
    public String getDuration() {
        return this.duration;
    }

    /**
     * @param duration
     *            null.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /** @return null. */
    @Column(name = "CREATOR", length = 64)
    public String getCreator() {
        return this.creator;
    }

    /**
     * @param creator
     *            null.
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /** @return null. */
    @Column(name = "INITIATOR", length = 64)
    public String getInitiator() {
        return this.initiator;
    }

    /**
     * @param initiator
     *            null.
     */
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    /** @return null. */
    @Column(name = "ASSIGNEE", length = 64)
    public String getAssignee() {
        return this.assignee;
    }

    /**
     * @param assignee
     *            null.
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /** @return null. */
    @Column(name = "OWNER", length = 64)
    public String getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     *            null.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /** @return null. */
    @Column(name = "LAST_MODIFIER", length = 64)
    public String getLastModifier() {
        return this.lastModifier;
    }

    /**
     * @param lastModifier
     *            null.
     */
    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    /** @return null. */
    @Column(name = "SWIMLANE", length = 100)
    public String getSwimlane() {
        return this.swimlane;
    }

    /**
     * @param swimlane
     *            null.
     */
    public void setSwimlane(String swimlane) {
        this.swimlane = swimlane;
    }

    /** @return null. */
    @Column(name = "TASK_ID", length = 200)
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @param taskId
     *            null.
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /** @return null. */
    @Column(name = "EXECUTION_ID", length = 200)
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @param executionId
     *            null.
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /** @return null. */
    @Column(name = "PROCESS_INSTANCE_ID", length = 200)
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @param processInstanceId
     *            null.
     */
    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    /** @return null. */
    @Column(name = "PROCESS_DEFINITION_ID", length = 200)
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    /**
     * @param processDefinitionId
     *            null.
     */
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    /** @return null. */
    @Column(name = "ATTR1", length = 100)
    public String getAttr1() {
        return this.attr1;
    }

    /**
     * @param attr1
     *            null.
     */
    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    /** @return null. */
    @Column(name = "ATTR2", length = 100)
    public String getAttr2() {
        return this.attr2;
    }

    /**
     * @param attr2
     *            null.
     */
    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    /** @return null. */
    @Column(name = "ATTR3", length = 100)
    public String getAttr3() {
        return this.attr3;
    }

    /**
     * @param attr3
     *            null.
     */
    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    /** @return null. */
    @Column(name = "ATTR4", length = 100)
    public String getAttr4() {
        return this.attr4;
    }

    /**
     * @param attr4
     *            null.
     */
    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    /** @return null. */
    @Column(name = "ATTR5", length = 100)
    public String getAttr5() {
        return this.attr5;
    }

    /**
     * @param attr5
     *            null.
     */
    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    /** @return null. */
    @Column(name = "PROCESS_BUSINESS_KEY", length = 200)
    public String getProcessBusinessKey() {
        return this.processBusinessKey;
    }

    /**
     * @param processBusinessKey
     *            null.
     */
    public void setProcessBusinessKey(String processBusinessKey) {
        this.processBusinessKey = processBusinessKey;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskInfo")
    public Set<TaskDeadline> getTaskDeadlines() {
        return this.taskDeadlines;
    }

    /**
     * @param taskDeadlines
     *            .
     */
    public void setTaskDeadlines(Set<TaskDeadline> taskDeadlines) {
        this.taskDeadlines = taskDeadlines;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskInfo")
    public Set<TaskInfo> getTaskInfos() {
        return this.taskInfos;
    }

    /**
     * @param taskInfos
     *            .
     */
    public void setTaskInfos(Set<TaskInfo> taskInfos) {
        this.taskInfos = taskInfos;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskInfo")
    public Set<TaskParticipant> getTaskParticipants() {
        return this.taskParticipants;
    }

    /**
     * @param taskParticipants
     *            .
     */
    public void setTaskParticipants(Set<TaskParticipant> taskParticipants) {
        this.taskParticipants = taskParticipants;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "taskInfo")
    public Set<TaskLog> getTaskLogs() {
        return this.taskLogs;
    }

    /**
     * @param taskLogs
     *            .
     */
    public void setTaskLogs(Set<TaskLog> taskLogs) {
        this.taskLogs = taskLogs;
    }
}