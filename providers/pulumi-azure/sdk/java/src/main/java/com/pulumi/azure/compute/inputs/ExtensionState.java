// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionState extends com.pulumi.resources.ResourceArgs {

    public static final ExtensionState Empty = new ExtensionState();

    /**
     * Specifies if the platform deploys
     * the latest minor version update to the `type_handler_version` specified.
     * 
     */
    @Import(name="autoUpgradeMinorVersion")
    private @Nullable Output<Boolean> autoUpgradeMinorVersion;

    /**
     * @return Specifies if the platform deploys
     * the latest minor version update to the `type_handler_version` specified.
     * 
     */
    public Optional<Output<Boolean>> autoUpgradeMinorVersion() {
        return Optional.ofNullable(this.autoUpgradeMinorVersion);
    }

    /**
     * Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    @Import(name="automaticUpgradeEnabled")
    private @Nullable Output<Boolean> automaticUpgradeEnabled;

    /**
     * @return Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> automaticUpgradeEnabled() {
        return Optional.ofNullable(this.automaticUpgradeEnabled);
    }

    /**
     * The name of the virtual machine extension peering. Changing
     * this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the virtual machine extension peering. Changing
     * this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The protected_settings passed to the
     * extension, like settings, these are specified as a JSON object in a string.
     * 
     */
    @Import(name="protectedSettings")
    private @Nullable Output<String> protectedSettings;

    /**
     * @return The protected_settings passed to the
     * extension, like settings, these are specified as a JSON object in a string.
     * 
     */
    public Optional<Output<String>> protectedSettings() {
        return Optional.ofNullable(this.protectedSettings);
    }

    /**
     * The publisher of the extension, available publishers can be found by using the Azure CLI. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="publisher")
    private @Nullable Output<String> publisher;

    /**
     * @return The publisher of the extension, available publishers can be found by using the Azure CLI. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> publisher() {
        return Optional.ofNullable(this.publisher);
    }

    /**
     * The settings passed to the extension, these are
     * specified as a JSON object in a string.
     * 
     */
    @Import(name="settings")
    private @Nullable Output<String> settings;

    /**
     * @return The settings passed to the extension, these are
     * specified as a JSON object in a string.
     * 
     */
    public Optional<Output<String>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of extension, available types for a publisher can
     * be found using the Azure CLI.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of extension, available types for a publisher can
     * be found using the Azure CLI.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Specifies the version of the extension to
     * use, available versions can be found using the Azure CLI.
     * 
     */
    @Import(name="typeHandlerVersion")
    private @Nullable Output<String> typeHandlerVersion;

    /**
     * @return Specifies the version of the extension to
     * use, available versions can be found using the Azure CLI.
     * 
     */
    public Optional<Output<String>> typeHandlerVersion() {
        return Optional.ofNullable(this.typeHandlerVersion);
    }

    /**
     * The ID of the Virtual Machine. Changing this forces a new resource to be created
     * 
     */
    @Import(name="virtualMachineId")
    private @Nullable Output<String> virtualMachineId;

    /**
     * @return The ID of the Virtual Machine. Changing this forces a new resource to be created
     * 
     */
    public Optional<Output<String>> virtualMachineId() {
        return Optional.ofNullable(this.virtualMachineId);
    }

    private ExtensionState() {}

    private ExtensionState(ExtensionState $) {
        this.autoUpgradeMinorVersion = $.autoUpgradeMinorVersion;
        this.automaticUpgradeEnabled = $.automaticUpgradeEnabled;
        this.name = $.name;
        this.protectedSettings = $.protectedSettings;
        this.publisher = $.publisher;
        this.settings = $.settings;
        this.tags = $.tags;
        this.type = $.type;
        this.typeHandlerVersion = $.typeHandlerVersion;
        this.virtualMachineId = $.virtualMachineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExtensionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExtensionState $;

        public Builder() {
            $ = new ExtensionState();
        }

        public Builder(ExtensionState defaults) {
            $ = new ExtensionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoUpgradeMinorVersion Specifies if the platform deploys
         * the latest minor version update to the `type_handler_version` specified.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(@Nullable Output<Boolean> autoUpgradeMinorVersion) {
            $.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * @param autoUpgradeMinorVersion Specifies if the platform deploys
         * the latest minor version update to the `type_handler_version` specified.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
            return autoUpgradeMinorVersion(Output.of(autoUpgradeMinorVersion));
        }

        /**
         * @param automaticUpgradeEnabled Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(@Nullable Output<Boolean> automaticUpgradeEnabled) {
            $.automaticUpgradeEnabled = automaticUpgradeEnabled;
            return this;
        }

        /**
         * @param automaticUpgradeEnabled Should the Extension be automatically updated whenever the Publisher releases a new version of this VM Extension? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder automaticUpgradeEnabled(Boolean automaticUpgradeEnabled) {
            return automaticUpgradeEnabled(Output.of(automaticUpgradeEnabled));
        }

        /**
         * @param name The name of the virtual machine extension peering. Changing
         * this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the virtual machine extension peering. Changing
         * this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param protectedSettings The protected_settings passed to the
         * extension, like settings, these are specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(@Nullable Output<String> protectedSettings) {
            $.protectedSettings = protectedSettings;
            return this;
        }

        /**
         * @param protectedSettings The protected_settings passed to the
         * extension, like settings, these are specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder protectedSettings(String protectedSettings) {
            return protectedSettings(Output.of(protectedSettings));
        }

        /**
         * @param publisher The publisher of the extension, available publishers can be found by using the Azure CLI. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(@Nullable Output<String> publisher) {
            $.publisher = publisher;
            return this;
        }

        /**
         * @param publisher The publisher of the extension, available publishers can be found by using the Azure CLI. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder publisher(String publisher) {
            return publisher(Output.of(publisher));
        }

        /**
         * @param settings The settings passed to the extension, these are
         * specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<String> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings The settings passed to the extension, these are
         * specified as a JSON object in a string.
         * 
         * @return builder
         * 
         */
        public Builder settings(String settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type The type of extension, available types for a publisher can
         * be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of extension, available types for a publisher can
         * be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to
         * use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(@Nullable Output<String> typeHandlerVersion) {
            $.typeHandlerVersion = typeHandlerVersion;
            return this;
        }

        /**
         * @param typeHandlerVersion Specifies the version of the extension to
         * use, available versions can be found using the Azure CLI.
         * 
         * @return builder
         * 
         */
        public Builder typeHandlerVersion(String typeHandlerVersion) {
            return typeHandlerVersion(Output.of(typeHandlerVersion));
        }

        /**
         * @param virtualMachineId The ID of the Virtual Machine. Changing this forces a new resource to be created
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(@Nullable Output<String> virtualMachineId) {
            $.virtualMachineId = virtualMachineId;
            return this;
        }

        /**
         * @param virtualMachineId The ID of the Virtual Machine. Changing this forces a new resource to be created
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineId(String virtualMachineId) {
            return virtualMachineId(Output.of(virtualMachineId));
        }

        public ExtensionState build() {
            return $;
        }
    }

}
