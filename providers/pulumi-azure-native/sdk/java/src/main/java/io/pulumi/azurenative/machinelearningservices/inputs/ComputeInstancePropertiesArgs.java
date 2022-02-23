// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.ApplicationSharingPolicy;
import io.pulumi.azurenative.machinelearningservices.enums.ComputeInstanceAuthorizationType;
import io.pulumi.azurenative.machinelearningservices.inputs.ComputeInstanceSshSettingsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.PersonalComputeInstanceSettingsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ResourceIdArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.SetupScriptsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Compute Instance properties
 * 
 */
public final class ComputeInstancePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeInstancePropertiesArgs Empty = new ComputeInstancePropertiesArgs();

    /**
     * Policy for sharing applications on this compute instance among users of parent workspace. If Personal, only the creator can access applications on this compute instance. When Shared, any workspace user can access applications on this instance depending on his/her assigned role.
     * 
     */
    @InputImport(name="applicationSharingPolicy")
        private final @Nullable Input<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy;

    public Input<Either<String,ApplicationSharingPolicy>> getApplicationSharingPolicy() {
        return this.applicationSharingPolicy == null ? Input.empty() : this.applicationSharingPolicy;
    }

    /**
     * The Compute Instance Authorization type. Available values are personal (default).
     * 
     */
    @InputImport(name="computeInstanceAuthorizationType")
        private final @Nullable Input<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType;

    public Input<Either<String,ComputeInstanceAuthorizationType>> getComputeInstanceAuthorizationType() {
        return this.computeInstanceAuthorizationType == null ? Input.empty() : this.computeInstanceAuthorizationType;
    }

    /**
     * Settings for a personal compute instance.
     * 
     */
    @InputImport(name="personalComputeInstanceSettings")
        private final @Nullable Input<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings;

    public Input<PersonalComputeInstanceSettingsArgs> getPersonalComputeInstanceSettings() {
        return this.personalComputeInstanceSettings == null ? Input.empty() : this.personalComputeInstanceSettings;
    }

    /**
     * Details of customized scripts to execute for setting up the cluster.
     * 
     */
    @InputImport(name="setupScripts")
        private final @Nullable Input<SetupScriptsArgs> setupScripts;

    public Input<SetupScriptsArgs> getSetupScripts() {
        return this.setupScripts == null ? Input.empty() : this.setupScripts;
    }

    /**
     * Specifies policy and settings for SSH access.
     * 
     */
    @InputImport(name="sshSettings")
        private final @Nullable Input<ComputeInstanceSshSettingsArgs> sshSettings;

    public Input<ComputeInstanceSshSettingsArgs> getSshSettings() {
        return this.sshSettings == null ? Input.empty() : this.sshSettings;
    }

    /**
     * Virtual network subnet resource ID the compute nodes belong to.
     * 
     */
    @InputImport(name="subnet")
        private final @Nullable Input<ResourceIdArgs> subnet;

    public Input<ResourceIdArgs> getSubnet() {
        return this.subnet == null ? Input.empty() : this.subnet;
    }

    /**
     * Virtual Machine Size
     * 
     */
    @InputImport(name="vmSize")
        private final @Nullable Input<String> vmSize;

    public Input<String> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    public ComputeInstancePropertiesArgs(
        @Nullable Input<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy,
        @Nullable Input<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType,
        @Nullable Input<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings,
        @Nullable Input<SetupScriptsArgs> setupScripts,
        @Nullable Input<ComputeInstanceSshSettingsArgs> sshSettings,
        @Nullable Input<ResourceIdArgs> subnet,
        @Nullable Input<String> vmSize) {
        this.applicationSharingPolicy = applicationSharingPolicy == null ? Input.ofLeft("Shared") : applicationSharingPolicy;
        this.computeInstanceAuthorizationType = computeInstanceAuthorizationType == null ? Input.ofLeft("personal") : computeInstanceAuthorizationType;
        this.personalComputeInstanceSettings = personalComputeInstanceSettings;
        this.setupScripts = setupScripts;
        this.sshSettings = sshSettings;
        this.subnet = subnet;
        this.vmSize = vmSize;
    }

    private ComputeInstancePropertiesArgs() {
        this.applicationSharingPolicy = Input.empty();
        this.computeInstanceAuthorizationType = Input.empty();
        this.personalComputeInstanceSettings = Input.empty();
        this.setupScripts = Input.empty();
        this.sshSettings = Input.empty();
        this.subnet = Input.empty();
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy;
        private @Nullable Input<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType;
        private @Nullable Input<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings;
        private @Nullable Input<SetupScriptsArgs> setupScripts;
        private @Nullable Input<ComputeInstanceSshSettingsArgs> sshSettings;
        private @Nullable Input<ResourceIdArgs> subnet;
        private @Nullable Input<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstancePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationSharingPolicy = defaults.applicationSharingPolicy;
    	      this.computeInstanceAuthorizationType = defaults.computeInstanceAuthorizationType;
    	      this.personalComputeInstanceSettings = defaults.personalComputeInstanceSettings;
    	      this.setupScripts = defaults.setupScripts;
    	      this.sshSettings = defaults.sshSettings;
    	      this.subnet = defaults.subnet;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setApplicationSharingPolicy(@Nullable Input<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy) {
            this.applicationSharingPolicy = applicationSharingPolicy;
            return this;
        }

        public Builder setApplicationSharingPolicy(@Nullable Either<String,ApplicationSharingPolicy> applicationSharingPolicy) {
            this.applicationSharingPolicy = Input.ofNullable(applicationSharingPolicy);
            return this;
        }

        public Builder setComputeInstanceAuthorizationType(@Nullable Input<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType) {
            this.computeInstanceAuthorizationType = computeInstanceAuthorizationType;
            return this;
        }

        public Builder setComputeInstanceAuthorizationType(@Nullable Either<String,ComputeInstanceAuthorizationType> computeInstanceAuthorizationType) {
            this.computeInstanceAuthorizationType = Input.ofNullable(computeInstanceAuthorizationType);
            return this;
        }

        public Builder setPersonalComputeInstanceSettings(@Nullable Input<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings) {
            this.personalComputeInstanceSettings = personalComputeInstanceSettings;
            return this;
        }

        public Builder setPersonalComputeInstanceSettings(@Nullable PersonalComputeInstanceSettingsArgs personalComputeInstanceSettings) {
            this.personalComputeInstanceSettings = Input.ofNullable(personalComputeInstanceSettings);
            return this;
        }

        public Builder setSetupScripts(@Nullable Input<SetupScriptsArgs> setupScripts) {
            this.setupScripts = setupScripts;
            return this;
        }

        public Builder setSetupScripts(@Nullable SetupScriptsArgs setupScripts) {
            this.setupScripts = Input.ofNullable(setupScripts);
            return this;
        }

        public Builder setSshSettings(@Nullable Input<ComputeInstanceSshSettingsArgs> sshSettings) {
            this.sshSettings = sshSettings;
            return this;
        }

        public Builder setSshSettings(@Nullable ComputeInstanceSshSettingsArgs sshSettings) {
            this.sshSettings = Input.ofNullable(sshSettings);
            return this;
        }

        public Builder setSubnet(@Nullable Input<ResourceIdArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setSubnet(@Nullable ResourceIdArgs subnet) {
            this.subnet = Input.ofNullable(subnet);
            return this;
        }

        public Builder setVmSize(@Nullable Input<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = Input.ofNullable(vmSize);
            return this;
        }
        public ComputeInstancePropertiesArgs build() {
            return new ComputeInstancePropertiesArgs(applicationSharingPolicy, computeInstanceAuthorizationType, personalComputeInstanceSettings, setupScripts, sshSettings, subnet, vmSize);
        }
    }
}
