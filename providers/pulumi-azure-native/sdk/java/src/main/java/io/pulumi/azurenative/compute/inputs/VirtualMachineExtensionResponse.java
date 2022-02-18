// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.VirtualMachineExtensionInstanceViewResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Virtual Machine Extension.
 * 
 */
public final class VirtualMachineExtensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineExtensionResponse Empty = new VirtualMachineExtensionResponse();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @InputImport(name="autoUpgradeMinorVersion")
    private final @Nullable Boolean autoUpgradeMinorVersion;

    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Optional.empty() : Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    @InputImport(name="enableAutomaticUpgrade")
    private final @Nullable Boolean enableAutomaticUpgrade;

    public Optional<Boolean> getEnableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade == null ? Optional.empty() : Optional.ofNullable(this.enableAutomaticUpgrade);
    }

    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @InputImport(name="forceUpdateTag")
    private final @Nullable String forceUpdateTag;

    public Optional<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Optional.empty() : Optional.ofNullable(this.forceUpdateTag);
    }

    /**
     * Resource Id
     * 
     */
    @InputImport(name="id", required=true)
    private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The virtual machine extension instance view.
     * 
     */
    @InputImport(name="instanceView")
    private final @Nullable VirtualMachineExtensionInstanceViewResponse instanceView;

    public Optional<VirtualMachineExtensionInstanceViewResponse> getInstanceView() {
        return this.instanceView == null ? Optional.empty() : Optional.ofNullable(this.instanceView);
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location", required=true)
    private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * Resource name
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @InputImport(name="protectedSettings")
    private final @Nullable Object protectedSettings;

    public Optional<Object> getProtectedSettings() {
        return this.protectedSettings == null ? Optional.empty() : Optional.ofNullable(this.protectedSettings);
    }

    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @InputImport(name="publisher")
    private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    /**
     * Json formatted public settings for the extension.
     * 
     */
    @InputImport(name="settings")
    private final @Nullable Object settings;

    public Optional<Object> getSettings() {
        return this.settings == null ? Optional.empty() : Optional.ofNullable(this.settings);
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Resource type
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @InputImport(name="typeHandlerVersion")
    private final @Nullable String typeHandlerVersion;

    public Optional<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Optional.empty() : Optional.ofNullable(this.typeHandlerVersion);
    }

    public VirtualMachineExtensionResponse(
        @Nullable Boolean autoUpgradeMinorVersion,
        @Nullable Boolean enableAutomaticUpgrade,
        @Nullable String forceUpdateTag,
        String id,
        @Nullable VirtualMachineExtensionInstanceViewResponse instanceView,
        String location,
        String name,
        @Nullable Object protectedSettings,
        String provisioningState,
        @Nullable String publisher,
        @Nullable Object settings,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.enableAutomaticUpgrade = enableAutomaticUpgrade;
        this.forceUpdateTag = forceUpdateTag;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.instanceView = instanceView;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protectedSettings = protectedSettings;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publisher = publisher;
        this.settings = settings;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VirtualMachineExtensionResponse() {
        this.autoUpgradeMinorVersion = null;
        this.enableAutomaticUpgrade = null;
        this.forceUpdateTag = null;
        this.id = null;
        this.instanceView = null;
        this.location = null;
        this.name = null;
        this.protectedSettings = null;
        this.provisioningState = null;
        this.publisher = null;
        this.settings = null;
        this.tags = Map.of();
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable Boolean enableAutomaticUpgrade;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable VirtualMachineExtensionInstanceViewResponse instanceView;
        private String location;
        private String name;
        private @Nullable Object protectedSettings;
        private String provisioningState;
        private @Nullable String publisher;
        private @Nullable Object settings;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.enableAutomaticUpgrade = defaults.enableAutomaticUpgrade;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.id = defaults.id;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder setEnableAutomaticUpgrade(@Nullable Boolean enableAutomaticUpgrade) {
            this.enableAutomaticUpgrade = enableAutomaticUpgrade;
            return this;
        }

        public Builder setForceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceView(@Nullable VirtualMachineExtensionInstanceViewResponse instanceView) {
            this.instanceView = instanceView;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
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

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setSettings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public VirtualMachineExtensionResponse build() {
            return new VirtualMachineExtensionResponse(autoUpgradeMinorVersion, enableAutomaticUpgrade, forceUpdateTag, id, instanceView, location, name, protectedSettings, provisioningState, publisher, settings, tags, type, typeHandlerVersion);
        }
    }
}
