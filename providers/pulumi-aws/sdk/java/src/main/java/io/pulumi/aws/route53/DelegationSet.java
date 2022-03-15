// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.DelegationSetArgs;
import io.pulumi.aws.route53.inputs.DelegationSetState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a [Route53 Delegation Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API-actions-by-function.html#actions-by-function-reusable-delegation-sets) resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Delegation Sets can be imported using the `delegation set id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/delegationSet:DelegationSet set1 N1PA6795SAMPLE
 * ```
 * 
 */
@ResourceType(type="aws:route53/delegationSet:DelegationSet")
public class DelegationSet extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Delegation Set.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Delegation Set.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A list of authoritative name servers for the hosted zone
     * (effectively a list of NS records).
     * 
     */
    @Export(name="nameServers", type=List.class, parameters={String.class})
    private Output<List<String>> nameServers;

    /**
     * @return A list of authoritative name servers for the hosted zone
     * (effectively a list of NS records).
     * 
     */
    public Output<List<String>> getNameServers() {
        return this.nameServers;
    }
    /**
     * This is a reference name used in Caller Reference
     * (helpful for identifying single delegation set amongst others)
     * 
     */
    @Export(name="referenceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> referenceName;

    /**
     * @return This is a reference name used in Caller Reference
     * (helpful for identifying single delegation set amongst others)
     * 
     */
    public Output</* @Nullable */ String> getReferenceName() {
        return this.referenceName;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DelegationSetArgs.Builder a);
    }
    private static io.pulumi.aws.route53.DelegationSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.DelegationSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public DelegationSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DelegationSet(String name) {
        this(name, DelegationSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DelegationSet(String name, @Nullable DelegationSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DelegationSet(String name, @Nullable DelegationSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/delegationSet:DelegationSet", name, args == null ? DelegationSetArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private DelegationSet(String name, Output<String> id, @Nullable DelegationSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/delegationSet:DelegationSet", name, state, makeResourceOptions(options, id));
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
    public static DelegationSet get(String name, Output<String> id, @Nullable DelegationSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DelegationSet(name, id, state, options);
    }
}
