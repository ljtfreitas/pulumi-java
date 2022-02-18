// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.AppServiceEnvironmentArgs;
import io.pulumi.azurenative.web.outputs.NameValuePairResponse;
import io.pulumi.azurenative.web.outputs.VirtualNetworkProfileResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * App Service Environment ARM resource.
 * API Version: 2020-12-01.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:web:AppServiceEnvironment myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/hostingEnvironments/{name} 
 * ```
 * 
 */
@ResourceType(type="azure-native:web:AppServiceEnvironment")
public class AppServiceEnvironment extends io.pulumi.resources.CustomResource {
    /**
     * Custom settings for changing the behavior of the App Service Environment.
     * 
     */
    @OutputExport(name="clusterSettings", type=List.class, parameters={NameValuePairResponse.class})
    private Output</* @Nullable */ List<NameValuePairResponse>> clusterSettings;

    /**
     * @return Custom settings for changing the behavior of the App Service Environment.
     * 
     */
    public Output</* @Nullable */ List<NameValuePairResponse>> getClusterSettings() {
        return this.clusterSettings;
    }
    /**
     * Dedicated Host Count
     * 
     */
    @OutputExport(name="dedicatedHostCount", type=Integer.class, parameters={})
    private Output<Integer> dedicatedHostCount;

    /**
     * @return Dedicated Host Count
     * 
     */
    public Output<Integer> getDedicatedHostCount() {
        return this.dedicatedHostCount;
    }
    /**
     * DNS suffix of the App Service Environment.
     * 
     */
    @OutputExport(name="dnsSuffix", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsSuffix;

    /**
     * @return DNS suffix of the App Service Environment.
     * 
     */
    public Output</* @Nullable */ String> getDnsSuffix() {
        return this.dnsSuffix;
    }
    /**
     * Scale factor for front-ends.
     * 
     */
    @OutputExport(name="frontEndScaleFactor", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> frontEndScaleFactor;

    /**
     * @return Scale factor for front-ends.
     * 
     */
    public Output</* @Nullable */ Integer> getFrontEndScaleFactor() {
        return this.frontEndScaleFactor;
    }
    /**
     * Flag that displays whether an ASE has linux workers or not
     * 
     */
    @OutputExport(name="hasLinuxWorkers", type=Boolean.class, parameters={})
    private Output<Boolean> hasLinuxWorkers;

    /**
     * @return Flag that displays whether an ASE has linux workers or not
     * 
     */
    public Output<Boolean> getHasLinuxWorkers() {
        return this.hasLinuxWorkers;
    }
    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
     */
    @OutputExport(name="internalLoadBalancingMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> internalLoadBalancingMode;

    /**
     * @return Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
     */
    public Output</* @Nullable */ String> getInternalLoadBalancingMode() {
        return this.internalLoadBalancingMode;
    }
    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     * 
     */
    @OutputExport(name="ipsslAddressCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ipsslAddressCount;

    /**
     * @return Number of IP SSL addresses reserved for the App Service Environment.
     * 
     */
    public Output</* @Nullable */ Integer> getIpsslAddressCount() {
        return this.ipsslAddressCount;
    }
    /**
     * Kind of resource.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Resource Location.
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Maximum number of VMs in the App Service Environment.
     * 
     */
    @OutputExport(name="maximumNumberOfMachines", type=Integer.class, parameters={})
    private Output<Integer> maximumNumberOfMachines;

    /**
     * @return Maximum number of VMs in the App Service Environment.
     * 
     */
    public Output<Integer> getMaximumNumberOfMachines() {
        return this.maximumNumberOfMachines;
    }
    /**
     * Number of front-end instances.
     * 
     */
    @OutputExport(name="multiRoleCount", type=Integer.class, parameters={})
    private Output<Integer> multiRoleCount;

    /**
     * @return Number of front-end instances.
     * 
     */
    public Output<Integer> getMultiRoleCount() {
        return this.multiRoleCount;
    }
    /**
     * Front-end VM size, e.g. "Medium", "Large".
     * 
     */
    @OutputExport(name="multiSize", type=String.class, parameters={})
    private Output</* @Nullable */ String> multiSize;

    /**
     * @return Front-end VM size, e.g. "Medium", "Large".
     * 
     */
    public Output</* @Nullable */ String> getMultiSize() {
        return this.multiSize;
    }
    /**
     * Resource Name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Provisioning state of the App Service Environment.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the App Service Environment.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Current status of the App Service Environment.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Current status of the App Service Environment.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * <code>true</code> if the App Service Environment is suspended; otherwise, <code>false</code>. The environment can be suspended, e.g. when the management endpoint is no longer available
     *  (most likely because NSG blocked the incoming traffic).
     * 
     */
    @OutputExport(name="suspended", type=Boolean.class, parameters={})
    private Output<Boolean> suspended;

    /**
     * @return <code>true</code> if the App Service Environment is suspended; otherwise, <code>false</code>. The environment can be suspended, e.g. when the management endpoint is no longer available
     *  (most likely because NSG blocked the incoming traffic).
     * 
     */
    public Output<Boolean> getSuspended() {
        return this.suspended;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * User added ip ranges to whitelist on ASE db
     * 
     */
    @OutputExport(name="userWhitelistedIpRanges", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> userWhitelistedIpRanges;

    /**
     * @return User added ip ranges to whitelist on ASE db
     * 
     */
    public Output</* @Nullable */ List<String>> getUserWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges;
    }
    /**
     * Description of the Virtual Network.
     * 
     */
    @OutputExport(name="virtualNetwork", type=VirtualNetworkProfileResponse.class, parameters={})
    private Output<VirtualNetworkProfileResponse> virtualNetwork;

    /**
     * @return Description of the Virtual Network.
     * 
     */
    public Output<VirtualNetworkProfileResponse> getVirtualNetwork() {
        return this.virtualNetwork;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppServiceEnvironment(String name, AppServiceEnvironmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:AppServiceEnvironment", name, args == null ? AppServiceEnvironmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private AppServiceEnvironment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:AppServiceEnvironment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160901:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:AppServiceEnvironment").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:AppServiceEnvironment").build())
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
    public static AppServiceEnvironment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AppServiceEnvironment(name, id, options);
    }
}
