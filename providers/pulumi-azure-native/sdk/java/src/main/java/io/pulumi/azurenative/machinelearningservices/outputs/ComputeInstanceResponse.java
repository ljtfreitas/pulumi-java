// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceResponseProperties;
import io.pulumi.azurenative.machinelearningservices.outputs.MachineLearningServiceErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeInstanceResponse {
    /**
     * Location for the underlying compute
     * 
     */
    private final @Nullable String computeLocation;
    /**
     * The type of compute
     * Expected value is 'ComputeInstance'.
     * 
     */
    private final String computeType;
    /**
     * The description of the Machine Learning compute.
     * 
     */
    private final @Nullable String description;
    /**
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
     */
    private final Boolean isAttachedCompute;
    /**
     * Compute Instance properties
     * 
     */
    private final @Nullable ComputeInstanceResponseProperties properties;
    /**
     * Errors during provisioning
     * 
     */
    private final List<MachineLearningServiceErrorResponse> provisioningErrors;
    /**
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * ARM resource id of the underlying compute
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private ComputeInstanceResponse(
        @CustomType.Parameter("computeLocation") @Nullable String computeLocation,
        @CustomType.Parameter("computeType") String computeType,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("isAttachedCompute") Boolean isAttachedCompute,
        @CustomType.Parameter("properties") @Nullable ComputeInstanceResponseProperties properties,
        @CustomType.Parameter("provisioningErrors") List<MachineLearningServiceErrorResponse> provisioningErrors,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = computeType;
        this.description = description;
        this.isAttachedCompute = isAttachedCompute;
        this.properties = properties;
        this.provisioningErrors = provisioningErrors;
        this.provisioningState = provisioningState;
        this.resourceId = resourceId;
    }

    /**
     * Location for the underlying compute
     * 
    */
    public Optional<String> getComputeLocation() {
        return Optional.ofNullable(this.computeLocation);
    }
    /**
     * The type of compute
     * Expected value is 'ComputeInstance'.
     * 
    */
    public String getComputeType() {
        return this.computeType;
    }
    /**
     * The description of the Machine Learning compute.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Indicating whether the compute was provisioned by user and brought from outside if true, or machine learning service provisioned it if false.
     * 
    */
    public Boolean getIsAttachedCompute() {
        return this.isAttachedCompute;
    }
    /**
     * Compute Instance properties
     * 
    */
    public Optional<ComputeInstanceResponseProperties> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Errors during provisioning
     * 
    */
    public List<MachineLearningServiceErrorResponse> getProvisioningErrors() {
        return this.provisioningErrors;
    }
    /**
     * The provision state of the cluster. Valid values are Unknown, Updating, Provisioning, Succeeded, and Failed.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * ARM resource id of the underlying compute
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeLocation;
        private String computeType;
        private @Nullable String description;
        private Boolean isAttachedCompute;
        private @Nullable ComputeInstanceResponseProperties properties;
        private List<MachineLearningServiceErrorResponse> provisioningErrors;
        private String provisioningState;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.isAttachedCompute = defaults.isAttachedCompute;
    	      this.properties = defaults.properties;
    	      this.provisioningErrors = defaults.provisioningErrors;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder computeLocation(@Nullable String computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }

        public Builder computeType(String computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder isAttachedCompute(Boolean isAttachedCompute) {
            this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute);
            return this;
        }

        public Builder properties(@Nullable ComputeInstanceResponseProperties properties) {
            this.properties = properties;
            return this;
        }

        public Builder provisioningErrors(List<MachineLearningServiceErrorResponse> provisioningErrors) {
            this.provisioningErrors = Objects.requireNonNull(provisioningErrors);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public ComputeInstanceResponse build() {
            return new ComputeInstanceResponse(computeLocation, computeType, description, isAttachedCompute, properties, provisioningErrors, provisioningState, resourceId);
        }
    }
}
