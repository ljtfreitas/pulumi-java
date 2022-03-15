// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.LogResourcePolicyArgs;
import io.pulumi.aws.cloudwatch.inputs.LogResourcePolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a CloudWatch log resource policy.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CloudWatch log resource policies can be imported using the policy name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/logResourcePolicy:LogResourcePolicy MyPolicy MyPolicy
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logResourcePolicy:LogResourcePolicy")
public class LogResourcePolicy extends io.pulumi.resources.CustomResource {
    /**
     * Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * 
     */
    @Export(name="policyDocument", type=String.class, parameters={})
    private Output<String> policyDocument;

    /**
     * @return Details of the resource policy, including the identity of the principal that is enabled to put logs to this account. This is formatted as a JSON string. Maximum length of 5120 characters.
     * 
     */
    public Output<String> getPolicyDocument() {
        return this.policyDocument;
    }
    /**
     * Name of the resource policy.
     * 
     */
    @Export(name="policyName", type=String.class, parameters={})
    private Output<String> policyName;

    /**
     * @return Name of the resource policy.
     * 
     */
    public Output<String> getPolicyName() {
        return this.policyName;
    }

    public interface BuilderApplicator {
        public void apply(LogResourcePolicyArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.LogResourcePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.LogResourcePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LogResourcePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogResourcePolicy(String name) {
        this(name, LogResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogResourcePolicy(String name, LogResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogResourcePolicy(String name, LogResourcePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logResourcePolicy:LogResourcePolicy", name, args == null ? LogResourcePolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LogResourcePolicy(String name, Output<String> id, @Nullable LogResourcePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logResourcePolicy:LogResourcePolicy", name, state, makeResourceOptions(options, id));
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
    public static LogResourcePolicy get(String name, Output<String> id, @Nullable LogResourcePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LogResourcePolicy(name, id, state, options);
    }
}
