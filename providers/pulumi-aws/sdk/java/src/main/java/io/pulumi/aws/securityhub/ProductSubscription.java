// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.securityhub.ProductSubscriptionArgs;
import io.pulumi.aws.securityhub.inputs.ProductSubscriptionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Subscribes to a Security Hub product.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Security Hub product subscriptions can be imported in the form `product_arn,arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:securityhub/productSubscription:ProductSubscription example arn:aws:securityhub:eu-west-1:733251395267:product/alertlogic/althreatmanagement,arn:aws:securityhub:eu-west-1:123456789012:product-subscription/alertlogic/althreatmanagement
 * ```
 * 
 */
@ResourceType(type="aws:securityhub/productSubscription:ProductSubscription")
public class ProductSubscription extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ARN of the product that generates findings that you want to import into Security Hub - see below.
     * 
     */
    @Export(name="productArn", type=String.class, parameters={})
    private Output<String> productArn;

    /**
     * @return The ARN of the product that generates findings that you want to import into Security Hub - see below.
     * 
     */
    public Output<String> getProductArn() {
        return this.productArn;
    }

    public interface BuilderApplicator {
        public void apply(ProductSubscriptionArgs.Builder a);
    }
    private static io.pulumi.aws.securityhub.ProductSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.securityhub.ProductSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ProductSubscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ProductSubscription(String name) {
        this(name, ProductSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ProductSubscription(String name, ProductSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProductSubscription(String name, ProductSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/productSubscription:ProductSubscription", name, args == null ? ProductSubscriptionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ProductSubscription(String name, Output<String> id, @Nullable ProductSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:securityhub/productSubscription:ProductSubscription", name, state, makeResourceOptions(options, id));
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
    public static ProductSubscription get(String name, Output<String> id, @Nullable ProductSubscriptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProductSubscription(name, id, state, options);
    }
}
