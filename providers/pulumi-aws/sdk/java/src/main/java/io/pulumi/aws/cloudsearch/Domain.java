// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudsearch.DomainArgs;
import io.pulumi.aws.cloudsearch.inputs.DomainState;
import io.pulumi.aws.cloudsearch.outputs.DomainEndpointOptions;
import io.pulumi.aws.cloudsearch.outputs.DomainIndexField;
import io.pulumi.aws.cloudsearch.outputs.DomainScalingParameters;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * CloudSearch Domains can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cloudsearch/domain:Domain example example-domain
 * ```
 * 
 */
@ResourceType(type="aws:cloudsearch/domain:Domain")
public class Domain extends io.pulumi.resources.CustomResource {
    /**
     * The domain's ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The domain's ARN.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The service endpoint for updating documents in a search domain.
     * 
     */
    @Export(name="documentServiceEndpoint", type=String.class, parameters={})
    private Output<String> documentServiceEndpoint;

    /**
     * @return The service endpoint for updating documents in a search domain.
     * 
     */
    public Output<String> getDocumentServiceEndpoint() {
        return this.documentServiceEndpoint;
    }
    /**
     * An internally generated unique identifier for the domain.
     * 
     */
    @Export(name="domainId", type=String.class, parameters={})
    private Output<String> domainId;

    /**
     * @return An internally generated unique identifier for the domain.
     * 
     */
    public Output<String> getDomainId() {
        return this.domainId;
    }
    /**
     * Domain endpoint options. Documented below.
     * 
     */
    @Export(name="endpointOptions", type=DomainEndpointOptions.class, parameters={})
    private Output<DomainEndpointOptions> endpointOptions;

    /**
     * @return Domain endpoint options. Documented below.
     * 
     */
    public Output<DomainEndpointOptions> getEndpointOptions() {
        return this.endpointOptions;
    }
    /**
     * The index fields for documents added to the domain. Documented below.
     * 
     */
    @Export(name="indexFields", type=List.class, parameters={DomainIndexField.class})
    private Output</* @Nullable */ List<DomainIndexField>> indexFields;

    /**
     * @return The index fields for documents added to the domain. Documented below.
     * 
     */
    public Output</* @Nullable */ List<DomainIndexField>> getIndexFields() {
        return this.indexFields;
    }
    /**
     * Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    @Export(name="multiAz", type=Boolean.class, parameters={})
    private Output<Boolean> multiAz;

    /**
     * @return Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    public Output<Boolean> getMultiAz() {
        return this.multiAz;
    }
    /**
     * A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Domain scaling parameters. Documented below.
     * 
     */
    @Export(name="scalingParameters", type=DomainScalingParameters.class, parameters={})
    private Output<DomainScalingParameters> scalingParameters;

    /**
     * @return Domain scaling parameters. Documented below.
     * 
     */
    public Output<DomainScalingParameters> getScalingParameters() {
        return this.scalingParameters;
    }
    /**
     * The service endpoint for requesting search results from a search domain.
     * 
     */
    @Export(name="searchServiceEndpoint", type=String.class, parameters={})
    private Output<String> searchServiceEndpoint;

    /**
     * @return The service endpoint for requesting search results from a search domain.
     * 
     */
    public Output<String> getSearchServiceEndpoint() {
        return this.searchServiceEndpoint;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable DomainArgs.Builder a);
    }
    private static io.pulumi.aws.cloudsearch.DomainArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cloudsearch.DomainArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Domain(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Domain(String name) {
        this(name, DomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Domain(String name, @Nullable DomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Domain(String name, @Nullable DomainArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudsearch/domain:Domain", name, args == null ? DomainArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Domain(String name, Output<String> id, @Nullable DomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudsearch/domain:Domain", name, state, makeResourceOptions(options, id));
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
    public static Domain get(String name, Output<String> id, @Nullable DomainState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Domain(name, id, state, options);
    }
}
