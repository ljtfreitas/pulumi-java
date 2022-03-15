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
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="applicationSharingPolicy")
      private final @Nullable Output<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy;

    public Output<Either<String,ApplicationSharingPolicy>> getApplicationSharingPolicy() {
        return this.applicationSharingPolicy == null ? Output.empty() : this.applicationSharingPolicy;
    }

    /**
     * The Compute Instance Authorization type. Available values are personal (default).
     * 
     */
    @Import(name="computeInstanceAuthorizationType")
      private final @Nullable Output<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType;

    public Output<Either<String,ComputeInstanceAuthorizationType>> getComputeInstanceAuthorizationType() {
        return this.computeInstanceAuthorizationType == null ? Output.empty() : this.computeInstanceAuthorizationType;
    }

    /**
     * Settings for a personal compute instance.
     * 
     */
    @Import(name="personalComputeInstanceSettings")
      private final @Nullable Output<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings;

    public Output<PersonalComputeInstanceSettingsArgs> getPersonalComputeInstanceSettings() {
        return this.personalComputeInstanceSettings == null ? Output.empty() : this.personalComputeInstanceSettings;
    }

    /**
     * Details of customized scripts to execute for setting up the cluster.
     * 
     */
    @Import(name="setupScripts")
      private final @Nullable Output<SetupScriptsArgs> setupScripts;

    public Output<SetupScriptsArgs> getSetupScripts() {
        return this.setupScripts == null ? Output.empty() : this.setupScripts;
    }

    /**
     * Specifies policy and settings for SSH access.
     * 
     */
    @Import(name="sshSettings")
      private final @Nullable Output<ComputeInstanceSshSettingsArgs> sshSettings;

    public Output<ComputeInstanceSshSettingsArgs> getSshSettings() {
        return this.sshSettings == null ? Output.empty() : this.sshSettings;
    }

    /**
     * Virtual network subnet resource ID the compute nodes belong to.
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<ResourceIdArgs> subnet;

    public Output<ResourceIdArgs> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    /**
     * Virtual Machine Size
     * 
     */
    @Import(name="vmSize")
      private final @Nullable Output<String> vmSize;

    public Output<String> getVmSize() {
        return this.vmSize == null ? Output.empty() : this.vmSize;
    }

    public ComputeInstancePropertiesArgs(
        @Nullable Output<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy,
        @Nullable Output<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType,
        @Nullable Output<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings,
        @Nullable Output<SetupScriptsArgs> setupScripts,
        @Nullable Output<ComputeInstanceSshSettingsArgs> sshSettings,
        @Nullable Output<ResourceIdArgs> subnet,
        @Nullable Output<String> vmSize) {
        this.applicationSharingPolicy = applicationSharingPolicy == null ? Output.ofLeft("Shared") : applicationSharingPolicy;
        this.computeInstanceAuthorizationType = computeInstanceAuthorizationType == null ? Output.ofLeft("personal") : computeInstanceAuthorizationType;
        this.personalComputeInstanceSettings = personalComputeInstanceSettings;
        this.setupScripts = setupScripts;
        this.sshSettings = sshSettings;
        this.subnet = subnet;
        this.vmSize = vmSize;
    }

    private ComputeInstancePropertiesArgs() {
        this.applicationSharingPolicy = Output.empty();
        this.computeInstanceAuthorizationType = Output.empty();
        this.personalComputeInstanceSettings = Output.empty();
        this.setupScripts = Output.empty();
        this.sshSettings = Output.empty();
        this.subnet = Output.empty();
        this.vmSize = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstancePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy;
        private @Nullable Output<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType;
        private @Nullable Output<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings;
        private @Nullable Output<SetupScriptsArgs> setupScripts;
        private @Nullable Output<ComputeInstanceSshSettingsArgs> sshSettings;
        private @Nullable Output<ResourceIdArgs> subnet;
        private @Nullable Output<String> vmSize;

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

        public Builder applicationSharingPolicy(@Nullable Output<Either<String,ApplicationSharingPolicy>> applicationSharingPolicy) {
            this.applicationSharingPolicy = applicationSharingPolicy;
            return this;
        }

        public Builder applicationSharingPolicy(@Nullable Either<String,ApplicationSharingPolicy> applicationSharingPolicy) {
            this.applicationSharingPolicy = Output.ofNullable(applicationSharingPolicy);
            return this;
        }

        public Builder computeInstanceAuthorizationType(@Nullable Output<Either<String,ComputeInstanceAuthorizationType>> computeInstanceAuthorizationType) {
            this.computeInstanceAuthorizationType = computeInstanceAuthorizationType;
            return this;
        }

        public Builder computeInstanceAuthorizationType(@Nullable Either<String,ComputeInstanceAuthorizationType> computeInstanceAuthorizationType) {
            this.computeInstanceAuthorizationType = Output.ofNullable(computeInstanceAuthorizationType);
            return this;
        }

        public Builder personalComputeInstanceSettings(@Nullable Output<PersonalComputeInstanceSettingsArgs> personalComputeInstanceSettings) {
            this.personalComputeInstanceSettings = personalComputeInstanceSettings;
            return this;
        }

        public Builder personalComputeInstanceSettings(@Nullable PersonalComputeInstanceSettingsArgs personalComputeInstanceSettings) {
            this.personalComputeInstanceSettings = Output.ofNullable(personalComputeInstanceSettings);
            return this;
        }

        public Builder setupScripts(@Nullable Output<SetupScriptsArgs> setupScripts) {
            this.setupScripts = setupScripts;
            return this;
        }

        public Builder setupScripts(@Nullable SetupScriptsArgs setupScripts) {
            this.setupScripts = Output.ofNullable(setupScripts);
            return this;
        }

        public Builder sshSettings(@Nullable Output<ComputeInstanceSshSettingsArgs> sshSettings) {
            this.sshSettings = sshSettings;
            return this;
        }

        public Builder sshSettings(@Nullable ComputeInstanceSshSettingsArgs sshSettings) {
            this.sshSettings = Output.ofNullable(sshSettings);
            return this;
        }

        public Builder subnet(@Nullable Output<ResourceIdArgs> subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder subnet(@Nullable ResourceIdArgs subnet) {
            this.subnet = Output.ofNullable(subnet);
            return this;
        }

        public Builder vmSize(@Nullable Output<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = Output.ofNullable(vmSize);
            return this;
        }
        public ComputeInstancePropertiesArgs build() {
            return new ComputeInstancePropertiesArgs(applicationSharingPolicy, computeInstanceAuthorizationType, personalComputeInstanceSettings, setupScripts, sshSettings, subnet, vmSize);
        }
    }
}
