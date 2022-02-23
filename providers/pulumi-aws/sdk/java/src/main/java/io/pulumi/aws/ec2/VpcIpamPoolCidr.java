// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.VpcIpamPoolCidrArgs;
import io.pulumi.aws.ec2.inputs.VpcIpamPoolCidrState;
import io.pulumi.aws.ec2.outputs.VpcIpamPoolCidrCidrAuthorizationContext;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provisions a CIDR from an IPAM address pool.
 * 
 * > **NOTE:** Provisioning Public IPv4 or Public IPv6 require [steps outside the scope of this resource](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#prepare-for-byoip). The resource accepts `message` and `signature` as part of the `cidr_authorization_context` attribute but those must be generated ahead of time. Public IPv6 CIDRs that are provisioned into a Pool with `publicly_advertisable = true` and all public IPv4 CIDRs also require creating a Route Origin Authorization (ROA) object in your Regional Internet Registry (RIR).
 * 
 * > **NOTE:** In order to deprovision CIDRs all Allocations must be released. Allocations created by a VPC take up to 30 minutes to be released. However, for IPAM to properly manage the removal of allocation records created by VPCs and other resources, you must [grant it permissions](https://docs.aws.amazon.com/vpc/latest/ipam/choose-single-user-or-orgs-ipam.html) in
 * either a single account or organizationally. If you are unable to deprovision a cidr after waiting over 30 minutes, you may be missing the Service Linked Role.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IPAMs can be imported using the `<cidr>_<ipam-pool-id>`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr example 172.2.0.0/24_ipam-pool-0e634f5a1517cccdc
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr")
public class VpcIpamPoolCidr extends io.pulumi.resources.CustomResource {
    /**
     * The CIDR you want to assign to the pool.
     * 
     */
    @OutputExport(name="cidr", type=String.class, parameters={})
    private Output<String> cidr;

    /**
     * @return The CIDR you want to assign to the pool.
     * 
     */
    public Output<String> getCidr() {
        return this.cidr;
    }
    /**
     * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidr_authorization_context for more information.
     * 
     */
    @OutputExport(name="cidrAuthorizationContext", type=VpcIpamPoolCidrCidrAuthorizationContext.class, parameters={})
    private Output</* @Nullable */ VpcIpamPoolCidrCidrAuthorizationContext> cidrAuthorizationContext;

    /**
     * @return A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidr_authorization_context for more information.
     * 
     */
    public Output</* @Nullable */ VpcIpamPoolCidrCidrAuthorizationContext> getCidrAuthorizationContext() {
        return this.cidrAuthorizationContext;
    }
    /**
     * The ID of the pool to which you want to assign a CIDR.
     * 
     */
    @OutputExport(name="ipamPoolId", type=String.class, parameters={})
    private Output<String> ipamPoolId;

    /**
     * @return The ID of the pool to which you want to assign a CIDR.
     * 
     */
    public Output<String> getIpamPoolId() {
        return this.ipamPoolId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcIpamPoolCidr(String name, VpcIpamPoolCidrArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr", name, args == null ? VpcIpamPoolCidrArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VpcIpamPoolCidr(String name, Input<String> id, @Nullable VpcIpamPoolCidrState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static VpcIpamPoolCidr get(String name, Input<String> id, @Nullable VpcIpamPoolCidrState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VpcIpamPoolCidr(name, id, state, options);
    }
}
