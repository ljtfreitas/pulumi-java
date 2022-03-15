// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.deploymentmanager_v2.outputs.OperationErrorResponse;
import io.pulumi.googlenative.deploymentmanager_v2.outputs.OperationWarningsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OperationResponse {
    /**
     * The value of `requestId` if you provided it in the request. Not present otherwise.
     * 
     */
    private final String clientOperationId;
    /**
     * A textual description of the operation, which is set when the operation is created.
     * 
     */
    private final String description;
    /**
     * The time that this operation was completed. This value is in RFC3339 text format.
     * 
     */
    private final String endTime;
    /**
     * If errors are generated during processing of the operation, this field will be populated.
     * 
     */
    private final OperationErrorResponse error;
    /**
     * If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
     * 
     */
    private final String httpErrorMessage;
    /**
     * If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found.
     * 
     */
    private final Integer httpErrorStatusCode;
    /**
     * The time that this operation was requested. This value is in RFC3339 text format.
     * 
     */
    private final String insertTime;
    /**
     * Type of the resource. Always `compute#operation` for Operation resources.
     * 
     */
    private final String kind;
    /**
     * Name of the operation.
     * 
     */
    private final String name;
    /**
     * An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
     * 
     */
    private final String operationGroupId;
    /**
     * The type of operation, such as `insert`, `update`, or `delete`, and so on.
     * 
     */
    private final String operationType;
    /**
     * An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
     * 
     */
    private final Integer progress;
    /**
     * The URL of the region where the operation resides. Only applicable when performing regional operations.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The time that this operation was started by the server. This value is in RFC3339 text format.
     * 
     */
    private final String startTime;
    /**
     * The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
     * 
     */
    private final String status;
    /**
     * An optional textual description of the current status of the operation.
     * 
     */
    private final String statusMessage;
    /**
     * The unique target ID, which identifies a specific incarnation of the target resource.
     * 
     */
    private final String targetId;
    /**
     * The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
     * 
     */
    private final String targetLink;
    /**
     * User who requested the operation, for example: `user@example.com`.
     * 
     */
    private final String user;
    /**
     * If warning messages are generated during processing of the operation, this field will be populated.
     * 
     */
    private final List<OperationWarningsItemResponse> warnings;
    /**
     * The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
     * 
     */
    private final String zone;

    @CustomType.Constructor
    private OperationResponse(
        @CustomType.Parameter("clientOperationId") String clientOperationId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("error") OperationErrorResponse error,
        @CustomType.Parameter("httpErrorMessage") String httpErrorMessage,
        @CustomType.Parameter("httpErrorStatusCode") Integer httpErrorStatusCode,
        @CustomType.Parameter("insertTime") String insertTime,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("operationGroupId") String operationGroupId,
        @CustomType.Parameter("operationType") String operationType,
        @CustomType.Parameter("progress") Integer progress,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusMessage") String statusMessage,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("targetLink") String targetLink,
        @CustomType.Parameter("user") String user,
        @CustomType.Parameter("warnings") List<OperationWarningsItemResponse> warnings,
        @CustomType.Parameter("zone") String zone) {
        this.clientOperationId = clientOperationId;
        this.description = description;
        this.endTime = endTime;
        this.error = error;
        this.httpErrorMessage = httpErrorMessage;
        this.httpErrorStatusCode = httpErrorStatusCode;
        this.insertTime = insertTime;
        this.kind = kind;
        this.name = name;
        this.operationGroupId = operationGroupId;
        this.operationType = operationType;
        this.progress = progress;
        this.region = region;
        this.selfLink = selfLink;
        this.startTime = startTime;
        this.status = status;
        this.statusMessage = statusMessage;
        this.targetId = targetId;
        this.targetLink = targetLink;
        this.user = user;
        this.warnings = warnings;
        this.zone = zone;
    }

    /**
     * The value of `requestId` if you provided it in the request. Not present otherwise.
     * 
    */
    public String getClientOperationId() {
        return this.clientOperationId;
    }
    /**
     * A textual description of the operation, which is set when the operation is created.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The time that this operation was completed. This value is in RFC3339 text format.
     * 
    */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * If errors are generated during processing of the operation, this field will be populated.
     * 
    */
    public OperationErrorResponse getError() {
        return this.error;
    }
    /**
     * If the operation fails, this field contains the HTTP error message that was returned, such as `NOT FOUND`.
     * 
    */
    public String getHttpErrorMessage() {
        return this.httpErrorMessage;
    }
    /**
     * If the operation fails, this field contains the HTTP error status code that was returned. For example, a `404` means the resource was not found.
     * 
    */
    public Integer getHttpErrorStatusCode() {
        return this.httpErrorStatusCode;
    }
    /**
     * The time that this operation was requested. This value is in RFC3339 text format.
     * 
    */
    public String getInsertTime() {
        return this.insertTime;
    }
    /**
     * Type of the resource. Always `compute#operation` for Operation resources.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the operation.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * An ID that represents a group of operations, such as when a group of operations results from a `bulkInsert` API request.
     * 
    */
    public String getOperationGroupId() {
        return this.operationGroupId;
    }
    /**
     * The type of operation, such as `insert`, `update`, or `delete`, and so on.
     * 
    */
    public String getOperationType() {
        return this.operationType;
    }
    /**
     * An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of operations. This should not be used to guess when the operation will be complete. This number should monotonically increase as the operation progresses.
     * 
    */
    public Integer getProgress() {
        return this.progress;
    }
    /**
     * The URL of the region where the operation resides. Only applicable when performing regional operations.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * The time that this operation was started by the server. This value is in RFC3339 text format.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The status of the operation, which can be one of the following: `PENDING`, `RUNNING`, or `DONE`.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * An optional textual description of the current status of the operation.
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * The unique target ID, which identifies a specific incarnation of the target resource.
     * 
    */
    public String getTargetId() {
        return this.targetId;
    }
    /**
     * The URL of the resource that the operation modifies. For operations related to creating a snapshot, this points to the persistent disk that the snapshot was created from.
     * 
    */
    public String getTargetLink() {
        return this.targetLink;
    }
    /**
     * User who requested the operation, for example: `user@example.com`.
     * 
    */
    public String getUser() {
        return this.user;
    }
    /**
     * If warning messages are generated during processing of the operation, this field will be populated.
     * 
    */
    public List<OperationWarningsItemResponse> getWarnings() {
        return this.warnings;
    }
    /**
     * The URL of the zone where the operation resides. Only applicable when performing per-zone operations.
     * 
    */
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientOperationId;
        private String description;
        private String endTime;
        private OperationErrorResponse error;
        private String httpErrorMessage;
        private Integer httpErrorStatusCode;
        private String insertTime;
        private String kind;
        private String name;
        private String operationGroupId;
        private String operationType;
        private Integer progress;
        private String region;
        private String selfLink;
        private String startTime;
        private String status;
        private String statusMessage;
        private String targetId;
        private String targetLink;
        private String user;
        private List<OperationWarningsItemResponse> warnings;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.description = defaults.description;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.httpErrorMessage = defaults.httpErrorMessage;
    	      this.httpErrorStatusCode = defaults.httpErrorStatusCode;
    	      this.insertTime = defaults.insertTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.operationGroupId = defaults.operationGroupId;
    	      this.operationType = defaults.operationType;
    	      this.progress = defaults.progress;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.targetId = defaults.targetId;
    	      this.targetLink = defaults.targetLink;
    	      this.user = defaults.user;
    	      this.warnings = defaults.warnings;
    	      this.zone = defaults.zone;
        }

        public Builder clientOperationId(String clientOperationId) {
            this.clientOperationId = Objects.requireNonNull(clientOperationId);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder error(OperationErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder httpErrorMessage(String httpErrorMessage) {
            this.httpErrorMessage = Objects.requireNonNull(httpErrorMessage);
            return this;
        }

        public Builder httpErrorStatusCode(Integer httpErrorStatusCode) {
            this.httpErrorStatusCode = Objects.requireNonNull(httpErrorStatusCode);
            return this;
        }

        public Builder insertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder operationGroupId(String operationGroupId) {
            this.operationGroupId = Objects.requireNonNull(operationGroupId);
            return this;
        }

        public Builder operationType(String operationType) {
            this.operationType = Objects.requireNonNull(operationType);
            return this;
        }

        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder statusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public Builder targetLink(String targetLink) {
            this.targetLink = Objects.requireNonNull(targetLink);
            return this;
        }

        public Builder user(String user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder warnings(List<OperationWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public OperationResponse build() {
            return new OperationResponse(clientOperationId, description, endTime, error, httpErrorMessage, httpErrorStatusCode, insertTime, kind, name, operationGroupId, operationType, progress, region, selfLink, startTime, status, statusMessage, targetId, targetLink, user, warnings, zone);
        }
    }
}
