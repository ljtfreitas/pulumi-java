// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.LogDestinationPolicyArgs;
import com.pulumi.aws.cloudwatch.inputs.LogDestinationPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Logs destination policy resource.
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
 *         var testDestination = new LogDestination(&#34;testDestination&#34;, LogDestinationArgs.builder()        
 *             .roleArn(aws_iam_role.getIam_for_cloudwatch().getArn())
 *             .targetArn(aws_kinesis_stream.getKinesis_for_cloudwatch().getArn())
 *             .build());
 * 
 *         final var testDestinationPolicyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatement.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipal.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;123456789012&#34;)
 *                     .build())
 *                 .actions(&#34;logs:PutSubscriptionFilter&#34;)
 *                 .resources(testDestination.getArn())
 *                 .build())
 *             .build());
 * 
 *         var testDestinationPolicyLogDestinationPolicy = new LogDestinationPolicy(&#34;testDestinationPolicyLogDestinationPolicy&#34;, LogDestinationPolicyArgs.builder()        
 *             .destinationName(testDestination.getName())
 *             .accessPolicy(testDestinationPolicyPolicyDocument.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult).apply(testDestinationPolicyPolicyDocument -&gt; testDestinationPolicyPolicyDocument.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult.getJson())))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * CloudWatch Logs destination policies can be imported using the `destination_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy test_destination_policy test_destination
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy")
public class LogDestinationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Export(name="accessPolicy", type=String.class, parameters={})
    private Output<String> accessPolicy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * 
     */
    public Output<String> accessPolicy() {
        return this.accessPolicy;
    }
    /**
     * A name for the subscription filter
     * 
     */
    @Export(name="destinationName", type=String.class, parameters={})
    private Output<String> destinationName;

    /**
     * @return A name for the subscription filter
     * 
     */
    public Output<String> destinationName() {
        return this.destinationName;
    }
    /**
     * Specify true if you are updating an existing destination policy to grant permission to an organization ID instead of granting permission to individual AWS accounts.
     * 
     */
    @Export(name="forceUpdate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceUpdate;

    /**
     * @return Specify true if you are updating an existing destination policy to grant permission to an organization ID instead of granting permission to individual AWS accounts.
     * 
     */
    public Output<Optional<Boolean>> forceUpdate() {
        return Codegen.optional(this.forceUpdate);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogDestinationPolicy(String name) {
        this(name, LogDestinationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogDestinationPolicy(String name, LogDestinationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogDestinationPolicy(String name, LogDestinationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy", name, args == null ? LogDestinationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogDestinationPolicy(String name, Output<String> id, @Nullable LogDestinationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy", name, state, makeResourceOptions(options, id));
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
    public static LogDestinationPolicy get(String name, Output<String> id, @Nullable LogDestinationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogDestinationPolicy(name, id, state, options);
    }
}
