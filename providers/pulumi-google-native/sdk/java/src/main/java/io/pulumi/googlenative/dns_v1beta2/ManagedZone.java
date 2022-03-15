// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dns_v1beta2.ManagedZoneArgs;
import io.pulumi.googlenative.dns_v1beta2.outputs.ManagedZoneCloudLoggingConfigResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.ManagedZoneDnsSecConfigResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.ManagedZoneForwardingConfigResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.ManagedZonePeeringConfigResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.ManagedZonePrivateVisibilityConfigResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.ManagedZoneReverseLookupConfigResponse;
import io.pulumi.googlenative.dns_v1beta2.outputs.ManagedZoneServiceDirectoryConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new ManagedZone.
 * 
 */
@ResourceType(type="google-native:dns/v1beta2:ManagedZone")
public class ManagedZone extends io.pulumi.resources.CustomResource {
    @Export(name="cloudLoggingConfig", type=ManagedZoneCloudLoggingConfigResponse.class, parameters={})
    private Output<ManagedZoneCloudLoggingConfigResponse> cloudLoggingConfig;

    public Output<ManagedZoneCloudLoggingConfigResponse> getCloudLoggingConfig() {
        return this.cloudLoggingConfig;
    }
    /**
     * The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    public Output<String> getCreationTime() {
        return this.creationTime;
    }
    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    public Output<String> getDnsName() {
        return this.dnsName;
    }
    /**
     * DNSSEC configuration.
     * 
     */
    @Export(name="dnssecConfig", type=ManagedZoneDnsSecConfigResponse.class, parameters={})
    private Output<ManagedZoneDnsSecConfigResponse> dnssecConfig;

    /**
     * @return DNSSEC configuration.
     * 
     */
    public Output<ManagedZoneDnsSecConfigResponse> getDnssecConfig() {
        return this.dnssecConfig;
    }
    /**
     * The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    @Export(name="forwardingConfig", type=ManagedZoneForwardingConfigResponse.class, parameters={})
    private Output<ManagedZoneForwardingConfigResponse> forwardingConfig;

    /**
     * @return The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    public Output<ManagedZoneForwardingConfigResponse> getForwardingConfig() {
        return this.forwardingConfig;
    }
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * User labels.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User labels.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    @Export(name="nameServerSet", type=String.class, parameters={})
    private Output<String> nameServerSet;

    /**
     * @return Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    public Output<String> getNameServerSet() {
        return this.nameServerSet;
    }
    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    /**
     * @return Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    public Output<List<String>> getNameServers() {
        return this.nameServers;
    }
    /**
     * The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    @Export(name="peeringConfig", type=ManagedZonePeeringConfigResponse.class, parameters={})
    private Output<ManagedZonePeeringConfigResponse> peeringConfig;

    /**
     * @return The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    public Output<ManagedZonePeeringConfigResponse> getPeeringConfig() {
        return this.peeringConfig;
    }
    /**
     * For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    @Export(name="privateVisibilityConfig", type=ManagedZonePrivateVisibilityConfigResponse.class, parameters={})
    private Output<ManagedZonePrivateVisibilityConfigResponse> privateVisibilityConfig;

    /**
     * @return For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    public Output<ManagedZonePrivateVisibilityConfigResponse> getPrivateVisibilityConfig() {
        return this.privateVisibilityConfig;
    }
    /**
     * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    @Export(name="reverseLookupConfig", type=ManagedZoneReverseLookupConfigResponse.class, parameters={})
    private Output<ManagedZoneReverseLookupConfigResponse> reverseLookupConfig;

    /**
     * @return The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    public Output<ManagedZoneReverseLookupConfigResponse> getReverseLookupConfig() {
        return this.reverseLookupConfig;
    }
    /**
     * This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    @Export(name="serviceDirectoryConfig", type=ManagedZoneServiceDirectoryConfigResponse.class, parameters={})
    private Output<ManagedZoneServiceDirectoryConfigResponse> serviceDirectoryConfig;

    /**
     * @return This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    public Output<ManagedZoneServiceDirectoryConfigResponse> getServiceDirectoryConfig() {
        return this.serviceDirectoryConfig;
    }
    /**
     * The zone's visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    @Export(name="visibility", type=String.class, parameters={})
    private Output<String> visibility;

    /**
     * @return The zone's visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    public Output<String> getVisibility() {
        return this.visibility;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ManagedZoneArgs.Builder a);
    }
    private static io.pulumi.googlenative.dns_v1beta2.ManagedZoneArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.dns_v1beta2.ManagedZoneArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ManagedZone(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagedZone(String name) {
        this(name, ManagedZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagedZone(String name, @Nullable ManagedZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagedZone(String name, @Nullable ManagedZoneArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ManagedZone", name, args == null ? ManagedZoneArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ManagedZone(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:dns/v1beta2:ManagedZone", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static ManagedZone get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ManagedZone(name, id, options);
    }
}
