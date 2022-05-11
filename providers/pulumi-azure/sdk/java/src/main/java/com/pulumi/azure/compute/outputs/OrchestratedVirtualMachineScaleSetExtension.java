// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrchestratedVirtualMachineScaleSetExtension {
    private final @Nullable Boolean autoUpgradeMinorVersionEnabled;
    /**
     * @return An ordered list of Extension names which Orchestrated Virtual Machine Scale Set should provision after VM creation.
     * 
     */
    private final @Nullable List<String> extensionsToProvisionAfterVmCreations;
    private final @Nullable String forceExtensionExecutionOnChange;
    /**
     * @return The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    private final String name;
    private final @Nullable String protectedSettings;
    private final String publisher;
    private final @Nullable String settings;
    private final String type;
    private final String typeHandlerVersion;

    @CustomType.Constructor
    private OrchestratedVirtualMachineScaleSetExtension(
        @CustomType.Parameter("autoUpgradeMinorVersionEnabled") @Nullable Boolean autoUpgradeMinorVersionEnabled,
        @CustomType.Parameter("extensionsToProvisionAfterVmCreations") @Nullable List<String> extensionsToProvisionAfterVmCreations,
        @CustomType.Parameter("forceExtensionExecutionOnChange") @Nullable String forceExtensionExecutionOnChange,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protectedSettings") @Nullable String protectedSettings,
        @CustomType.Parameter("publisher") String publisher,
        @CustomType.Parameter("settings") @Nullable String settings,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("typeHandlerVersion") String typeHandlerVersion) {
        this.autoUpgradeMinorVersionEnabled = autoUpgradeMinorVersionEnabled;
        this.extensionsToProvisionAfterVmCreations = extensionsToProvisionAfterVmCreations;
        this.forceExtensionExecutionOnChange = forceExtensionExecutionOnChange;
        this.name = name;
        this.protectedSettings = protectedSettings;
        this.publisher = publisher;
        this.settings = settings;
        this.type = type;
        this.typeHandlerVersion = typeHandlerVersion;
    }

    public Optional<Boolean> autoUpgradeMinorVersionEnabled() {
        return Optional.ofNullable(this.autoUpgradeMinorVersionEnabled);
    }
    /**
     * @return An ordered list of Extension names which Orchestrated Virtual Machine Scale Set should provision after VM creation.
     * 
     */
    public List<String> extensionsToProvisionAfterVmCreations() {
        return this.extensionsToProvisionAfterVmCreations == null ? List.of() : this.extensionsToProvisionAfterVmCreations;
    }
    public Optional<String> forceExtensionExecutionOnChange() {
        return Optional.ofNullable(this.forceExtensionExecutionOnChange);
    }
    /**
     * @return The name of the Orchestrated Virtual Machine Scale Set. Changing this forces a new resource to be created.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }
    public String publisher() {
        return this.publisher;
    }
    public Optional<String> settings() {
        return Optional.ofNullable(this.settings);
    }
    public String type() {
        return this.type;
    }
    public String typeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrchestratedVirtualMachineScaleSetExtension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoUpgradeMinorVersionEnabled;
        private @Nullable List<String> extensionsToProvisionAfterVmCreations;
        private @Nullable String forceExtensionExecutionOnChange;
        private String name;
        private @Nullable String protectedSettings;
        private String publisher;
        private @Nullable String settings;
        private String type;
        private String typeHandlerVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(OrchestratedVirtualMachineScaleSetExtension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoUpgradeMinorVersionEnabled = defaults.autoUpgradeMinorVersionEnabled;
    	      this.extensionsToProvisionAfterVmCreations = defaults.extensionsToProvisionAfterVmCreations;
    	      this.forceExtensionExecutionOnChange = defaults.forceExtensionExecutionOnChange;
    	      this.name = defaults.name;
    	      this.protectedSettings = defaults.protectedSettings;
    	      this.publisher = defaults.publisher;
    	      this.settings = defaults.settings;
    	      this.type = defaults.type;
    	      this.typeHandlerVersion = defaults.typeHandlerVersion;
        }

        public Builder autoUpgradeMinorVersionEnabled(@Nullable Boolean autoUpgradeMinorVersionEnabled) {
            this.autoUpgradeMinorVersionEnabled = autoUpgradeMinorVersionEnabled;
            return this;
        }
        public Builder extensionsToProvisionAfterVmCreations(@Nullable List<String> extensionsToProvisionAfterVmCreations) {
            this.extensionsToProvisionAfterVmCreations = extensionsToProvisionAfterVmCreations;
            return this;
        }
        public Builder extensionsToProvisionAfterVmCreations(String... extensionsToProvisionAfterVmCreations) {
            return extensionsToProvisionAfterVmCreations(List.of(extensionsToProvisionAfterVmCreations));
        }
        public Builder forceExtensionExecutionOnChange(@Nullable String forceExtensionExecutionOnChange) {
            this.forceExtensionExecutionOnChange = forceExtensionExecutionOnChange;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protectedSettings(@Nullable String protectedSettings) {
            this.protectedSettings = protectedSettings;
            return this;
        }
        public Builder publisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }
        public Builder settings(@Nullable String settings) {
            this.settings = settings;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            this.typeHandlerVersion = Objects.requireNonNull(typeHandlerVersion);
            return this;
        }        public OrchestratedVirtualMachineScaleSetExtension build() {
            return new OrchestratedVirtualMachineScaleSetExtension(autoUpgradeMinorVersionEnabled, extensionsToProvisionAfterVmCreations, forceExtensionExecutionOnChange, name, protectedSettings, publisher, settings, type, typeHandlerVersion);
        }
    }
}
