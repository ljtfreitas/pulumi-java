// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.enums.OsType;
import io.pulumi.azurenative.machinelearningservices.enums.RemoteLoginPortPublicAccess;
import io.pulumi.azurenative.machinelearningservices.enums.VmPriority;
import io.pulumi.azurenative.machinelearningservices.inputs.ResourceIdArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.ScaleSettingsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.UserAccountCredentialsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.VirtualMachineImageArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AML Compute properties
 * 
 */
public final class AmlComputePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AmlComputePropertiesArgs Empty = new AmlComputePropertiesArgs();

    /**
     * Enable or disable node public IP address provisioning. Possible values are: Possible values are: true - Indicates that the compute nodes will have public IPs provisioned. false - Indicates that the compute nodes will have a private endpoint and no public IPs.
     * 
     */
    @InputImport(name="enableNodePublicIp")
        private final @Nullable Input<Boolean> enableNodePublicIp;

    public Input<Boolean> getEnableNodePublicIp() {
        return this.enableNodePublicIp == null ? Input.empty() : this.enableNodePublicIp;
    }

    /**
     * Network is isolated or not
     * 
     */
    @InputImport(name="isolatedNetwork")
        private final @Nullable Input<Boolean> isolatedNetwork;

    public Input<Boolean> getIsolatedNetwork() {
        return this.isolatedNetwork == null ? Input.empty() : this.isolatedNetwork;
    }

    /**
     * Compute OS Type
     * 
     */
    @InputImport(name="osType")
        private final @Nullable Input<Either<String,OsType>> osType;

    public Input<Either<String,OsType>> getOsType() {
        return this.osType == null ? Input.empty() : this.osType;
    }

    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on all nodes of the cluster. Enabled - Indicates that the public ssh port is open on all nodes of the cluster. NotSpecified - Indicates that the public ssh port is closed on all nodes of the cluster if VNet is defined, else is open all public nodes. It can be default only during cluster creation time, after creation it will be either enabled or disabled.
     * 
     */
    @InputImport(name="remoteLoginPortPublicAccess")
        private final @Nullable Input<Either<String,RemoteLoginPortPublicAccess>> remoteLoginPortPublicAccess;

    public Input<Either<String,RemoteLoginPortPublicAccess>> getRemoteLoginPortPublicAccess() {
        return this.remoteLoginPortPublicAccess == null ? Input.empty() : this.remoteLoginPortPublicAccess;
    }

    /**
     * Scale settings for AML Compute
     * 
     */
    @InputImport(name="scaleSettings")
        private final @Nullable Input<ScaleSettingsArgs> scaleSettings;

    public Input<ScaleSettingsArgs> getScaleSettings() {
        return this.scaleSettings == null ? Input.empty() : this.scaleSettings;
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
     * Credentials for an administrator user account that will be created on each compute node.
     * 
     */
    @InputImport(name="userAccountCredentials")
        private final @Nullable Input<UserAccountCredentialsArgs> userAccountCredentials;

    public Input<UserAccountCredentialsArgs> getUserAccountCredentials() {
        return this.userAccountCredentials == null ? Input.empty() : this.userAccountCredentials;
    }

    /**
     * Virtual Machine image for AML Compute - windows only
     * 
     */
    @InputImport(name="virtualMachineImage")
        private final @Nullable Input<VirtualMachineImageArgs> virtualMachineImage;

    public Input<VirtualMachineImageArgs> getVirtualMachineImage() {
        return this.virtualMachineImage == null ? Input.empty() : this.virtualMachineImage;
    }

    /**
     * Virtual Machine priority
     * 
     */
    @InputImport(name="vmPriority")
        private final @Nullable Input<Either<String,VmPriority>> vmPriority;

    public Input<Either<String,VmPriority>> getVmPriority() {
        return this.vmPriority == null ? Input.empty() : this.vmPriority;
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

    public AmlComputePropertiesArgs(
        @Nullable Input<Boolean> enableNodePublicIp,
        @Nullable Input<Boolean> isolatedNetwork,
        @Nullable Input<Either<String,OsType>> osType,
        @Nullable Input<Either<String,RemoteLoginPortPublicAccess>> remoteLoginPortPublicAccess,
        @Nullable Input<ScaleSettingsArgs> scaleSettings,
        @Nullable Input<ResourceIdArgs> subnet,
        @Nullable Input<UserAccountCredentialsArgs> userAccountCredentials,
        @Nullable Input<VirtualMachineImageArgs> virtualMachineImage,
        @Nullable Input<Either<String,VmPriority>> vmPriority,
        @Nullable Input<String> vmSize) {
        this.enableNodePublicIp = enableNodePublicIp == null ? Input.ofNullable(true) : enableNodePublicIp;
        this.isolatedNetwork = isolatedNetwork;
        this.osType = osType == null ? Input.ofLeft("Linux") : osType;
        this.remoteLoginPortPublicAccess = remoteLoginPortPublicAccess == null ? Input.ofLeft("NotSpecified") : remoteLoginPortPublicAccess;
        this.scaleSettings = scaleSettings;
        this.subnet = subnet;
        this.userAccountCredentials = userAccountCredentials;
        this.virtualMachineImage = virtualMachineImage;
        this.vmPriority = vmPriority;
        this.vmSize = vmSize;
    }

    private AmlComputePropertiesArgs() {
        this.enableNodePublicIp = Input.empty();
        this.isolatedNetwork = Input.empty();
        this.osType = Input.empty();
        this.remoteLoginPortPublicAccess = Input.empty();
        this.scaleSettings = Input.empty();
        this.subnet = Input.empty();
        this.userAccountCredentials = Input.empty();
        this.virtualMachineImage = Input.empty();
        this.vmPriority = Input.empty();
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmlComputePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableNodePublicIp;
        private @Nullable Input<Boolean> isolatedNetwork;
        private @Nullable Input<Either<String,OsType>> osType;
        private @Nullable Input<Either<String,RemoteLoginPortPublicAccess>> remoteLoginPortPublicAccess;
        private @Nullable Input<ScaleSettingsArgs> scaleSettings;
        private @Nullable Input<ResourceIdArgs> subnet;
        private @Nullable Input<UserAccountCredentialsArgs> userAccountCredentials;
        private @Nullable Input<VirtualMachineImageArgs> virtualMachineImage;
        private @Nullable Input<Either<String,VmPriority>> vmPriority;
        private @Nullable Input<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(AmlComputePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNodePublicIp = defaults.enableNodePublicIp;
    	      this.isolatedNetwork = defaults.isolatedNetwork;
    	      this.osType = defaults.osType;
    	      this.remoteLoginPortPublicAccess = defaults.remoteLoginPortPublicAccess;
    	      this.scaleSettings = defaults.scaleSettings;
    	      this.subnet = defaults.subnet;
    	      this.userAccountCredentials = defaults.userAccountCredentials;
    	      this.virtualMachineImage = defaults.virtualMachineImage;
    	      this.vmPriority = defaults.vmPriority;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setEnableNodePublicIp(@Nullable Input<Boolean> enableNodePublicIp) {
            this.enableNodePublicIp = enableNodePublicIp;
            return this;
        }

        public Builder setEnableNodePublicIp(@Nullable Boolean enableNodePublicIp) {
            this.enableNodePublicIp = Input.ofNullable(enableNodePublicIp);
            return this;
        }

        public Builder setIsolatedNetwork(@Nullable Input<Boolean> isolatedNetwork) {
            this.isolatedNetwork = isolatedNetwork;
            return this;
        }

        public Builder setIsolatedNetwork(@Nullable Boolean isolatedNetwork) {
            this.isolatedNetwork = Input.ofNullable(isolatedNetwork);
            return this;
        }

        public Builder setOsType(@Nullable Input<Either<String,OsType>> osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsType(@Nullable Either<String,OsType> osType) {
            this.osType = Input.ofNullable(osType);
            return this;
        }

        public Builder setRemoteLoginPortPublicAccess(@Nullable Input<Either<String,RemoteLoginPortPublicAccess>> remoteLoginPortPublicAccess) {
            this.remoteLoginPortPublicAccess = remoteLoginPortPublicAccess;
            return this;
        }

        public Builder setRemoteLoginPortPublicAccess(@Nullable Either<String,RemoteLoginPortPublicAccess> remoteLoginPortPublicAccess) {
            this.remoteLoginPortPublicAccess = Input.ofNullable(remoteLoginPortPublicAccess);
            return this;
        }

        public Builder setScaleSettings(@Nullable Input<ScaleSettingsArgs> scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }

        public Builder setScaleSettings(@Nullable ScaleSettingsArgs scaleSettings) {
            this.scaleSettings = Input.ofNullable(scaleSettings);
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

        public Builder setUserAccountCredentials(@Nullable Input<UserAccountCredentialsArgs> userAccountCredentials) {
            this.userAccountCredentials = userAccountCredentials;
            return this;
        }

        public Builder setUserAccountCredentials(@Nullable UserAccountCredentialsArgs userAccountCredentials) {
            this.userAccountCredentials = Input.ofNullable(userAccountCredentials);
            return this;
        }

        public Builder setVirtualMachineImage(@Nullable Input<VirtualMachineImageArgs> virtualMachineImage) {
            this.virtualMachineImage = virtualMachineImage;
            return this;
        }

        public Builder setVirtualMachineImage(@Nullable VirtualMachineImageArgs virtualMachineImage) {
            this.virtualMachineImage = Input.ofNullable(virtualMachineImage);
            return this;
        }

        public Builder setVmPriority(@Nullable Input<Either<String,VmPriority>> vmPriority) {
            this.vmPriority = vmPriority;
            return this;
        }

        public Builder setVmPriority(@Nullable Either<String,VmPriority> vmPriority) {
            this.vmPriority = Input.ofNullable(vmPriority);
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
        public AmlComputePropertiesArgs build() {
            return new AmlComputePropertiesArgs(enableNodePublicIp, isolatedNetwork, osType, remoteLoginPortPublicAccess, scaleSettings, subnet, userAccountCredentials, virtualMachineImage, vmPriority, vmSize);
        }
    }
}
