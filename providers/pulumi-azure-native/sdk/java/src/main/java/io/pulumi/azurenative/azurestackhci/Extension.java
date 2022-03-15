// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurestackhci.ExtensionArgs;
import io.pulumi.azurenative.azurestackhci.outputs.PerNodeExtensionStateResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Details of a particular extension in HCI Cluster.
 * API Version: 2021-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azurestackhci:Extension MicrosoftMonitoringAgent /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/test-rg/providers/Microsoft.AzureStackHCI/clusters/myCluster/arcSettings/default/extensions/MicrosoftMonitoringAgent 
 * ```
 * 
 */
@ResourceType(type="azure-native:azurestackhci:Extension")
public class Extension extends io.pulumi.resources.CustomResource {
    /**
     * Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     * 
     */
    @Export(name="aggregateState", type=String.class, parameters={})
    private Output<String> aggregateState;

    /**
     * @return Aggregate state of Arc Extensions across the nodes in this HCI cluster.
     * 
     */
    public Output<String> getAggregateState() {
        return this.aggregateState;
    }
    /**
     * Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    @Export(name="autoUpgradeMinorVersion", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoUpgradeMinorVersion;

    /**
     * @return Indicates whether the extension should use a newer minor version if one is available at deployment time. Once deployed, however, the extension will not upgrade minor versions unless redeployed, even with this property set to true.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdAt;

    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Output</* @Nullable */ String> getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The identity that created the resource.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    /**
     * @return The identity that created the resource.
     * 
     */
    public Output</* @Nullable */ String> getCreatedBy() {
        return this.createdBy;
    }
    /**
     * The type of identity that created the resource.
     * 
     */
    @Export(name="createdByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdByType;

    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Output</* @Nullable */ String> getCreatedByType() {
        return this.createdByType;
    }
    /**
     * How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    @Export(name="forceUpdateTag", type=String.class, parameters={})
    private Output</* @Nullable */ String> forceUpdateTag;

    /**
     * @return How the extension handler should be forced to update even if the extension configuration has not changed.
     * 
     */
    public Output</* @Nullable */ String> getForceUpdateTag() {
        return this.forceUpdateTag;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedAt;

    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * The identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedByType;

    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Output</* @Nullable */ String> getLastModifiedByType() {
        return this.lastModifiedByType;
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
     * State of Arc Extension in each of the nodes.
     * 
     */
    @Export(name="perNodeExtensionDetails", type=List.class, parameters={PerNodeExtensionStateResponse.class})
    private Output<List<PerNodeExtensionStateResponse>> perNodeExtensionDetails;

    /**
     * @return State of Arc Extension in each of the nodes.
     * 
     */
    public Output<List<PerNodeExtensionStateResponse>> getPerNodeExtensionDetails() {
        return this.perNodeExtensionDetails;
    }
    /**
     * Protected settings (may contain secrets).
     * 
     */
    @Export(name="protectedSettings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> protectedSettings;

    /**
     * @return Protected settings (may contain secrets).
     * 
     */
    public Output</* @Nullable */ Object> getProtectedSettings() {
        return this.protectedSettings;
    }
    /**
     * Provisioning state of the Extension proxy resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the Extension proxy resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The name of the extension handler publisher.
     * 
     */
    @Export(name="publisher", type=String.class, parameters={})
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
    @Export(name="settings", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> settings;

    /**
     * @return Json formatted public settings for the extension.
     * 
     */
    public Output</* @Nullable */ Object> getSettings() {
        return this.settings;
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
     * Specifies the version of the script handler.
     * 
     */
    @Export(name="typeHandlerVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> typeHandlerVersion;

    /**
     * @return Specifies the version of the script handler.
     * 
     */
    public Output</* @Nullable */ String> getTypeHandlerVersion() {
        return this.typeHandlerVersion;
    }

    public interface BuilderApplicator {
        public void apply(ExtensionArgs.Builder a);
    }
    private static io.pulumi.azurenative.azurestackhci.ExtensionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.azurestackhci.ExtensionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Extension(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Extension(String name) {
        this(name, ExtensionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Extension(String name, ExtensionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Extension(String name, ExtensionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurestackhci:Extension", name, args == null ? ExtensionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Extension(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurestackhci:Extension", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:azurestackhci/v20210101preview:Extension").build()),
                Output.of(Alias.builder().setType("azure-native:azurestackhci/v20210901:Extension").build()),
                Output.of(Alias.builder().setType("azure-native:azurestackhci/v20220101:Extension").build())
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
    public static Extension get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Extension(name, id, options);
    }
}
