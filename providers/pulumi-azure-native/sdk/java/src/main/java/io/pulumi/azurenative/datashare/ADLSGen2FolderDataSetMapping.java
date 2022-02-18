// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.ADLSGen2FolderDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An ADLS Gen2 folder data set mapping.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:datashare:ADLSGen2FolderDataSetMapping datasetMappingName1 /subscriptions/0f3dcfc3-18f8-4099-b381-8353e19d43a7/resourceGroups/SampleResourceGroup/providers/Microsoft.DataShare/accounts/consumerAccount/shareSubscriptions/ShareSubscription1/dataSetMappings/datasetMappingName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:datashare:ADLSGen2FolderDataSetMapping")
public class ADLSGen2FolderDataSetMapping extends io.pulumi.resources.CustomResource {
    /**
     * The id of the source data set.
     * 
     */
    @OutputExport(name="dataSetId", type=String.class, parameters={})
    private Output<String> dataSetId;

    /**
     * @return The id of the source data set.
     * 
     */
    public Output<String> getDataSetId() {
        return this.dataSetId;
    }
    /**
     * Gets the status of the data set mapping.
     * 
     */
    @OutputExport(name="dataSetMappingStatus", type=String.class, parameters={})
    private Output<String> dataSetMappingStatus;

    /**
     * @return Gets the status of the data set mapping.
     * 
     */
    public Output<String> getDataSetMappingStatus() {
        return this.dataSetMappingStatus;
    }
    /**
     * File system to which the folder belongs.
     * 
     */
    @OutputExport(name="fileSystem", type=String.class, parameters={})
    private Output<String> fileSystem;

    /**
     * @return File system to which the folder belongs.
     * 
     */
    public Output<String> getFileSystem() {
        return this.fileSystem;
    }
    /**
     * Folder path within the file system.
     * 
     */
    @OutputExport(name="folderPath", type=String.class, parameters={})
    private Output<String> folderPath;

    /**
     * @return Folder path within the file system.
     * 
     */
    public Output<String> getFolderPath() {
        return this.folderPath;
    }
    /**
     * Kind of data set mapping.
     * Expected value is 'AdlsGen2Folder'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Kind of data set mapping.
     * Expected value is 'AdlsGen2Folder'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the azure resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the data set mapping.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the data set mapping.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource group of storage account.
     * 
     */
    @OutputExport(name="resourceGroup", type=String.class, parameters={})
    private Output<String> resourceGroup;

    /**
     * @return Resource group of storage account.
     * 
     */
    public Output<String> getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set.
     * 
     */
    @OutputExport(name="storageAccountName", type=String.class, parameters={})
    private Output<String> storageAccountName;

    /**
     * @return Storage account name of the source data set.
     * 
     */
    public Output<String> getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account.
     * 
     */
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Subscription id of storage account.
     * 
     */
    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
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
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the azure resource
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
    public ADLSGen2FolderDataSetMapping(String name, ADLSGen2FolderDataSetMappingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen2FolderDataSetMapping", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ADLSGen2FolderDataSetMapping(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:datashare:ADLSGen2FolderDataSetMapping", name, null, makeResourceOptions(options, id));
    }

    private static ADLSGen2FolderDataSetMappingArgs makeArgs(ADLSGen2FolderDataSetMappingArgs args) {
        var builder = args == null ? ADLSGen2FolderDataSetMappingArgs.builder() : ADLSGen2FolderDataSetMappingArgs.builder(args);
        return builder
            .setKind("AdlsGen2Folder")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:datashare/v20181101preview:ADLSGen2FolderDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20191101:ADLSGen2FolderDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20200901:ADLSGen2FolderDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20201001preview:ADLSGen2FolderDataSetMapping").build()),
                Input.of(Alias.builder().setType("azure-native:datashare/v20210801:ADLSGen2FolderDataSetMapping").build())
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
    public static ADLSGen2FolderDataSetMapping get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ADLSGen2FolderDataSetMapping(name, id, options);
    }
}
