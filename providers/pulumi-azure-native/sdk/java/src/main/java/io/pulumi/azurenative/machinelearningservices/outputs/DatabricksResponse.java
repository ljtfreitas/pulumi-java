// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.DatabricksResponseProperties;
import io.pulumi.azurenative.machinelearningservices.outputs.MachineLearningServiceErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabricksResponse {
    /**
     * Location for the underlying compute
     * 
     */
    private final @Nullable String computeLocation;
    /**
     * The type of compute
     * Expected value is 'Databricks'.
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
    private final @Nullable DatabricksResponseProperties properties;
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

    @OutputCustomType.Constructor({"computeLocation","computeType","description","isAttachedCompute","properties","provisioningErrors","provisioningState","resourceId"})
    private DatabricksResponse(
        @Nullable String computeLocation,
        String computeType,
        @Nullable String description,
        Boolean isAttachedCompute,
        @Nullable DatabricksResponseProperties properties,
        List<MachineLearningServiceErrorResponse> provisioningErrors,
        String provisioningState,
        @Nullable String resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Objects.requireNonNull(computeType);
        this.description = description;
        this.isAttachedCompute = Objects.requireNonNull(isAttachedCompute);
        this.properties = properties;
        this.provisioningErrors = Objects.requireNonNull(provisioningErrors);
        this.provisioningState = Objects.requireNonNull(provisioningState);
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
     * Expected value is 'Databricks'.
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
    public Optional<DatabricksResponseProperties> getProperties() {
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

    public static Builder builder(DatabricksResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String computeLocation;
        private String computeType;
        private @Nullable String description;
        private Boolean isAttachedCompute;
        private @Nullable DatabricksResponseProperties properties;
        private List<MachineLearningServiceErrorResponse> provisioningErrors;
        private String provisioningState;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabricksResponse defaults) {
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

        public Builder setProperties(@Nullable DatabricksResponseProperties properties) {
            this.properties = properties;
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
        public DatabricksResponse build() {
            return new DatabricksResponse(computeLocation, computeType, description, isAttachedCompute, properties, provisioningErrors, provisioningState, resourceId);
        }
    }
}
