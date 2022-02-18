// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.WorkloadNetworkDnsZoneArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * NSX DNS Zone
 * API Version: 2020-07-17-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:avs:WorkloadNetworkDnsZone dnsZone1 /subscriptions/{subscription-id}/resourceGroups/group1/providers/Microsoft.AVS/privateClouds/cloud1/workloadNetworks/default/dnsZones/dnsZone1 
 * ```
 * 
 */
@ResourceType(type="azure-native:avs:WorkloadNetworkDnsZone")
public class WorkloadNetworkDnsZone extends io.pulumi.resources.CustomResource {
    /**
     * Display name of the DNS Zone.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name of the DNS Zone.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * DNS Server IP array of the DNS Zone.
     * 
     */
    @OutputExport(name="dnsServerIps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> dnsServerIps;

    /**
     * @return DNS Server IP array of the DNS Zone.
     * 
     */
    public Output</* @Nullable */ List<String>> getDnsServerIps() {
        return this.dnsServerIps;
    }
    /**
     * Number of DNS Services using the DNS zone.
     * 
     */
    @OutputExport(name="dnsServices", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> dnsServices;

    /**
     * @return Number of DNS Services using the DNS zone.
     * 
     */
    public Output</* @Nullable */ Double> getDnsServices() {
        return this.dnsServices;
    }
    /**
     * Domain names of the DNS Zone.
     * 
     */
    @OutputExport(name="domain", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> domain;

    /**
     * @return Domain names of the DNS Zone.
     * 
     */
    public Output</* @Nullable */ List<String>> getDomain() {
        return this.domain;
    }
    /**
     * Resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The provisioning state
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
     */
    @OutputExport(name="revision", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> revision;

    /**
     * @return NSX revision number.
     * 
     */
    public Output</* @Nullable */ Double> getRevision() {
        return this.revision;
    }
    /**
     * Source IP of the DNS Zone.
     * 
     */
    @OutputExport(name="sourceIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceIp;

    /**
     * @return Source IP of the DNS Zone.
     * 
     */
    public Output</* @Nullable */ String> getSourceIp() {
        return this.sourceIp;
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
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadNetworkDnsZone(String name, WorkloadNetworkDnsZoneArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkDnsZone", name, args == null ? WorkloadNetworkDnsZoneArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WorkloadNetworkDnsZone(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:avs:WorkloadNetworkDnsZone", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:avs/v20200717preview:WorkloadNetworkDnsZone").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210101preview:WorkloadNetworkDnsZone").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20210601:WorkloadNetworkDnsZone").build()),
                Input.of(Alias.builder().setType("azure-native:avs/v20211201:WorkloadNetworkDnsZone").build())
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
    public static WorkloadNetworkDnsZone get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadNetworkDnsZone(name, id, options);
    }
}
