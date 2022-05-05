// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ram;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ram.ResourceShareAccepterArgs;
import com.pulumi.aws.ram.inputs.ResourceShareAccepterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manage accepting a Resource Access Manager (RAM) Resource Share invitation. From a _receiver_ AWS account, accept an invitation to share resources that were shared by a _sender_ AWS account. To create a resource share in the _sender_, see the `aws.ram.ResourceShare` resource.
 * 
 * &gt; **Note:** If both AWS accounts are in the same Organization and [RAM Sharing with AWS Organizations is enabled](https://docs.aws.amazon.com/ram/latest/userguide/getting-started-sharing.html#getting-started-sharing-orgs), this resource is not necessary as RAM Resource Share invitations are not used.
 * 
 * ## Example Usage
 * 
 * This configuration provides an example of using multiple AWS providers to configure two different AWS accounts. In the _sender_ account, the configuration creates a `aws.ram.ResourceShare` and uses a data source in the _receiver_ account to create a `aws.ram.PrincipalAssociation` resource with the _receiver&#39;s_ account ID. In the _receiver_ account, the configuration accepts the invitation to share resources with the `aws.ram.ResourceShareAccepter`.
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
 *         var alternate = new Provider(&#34;alternate&#34;, ProviderArgs.builder()        
 *             .profile(&#34;profile1&#34;)
 *             .build());
 * 
 *         var senderShare = new ResourceShare(&#34;senderShare&#34;, ResourceShareArgs.builder()        
 *             .allowExternalPrincipals(true)
 *             .tags(Map.of(&#34;Name&#34;, &#34;tf-test-resource-share&#34;))
 *             .build());
 * 
 *         final var receiver = Output.of(AwsFunctions.getCallerIdentity());
 * 
 *         var senderInvite = new PrincipalAssociation(&#34;senderInvite&#34;, PrincipalAssociationArgs.builder()        
 *             .principal(receiver.apply(getCallerIdentityResult -&gt; getCallerIdentityResult.getAccountId()))
 *             .resourceShareArn(senderShare.getArn())
 *             .build());
 * 
 *         var receiverAccept = new ResourceShareAccepter(&#34;receiverAccept&#34;, ResourceShareAccepterArgs.builder()        
 *             .shareArn(senderInvite.getResourceShareArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Resource share accepters can be imported using the resource share ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ram/resourceShareAccepter:ResourceShareAccepter example arn:aws:ram:us-east-1:123456789012:resource-share/c4b56393-e8d9-89d9-6dc9-883752de4767
 * ```
 * 
 */
@ResourceType(type="aws:ram/resourceShareAccepter:ResourceShareAccepter")
public class ResourceShareAccepter extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the resource share invitation.
     * 
     */
    @Export(name="invitationArn", type=String.class, parameters={})
    private Output<String> invitationArn;

    /**
     * @return The ARN of the resource share invitation.
     * 
     */
    public Output<String> invitationArn() {
        return this.invitationArn;
    }
    /**
     * The account ID of the receiver account which accepts the invitation.
     * 
     */
    @Export(name="receiverAccountId", type=String.class, parameters={})
    private Output<String> receiverAccountId;

    /**
     * @return The account ID of the receiver account which accepts the invitation.
     * 
     */
    public Output<String> receiverAccountId() {
        return this.receiverAccountId;
    }
    /**
     * A list of the resource ARNs shared via the resource share.
     * 
     */
    @Export(name="resources", type=List.class, parameters={String.class})
    private Output<List<String>> resources;

    /**
     * @return A list of the resource ARNs shared via the resource share.
     * 
     */
    public Output<List<String>> resources() {
        return this.resources;
    }
    /**
     * The account ID of the sender account which submits the invitation.
     * 
     */
    @Export(name="senderAccountId", type=String.class, parameters={})
    private Output<String> senderAccountId;

    /**
     * @return The account ID of the sender account which submits the invitation.
     * 
     */
    public Output<String> senderAccountId() {
        return this.senderAccountId;
    }
    /**
     * The ARN of the resource share.
     * 
     */
    @Export(name="shareArn", type=String.class, parameters={})
    private Output<String> shareArn;

    /**
     * @return The ARN of the resource share.
     * 
     */
    public Output<String> shareArn() {
        return this.shareArn;
    }
    /**
     * The ID of the resource share as displayed in the console.
     * 
     */
    @Export(name="shareId", type=String.class, parameters={})
    private Output<String> shareId;

    /**
     * @return The ID of the resource share as displayed in the console.
     * 
     */
    public Output<String> shareId() {
        return this.shareId;
    }
    /**
     * The name of the resource share.
     * 
     */
    @Export(name="shareName", type=String.class, parameters={})
    private Output<String> shareName;

    /**
     * @return The name of the resource share.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }
    /**
     * The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceShareAccepter(String name) {
        this(name, ResourceShareAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceShareAccepter(String name, ResourceShareAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceShareAccepter(String name, ResourceShareAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceShareAccepter:ResourceShareAccepter", name, args == null ? ResourceShareAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceShareAccepter(String name, Output<String> id, @Nullable ResourceShareAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ram/resourceShareAccepter:ResourceShareAccepter", name, state, makeResourceOptions(options, id));
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
    public static ResourceShareAccepter get(String name, Output<String> id, @Nullable ResourceShareAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceShareAccepter(name, id, state, options);
    }
}
