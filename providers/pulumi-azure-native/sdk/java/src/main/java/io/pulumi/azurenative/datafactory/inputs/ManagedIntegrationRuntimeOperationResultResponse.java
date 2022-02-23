// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Properties of managed integration runtime operation result.
 * 
 */
public final class ManagedIntegrationRuntimeOperationResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedIntegrationRuntimeOperationResultResponse Empty = new ManagedIntegrationRuntimeOperationResultResponse();

    /**
     * The activity id for the operation request.
     * 
     */
    @InputImport(name="activityId", required=true)
        private final String activityId;

    public String getActivityId() {
        return this.activityId;
    }

    /**
     * The error code.
     * 
     */
    @InputImport(name="errorCode", required=true)
        private final String errorCode;

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Managed integration runtime error parameters.
     * 
     */
    @InputImport(name="parameters", required=true)
        private final List<String> parameters;

    public List<String> getParameters() {
        return this.parameters;
    }

    /**
     * The operation result.
     * 
     */
    @InputImport(name="result", required=true)
        private final String result;

    public String getResult() {
        return this.result;
    }

    /**
     * The start time of the operation.
     * 
     */
    @InputImport(name="startTime", required=true)
        private final String startTime;

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The operation type. Could be start or stop.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public ManagedIntegrationRuntimeOperationResultResponse(
        String activityId,
        String errorCode,
        List<String> parameters,
        String result,
        String startTime,
        String type) {
        this.activityId = Objects.requireNonNull(activityId, "expected parameter 'activityId' to be non-null");
        this.errorCode = Objects.requireNonNull(errorCode, "expected parameter 'errorCode' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.result = Objects.requireNonNull(result, "expected parameter 'result' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedIntegrationRuntimeOperationResultResponse() {
        this.activityId = null;
        this.errorCode = null;
        this.parameters = List.of();
        this.result = null;
        this.startTime = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeOperationResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String activityId;
        private String errorCode;
        private List<String> parameters;
        private String result;
        private String startTime;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeOperationResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activityId = defaults.activityId;
    	      this.errorCode = defaults.errorCode;
    	      this.parameters = defaults.parameters;
    	      this.result = defaults.result;
    	      this.startTime = defaults.startTime;
    	      this.type = defaults.type;
        }

        public Builder setActivityId(String activityId) {
            this.activityId = Objects.requireNonNull(activityId);
            return this;
        }

        public Builder setErrorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }

        public Builder setParameters(List<String> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedIntegrationRuntimeOperationResultResponse build() {
            return new ManagedIntegrationRuntimeOperationResultResponse(activityId, errorCode, parameters, result, startTime, type);
        }
    }
}
