// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ses.DomainDkimArgs;
import io.pulumi.aws.ses.inputs.DomainDkimState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides an SES domain DKIM generation resource.
 * 
 * Domain ownership needs to be confirmed first using `aws.ses.DomainIdentity` resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DKIM tokens can be imported using the `domain` attribute, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/domainDkim:DomainDkim example example.com
 * ```
 * 
 */
@ResourceType(type="aws:ses/domainDkim:DomainDkim")
public class DomainDkim extends io.pulumi.resources.CustomResource {
    /**
     * DKIM tokens generated by SES.
     * These tokens should be used to create CNAME records used to verify SES Easy DKIM.
     * See below for an example of how this might be achieved
     * when the domain is hosted in Route 53 and managed by this provider.
     * Find out more about verifying domains in Amazon SES
     * in the [AWS SES docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html).
     * 
     */
    @OutputExport(name="dkimTokens", type=List.class, parameters={String.class})
    private Output<List<String>> dkimTokens;

    /**
     * @return DKIM tokens generated by SES.
     * These tokens should be used to create CNAME records used to verify SES Easy DKIM.
     * See below for an example of how this might be achieved
     * when the domain is hosted in Route 53 and managed by this provider.
     * Find out more about verifying domains in Amazon SES
     * in the [AWS SES docs](http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html).
     * 
     */
    public Output<List<String>> getDkimTokens() {
        return this.dkimTokens;
    }
    /**
     * Verified domain name to generate DKIM tokens for.
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return Verified domain name to generate DKIM tokens for.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainDkim(String name, DomainDkimArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/domainDkim:DomainDkim", name, args == null ? DomainDkimArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DomainDkim(String name, Input<String> id, @Nullable DomainDkimState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/domainDkim:DomainDkim", name, state, makeResourceOptions(options, id));
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
    public static DomainDkim get(String name, Input<String> id, @Nullable DomainDkimState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DomainDkim(name, id, state, options);
    }
}
