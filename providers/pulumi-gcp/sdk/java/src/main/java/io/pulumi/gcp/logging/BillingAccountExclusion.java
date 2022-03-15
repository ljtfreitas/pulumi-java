// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.logging.BillingAccountExclusionArgs;
import io.pulumi.gcp.logging.inputs.BillingAccountExclusionState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Billing account logging exclusions can be imported using their URI, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:logging/billingAccountExclusion:BillingAccountExclusion my_exclusion billingAccounts/my-billing_account/exclusions/my-exclusion
 * ```
 * 
 */
@ResourceType(type="gcp:logging/billingAccountExclusion:BillingAccountExclusion")
public class BillingAccountExclusion extends io.pulumi.resources.CustomResource {
    /**
     * The billing account to create the exclusion for.
     * 
     */
    @Export(name="billingAccount", type=String.class, parameters={})
    private Output<String> billingAccount;

    /**
     * @return The billing account to create the exclusion for.
     * 
     */
    public Output<String> getBillingAccount() {
        return this.billingAccount;
    }
    /**
     * A human-readable description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    public Output<String> getFilter() {
        return this.filter;
    }
    /**
     * The name of the logging exclusion.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the logging exclusion.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }

    public interface BuilderApplicator {
        public void apply(BillingAccountExclusionArgs.Builder a);
    }
    private static io.pulumi.gcp.logging.BillingAccountExclusionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.logging.BillingAccountExclusionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BillingAccountExclusion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingAccountExclusion(String name) {
        this(name, BillingAccountExclusionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingAccountExclusion(String name, BillingAccountExclusionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingAccountExclusion(String name, BillingAccountExclusionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/billingAccountExclusion:BillingAccountExclusion", name, args == null ? BillingAccountExclusionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BillingAccountExclusion(String name, Output<String> id, @Nullable BillingAccountExclusionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/billingAccountExclusion:BillingAccountExclusion", name, state, makeResourceOptions(options, id));
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
    public static BillingAccountExclusion get(String name, Output<String> id, @Nullable BillingAccountExclusionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BillingAccountExclusion(name, id, state, options);
    }
}
