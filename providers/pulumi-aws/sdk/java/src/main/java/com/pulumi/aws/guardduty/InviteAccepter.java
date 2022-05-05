// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.InviteAccepterArgs;
import com.pulumi.aws.guardduty.inputs.InviteAccepterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to accept a pending GuardDuty invite on creation, ensure the detector has the correct primary account on read, and disassociate with the primary account upon removal.
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
 *         var primary = new Provider(&#34;primary&#34;);
 * 
 *         var member = new Provider(&#34;member&#34;);
 * 
 *         var primaryDetector = new Detector(&#34;primaryDetector&#34;);
 * 
 *         var memberDetector = new Detector(&#34;memberDetector&#34;);
 * 
 *         var memberMember = new Member(&#34;memberMember&#34;, MemberArgs.builder()        
 *             .accountId(memberDetector.getAccountId())
 *             .detectorId(primaryDetector.getId())
 *             .email(&#34;required@example.com&#34;)
 *             .invite(true)
 *             .build());
 * 
 *         var memberInviteAccepter = new InviteAccepter(&#34;memberInviteAccepter&#34;, InviteAccepterArgs.builder()        
 *             .detectorId(memberDetector.getId())
 *             .masterAccountId(primaryDetector.getAccountId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_guardduty_invite_accepter` can be imported using the the member GuardDuty detector ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/inviteAccepter:InviteAccepter member 00b00fd5aecc0ab60a708659477e9617
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/inviteAccepter:InviteAccepter")
public class InviteAccepter extends com.pulumi.resources.CustomResource {
    /**
     * The detector ID of the member GuardDuty account.
     * 
     */
    @Export(name="detectorId", type=String.class, parameters={})
    private Output<String> detectorId;

    /**
     * @return The detector ID of the member GuardDuty account.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }
    /**
     * AWS account ID for primary account.
     * 
     */
    @Export(name="masterAccountId", type=String.class, parameters={})
    private Output<String> masterAccountId;

    /**
     * @return AWS account ID for primary account.
     * 
     */
    public Output<String> masterAccountId() {
        return this.masterAccountId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InviteAccepter(String name) {
        this(name, InviteAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InviteAccepter(String name, InviteAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InviteAccepter(String name, InviteAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/inviteAccepter:InviteAccepter", name, args == null ? InviteAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InviteAccepter(String name, Output<String> id, @Nullable InviteAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/inviteAccepter:InviteAccepter", name, state, makeResourceOptions(options, id));
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
    public static InviteAccepter get(String name, Output<String> id, @Nullable InviteAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InviteAccepter(name, id, state, options);
    }
}
