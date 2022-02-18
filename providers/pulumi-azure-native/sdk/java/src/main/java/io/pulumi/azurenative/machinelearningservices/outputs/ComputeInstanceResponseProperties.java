// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceApplicationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceConnectivityEndpointsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceCreatedByResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceLastOperationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ComputeInstanceSshSettingsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.MachineLearningServiceErrorResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.PersonalComputeInstanceSettingsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ResourceIdResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.SetupScriptsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeInstanceResponseProperties {
    /**
     * Policy for sharing applications on this compute instance among users of parent workspace. If Personal, only the creator can access applications on this compute instance. When Shared, any workspace user can access applications on this instance depending on his/her assigned role.
     * 
     */
    private final @Nullable String applicationSharingPolicy;
    /**
     * Describes available applications and their endpoints on this ComputeInstance.
     * 
     */
    private final List<ComputeInstanceApplicationResponse> applications;
    /**
     * The Compute Instance Authorization type. Available values are personal (default).
     * 
     */
    private final @Nullable String computeInstanceAuthorizationType;
    /**
     * Describes all connectivity endpoints available for this ComputeInstance.
     * 
     */
    private final ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints;
    /**
     * Describes information on user who created this ComputeInstance.
     * 
     */
    private final ComputeInstanceCreatedByResponse createdBy;
    /**
     * Collection of errors encountered on this ComputeInstance.
     * 
     */
    private final List<MachineLearningServiceErrorResponse> errors;
    /**
     * The last operation on ComputeInstance.
     * 
     */
    private final ComputeInstanceLastOperationResponse lastOperation;
    /**
     * Settings for a personal compute instance.
     * 
     */
    private final @Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings;
    /**
     * Details of customized scripts to execute for setting up the cluster.
     * 
     */
    private final @Nullable SetupScriptsResponse setupScripts;
    /**
     * Specifies policy and settings for SSH access.
     * 
     */
    private final @Nullable ComputeInstanceSshSettingsResponse sshSettings;
    /**
     * The current state of this ComputeInstance.
     * 
     */
    private final String state;
    /**
     * Virtual network subnet resource ID the compute nodes belong to.
     * 
     */
    private final @Nullable ResourceIdResponse subnet;
    /**
     * Virtual Machine Size
     * 
     */
    private final @Nullable String vmSize;

    @OutputCustomType.Constructor({"applicationSharingPolicy","applications","computeInstanceAuthorizationType","connectivityEndpoints","createdBy","errors","lastOperation","personalComputeInstanceSettings","setupScripts","sshSettings","state","subnet","vmSize"})
    private ComputeInstanceResponseProperties(
        @Nullable String applicationSharingPolicy,
        List<ComputeInstanceApplicationResponse> applications,
        @Nullable String computeInstanceAuthorizationType,
        ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints,
        ComputeInstanceCreatedByResponse createdBy,
        List<MachineLearningServiceErrorResponse> errors,
        ComputeInstanceLastOperationResponse lastOperation,
        @Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings,
        @Nullable SetupScriptsResponse setupScripts,
        @Nullable ComputeInstanceSshSettingsResponse sshSettings,
        String state,
        @Nullable ResourceIdResponse subnet,
        @Nullable String vmSize) {
        this.applicationSharingPolicy = applicationSharingPolicy;
        this.applications = Objects.requireNonNull(applications);
        this.computeInstanceAuthorizationType = computeInstanceAuthorizationType;
        this.connectivityEndpoints = Objects.requireNonNull(connectivityEndpoints);
        this.createdBy = Objects.requireNonNull(createdBy);
        this.errors = Objects.requireNonNull(errors);
        this.lastOperation = Objects.requireNonNull(lastOperation);
        this.personalComputeInstanceSettings = personalComputeInstanceSettings;
        this.setupScripts = setupScripts;
        this.sshSettings = sshSettings;
        this.state = Objects.requireNonNull(state);
        this.subnet = subnet;
        this.vmSize = vmSize;
    }

    /**
     * Policy for sharing applications on this compute instance among users of parent workspace. If Personal, only the creator can access applications on this compute instance. When Shared, any workspace user can access applications on this instance depending on his/her assigned role.
     * 
     */
    public Optional<String> getApplicationSharingPolicy() {
        return Optional.ofNullable(this.applicationSharingPolicy);
    }
    /**
     * Describes available applications and their endpoints on this ComputeInstance.
     * 
     */
    public List<ComputeInstanceApplicationResponse> getApplications() {
        return this.applications;
    }
    /**
     * The Compute Instance Authorization type. Available values are personal (default).
     * 
     */
    public Optional<String> getComputeInstanceAuthorizationType() {
        return Optional.ofNullable(this.computeInstanceAuthorizationType);
    }
    /**
     * Describes all connectivity endpoints available for this ComputeInstance.
     * 
     */
    public ComputeInstanceConnectivityEndpointsResponse getConnectivityEndpoints() {
        return this.connectivityEndpoints;
    }
    /**
     * Describes information on user who created this ComputeInstance.
     * 
     */
    public ComputeInstanceCreatedByResponse getCreatedBy() {
        return this.createdBy;
    }
    /**
     * Collection of errors encountered on this ComputeInstance.
     * 
     */
    public List<MachineLearningServiceErrorResponse> getErrors() {
        return this.errors;
    }
    /**
     * The last operation on ComputeInstance.
     * 
     */
    public ComputeInstanceLastOperationResponse getLastOperation() {
        return this.lastOperation;
    }
    /**
     * Settings for a personal compute instance.
     * 
     */
    public Optional<PersonalComputeInstanceSettingsResponse> getPersonalComputeInstanceSettings() {
        return Optional.ofNullable(this.personalComputeInstanceSettings);
    }
    /**
     * Details of customized scripts to execute for setting up the cluster.
     * 
     */
    public Optional<SetupScriptsResponse> getSetupScripts() {
        return Optional.ofNullable(this.setupScripts);
    }
    /**
     * Specifies policy and settings for SSH access.
     * 
     */
    public Optional<ComputeInstanceSshSettingsResponse> getSshSettings() {
        return Optional.ofNullable(this.sshSettings);
    }
    /**
     * The current state of this ComputeInstance.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Virtual network subnet resource ID the compute nodes belong to.
     * 
     */
    public Optional<ResourceIdResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * Virtual Machine Size
     * 
     */
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applicationSharingPolicy;
        private List<ComputeInstanceApplicationResponse> applications;
        private @Nullable String computeInstanceAuthorizationType;
        private ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints;
        private ComputeInstanceCreatedByResponse createdBy;
        private List<MachineLearningServiceErrorResponse> errors;
        private ComputeInstanceLastOperationResponse lastOperation;
        private @Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings;
        private @Nullable SetupScriptsResponse setupScripts;
        private @Nullable ComputeInstanceSshSettingsResponse sshSettings;
        private String state;
        private @Nullable ResourceIdResponse subnet;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationSharingPolicy = defaults.applicationSharingPolicy;
    	      this.applications = defaults.applications;
    	      this.computeInstanceAuthorizationType = defaults.computeInstanceAuthorizationType;
    	      this.connectivityEndpoints = defaults.connectivityEndpoints;
    	      this.createdBy = defaults.createdBy;
    	      this.errors = defaults.errors;
    	      this.lastOperation = defaults.lastOperation;
    	      this.personalComputeInstanceSettings = defaults.personalComputeInstanceSettings;
    	      this.setupScripts = defaults.setupScripts;
    	      this.sshSettings = defaults.sshSettings;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setApplicationSharingPolicy(@Nullable String applicationSharingPolicy) {
            this.applicationSharingPolicy = applicationSharingPolicy;
            return this;
        }

        public Builder setApplications(List<ComputeInstanceApplicationResponse> applications) {
            this.applications = Objects.requireNonNull(applications);
            return this;
        }

        public Builder setComputeInstanceAuthorizationType(@Nullable String computeInstanceAuthorizationType) {
            this.computeInstanceAuthorizationType = computeInstanceAuthorizationType;
            return this;
        }

        public Builder setConnectivityEndpoints(ComputeInstanceConnectivityEndpointsResponse connectivityEndpoints) {
            this.connectivityEndpoints = Objects.requireNonNull(connectivityEndpoints);
            return this;
        }

        public Builder setCreatedBy(ComputeInstanceCreatedByResponse createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder setErrors(List<MachineLearningServiceErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setLastOperation(ComputeInstanceLastOperationResponse lastOperation) {
            this.lastOperation = Objects.requireNonNull(lastOperation);
            return this;
        }

        public Builder setPersonalComputeInstanceSettings(@Nullable PersonalComputeInstanceSettingsResponse personalComputeInstanceSettings) {
            this.personalComputeInstanceSettings = personalComputeInstanceSettings;
            return this;
        }

        public Builder setSetupScripts(@Nullable SetupScriptsResponse setupScripts) {
            this.setupScripts = setupScripts;
            return this;
        }

        public Builder setSshSettings(@Nullable ComputeInstanceSshSettingsResponse sshSettings) {
            this.sshSettings = sshSettings;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setSubnet(@Nullable ResourceIdResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public ComputeInstanceResponseProperties build() {
            return new ComputeInstanceResponseProperties(applicationSharingPolicy, applications, computeInstanceAuthorizationType, connectivityEndpoints, createdBy, errors, lastOperation, personalComputeInstanceSettings, setupScripts, sshSettings, state, subnet, vmSize);
        }
    }
}
