// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NetworkManagerDeploymentStatusResponse {
    /**
     * Commit Time.
     * 
     */
    private final @Nullable String commitTime;
    /**
     * List of configuration ids.
     * 
     */
    private final @Nullable List<String> configurationIds;
    /**
     * Deployment Status.
     * 
     */
    private final @Nullable String deploymentStatus;
    /**
     * Configuration Deployment Type.
     * 
     */
    private final @Nullable String deploymentType;
    /**
     * Error Message.
     * 
     */
    private final @Nullable String errorMessage;
    /**
     * Region Name.
     * 
     */
    private final @Nullable String region;

    @OutputCustomType.Constructor({"commitTime","configurationIds","deploymentStatus","deploymentType","errorMessage","region"})
    private NetworkManagerDeploymentStatusResponse(
        @Nullable String commitTime,
        @Nullable List<String> configurationIds,
        @Nullable String deploymentStatus,
        @Nullable String deploymentType,
        @Nullable String errorMessage,
        @Nullable String region) {
        this.commitTime = commitTime;
        this.configurationIds = configurationIds;
        this.deploymentStatus = deploymentStatus;
        this.deploymentType = deploymentType;
        this.errorMessage = errorMessage;
        this.region = region;
    }

    /**
     * Commit Time.
     * 
     */
    public Optional<String> getCommitTime() {
        return Optional.ofNullable(this.commitTime);
    }
    /**
     * List of configuration ids.
     * 
     */
    public List<String> getConfigurationIds() {
        return this.configurationIds == null ? List.of() : this.configurationIds;
    }
    /**
     * Deployment Status.
     * 
     */
    public Optional<String> getDeploymentStatus() {
        return Optional.ofNullable(this.deploymentStatus);
    }
    /**
     * Configuration Deployment Type.
     * 
     */
    public Optional<String> getDeploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }
    /**
     * Error Message.
     * 
     */
    public Optional<String> getErrorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    /**
     * Region Name.
     * 
     */
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkManagerDeploymentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commitTime;
        private @Nullable List<String> configurationIds;
        private @Nullable String deploymentStatus;
        private @Nullable String deploymentType;
        private @Nullable String errorMessage;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkManagerDeploymentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitTime = defaults.commitTime;
    	      this.configurationIds = defaults.configurationIds;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.deploymentType = defaults.deploymentType;
    	      this.errorMessage = defaults.errorMessage;
    	      this.region = defaults.region;
        }

        public Builder setCommitTime(@Nullable String commitTime) {
            this.commitTime = commitTime;
            return this;
        }

        public Builder setConfigurationIds(@Nullable List<String> configurationIds) {
            this.configurationIds = configurationIds;
            return this;
        }

        public Builder setDeploymentStatus(@Nullable String deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        public Builder setDeploymentType(@Nullable String deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }
        public NetworkManagerDeploymentStatusResponse build() {
            return new NetworkManagerDeploymentStatusResponse(commitTime, configurationIds, deploymentStatus, deploymentType, errorMessage, region);
        }
    }
}
