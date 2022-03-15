// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.privateca_v1.CaPoolArgs;
import io.pulumi.googlenative.privateca_v1.outputs.IssuancePolicyResponse;
import io.pulumi.googlenative.privateca_v1.outputs.PublishingOptionsResponse;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Create a CaPool.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:privateca/v1:CaPool")
public class CaPool extends io.pulumi.resources.CustomResource {
    /**
     * Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * 
     */
    @Export(name="issuancePolicy", type=IssuancePolicyResponse.class, parameters={})
    private Output<IssuancePolicyResponse> issuancePolicy;

    /**
     * @return Optional. The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * 
     */
    public Output<IssuancePolicyResponse> getIssuancePolicy() {
        return this.issuancePolicy;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    /**
     * The resource name for this CaPool in the format `projects/*{@literal /}locations/*{@literal /}caPools/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CaPool in the format `projects/*{@literal /}locations/*{@literal /}caPools/*`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Optional. The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * 
     */
    @Export(name="publishingOptions", type=PublishingOptionsResponse.class, parameters={})
    private Output<PublishingOptionsResponse> publishingOptions;

    /**
     * @return Optional. The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * 
     */
    public Output<PublishingOptionsResponse> getPublishingOptions() {
        return this.publishingOptions;
    }
    /**
     * Immutable. The Tier of this CaPool.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output<String> tier;

    /**
     * @return Immutable. The Tier of this CaPool.
     * 
     */
    public Output<String> getTier() {
        return this.tier;
    }

    public interface BuilderApplicator {
        public void apply(CaPoolArgs.Builder a);
    }
    private static io.pulumi.googlenative.privateca_v1.CaPoolArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.privateca_v1.CaPoolArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CaPool(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CaPool(String name) {
        this(name, CaPoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CaPool(String name, CaPoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CaPool(String name, CaPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CaPool", name, args == null ? CaPoolArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CaPool(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:privateca/v1:CaPool", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CaPool get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CaPool(name, id, options);
    }
}
