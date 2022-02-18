// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.VirtualMachineScaleSetVMExtensionArgs;
import io.pulumi.azurenative.compute.outputs.VirtualMachineExtensionInstanceViewResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Describes a VMSS VM Extension.
 * API Version: 2021-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:compute:VirtualMachineScaleSetVMExtension myVMExtension /subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachineScaleSets/myvmScaleSet/virtualMachines/0/extensions/myVMExtension 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:VirtualMachineScaleSetVMExtension")
public class VirtualMachineScaleSetVMExtension extends io.pulumi.resources.CustomResource {
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @OutputExport(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    /**
     * @return Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }
    /**
     * Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    @OutputExport(name="enableAutomaticUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableAutomaticUpgrade;

    /**
     * @return Indicates whether the extension should be automatically upgraded by the platform if there is a newer version of the extension available.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableAutomaticUpgrade() {
        return this.enableAutomaticUpgrade;
    }
    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @OutputExport(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    public Output</* @Nullable */ String> getForceUpdateTag() {
        return this.forceUpdateTag;
    }
    /**
     * The virtual machine extension instance view.
     * 
     */
    @OutputExport(name="instanceView", type=VirtualMachineExtensionInstanceViewResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineExtensionInstanceViewResponse> instanceView;

    /**
     * @return The virtual machine extension instance view.
     * 
     */
    public Output</* @Nullable */ VirtualMachineExtensionInstanceViewResponse> getInstanceView() {
        return this.instanceView;
    }
    /**
     * The name of the extension.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the extension.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    @OutputExport(name="protectedSettings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> protectedSettings;

    /**
     * @return The extension can contain either protectedSettings or protectedSettingsFromKeyVault or no protected settings at all.
     * 
     */
    public Output</* @Nullable */ Object> getProtectedSettings() {
        return this.protectedSettings;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state, which only appears in the response.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the extension handler publisher.
     * 
     */
    @OutputExport(name="publisher", type=String.class, parameters={})
    private Output</* @Nullable */ String> publisher;

    /**
     * @return The name of the extension handler publisher.
     * 
     */
    public Output</* @Nullable */ String> getPublisher() {
        return this.publisher;
    }
    /**
     * Json formatted public settings for the extension.
     * 
     */
    @OutputExport(name="settings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> settings;

    /**
     * @return Json formatted public settings for the extension.
     * 
     */
    public Output</* @Nullable */ Object> getSettings() {
        return this.settings;
    }
    /**
     * Resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Specifies the version of the script handler.
     * 
     */
    @OutputExport(name="typeHandlerVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeHandlerVersion;

    /**
     * @return Specifies the version of the script handler.
     * 
     */
    public Output</* @Nullable */ String> getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMachineScaleSetVMExtension(String name, VirtualMachineScaleSetVMExtensionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVMExtension", name, args == null ? VirtualMachineScaleSetVMExtensionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualMachineScaleSetVMExtension(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineScaleSetVMExtension", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20190701:VirtualMachineScaleSetVMExtension").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20191201:VirtualMachineScaleSetVMExtension").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20200601:VirtualMachineScaleSetVMExtension").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20201201:VirtualMachineScaleSetVMExtension").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210301:VirtualMachineScaleSetVMExtension").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:VirtualMachineScaleSetVMExtension").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:VirtualMachineScaleSetVMExtension").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:VirtualMachineScaleSetVMExtension").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualMachineScaleSetVMExtension get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineScaleSetVMExtension(name, id, options);
    }
}
