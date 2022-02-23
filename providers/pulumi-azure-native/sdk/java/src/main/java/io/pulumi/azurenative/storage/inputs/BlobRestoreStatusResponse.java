// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.BlobRestoreParametersResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Blob restore status.
 * 
 */
public final class BlobRestoreStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobRestoreStatusResponse Empty = new BlobRestoreStatusResponse();

    /**
     * Failure reason when blob restore is failed.
     * 
     */
    @InputImport(name="failureReason", required=true)
        private final String failureReason;

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * Blob restore request parameters.
     * 
     */
    @InputImport(name="parameters", required=true)
        private final BlobRestoreParametersResponse parameters;

    public BlobRestoreParametersResponse getParameters() {
        return this.parameters;
    }

    /**
     * Id for tracking blob restore request.
     * 
     */
    @InputImport(name="restoreId", required=true)
        private final String restoreId;

    public String getRestoreId() {
        return this.restoreId;
    }

    /**
     * The status of blob restore progress. Possible values are: - InProgress: Indicates that blob restore is ongoing. - Complete: Indicates that blob restore has been completed successfully. - Failed: Indicates that blob restore is failed.
     * 
     */
    @InputImport(name="status", required=true)
        private final String status;

    public String getStatus() {
        return this.status;
    }

    public BlobRestoreStatusResponse(
        String failureReason,
        BlobRestoreParametersResponse parameters,
        String restoreId,
        String status) {
        this.failureReason = Objects.requireNonNull(failureReason, "expected parameter 'failureReason' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.restoreId = Objects.requireNonNull(restoreId, "expected parameter 'restoreId' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private BlobRestoreStatusResponse() {
        this.failureReason = null;
        this.parameters = null;
        this.restoreId = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobRestoreStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String failureReason;
        private BlobRestoreParametersResponse parameters;
        private String restoreId;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobRestoreStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureReason = defaults.failureReason;
    	      this.parameters = defaults.parameters;
    	      this.restoreId = defaults.restoreId;
    	      this.status = defaults.status;
        }

        public Builder setFailureReason(String failureReason) {
            this.failureReason = Objects.requireNonNull(failureReason);
            return this;
        }

        public Builder setParameters(BlobRestoreParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setRestoreId(String restoreId) {
            this.restoreId = Objects.requireNonNull(restoreId);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public BlobRestoreStatusResponse build() {
            return new BlobRestoreStatusResponse(failureReason, parameters, restoreId, status);
        }
    }
}
