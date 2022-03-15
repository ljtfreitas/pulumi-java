// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.NetworkSecurityGroupArgs;
import io.pulumi.azurenative.network.outputs.FlowLogResponse;
import io.pulumi.azurenative.network.outputs.NetworkInterfaceResponse;
import io.pulumi.azurenative.network.outputs.SecurityRuleResponse;
import io.pulumi.azurenative.network.outputs.SubnetResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * NetworkSecurityGroup resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:NetworkSecurityGroup testnsg /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/testnsg 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:NetworkSecurityGroup")
public class NetworkSecurityGroup extends io.pulumi.resources.CustomResource {
    /**
     * The default security rules of network security group.
     * 
     */
    @Export(name="defaultSecurityRules", type=List.class, parameters={SecurityRuleResponse.class})
    private Output<List<SecurityRuleResponse>> defaultSecurityRules;

    /**
     * @return The default security rules of network security group.
     * 
     */
    public Output<List<SecurityRuleResponse>> getDefaultSecurityRules() {
        return this.defaultSecurityRules;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * A collection of references to flow log resources.
     * 
     */
    @Export(name="flowLogs", type=List.class, parameters={FlowLogResponse.class})
    private Output<List<FlowLogResponse>> flowLogs;

    /**
     * @return A collection of references to flow log resources.
     * 
     */
    public Output<List<FlowLogResponse>> getFlowLogs() {
        return this.flowLogs;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A collection of references to network interfaces.
     * 
     */
    @Export(name="networkInterfaces", type=List.class, parameters={NetworkInterfaceResponse.class})
    private Output<List<NetworkInterfaceResponse>> networkInterfaces;

    /**
     * @return A collection of references to network interfaces.
     * 
     */
    public Output<List<NetworkInterfaceResponse>> getNetworkInterfaces() {
        return this.networkInterfaces;
    }
    /**
     * The provisioning state of the network security group resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the network security group resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the network security group resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the network security group resource.
     * 
     */
    public Output<String> getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * A collection of security rules of the network security group.
     * 
     */
    @Export(name="securityRules", type=List.class, parameters={SecurityRuleResponse.class})
    private Output</* @Nullable */ List<SecurityRuleResponse>> securityRules;

    /**
     * @return A collection of security rules of the network security group.
     * 
     */
    public Output</* @Nullable */ List<SecurityRuleResponse>> getSecurityRules() {
        return this.securityRules;
    }
    /**
     * A collection of references to subnets.
     * 
     */
    @Export(name="subnets", type=List.class, parameters={SubnetResponse.class})
    private Output<List<SubnetResponse>> subnets;

    /**
     * @return A collection of references to subnets.
     * 
     */
    public Output<List<SubnetResponse>> getSubnets() {
        return this.subnets;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
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
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(NetworkSecurityGroupArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.NetworkSecurityGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.NetworkSecurityGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public NetworkSecurityGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkSecurityGroup(String name) {
        this(name, NetworkSecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkSecurityGroup(String name, NetworkSecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkSecurityGroup(String name, NetworkSecurityGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkSecurityGroup", name, args == null ? NetworkSecurityGroupArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private NetworkSecurityGroup(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:NetworkSecurityGroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:network/v20150501preview:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20150615:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20160330:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20160601:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20160901:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20161201:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20170301:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20170601:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20170801:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20170901:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20171001:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20171101:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180101:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180201:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180401:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180601:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180701:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180801:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181001:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181101:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181201:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190201:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190401:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190601:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190701:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190801:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190901:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191101:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191201:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200301:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200401:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200501:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200601:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200701:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200801:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20201101:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210201:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210301:NetworkSecurityGroup").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210501:NetworkSecurityGroup").build())
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
    public static NetworkSecurityGroup get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkSecurityGroup(name, id, options);
    }
}
