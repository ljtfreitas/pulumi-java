// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.MachineLearningServiceErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A DataFactory compute.
 * 
 */
public final class DataFactoryResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataFactoryResponse Empty = new DataFactoryResponse();

    /**
     * Location for the underlying compute
     * 
     */
    @InputImport(name="computeLocation")
        private final @Nullable String computeLocation;

    public Optional<String> getComputeLocation() {
        return this.computeLocation == null ? Optional.empty() : Optional.ofNullable(this.computeLocation);
    }

    /**
     * The type of compute
     * Expected value is 'DataFactory'.
     * 
     */
    @InputImport(name="computeType", required=true)
        private final String computeType;

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
     */
    @InputImport(name="isAttachedCompute", required=true)
        private final Boolean isAttachedCompute;

    public Boolean getIsAttachedCompute() {
        return this.isAttachedCompute;
    }

    /**
     * Errors during provisioning
     * 
     */
    @InputImport(name="provisioningErrors", required=true)
        private final List<MachineLearningServiceErrorResponse> provisioningErrors;

    public List<MachineLearningServiceErrorResponse> getProvisioningErrors() {
        return this.provisioningErrors;
    }

    /**
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public DataFactoryResponse(
        @Nullable String computeLocation,
        String computeType,
        @Nullable String description,
        Boolean isAttachedCompute,
        List<MachineLearningServiceErrorResponse> provisioningErrors,
        String provisioningState,
        @Nullable String resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType, "expected parameter 'computeType' to be non-null");
        this.description = description;
        this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute, "expected parameter 'isAttachedCompute' to be non-null");
        this.provisioningErrors = Objects.requireNonNull(provisioningErrors, "expected parameter 'provisioningErrors' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceId = resourceId;
    }

    private DataFactoryResponse() {
        this.computeLocation = null;
        this.computeType = null;
        this.description = null;
        this.isAttachedCompute = null;
        this.provisioningErrors = List.of();
        this.provisioningState = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFactoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeLocation;
        private String computeType;
        private @Nullable String description;
        private Boolean isAttachedCompute;
        private List<MachineLearningServiceErrorResponse> provisioningErrors;
        private String provisioningState;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFactoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.isAttachedCompute = defaults.isAttachedCompute;
    	      this.provisioningErrors = defaults.provisioningErrors;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setComputeLocation(@Nullable String computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }

        public Builder setComputeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIsAttachedCompute(Boolean isAttachedCompute) {
            this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute);
            return this;
        }

        public Builder setProvisioningErrors(List<MachineLearningServiceErrorResponse> provisioningErrors) {
            this.provisioningErrors = Objects.requireNonNull(provisioningErrors);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public DataFactoryResponse build() {
            return new DataFactoryResponse(computeLocation, computeType, description, isAttachedCompute, provisioningErrors, provisioningState, resourceId);
        }
    }
}
