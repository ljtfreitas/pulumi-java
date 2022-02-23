// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.SamlProviderArgs;
import io.pulumi.aws.iam.inputs.SamlProviderState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an IAM SAML provider.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM SAML Providers can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/samlProvider:SamlProvider default arn:aws:iam::123456789012:saml-provider/SAMLADFS
 * ```
 * 
 */
@ResourceType(type="aws:iam/samlProvider:SamlProvider")
public class SamlProvider extends io.pulumi.resources.CustomResource {
    /**
     * The ARN assigned by AWS for this provider.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN assigned by AWS for this provider.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name of the provider to create.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the provider to create.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * An XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    @OutputExport(name="samlMetadataDocument", type=String.class, parameters={})
    private Output<String> samlMetadataDocument;

    /**
     * @return An XML document generated by an identity provider that supports SAML 2.0.
     * 
     */
    public Output<String> getSamlMetadataDocument() {
        return this.samlMetadataDocument;
    }
    /**
     * Map of resource tags for the IAM SAML provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags for the IAM SAML provider. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The expiration date and time for the SAML provider in RFC1123 format, e.g., `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    @OutputExport(name="validUntil", type=String.class, parameters={})
    private Output<String> validUntil;

    /**
     * @return The expiration date and time for the SAML provider in RFC1123 format, e.g., `Mon, 02 Jan 2006 15:04:05 MST`.
     * 
     */
    public Output<String> getValidUntil() {
        return this.validUntil;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SamlProvider(String name, SamlProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/samlProvider:SamlProvider", name, args == null ? SamlProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SamlProvider(String name, Input<String> id, @Nullable SamlProviderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/samlProvider:SamlProvider", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static SamlProvider get(String name, Input<String> id, @Nullable SamlProviderState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SamlProvider(name, id, state, options);
    }
}