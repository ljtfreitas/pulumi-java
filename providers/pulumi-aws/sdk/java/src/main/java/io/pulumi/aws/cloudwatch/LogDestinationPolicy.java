// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudwatch.LogDestinationPolicyArgs;
import io.pulumi.aws.cloudwatch.inputs.LogDestinationPolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Logs destination policy resource.
 * 
 * ## Example Usage
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
public class LogDestinationPolicy extends io.pulumi.resources.CustomResource {
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
    public Output<String> getAccessPolicy() {
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
    public Output<String> getDestinationName() {
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
    public Output</* @Nullable */ Boolean> getForceUpdate() {
        return this.forceUpdate;
    }

    public interface BuilderApplicator {
        public void apply(LogDestinationPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.cloudwatch.LogDestinationPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudwatch.LogDestinationPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LogDestinationPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public LogDestinationPolicy(String name, LogDestinationPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy", name, args == null ? LogDestinationPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LogDestinationPolicy(String name, Output<String> id, @Nullable LogDestinationPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDestinationPolicy:LogDestinationPolicy", name, state, makeResourceOptions(options, id));
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
    public static LogDestinationPolicy get(String name, Output<String> id, @Nullable LogDestinationPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LogDestinationPolicy(name, id, state, options);
    }
}
