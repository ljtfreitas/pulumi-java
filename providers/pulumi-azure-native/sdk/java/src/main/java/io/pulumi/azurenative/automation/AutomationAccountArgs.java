// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.EncryptionPropertiesArgs;
import io.pulumi.azurenative.automation.inputs.IdentityArgs;
import io.pulumi.azurenative.automation.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutomationAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutomationAccountArgs Empty = new AutomationAccountArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName")
        private final @Nullable Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName == null ? Input.empty() : this.automationAccountName;
    }

    /**
     * Indicates whether requests using non-AAD authentication are blocked
     * 
     */
    @InputImport(name="disableLocalAuth")
        private final @Nullable Input<Boolean> disableLocalAuth;

    public Input<Boolean> getDisableLocalAuth() {
        return this.disableLocalAuth == null ? Input.empty() : this.disableLocalAuth;
    }

    /**
     * Set the encryption properties for the automation account
     * 
     */
    @InputImport(name="encryption")
        private final @Nullable Input<EncryptionPropertiesArgs> encryption;

    public Input<EncryptionPropertiesArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * Sets the identity property for automation account
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<IdentityArgs> identity;

    public Input<IdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Gets or sets the location of the resource.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Gets or sets name of the resource.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Indicates whether traffic on the non-ARM endpoint (Webhook/Agent) is allowed from the public internet
     * 
     */
    @InputImport(name="publicNetworkAccess")
        private final @Nullable Input<Boolean> publicNetworkAccess;

    public Input<Boolean> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets account SKU.
     * 
     */
    @InputImport(name="sku")
        private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AutomationAccountArgs(
        @Nullable Input<String> automationAccountName,
        @Nullable Input<Boolean> disableLocalAuth,
        @Nullable Input<EncryptionPropertiesArgs> encryption,
        @Nullable Input<IdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> publicNetworkAccess,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.automationAccountName = automationAccountName;
        this.disableLocalAuth = disableLocalAuth;
        this.encryption = encryption;
        this.identity = identity;
        this.location = location;
        this.name = name;
        this.publicNetworkAccess = publicNetworkAccess;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private AutomationAccountArgs() {
        this.automationAccountName = Input.empty();
        this.disableLocalAuth = Input.empty();
        this.encryption = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> automationAccountName;
        private @Nullable Input<Boolean> disableLocalAuth;
        private @Nullable Input<EncryptionPropertiesArgs> encryption;
        private @Nullable Input<IdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> publicNetworkAccess;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.encryption = defaults.encryption;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setAutomationAccountName(@Nullable Input<String> automationAccountName) {
            this.automationAccountName = automationAccountName;
            return this;
        }

        public Builder setAutomationAccountName(@Nullable String automationAccountName) {
            this.automationAccountName = Input.ofNullable(automationAccountName);
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Input<Boolean> disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }

        public Builder setDisableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = Input.ofNullable(disableLocalAuth);
            return this;
        }

        public Builder setEncryption(@Nullable Input<EncryptionPropertiesArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionPropertiesArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setIdentity(@Nullable Input<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Boolean> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Boolean publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
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

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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
        public AutomationAccountArgs build() {
            return new AutomationAccountArgs(automationAccountName, disableLocalAuth, encryption, identity, location, name, publicNetworkAccess, resourceGroupName, sku, tags);
        }
    }
}
