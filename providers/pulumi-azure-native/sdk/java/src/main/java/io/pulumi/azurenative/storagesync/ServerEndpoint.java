// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagesync.ServerEndpointArgs;
import io.pulumi.azurenative.storagesync.outputs.ServerEndpointCloudTieringStatusResponse;
import io.pulumi.azurenative.storagesync.outputs.ServerEndpointRecallStatusResponse;
import io.pulumi.azurenative.storagesync.outputs.ServerEndpointSyncStatusResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Server Endpoint object.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagesync:ServerEndpoint SampleServerEndpoint_1 /subscriptions/52b8da2f-61e0-4a1f-8dde-336911f367fb/resourceGroups/SampleResourceGroup_1/providers/Microsoft.StorageSync/storageSyncServices/SampleStorageSyncService_1/syncGroups/SampleSyncGroup_1/serverEndpoints/SampleServerEndpoint_1 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagesync:ServerEndpoint")
public class ServerEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * Cloud Tiering.
     * 
     */
    @Export(name="cloudTiering", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudTiering;

    /**
     * @return Cloud Tiering.
     * 
     */
    public Output</* @Nullable */ String> getCloudTiering() {
        return this.cloudTiering;
    }
    /**
     * Cloud tiering status. Only populated if cloud tiering is enabled.
     * 
     */
    @Export(name="cloudTieringStatus", type=ServerEndpointCloudTieringStatusResponse.class, parameters={})
    private Output<ServerEndpointCloudTieringStatusResponse> cloudTieringStatus;

    /**
     * @return Cloud tiering status. Only populated if cloud tiering is enabled.
     * 
     */
    public Output<ServerEndpointCloudTieringStatusResponse> getCloudTieringStatus() {
        return this.cloudTieringStatus;
    }
    /**
     * Friendly Name
     * 
     */
    @Export(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly Name
     * 
     */
    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Policy for how namespace and files are recalled during FastDr.
     * 
     */
    @Export(name="initialDownloadPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> initialDownloadPolicy;

    /**
     * @return Policy for how namespace and files are recalled during FastDr.
     * 
     */
    public Output</* @Nullable */ String> getInitialDownloadPolicy() {
        return this.initialDownloadPolicy;
    }
    /**
     * Resource Last Operation Name
     * 
     */
    @Export(name="lastOperationName", type=String.class, parameters={})
    private Output<String> lastOperationName;

    /**
     * @return Resource Last Operation Name
     * 
     */
    public Output<String> getLastOperationName() {
        return this.lastOperationName;
    }
    /**
     * ServerEndpoint lastWorkflowId
     * 
     */
    @Export(name="lastWorkflowId", type=String.class, parameters={})
    private Output<String> lastWorkflowId;

    /**
     * @return ServerEndpoint lastWorkflowId
     * 
     */
    public Output<String> getLastWorkflowId() {
        return this.lastWorkflowId;
    }
    /**
     * Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
     */
    @Export(name="localCacheMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> localCacheMode;

    /**
     * @return Policy for enabling follow-the-sun business models: link local cache to cloud behavior to pre-populate before local access.
     * 
     */
    public Output</* @Nullable */ String> getLocalCacheMode() {
        return this.localCacheMode;
    }
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
     * Offline data transfer
     * 
     */
    @Export(name="offlineDataTransfer", type=String.class, parameters={})
    private Output</* @Nullable */ String> offlineDataTransfer;

    /**
     * @return Offline data transfer
     * 
     */
    public Output</* @Nullable */ String> getOfflineDataTransfer() {
        return this.offlineDataTransfer;
    }
    /**
     * Offline data transfer share name
     * 
     */
    @Export(name="offlineDataTransferShareName", type=String.class, parameters={})
    private Output</* @Nullable */ String> offlineDataTransferShareName;

    /**
     * @return Offline data transfer share name
     * 
     */
    public Output</* @Nullable */ String> getOfflineDataTransferShareName() {
        return this.offlineDataTransferShareName;
    }
    /**
     * Offline data transfer storage account resource ID
     * 
     */
    @Export(name="offlineDataTransferStorageAccountResourceId", type=String.class, parameters={})
    private Output<String> offlineDataTransferStorageAccountResourceId;

    /**
     * @return Offline data transfer storage account resource ID
     * 
     */
    public Output<String> getOfflineDataTransferStorageAccountResourceId() {
        return this.offlineDataTransferStorageAccountResourceId;
    }
    /**
     * Offline data transfer storage account tenant ID
     * 
     */
    @Export(name="offlineDataTransferStorageAccountTenantId", type=String.class, parameters={})
    private Output<String> offlineDataTransferStorageAccountTenantId;

    /**
     * @return Offline data transfer storage account tenant ID
     * 
     */
    public Output<String> getOfflineDataTransferStorageAccountTenantId() {
        return this.offlineDataTransferStorageAccountTenantId;
    }
    /**
     * ServerEndpoint Provisioning State
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return ServerEndpoint Provisioning State
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Recall status. Only populated if cloud tiering is enabled.
     * 
     */
    @Export(name="recallStatus", type=ServerEndpointRecallStatusResponse.class, parameters={})
    private Output<ServerEndpointRecallStatusResponse> recallStatus;

    /**
     * @return Recall status. Only populated if cloud tiering is enabled.
     * 
     */
    public Output<ServerEndpointRecallStatusResponse> getRecallStatus() {
        return this.recallStatus;
    }
    /**
     * Server Local path.
     * 
     */
    @Export(name="serverLocalPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverLocalPath;

    /**
     * @return Server Local path.
     * 
     */
    public Output</* @Nullable */ String> getServerLocalPath() {
        return this.serverLocalPath;
    }
    /**
     * Server Resource Id.
     * 
     */
    @Export(name="serverResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serverResourceId;

    /**
     * @return Server Resource Id.
     * 
     */
    public Output</* @Nullable */ String> getServerResourceId() {
        return this.serverResourceId;
    }
    /**
     * Server Endpoint sync status
     * 
     */
    @Export(name="syncStatus", type=ServerEndpointSyncStatusResponse.class, parameters={})
    private Output<ServerEndpointSyncStatusResponse> syncStatus;

    /**
     * @return Server Endpoint sync status
     * 
     */
    public Output<ServerEndpointSyncStatusResponse> getSyncStatus() {
        return this.syncStatus;
    }
    /**
     * Tier files older than days.
     * 
     */
    @Export(name="tierFilesOlderThanDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> tierFilesOlderThanDays;

    /**
     * @return Tier files older than days.
     * 
     */
    public Output</* @Nullable */ Integer> getTierFilesOlderThanDays() {
        return this.tierFilesOlderThanDays;
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
     * Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
     */
    @Export(name="volumeFreeSpacePercent", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> volumeFreeSpacePercent;

    /**
     * @return Level of free space to be maintained by Cloud Tiering if it is enabled.
     * 
     */
    public Output</* @Nullable */ Integer> getVolumeFreeSpacePercent() {
        return this.volumeFreeSpacePercent;
    }

    public interface BuilderApplicator {
        public void apply(ServerEndpointArgs.Builder a);
    }
    private static io.pulumi.azurenative.storagesync.ServerEndpointArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.storagesync.ServerEndpointArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ServerEndpoint(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServerEndpoint(String name) {
        this(name, ServerEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServerEndpoint(String name, ServerEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServerEndpoint(String name, ServerEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:ServerEndpoint", name, args == null ? ServerEndpointArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ServerEndpoint(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:ServerEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:storagesync/v20170605preview:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20180402:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20180701:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20181001:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20190201:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20190301:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20190601:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20191001:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20200301:ServerEndpoint").build()),
                Output.of(Alias.builder().setType("azure-native:storagesync/v20200901:ServerEndpoint").build())
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
    public static ServerEndpoint get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ServerEndpoint(name, id, options);
    }
}
