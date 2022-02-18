// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.ArcAddonArgs;
import io.pulumi.azurenative.databoxedge.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Arc Addon.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databoxedge:ArcAddon arcName /subscriptions/4385cf00-2d3a-425a-832f-f4285b1c9dce/resourcegroups/GroupForEdgeAutomation/providers/Microsoft.DataBoxEdge/dataBoxEdgeDevices/addonExamples/roles/kubernetesRole/addons/arcName 
 * ```
 * 
 */
@ResourceType(type="azure-native:databoxedge:ArcAddon")
public class ArcAddon extends io.pulumi.resources.CustomResource {
    /**
     * Host OS supported by the Arc addon.
     * 
     */
    @OutputExport(name="hostPlatform", type=String.class, parameters={})
    private Output<String> hostPlatform;

    /**
     * @return Host OS supported by the Arc addon.
     * 
     */
    public Output<String> getHostPlatform() {
        return this.hostPlatform;
    }
    /**
     * Platform where the runtime is hosted.
     * 
     */
    @OutputExport(name="hostPlatformType", type=String.class, parameters={})
    private Output<String> hostPlatformType;

    /**
     * @return Platform where the runtime is hosted.
     * 
     */
    public Output<String> getHostPlatformType() {
        return this.hostPlatformType;
    }
    /**
     * Addon type.
     * Expected value is 'ArcForKubernetes'.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Addon type.
     * Expected value is 'ArcForKubernetes'.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The object name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The object name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Addon Provisioning State
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Addon Provisioning State
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Arc resource group name
     * 
     */
    @OutputExport(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return Arc resource group name
     * 
     */
    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * Arc resource location
     * 
     */
    @OutputExport(name="resourceLocation", type=String.class, parameters={})
    private Output<String> resourceLocation;

    /**
     * @return Arc resource location
     * 
     */
    public Output<String> getResourceLocation() {
        return this.resourceLocation;
    }
    /**
     * Arc resource Name
     * 
     */
    @OutputExport(name="resourceName", type=String.class, parameters={})
    private Output<String> resourceName;

    /**
     * @return Arc resource Name
     * 
     */
    public Output<String> getPropResourceName() {
        return this.resourceName;
    }
    /**
     * Arc resource subscription Id
     * 
     */
    @OutputExport(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    /**
     * @return Arc resource subscription Id
     * 
     */
    public Output<String> getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Addon type
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Addon type
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The hierarchical type of the object.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The hierarchical type of the object.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Arc resource version
     * 
     */
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Arc resource version
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ArcAddon(String name, ArcAddonArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:ArcAddon", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private ArcAddon(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databoxedge:ArcAddon", name, null, makeResourceOptions(options, id));
    }

    private static ArcAddonArgs makeArgs(ArcAddonArgs args) {
        var builder = args == null ? ArcAddonArgs.builder() : ArcAddonArgs.builder(args);
        return builder
            .setKind("ArcForKubernetes")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901:ArcAddon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20200901preview:ArcAddon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20201201:ArcAddon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201:ArcAddon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210201preview:ArcAddon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601:ArcAddon").build()),
                Input.of(Alias.builder().setType("azure-native:databoxedge/v20210601preview:ArcAddon").build())
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
    public static ArcAddon get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ArcAddon(name, id, options);
    }
}
