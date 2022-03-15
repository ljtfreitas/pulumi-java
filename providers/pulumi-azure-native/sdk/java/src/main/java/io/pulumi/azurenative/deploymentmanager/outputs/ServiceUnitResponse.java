// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.RolloutStepResponse;
import io.pulumi.azurenative.deploymentmanager.outputs.ServiceUnitArtifactsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceUnitResponse {
    /**
     * The artifacts for the service unit.
     * 
     */
    private final @Nullable ServiceUnitArtifactsResponse artifacts;
    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * 
     */
    private final String deploymentMode;
    /**
     * Name of the service unit.
     * 
     */
    private final @Nullable String name;
    /**
     * Detailed step information, if present.
     * 
     */
    private final @Nullable List<RolloutStepResponse> steps;
    /**
     * The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
     */
    private final String targetResourceGroup;

    @CustomType.Constructor
    private ServiceUnitResponse(
        @CustomType.Parameter("artifacts") @Nullable ServiceUnitArtifactsResponse artifacts,
        @CustomType.Parameter("deploymentMode") String deploymentMode,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("steps") @Nullable List<RolloutStepResponse> steps,
        @CustomType.Parameter("targetResourceGroup") String targetResourceGroup) {
        this.artifacts = artifacts;
        this.deploymentMode = deploymentMode;
        this.name = name;
        this.steps = steps;
        this.targetResourceGroup = targetResourceGroup;
    }

    /**
     * The artifacts for the service unit.
     * 
    */
    public Optional<ServiceUnitArtifactsResponse> getArtifacts() {
        return Optional.ofNullable(this.artifacts);
    }
    /**
     * Describes the type of ARM deployment to be performed on the resource.
     * 
    */
    public String getDeploymentMode() {
        return this.deploymentMode;
    }
    /**
     * Name of the service unit.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Detailed step information, if present.
     * 
    */
    public List<RolloutStepResponse> getSteps() {
        return this.steps == null ? List.of() : this.steps;
    }
    /**
     * The Azure Resource Group to which the resources in the service unit belong to or should be deployed to.
     * 
    */
    public String getTargetResourceGroup() {
        return this.targetResourceGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUnitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceUnitArtifactsResponse artifacts;
        private String deploymentMode;
        private @Nullable String name;
        private @Nullable List<RolloutStepResponse> steps;
        private String targetResourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUnitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.name = defaults.name;
    	      this.steps = defaults.steps;
    	      this.targetResourceGroup = defaults.targetResourceGroup;
        }

        public Builder artifacts(@Nullable ServiceUnitArtifactsResponse artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        public Builder deploymentMode(String deploymentMode) {
            this.deploymentMode = Objects.requireNonNull(deploymentMode);
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder steps(@Nullable List<RolloutStepResponse> steps) {
            this.steps = steps;
            return this;
        }

        public Builder targetResourceGroup(String targetResourceGroup) {
            this.targetResourceGroup = Objects.requireNonNull(targetResourceGroup);
            return this;
        }
        public ServiceUnitResponse build() {
            return new ServiceUnitResponse(artifacts, deploymentMode, name, steps, targetResourceGroup);
        }
    }
}
