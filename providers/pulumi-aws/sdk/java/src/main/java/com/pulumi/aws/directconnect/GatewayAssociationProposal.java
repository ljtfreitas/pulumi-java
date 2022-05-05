// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directconnect.GatewayAssociationProposalArgs;
import com.pulumi.aws.directconnect.inputs.GatewayAssociationProposalState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Direct Connect Gateway Association Proposal, typically for enabling cross-account associations. For single account associations, see the `aws.directconnect.GatewayAssociation` resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new GatewayAssociationProposal(&#34;example&#34;, GatewayAssociationProposalArgs.builder()        
 *             .dxGatewayId(aws_dx_gateway.getExample().getId())
 *             .dxGatewayOwnerAccountId(aws_dx_gateway.getExample().getOwner_account_id())
 *             .associatedGatewayId(aws_vpn_gateway.getExample().getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Direct Connect Gateway Association Proposals can be imported using either a proposal ID or proposal ID, Direct Connect Gateway ID and associated gateway ID separated by `/`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/gatewayAssociationProposal:GatewayAssociationProposal example ac90e981-b718-4364-872d-65478c84fafe
 * ```
 * 
 *  or
 * 
 * ```sh
 *  $ pulumi import aws:directconnect/gatewayAssociationProposal:GatewayAssociationProposal example ac90e981-b718-4364-872d-65478c84fafe/abcd1234-dcba-5678-be23-cdef9876ab45/vgw-12345678
 * ```
 * 
 *  The latter case is useful when a previous proposal has been accepted and deleted by AWS. The `aws_dx_gateway_association_proposal` resource will then represent a pseudo-proposal for the same Direct Connect Gateway and associated gateway. If no previous proposal is available, use a tool like [`uuidgen`](http://manpages.ubuntu.com/manpages/bionic/man1/uuidgen.1.html) to generate a new random pseudo-proposal ID.
 * 
 */
@ResourceType(type="aws:directconnect/gatewayAssociationProposal:GatewayAssociationProposal")
public class GatewayAssociationProposal extends com.pulumi.resources.CustomResource {
    /**
     * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
     * 
     */
    @Export(name="allowedPrefixes", type=List.class, parameters={String.class})
    private Output<List<String>> allowedPrefixes;

    /**
     * @return VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
     * 
     */
    public Output<List<String>> allowedPrefixes() {
        return this.allowedPrefixes;
    }
    /**
     * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
     * 
     */
    @Export(name="associatedGatewayId", type=String.class, parameters={})
    private Output<String> associatedGatewayId;

    /**
     * @return The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
     * 
     */
    public Output<String> associatedGatewayId() {
        return this.associatedGatewayId;
    }
    /**
     * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
     * 
     */
    @Export(name="associatedGatewayOwnerAccountId", type=String.class, parameters={})
    private Output<String> associatedGatewayOwnerAccountId;

    /**
     * @return The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
     * 
     */
    public Output<String> associatedGatewayOwnerAccountId() {
        return this.associatedGatewayOwnerAccountId;
    }
    /**
     * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
     * 
     */
    @Export(name="associatedGatewayType", type=String.class, parameters={})
    private Output<String> associatedGatewayType;

    /**
     * @return The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
     * 
     */
    public Output<String> associatedGatewayType() {
        return this.associatedGatewayType;
    }
    /**
     * Direct Connect Gateway identifier.
     * 
     */
    @Export(name="dxGatewayId", type=String.class, parameters={})
    private Output<String> dxGatewayId;

    /**
     * @return Direct Connect Gateway identifier.
     * 
     */
    public Output<String> dxGatewayId() {
        return this.dxGatewayId;
    }
    /**
     * AWS Account identifier of the Direct Connect Gateway&#39;s owner.
     * 
     */
    @Export(name="dxGatewayOwnerAccountId", type=String.class, parameters={})
    private Output<String> dxGatewayOwnerAccountId;

    /**
     * @return AWS Account identifier of the Direct Connect Gateway&#39;s owner.
     * 
     */
    public Output<String> dxGatewayOwnerAccountId() {
        return this.dxGatewayOwnerAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GatewayAssociationProposal(String name) {
        this(name, GatewayAssociationProposalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GatewayAssociationProposal(String name, GatewayAssociationProposalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayAssociationProposal(String name, GatewayAssociationProposalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/gatewayAssociationProposal:GatewayAssociationProposal", name, args == null ? GatewayAssociationProposalArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GatewayAssociationProposal(String name, Output<String> id, @Nullable GatewayAssociationProposalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directconnect/gatewayAssociationProposal:GatewayAssociationProposal", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static GatewayAssociationProposal get(String name, Output<String> id, @Nullable GatewayAssociationProposalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GatewayAssociationProposal(name, id, state, options);
    }
}
