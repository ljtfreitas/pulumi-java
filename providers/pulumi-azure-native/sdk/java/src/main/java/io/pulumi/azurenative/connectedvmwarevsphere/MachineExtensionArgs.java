// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MachineExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final MachineExtensionArgs Empty = new MachineExtensionArgs();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
      private final @Nullable Output<Boolean> autoUpgradeMinorVersion;

    public Output<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Output.empty() : this.autoUpgradeMinorVersion;
    }

    /**
     * The name of the machine extension.
     * 
     */
    @Import(name="extensionName")
      private final @Nullable Output<String> extensionName;

    public Output<String> getExtensionName() {
        return this.extensionName == null ? Output.empty() : this.extensionName;
    }

    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @Import(name="forceUpdateTag")
      private final @Nullable Output<String> forceUpdateTag;

    public Output<String> getForceUpdateTag() {
        return this.forceUpdateTag == null ? Output.empty() : this.forceUpdateTag;
    }

    /**
     * Gets or sets the location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the machine where the extension should be created or updated.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @Import(name="protectedSettings")
      private final @Nullable Output<Object> protectedSettings;

    public Output<Object> getProtectedSettings() {
        return this.protectedSettings == null ? Output.empty() : this.protectedSettings;
    }

    /**
     * The name of the extension handler publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable Output<String> publisher;

    public Output<String> getPublisher() {
        return this.publisher == null ? Output.empty() : this.publisher;
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
     * Json formatted public settings for the extension.
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<Object> settings;

    public Output<Object> getSettings() {
        return this.settings == null ? Output.empty() : this.settings;
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Specifies the type of the extension; an example is "CustomScriptExtension".
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * Specifies the version of the script handler.
     * 
     */
    @Import(name="typeHandlerVersion")
      private final @Nullable Output<String> typeHandlerVersion;

    public Output<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Output.empty() : this.typeHandlerVersion;
    }

    public MachineExtensionArgs(
        @Nullable Output<Boolean> autoUpgradeMinorVersion,
        @Nullable Output<String> extensionName,
        @Nullable Output<String> forceUpdateTag,
        @Nullable Output<String> location,
        Output<String> name,
        @Nullable Output<Object> protectedSettings,
        @Nullable Output<String> publisher,
        Output<String> resourceGroupName,
        @Nullable Output<Object> settings,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> type,
        @Nullable Output<String> typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.extensionName = extensionName;
        this.forceUpdateTag = forceUpdateTag;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protectedSettings = protectedSettings;
        this.publisher = publisher;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settings = settings;
        this.tags = tags;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private MachineExtensionArgs() {
        this.autoUpgradeMinorVersion = Output.empty();
        this.extensionName = Output.empty();
        this.forceUpdateTag = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.protectedSettings = Output.empty();
        this.publisher = Output.empty();
        this.resourceGroupName = Output.empty();
        this.settings = Output.empty();
        this.tags = Output.empty();
        this.type = Output.empty();
        this.typeHandlerVersion = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoUpgradeMinorVersion;
        private @Nullable Output<String> extensionName;
        private @Nullable Output<String> forceUpdateTag;
        private @Nullable Output<String> location;
        private Output<String> name;
        private @Nullable Output<Object> protectedSettings;
        private @Nullable Output<String> publisher;
        private Output<String> resourceGroupName;
        private @Nullable Output<Object> settings;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> type;
        private @Nullable Output<String> typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.extensionName = defaults.extensionName;
    	      this.forceUpdateTag = defaults.forceUpdateTag;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.publisher = defaults.publisher;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settings = defaults.settings;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        public Builder autoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = Output.ofNullable(autoUpgradeMinorVersion);
            return this;
        }

        public Builder extensionName(@Nullable Output<String> extensionName) {
            this.extensionName = extensionName;
            return this;
        }

        public Builder extensionName(@Nullable String extensionName) {
            this.extensionName = Output.ofNullable(extensionName);
            return this;
        }

        public Builder forceUpdateTag(@Nullable Output<String> forceUpdateTag) {
            this.forceUpdateTag = forceUpdateTag;
            return this;
        }

        public Builder forceUpdateTag(@Nullable String forceUpdateTag) {
            this.forceUpdateTag = Output.ofNullable(forceUpdateTag);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder protectedSettings(@Nullable Output<Object> protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }

        public Builder protectedSettings(@Nullable Object protectedSettings) {
            this.protectedSettings = Output.ofNullable(protectedSettings);
            return this;
        }

        public Builder publisher(@Nullable Output<String> publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder publisher(@Nullable String publisher) {
            this.publisher = Output.ofNullable(publisher);
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

        public Builder settings(@Nullable Output<Object> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable Object settings) {
            this.settings = Output.ofNullable(settings);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        public Builder typeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = Output.ofNullable(typeHandlerVersion);
            return this;
        }
        public MachineExtensionArgs build() {
            return new MachineExtensionArgs(autoUpgradeMinorVersion, extensionName, forceUpdateTag, location, name, protectedSettings, publisher, resourceGroupName, settings, tags, type, typeHandlerVersion);
        }
    }
}
