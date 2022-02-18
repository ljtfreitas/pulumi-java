// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storagesync.CloudEndpointArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Cloud Endpoint object.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:storagesync:CloudEndpoint SampleCloudEndpoint_1 /subscriptions/52b8da2f-61e0-4a1f-8dde-336911f367fb/resourceGroups/SampleResourceGroup_1/providers/Microsoft.StorageSync/storageSyncServices/SampleStorageSyncService_1/syncGroups/SampleSyncGroup_1/cloudEndpoints/SampleCloudEndpoint_1 
 * ```
 * 
 */
@ResourceType(type="azure-native:storagesync:CloudEndpoint")
public class CloudEndpoint extends io.pulumi.resources.CustomResource {
    /**
     * Azure file share name
     * 
     */
    @OutputExport(name="azureFileShareName", type=String.class, parameters={})
    private Output</* @Nullable */ String> azureFileShareName;

    /**
     * @return Azure file share name
     * 
     */
    public Output</* @Nullable */ String> getAzureFileShareName() {
        return this.azureFileShareName;
    }
    /**
     * Backup Enabled
     * 
     */
    @OutputExport(name="backupEnabled", type=String.class, parameters={})
    private Output<String> backupEnabled;

    /**
     * @return Backup Enabled
     * 
     */
    public Output<String> getBackupEnabled() {
        return this.backupEnabled;
    }
    /**
     * Friendly Name
     * 
     */
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    /**
     * @return Friendly Name
     * 
     */
    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    /**
     * Resource Last Operation Name
     * 
     */
    @OutputExport(name="lastOperationName", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastOperationName;

    /**
     * @return Resource Last Operation Name
     * 
     */
    public Output</* @Nullable */ String> getLastOperationName() {
        return this.lastOperationName;
    }
    /**
     * CloudEndpoint lastWorkflowId
     * 
     */
    @OutputExport(name="lastWorkflowId", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastWorkflowId;

    /**
     * @return CloudEndpoint lastWorkflowId
     * 
     */
    public Output</* @Nullable */ String> getLastWorkflowId() {
        return this.lastWorkflowId;
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
     * Partnership Id
     * 
     */
    @OutputExport(name="partnershipId", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnershipId;

    /**
     * @return Partnership Id
     * 
     */
    public Output</* @Nullable */ String> getPartnershipId() {
        return this.partnershipId;
    }
    /**
     * CloudEndpoint Provisioning State
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return CloudEndpoint Provisioning State
     * 
     */
    public Output</* @Nullable */ String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Storage Account Resource Id
     * 
     */
    @OutputExport(name="storageAccountResourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountResourceId;

    /**
     * @return Storage Account Resource Id
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountResourceId() {
        return this.storageAccountResourceId;
    }
    /**
     * Storage Account Tenant Id
     * 
     */
    @OutputExport(name="storageAccountTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountTenantId;

    /**
     * @return Storage Account Tenant Id
     * 
     */
    public Output</* @Nullable */ String> getStorageAccountTenantId() {
        return this.storageAccountTenantId;
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
    public CloudEndpoint(String name, CloudEndpointArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:CloudEndpoint", name, args == null ? CloudEndpointArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private CloudEndpoint(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:storagesync:CloudEndpoint", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:storagesync/v20170605preview:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20180402:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20180701:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20181001:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20190201:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20190301:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20190601:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20191001:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20200301:CloudEndpoint").build()),
                Input.of(Alias.builder().setType("azure-native:storagesync/v20200901:CloudEndpoint").build())
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
    public static CloudEndpoint get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CloudEndpoint(name, id, options);
    }
}
