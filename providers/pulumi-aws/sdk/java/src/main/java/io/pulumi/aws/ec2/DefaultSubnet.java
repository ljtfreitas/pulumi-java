// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.DefaultSubnetArgs;
import io.pulumi.aws.ec2.inputs.DefaultSubnetState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a [default AWS VPC subnet](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html#default-vpc-basics) in the current region.
 * 
 * The `aws.ec2.DefaultSubnet` behaves differently from normal resources, in that this provider does not _create_ this resource but instead "adopts" it into management.
 * 
 * The `aws.ec2.DefaultSubnet` resource allows you to manage a region's default VPC subnet but this provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile and the provider management.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Subnets can be imported using the `subnet id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/defaultSubnet:DefaultSubnet public_subnet subnet-9d4a7b6c
 * ```
 * 
 */
@ResourceType(type="aws:ec2/defaultSubnet:DefaultSubnet")
public class DefaultSubnet extends io.pulumi.resources.CustomResource {
    /**
     * ARN for the subnet.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN for the subnet.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    @Export(name="assignIpv6AddressOnCreation", type=Boolean.class, parameters={})
    private Output<Boolean> assignIpv6AddressOnCreation;

    /**
     * @return Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    public Output<Boolean> getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }
    /**
     * AZ for the subnet.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return AZ for the subnet.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    @Export(name="availabilityZoneId", type=String.class, parameters={})
    private Output<String> availabilityZoneId;

    public Output<String> getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * CIDR block for the subnet.
     * 
     */
    @Export(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return CIDR block for the subnet.
     * 
     */
    public Output<String> getCidrBlock() {
        return this.cidrBlock;
    }
    @Export(name="customerOwnedIpv4Pool", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    public Output</* @Nullable */ String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    @Export(name="enableDns64", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDns64;

    public Output</* @Nullable */ Boolean> getEnableDns64() {
        return this.enableDns64;
    }
    @Export(name="enableResourceNameDnsARecordOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableResourceNameDnsARecordOnLaunch;

    public Output</* @Nullable */ Boolean> getEnableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch;
    }
    @Export(name="enableResourceNameDnsAaaaRecordOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableResourceNameDnsAaaaRecordOnLaunch;

    public Output</* @Nullable */ Boolean> getEnableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch;
    }
    /**
     * IPv6 CIDR block.
     * 
     */
    @Export(name="ipv6CidrBlock", type=String.class, parameters={})
    private Output<String> ipv6CidrBlock;

    /**
     * @return IPv6 CIDR block.
     * 
     */
    public Output<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    @Export(name="ipv6CidrBlockAssociationId", type=String.class, parameters={})
    private Output<String> ipv6CidrBlockAssociationId;

    public Output<String> getIpv6CidrBlockAssociationId() {
        return this.ipv6CidrBlockAssociationId;
    }
    @Export(name="ipv6Native", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ipv6Native;

    public Output</* @Nullable */ Boolean> getIpv6Native() {
        return this.ipv6Native;
    }
    @Export(name="mapCustomerOwnedIpOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mapCustomerOwnedIpOnLaunch;

    public Output</* @Nullable */ Boolean> getMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }
    /**
     * Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    @Export(name="mapPublicIpOnLaunch", type=Boolean.class, parameters={})
    private Output<Boolean> mapPublicIpOnLaunch;

    /**
     * @return Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    public Output<Boolean> getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }
    @Export(name="outpostArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> outpostArn;

    public Output</* @Nullable */ String> getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * ID of the AWS account that owns the subnet.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return ID of the AWS account that owns the subnet.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    @Export(name="privateDnsHostnameTypeOnLaunch", type=String.class, parameters={})
    private Output<String> privateDnsHostnameTypeOnLaunch;

    public Output<String> getPrivateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch;
    }
    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * VPC ID.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VPC ID.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(DefaultSubnetArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.DefaultSubnetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.DefaultSubnetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DefaultSubnet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultSubnet(String name) {
        this(name, DefaultSubnetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultSubnet(String name, DefaultSubnetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultSubnet(String name, DefaultSubnetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultSubnet:DefaultSubnet", name, args == null ? DefaultSubnetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DefaultSubnet(String name, Output<String> id, @Nullable DefaultSubnetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultSubnet:DefaultSubnet", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DefaultSubnet get(String name, Output<String> id, @Nullable DefaultSubnetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DefaultSubnet(name, id, state, options);
    }
}
