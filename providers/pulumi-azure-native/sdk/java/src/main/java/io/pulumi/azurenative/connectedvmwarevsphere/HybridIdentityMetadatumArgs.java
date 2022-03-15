// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridIdentityMetadatumArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridIdentityMetadatumArgs Empty = new HybridIdentityMetadatumArgs();

    /**
     * Name of the hybridIdentityMetadata.
     * 
     */
    @Import(name="metadataName")
      private final @Nullable Output<String> metadataName;

    public Output<String> getMetadataName() {
        return this.metadataName == null ? Output.empty() : this.metadataName;
    }

    /**
     * Gets or sets the Public Key.
     * 
     */
    @Import(name="publicKey")
      private final @Nullable Output<String> publicKey;

    public Output<String> getPublicKey() {
        return this.publicKey == null ? Output.empty() : this.publicKey;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vm.
     * 
     */
    @Import(name="virtualMachineName", required=true)
      private final Output<String> virtualMachineName;

    public Output<String> getVirtualMachineName() {
        return this.virtualMachineName;
    }

    /**
     * Gets or sets the Vm Id.
     * 
     */
    @Import(name="vmId")
      private final @Nullable Output<String> vmId;

    public Output<String> getVmId() {
        return this.vmId == null ? Output.empty() : this.vmId;
    }

    public HybridIdentityMetadatumArgs(
        @Nullable Output<String> metadataName,
        @Nullable Output<String> publicKey,
        Output<String> resourceGroupName,
        Output<String> virtualMachineName,
        @Nullable Output<String> vmId) {
        this.metadataName = metadataName;
        this.publicKey = publicKey;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachineName = Objects.requireNonNull(virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
        this.vmId = vmId;
    }

    private HybridIdentityMetadatumArgs() {
        this.metadataName = Output.empty();
        this.publicKey = Output.empty();
        this.resourceGroupName = Output.empty();
        this.virtualMachineName = Output.empty();
        this.vmId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridIdentityMetadatumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> metadataName;
        private @Nullable Output<String> publicKey;
        private Output<String> resourceGroupName;
        private Output<String> virtualMachineName;
        private @Nullable Output<String> vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridIdentityMetadatumArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataName = defaults.metadataName;
    	      this.publicKey = defaults.publicKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineName = defaults.virtualMachineName;
    	      this.vmId = defaults.vmId;
        }

        public Builder metadataName(@Nullable Output<String> metadataName) {
            this.metadataName = metadataName;
            return this;
        }

        public Builder metadataName(@Nullable String metadataName) {
            this.metadataName = Output.ofNullable(metadataName);
            return this;
        }

        public Builder publicKey(@Nullable Output<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder publicKey(@Nullable String publicKey) {
            this.publicKey = Output.ofNullable(publicKey);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder virtualMachineName(Output<String> virtualMachineName) {
            this.virtualMachineName = Objects.requireNonNull(virtualMachineName);
            return this;
        }

        public Builder virtualMachineName(String virtualMachineName) {
            this.virtualMachineName = Output.of(Objects.requireNonNull(virtualMachineName));
            return this;
        }

        public Builder vmId(@Nullable Output<String> vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder vmId(@Nullable String vmId) {
            this.vmId = Output.ofNullable(vmId);
            return this;
        }
        public HybridIdentityMetadatumArgs build() {
            return new HybridIdentityMetadatumArgs(metadataName, publicKey, resourceGroupName, virtualMachineName, vmId);
        }
    }
}
