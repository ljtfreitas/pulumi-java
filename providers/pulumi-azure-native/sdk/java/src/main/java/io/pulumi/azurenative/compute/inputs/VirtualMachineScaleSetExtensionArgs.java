// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a Virtual Machine Scale Set Extension.
 * 
 */
public final class VirtualMachineScaleSetExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetExtensionArgs Empty = new VirtualMachineScaleSetExtensionArgs();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @InputImport(name="autoUpgradeMinorVersion")
    private final @Nullable Input<Boolean> autoUpgradeMinorVersion;

    public Input<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Input.empty() : this.autoUpgradeMinorVersion;
    }

    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    @InputImport(name="enableAutomaticUpgrade")
    private final @Nullable Input<Boolean> enableAutomaticUpgrade;

    public Input<Boolean> getEnableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade == null ? Input.empty() : this.enableAutomaticUpgrade;
    }

    /**
     * If a value is provided and is different from the previous value, the extension handler will be forced to update even if the extension configuration has not changed.
     * 
     */
    @InputImport(name="forceUpdateTag")
    private final @Nullable Input<String> forceUpdateTag;

    public Input<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Input.empty() : this.forceUpdateTag;
    }

    /**
     * The name of the extension.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @InputImport(name="protectedSettings")
    private final @Nullable Input<Object> protectedSettings;

    public Input<Object> getProtectedSettings() {
        return this.protectedSettings == null ? Input.empty() : this.protectedSettings;
    }

    /**
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    @InputImport(name="provisionAfterExtensions")
    private final @Nullable Input<List<String>> provisionAfterExtensions;

    public Input<List<String>> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? Input.empty() : this.provisionAfterExtensions;
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @InputImport(name="publisher")
    private final @Nullable Input<String> publisher;

    public Input<String> getPublisher() {
        return this.publisher == null ? Input.empty() : this.publisher;
    }

    /**
     * Json formatted public settings for the extension.
     * 
     */
    @InputImport(name="settings")
    private final @Nullable Input<Object> settings;

    public Input<Object> getSettings() {
        return this.settings == null ? Input.empty() : this.settings;
    }

    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @InputImport(name="typeHandlerVersion")
    private final @Nullable Input<String> typeHandlerVersion;

    public Input<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Input.empty() : this.typeHandlerVersion;
    }

    public VirtualMachineScaleSetExtensionArgs(
        @Nullable Input<Boolean> autoUpgradeMinorVersion,
        @Nullable Input<Boolean> enableAutomaticUpgrade,
        @Nullable Input<String> forceUpdateTag,
        @Nullable Input<String> name,
        @Nullable Input<Object> protectedSettings,
        @Nullable Input<List<String>> provisionAfterExtensions,
        @Nullable Input<String> publisher,
        @Nullable Input<Object> settings,
        @Nullable Input<String> type,
        @Nullable Input<String> typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        this.forceUpdateTag = forceUpdateTag;
        this.name = name;
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.publisher = publisher;
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VirtualMachineScaleSetExtensionArgs() {
        this.autoUpgradeMinorVersion = Input.empty();
        this.enableAutomaticUpgrade = Input.empty();
        this.forceUpdateTag = Input.empty();
        this.name = Input.empty();
        this.protectedSettings = Input.empty();
        this.provisionAfterExtensions = Input.empty();
        this.publisher = Input.empty();
        this.settings = Input.empty();
        this.type = Input.empty();
        this.typeHandlerVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoUpgradeMinorVersion;
        private @Nullable Input<Boolean> enableAutomaticUpgrade;
        private @Nullable Input<String> forceUpdateTag;
        private @Nullable Input<String> name;
        private @Nullable Input<Object> protectedSettings;
        private @Nullable Input<List<String>> provisionAfterExtensions;
        private @Nullable Input<String> publisher;
        private @Nullable Input<Object> settings;
        private @Nullable Input<String> type;
        private @Nullable Input<String> typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.enableAutomaticUpgrade = defaults.enableAutomaticUpgrade;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Input<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Input.ofNullable(autoUpgradeMinorVersion);
            return this;
        }

        public Builder setEnableAutomaticUpgrade(@Nullable Input<Boolean> enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = enableAutomaticUpgrade;
            return this;
        }

        public Builder setEnableAutomaticUpgrade(@Nullable Boolean enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = Input.ofNullable(enableAutomaticUpgrade);
            return this;
        }

        public Builder setForceUpdateTag(@Nullable Input<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Input.ofNullable(forceUpdateTag);
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

        public Builder setProtectedSettings(@Nullable Input<Object> protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder setProtectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = Input.ofNullable(protectedSettings);
            return this;
        }

        public Builder setProvisionAfterExtensions(@Nullable Input<List<String>> provisionAfterExtensions) {
            this.provisionAfterExtensions = provisionAfterExtensions;
            return this;
        }

        public Builder setProvisionAfterExtensions(@Nullable List<String> provisionAfterExtensions) {
            this.provisionAfterExtensions = Input.ofNullable(provisionAfterExtensions);
            return this;
        }

        public Builder setPublisher(@Nullable Input<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = Input.ofNullable(publisher);
            return this;
        }

        public Builder setSettings(@Nullable Input<Object> settings) {
            this.settings = settings;
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = Input.ofNullable(settings);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable Input<String> typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = Input.ofNullable(typeHandlerVersion);
            return this;
        }

        public VirtualMachineScaleSetExtensionArgs build() {
            return new VirtualMachineScaleSetExtensionArgs(autoUpgradeMinorVersion, enableAutomaticUpgrade, forceUpdateTag, name, protectedSettings, provisionAfterExtensions, publisher, settings, type, typeHandlerVersion);
        }
    }
}
