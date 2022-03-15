// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs;
import io.pulumi.aws.ec2.inputs.SpotDatafeedSubscriptionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * > **Note:** There is only a single subscription allowed per account.
 * 
 * To help you understand the charges for your Spot instances, Amazon EC2 provides a data feed that describes your Spot instance usage and pricing.
 * This data feed is sent to an Amazon S3 bucket that you specify when you subscribe to the data feed.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * A Spot Datafeed Subscription can be imported using the word `spot-datafeed-subscription`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription mysubscription spot-datafeed-subscription
 * ```
 * 
 */
@ResourceType(type="aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription")
public class SpotDatafeedSubscription extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon S3 bucket in which to store the Spot instance data feed.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The Amazon S3 bucket in which to store the Spot instance data feed.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * Path of folder inside bucket to place spot pricing data.
     * 
     */
    @Export(name="prefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> prefix;

    /**
     * @return Path of folder inside bucket to place spot pricing data.
     * 
     */
    public Output</* @Nullable */ String> getPrefix() {
        return this.prefix;
    }

    public interface BuilderApplicator {
        public void apply(SpotDatafeedSubscriptionArgs.Builder a);
    }
    private static io.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2.SpotDatafeedSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SpotDatafeedSubscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SpotDatafeedSubscription(String name) {
        this(name, SpotDatafeedSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SpotDatafeedSubscription(String name, SpotDatafeedSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SpotDatafeedSubscription(String name, SpotDatafeedSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription", name, args == null ? SpotDatafeedSubscriptionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SpotDatafeedSubscription(String name, Output<String> id, @Nullable SpotDatafeedSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/spotDatafeedSubscription:SpotDatafeedSubscription", name, state, makeResourceOptions(options, id));
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
    public static SpotDatafeedSubscription get(String name, Output<String> id, @Nullable SpotDatafeedSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SpotDatafeedSubscription(name, id, state, options);
    }
}
