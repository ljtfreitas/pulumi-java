// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.outputs;

import io.pulumi.azurenative.hybridcompute.outputs.MachineExtensionPropertiesResponseInstanceView;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMachineExtensionResult {
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    private final @Nullable Boolean autoUpgradeMinorVersion;
    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    private final @Nullable String forceUpdateTag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The machine extension instance view.
     * 
     */
    private final @Nullable MachineExtensionPropertiesResponseInstanceView instanceView;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    private final @Nullable Object protectedSettings;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The name of the extension handler publisher.
     * 
     */
    private final @Nullable String publisher;
    /**
     * Json formatted public settings for the extension.
     * 
     */
    private final @Nullable Object settings;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;
    /**
     * Specifies the version of the script handler.
     * 
     */
    private final @Nullable String typeHandlerVersion;

    @CustomType.Constructor
    private GetMachineExtensionResult(
        @CustomType.Parameter("autoUpgradeMinorVersion") @Nullable Boolean autoUpgradeMinorVersion,
        @CustomType.Parameter("forceUpdateTag") @Nullable String forceUpdateTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceView") @Nullable MachineExtensionPropertiesResponseInstanceView instanceView,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protectedSettings") @Nullable Object protectedSettings,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("publisher") @Nullable String publisher,
        @CustomType.Parameter("settings") @Nullable Object settings,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("typeHandlerVersion") @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.forceUpdateTag = forceUpdateTag;
        this.id = id;
        this.instanceView = instanceView;
        this.location = location;
        this.name = name;
        this.protectedSettings = protectedSettings;
        this.provisioningState = provisioningState;
        this.publisher = publisher;
        this.settings = settings;
        this.tags = tags;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
    */
    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }
    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
    */
    public Optional<String> getForceUpdateTag() {
        return Optional.ofNullable(this.forceUpdateTag);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The machine extension instance view.
     * 
    */
    public Optional<MachineExtensionPropertiesResponseInstanceView> getInstanceView() {
        return Optional.ofNullable(this.instanceView);
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
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
    public Optional<String> getPublisher() {
        return Optional.ofNullable(this.publisher);
    }
    /**
     * Json formatted public settings for the extension.
     * 
    */
    public Optional<Object> getSettings() {
        return Optional.ofNullable(this.settings);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Specifies the version of the script handler.
     * 
    */
    public Optional<String> getTypeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineExtensionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private @Nullable String forceUpdateTag;
        private String id;
        private @Nullable MachineExtensionPropertiesResponseInstanceView instanceView;
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

        public Builder(GetMachineExtensionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
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

        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder instanceView(@Nullable MachineExtensionPropertiesResponseInstanceView instanceView) {
            this.instanceView = instanceView;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder protectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder settings(@Nullable Object settings) {
            this.settings = settings;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public GetMachineExtensionResult build() {
            return new GetMachineExtensionResult(autoUpgradeMinorVersion, forceUpdateTag, id, instanceView, location, name, protectedSettings, provisioningState, publisher, settings, tags, type, typeHandlerVersion);
        }
    }
}
