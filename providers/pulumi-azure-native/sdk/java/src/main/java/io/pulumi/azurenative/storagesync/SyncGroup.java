// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagesync.SyncGroupArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Sync Group object.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagesync:SyncGroup SampleSyncGroup_1 /subscriptions/3a048283-338f-4002-a9dd-a50fdadcb392/resourceGroups/SampleResourceGroup_1/providers/Microsoft.StorageSync/storageSyncServices/SampleStorageSyncService_1/syncGroups/SampleSyncGroup_1 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagesync:SyncGroup")
public class SyncGroup extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Sync group status
     * 
     */
    @Export(name="syncGroupStatus", type=String.class, parameters={})
    private Output<String> syncGroupStatus;

    /**
     * @return Sync group status
     * 
     */
    public Output<String> getSyncGroupStatus() {
        return this.syncGroupStatus;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Unique Id
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Unique Id
     * 
     */
    public Output<String> getUniqueId() {
        return this.uniqueId;
    }

    public interface BuilderApplicator {
        public void apply(SyncGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.storagesync.SyncGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storagesync.SyncGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SyncGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyncGroup(String name) {
        this(name, SyncGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyncGroup(String name, SyncGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyncGroup(String name, SyncGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:SyncGroup", name, args == null ? SyncGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SyncGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:SyncGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:storagesync/v20170605preview:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20180402:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20180701:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20181001:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20190201:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20190301:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20190601:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20191001:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20200301:SyncGroup").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20200901:SyncGroup").build())
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
    public static SyncGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SyncGroup(name, id, options);
    }
}
