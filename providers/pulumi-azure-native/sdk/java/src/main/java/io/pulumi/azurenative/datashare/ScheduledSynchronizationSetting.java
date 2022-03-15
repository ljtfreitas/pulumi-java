// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ScheduledSynchronizationSettingArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A type of synchronization setting based on schedule
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:ScheduledSynchronizationSetting SynchronizationSetting1 /subscriptions/433a8dfd-e5d5-4e77-ad86-90acdc75eb1a/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/Account1/shares/Share1/synchronizationSettings/SynchronizationSetting1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:ScheduledSynchronizationSetting")
public class ScheduledSynchronizationSetting extends io.pulumi.resources.CustomResource {
    /**
     * Time at which the synchronization setting was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return Time at which the synchronization setting was created.
     * 
     */
    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Kind of synchronization setting.
     * Expected value is 'ScheduleBased'.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of synchronization setting.
     * Expected value is 'ScheduleBased'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Recurrence Interval
     * 
     */
    @Export(name="recurrenceInterval", type=String.class, parameters={})
    private Output<String> recurrenceInterval;

    /**
     * @return Recurrence Interval
     * 
     */
    public Output<String> getRecurrenceInterval() {
        return this.recurrenceInterval;
    }
    /**
     * Synchronization time
     * 
     */
    @Export(name="synchronizationTime", type=String.class, parameters={})
    private Output<String> synchronizationTime;

    /**
     * @return Synchronization time
     * 
     */
    public Output<String> getSynchronizationTime() {
        return this.synchronizationTime;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return System Data of the Azure resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Name of the user who created the synchronization setting.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return Name of the user who created the synchronization setting.
     * 
     */
    public Output<String> getUserName() {
        return this.userName;
    }

    public interface BuilderApplicator {
        public void apply(ScheduledSynchronizationSettingArgs.Builder a);
    }
    private static io.pulumi.azurenative.datashare.ScheduledSynchronizationSettingArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.datashare.ScheduledSynchronizationSettingArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ScheduledSynchronizationSetting(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduledSynchronizationSetting(String name) {
        this(name, ScheduledSynchronizationSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduledSynchronizationSetting(String name, ScheduledSynchronizationSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduledSynchronizationSetting(String name, ScheduledSynchronizationSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ScheduledSynchronizationSetting", name, makeArgs(args), makeResourceOptions(options, Output.empty()));
    }

    private ScheduledSynchronizationSetting(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ScheduledSynchronizationSetting", name, null, makeResourceOptions(options, id));
    }

    private static ScheduledSynchronizationSettingArgs makeArgs(ScheduledSynchronizationSettingArgs args) {
        var builder = args == null ? ScheduledSynchronizationSettingArgs.builder() : ScheduledSynchronizationSettingArgs.builder(args);
        return builder
            .kind("ScheduleBased")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:datashare/v20181101preview:ScheduledSynchronizationSetting").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20191101:ScheduledSynchronizationSetting").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20200901:ScheduledSynchronizationSetting").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20201001preview:ScheduledSynchronizationSetting").build()),
                Output.of(Alias.builder().setType("azure-native:datashare/v20210801:ScheduledSynchronizationSetting").build())
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
    public static ScheduledSynchronizationSetting get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ScheduledSynchronizationSetting(name, id, options);
    }
}
