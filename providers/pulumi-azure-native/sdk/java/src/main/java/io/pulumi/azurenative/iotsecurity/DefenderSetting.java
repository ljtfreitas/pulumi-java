// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.iotsecurity.DefenderSettingArgs;
import io.pulumi.azurenative.iotsecurity.outputs.DefenderSettingsPropertiesResponseMdeIntegration;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * IoT Defender settings
 * API Version: 2021-02-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:iotsecurity:DefenderSetting default /subscriptions/{subscriptionId}/providers/Microsoft.IoTSecurity/defenderSettings/default 
 * ```
 * 
 */
@ResourceType(type="azure-native:iotsecurity:DefenderSetting")
public class DefenderSetting extends io.pulumi.resources.CustomResource {
    /**
     * Size of the device quota. Value is required to be in multiples of 100.
     * 
     */
    @OutputExport(name="deviceQuota", type=Integer.class, parameters={})
    private Output<Integer> deviceQuota;

    /**
     * @return Size of the device quota. Value is required to be in multiples of 100.
     * 
     */
    public Output<Integer> getDeviceQuota() {
        return this.deviceQuota;
    }
    /**
     * End time of the evaluation period, if such exist
     * 
     */
    @OutputExport(name="evaluationEndTime", type=String.class, parameters={})
    private Output<String> evaluationEndTime;

    /**
     * @return End time of the evaluation period, if such exist
     * 
     */
    public Output<String> getEvaluationEndTime() {
        return this.evaluationEndTime;
    }
    /**
     * MDE integration configuration
     * 
     */
    @OutputExport(name="mdeIntegration", type=DefenderSettingsPropertiesResponseMdeIntegration.class, parameters={})
    private Output<DefenderSettingsPropertiesResponseMdeIntegration> mdeIntegration;

    /**
     * @return MDE integration configuration
     * 
     */
    public Output<DefenderSettingsPropertiesResponseMdeIntegration> getMdeIntegration() {
        return this.mdeIntegration;
    }
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The kind of onboarding for the subscription
     * 
     */
    @OutputExport(name="onboardingKind", type=String.class, parameters={})
    private Output<String> onboardingKind;

    /**
     * @return The kind of onboarding for the subscription
     * 
     */
    public Output<String> getOnboardingKind() {
        return this.onboardingKind;
    }
    /**
     * Sentinel Workspace Resource Ids
     * 
     */
    @OutputExport(name="sentinelWorkspaceResourceIds", type=List.class, parameters={String.class})
    private Output<List<String>> sentinelWorkspaceResourceIds;

    /**
     * @return Sentinel Workspace Resource Ids
     * 
     */
    public Output<List<String>> getSentinelWorkspaceResourceIds() {
        return this.sentinelWorkspaceResourceIds;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefenderSetting(String name, DefenderSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:iotsecurity:DefenderSetting", name, args == null ? DefenderSettingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DefenderSetting(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:iotsecurity:DefenderSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:iotsecurity/v20210201preview:DefenderSetting").build())
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
    public static DefenderSetting get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefenderSetting(name, id, options);
    }
}
