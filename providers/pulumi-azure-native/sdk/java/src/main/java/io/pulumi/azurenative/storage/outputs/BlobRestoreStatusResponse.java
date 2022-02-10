// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.BlobRestoreParametersResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BlobRestoreStatusResponse {
    private final String failureReason;
    private final BlobRestoreParametersResponse parameters;
    private final String restoreId;
    private final String status;

    @OutputCustomType.Constructor({"failureReason","parameters","restoreId","status"})
    private BlobRestoreStatusResponse(
        String failureReason,
        BlobRestoreParametersResponse parameters,
        String restoreId,
        String status) {
        this.failureReason = Objects.requireNonNull(failureReason);
        this.parameters = Objects.requireNonNull(parameters);
        this.restoreId = Objects.requireNonNull(restoreId);
        this.status = Objects.requireNonNull(status);
    }

    public String getFailureReason() {
        return this.failureReason;
    }
    public BlobRestoreParametersResponse getParameters() {
        return this.parameters;
    }
    public String getRestoreId() {
        return this.restoreId;
    }
    public String getStatus() {
        return this.status;
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