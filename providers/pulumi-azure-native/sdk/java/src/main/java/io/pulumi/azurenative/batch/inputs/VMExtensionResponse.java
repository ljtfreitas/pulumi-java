// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMExtensionResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMExtensionResponse Empty = new VMExtensionResponse();

    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @InputImport(name="autoUpgradeMinorVersion")
        private final @Nullable Boolean autoUpgradeMinorVersion;

    public Optional<Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion == null ? Optional.empty() : Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

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
     * Collection of extension names after which this extension needs to be provisioned.
     * 
     */
    @InputImport(name="provisionAfterExtensions")
        private final @Nullable List<String> provisionAfterExtensions;

    public List<String> getProvisionAfterExtensions() {
        return this.provisionAfterExtensions == null ? List.of() : this.provisionAfterExtensions;
    }

    @InputImport(name="publisher", required=true)
        private final String publisher;

    public String getPublisher() {
        return this.publisher;
    }

    @InputImport(name="settings")
        private final @Nullable Object settings;

    public Optional<Object> getSettings() {
        return this.settings == null ? Optional.empty() : Optional.ofNullable(this.settings);
    }

    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="typeHandlerVersion")
        private final @Nullable String typeHandlerVersion;

    public Optional<String> getTypeHandlerVersion() {
        return this.typeHandlerVersion == null ? Optional.empty() : Optional.ofNullable(this.typeHandlerVersion);
    }

    public VMExtensionResponse(
        @Nullable Boolean autoUpgradeMinorVersion,
        String name,
        @Nullable Object protectedSettings,
        @Nullable List<String> provisionAfterExtensions,
        String publisher,
        @Nullable Object settings,
        String type,
        @Nullable String typeHandlerVersion) {
        this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.protectedSettings = protectedSettings;
        this.provisionAfterExtensions = provisionAfterExtensions;
        this.publisher = Objects.requireNonNull(publisher, "expected parameter 'publisher' to be non-null");
        this.settings = settings;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.typeHandlerVersion = typeHandlerVersion;
    }

    private VMExtensionResponse() {
        this.autoUpgradeMinorVersion = null;
        this.name = null;
        this.protectedSettings = null;
        this.provisionAfterExtensions = List.of();
        this.publisher = null;
        this.settings = null;
        this.type = null;
        this.typeHandlerVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMExtensionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersion;
        private String name;
        private @Nullable Object protectedSettings;
        private @Nullable List<String> provisionAfterExtensions;
        private String publisher;
        private @Nullable Object settings;
        private String type;
        private @Nullable String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(VMExtensionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersion = defaults.autoUpgradeMinorVersion;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.provisionAfterExtensions = defaults.provisionAfterExtensions;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder setAutoUpgradeMinorVersion(@Nullable Boolean autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
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

        public Builder setTypeHandlerVersion(@Nullable String typeHandlerVersion) {
            this.typeHandlerVersion = typeHandlerVersion;
            return this;
        }
        public VMExtensionResponse build() {
            return new VMExtensionResponse(autoUpgradeMinorVersion, name, protectedSettings, provisionAfterExtensions, publisher, settings, type, typeHandlerVersion);
        }
    }
}
