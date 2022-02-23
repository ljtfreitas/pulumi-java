// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.AzureFileShareProtectionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureIaaSVMProtectionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureSqlProtectionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.AzureVmWorkloadProtectionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.GenericProtectionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.MabProtectionPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionPolicyArgs Empty = new ProtectionPolicyArgs();

    /**
     * Optional ETag.
     * 
     */
    @InputImport(name="eTag")
        private final @Nullable Input<String> eTag;

    public Input<String> getETag() {
        return this.eTag == null ? Input.empty() : this.eTag;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Backup policy to be created.
     * 
     */
    @InputImport(name="policyName")
        private final @Nullable Input<String> policyName;

    public Input<String> getPolicyName() {
        return this.policyName == null ? Input.empty() : this.policyName;
    }

    /**
     * ProtectionPolicyResource properties
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @InputImport(name="vaultName", required=true)
        private final Input<String> vaultName;

    public Input<String> getVaultName() {
        return this.vaultName;
    }

    public ProtectionPolicyArgs(
        @Nullable Input<String> eTag,
        @Nullable Input<String> location,
        @Nullable Input<String> policyName,
        @Nullable Input<Object> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        Input<String> vaultName) {
        this.eTag = eTag;
        this.location = location;
        this.policyName = policyName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private ProtectionPolicyArgs() {
        this.eTag = Input.empty();
        this.location = Input.empty();
        this.policyName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eTag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> policyName;
        private @Nullable Input<Object> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.location = defaults.location;
    	      this.policyName = defaults.policyName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setETag(@Nullable Input<String> eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder setETag(@Nullable String eTag) {
            this.eTag = Input.ofNullable(eTag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPolicyName(@Nullable Input<String> policyName) {
            this.policyName = policyName;
            return this;
        }

        public Builder setPolicyName(@Nullable String policyName) {
            this.policyName = Input.ofNullable(policyName);
            return this;
        }

        public Builder setProperties(@Nullable Input<Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Object properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVaultName(Input<String> vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }

        public Builder setVaultName(String vaultName) {
            this.vaultName = Input.of(Objects.requireNonNull(vaultName));
            return this;
        }
        public ProtectionPolicyArgs build() {
            return new ProtectionPolicyArgs(eTag, location, policyName, properties, resourceGroupName, tags, vaultName);
        }
    }
}
