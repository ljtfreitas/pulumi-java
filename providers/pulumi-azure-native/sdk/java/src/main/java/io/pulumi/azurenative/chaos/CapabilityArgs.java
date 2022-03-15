// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CapabilityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CapabilityArgs Empty = new CapabilityArgs();

    /**
     * String that represents a Capability resource name.
     * 
     */
    @Import(name="capabilityName")
      private final @Nullable Output<String> capabilityName;

    public Output<String> getCapabilityName() {
        return this.capabilityName == null ? Output.empty() : this.capabilityName;
    }

    /**
     * String that represents a resource provider namespace.
     * 
     */
    @Import(name="parentProviderNamespace", required=true)
      private final Output<String> parentProviderNamespace;

    public Output<String> getParentProviderNamespace() {
        return this.parentProviderNamespace;
    }

    /**
     * String that represents a resource name.
     * 
     */
    @Import(name="parentResourceName", required=true)
      private final Output<String> parentResourceName;

    public Output<String> getParentResourceName() {
        return this.parentResourceName;
    }

    /**
     * String that represents a resource type.
     * 
     */
    @Import(name="parentResourceType", required=true)
      private final Output<String> parentResourceType;

    public Output<String> getParentResourceType() {
        return this.parentResourceType;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * String that represents a Target resource name.
     * 
     */
    @Import(name="targetName", required=true)
      private final Output<String> targetName;

    public Output<String> getTargetName() {
        return this.targetName;
    }

    public CapabilityArgs(
        @Nullable Output<String> capabilityName,
        Output<String> parentProviderNamespace,
        Output<String> parentResourceName,
        Output<String> parentResourceType,
        Output<String> resourceGroupName,
        Output<String> targetName) {
        this.capabilityName = capabilityName;
        this.parentProviderNamespace = Objects.requireNonNull(parentProviderNamespace, "expected parameter 'parentProviderNamespace' to be non-null");
        this.parentResourceName = Objects.requireNonNull(parentResourceName, "expected parameter 'parentResourceName' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
    }

    private CapabilityArgs() {
        this.capabilityName = Output.empty();
        this.parentProviderNamespace = Output.empty();
        this.parentResourceName = Output.empty();
        this.parentResourceType = Output.empty();
        this.resourceGroupName = Output.empty();
        this.targetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CapabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> capabilityName;
        private Output<String> parentProviderNamespace;
        private Output<String> parentResourceName;
        private Output<String> parentResourceType;
        private Output<String> resourceGroupName;
        private Output<String> targetName;

        public Builder() {
    	      // Empty
        }

        public Builder(CapabilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilityName = defaults.capabilityName;
    	      this.parentProviderNamespace = defaults.parentProviderNamespace;
    	      this.parentResourceName = defaults.parentResourceName;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetName = defaults.targetName;
        }

        public Builder capabilityName(@Nullable Output<String> capabilityName) {
            this.capabilityName = capabilityName;
            return this;
        }

        public Builder capabilityName(@Nullable String capabilityName) {
            this.capabilityName = Output.ofNullable(capabilityName);
            return this;
        }

        public Builder parentProviderNamespace(Output<String> parentProviderNamespace) {
            this.parentProviderNamespace = Objects.requireNonNull(parentProviderNamespace);
            return this;
        }

        public Builder parentProviderNamespace(String parentProviderNamespace) {
            this.parentProviderNamespace = Output.of(Objects.requireNonNull(parentProviderNamespace));
            return this;
        }

        public Builder parentResourceName(Output<String> parentResourceName) {
            this.parentResourceName = Objects.requireNonNull(parentResourceName);
            return this;
        }

        public Builder parentResourceName(String parentResourceName) {
            this.parentResourceName = Output.of(Objects.requireNonNull(parentResourceName));
            return this;
        }

        public Builder parentResourceType(Output<String> parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }

        public Builder parentResourceType(String parentResourceType) {
            this.parentResourceType = Output.of(Objects.requireNonNull(parentResourceType));
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

        public Builder targetName(Output<String> targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }

        public Builder targetName(String targetName) {
            this.targetName = Output.of(Objects.requireNonNull(targetName));
            return this;
        }
        public CapabilityArgs build() {
            return new CapabilityArgs(capabilityName, parentProviderNamespace, parentResourceName, parentResourceType, resourceGroupName, targetName);
        }
    }
}
