// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VMSSExtensionResponse {
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * The name of the extension.
     * 
     */
    private final String name;
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    private final @Nullable Object protectedSettings;
    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    private final @Nullable List<String> provisionAfterExtensions;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The name of the extension handler publisher.
     * 
     */
    private final String publisher;
    /**
     * Json formatted public settings for the extension.
     * 
     */
    private final @Nullable Object settings;
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    private final String type;
    /**
     * Specifies the version of the script handler.
     * 
     */
    private final String typeHandlerVersion;

    @OutputCustomType.Constructor({"autoUpgradeMinorVersion","forceUpdateTag","name","protectedSettings","provisionAfterExtensions","provisioningState","publisher","settings","type","typeHandlerVersion"})
    private VMSSExtensionResponse(
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable String forceUpdateTag,
        String name,
        @Nullable Object protectedSettings,
        @Nullable List<String> provisionAfterExtensions,
        String provisioningState,
        String publisher,
        @Nullable Object settings,
        String type,
        String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.forceUpdateTag = forceUpdateTag;
        this.name = Objects.requireNonNull(name);
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publisher = Objects.requireNonNull(publisher);
        this.settings = settings;
        this.type = Objects.requireNonNull(type);
        this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
    }

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * The name of the extension.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    public Optional<Object> getProtectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    public List<String> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? List.of() : this.provisionAfterExtensions;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the extension handler publisher.
     * 
     */
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Json formatted public settings for the extension.
     * 
     */
    public Optional<Object> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies the version of the script handler.
     * 
     */
    public String getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMSSExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable String forceUpdateTag;
        private String name;
        private @Nullable Object protectedSettings;
        private @Nullable List<String> provisionAfterExtensions;
        private String provisioningState;
        private String publisher;
        private @Nullable Object settings;
        private String type;
        private String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VMSSExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProtectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder setProvisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }

        public VMSSExtensionResponse build() {
            return new VMSSExtensionResponse(autoUpgradeMinorVersion, forceUpdateTag, name, protectedSettings, provisionAfterExtensions, provisioningState, publisher, settings, type, typeHandlerVersion);
        }
    }
}
