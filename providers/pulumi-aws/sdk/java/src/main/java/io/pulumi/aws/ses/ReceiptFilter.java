// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.ReceiptFilterArgs;
import io.pulumi.aws.ses.inputs.ReceiptFilterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SES receipt filter resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SES Receipt Filter can be imported using their `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/receiptFilter:ReceiptFilter test some-filter
 * ```
 * 
 */
@ResourceType(type="aws:ses/receiptFilter:ReceiptFilter")
public class ReceiptFilter extends io.pulumi.resources.CustomResource {
    /**
     * The SES receipt filter ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The SES receipt filter ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The IP address or address range to filter, in CIDR notation
     * 
     */
    @Export(name="cidr", type=String.class, parameters={})
    private Output<String> cidr;

    /**
     * @return The IP address or address range to filter, in CIDR notation
     * 
     */
    public Output<String> getCidr() {
        return this.cidr;
    }
    /**
     * The name of the filter
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the filter
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Block or Allow
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return Block or Allow
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }

    public interface BuilderApplicator {
        public void apply(ReceiptFilterArgs.Builder a);
    }
    private static io.pulumi.aws.ses.ReceiptFilterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ses.ReceiptFilterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ReceiptFilter(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReceiptFilter(String name) {
        this(name, ReceiptFilterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReceiptFilter(String name, ReceiptFilterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReceiptFilter(String name, ReceiptFilterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptFilter:ReceiptFilter", name, args == null ? ReceiptFilterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ReceiptFilter(String name, Output<String> id, @Nullable ReceiptFilterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/receiptFilter:ReceiptFilter", name, state, makeResourceOptions(options, id));
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
    public static ReceiptFilter get(String name, Output<String> id, @Nullable ReceiptFilterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ReceiptFilter(name, id, state, options);
    }
}
