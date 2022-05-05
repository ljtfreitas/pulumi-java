// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.MailFromArgs;
import com.pulumi.aws.ses.inputs.MailFromState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SES domain MAIL FROM resource.
 * 
 * &gt; **NOTE:** For the MAIL FROM domain to be fully usable, this resource should be paired with the aws.ses.DomainIdentity resource. To validate the MAIL FROM domain, a DNS MX record is required. To pass SPF checks, a DNS TXT record may also be required. See the [Amazon SES MAIL FROM documentation](https://docs.aws.amazon.com/ses/latest/dg/mail-from.html) for more information.
 * 
 * ## Example Usage
 * ### Domain Identity MAIL FROM
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleDomainIdentity = new DomainIdentity(&#34;exampleDomainIdentity&#34;, DomainIdentityArgs.builder()        
 *             .domain(&#34;example.com&#34;)
 *             .build());
 * 
 *         var exampleMailFrom = new MailFrom(&#34;exampleMailFrom&#34;, MailFromArgs.builder()        
 *             .domain(exampleDomainIdentity.getDomain())
 *             .mailFromDomain(exampleDomainIdentity.getDomain().apply(domain -&gt; String.format(&#34;bounce.%s&#34;, domain)))
 *             .build());
 * 
 *         var exampleSesDomainMailFromMx = new Record(&#34;exampleSesDomainMailFromMx&#34;, RecordArgs.builder()        
 *             .zoneId(aws_route53_zone.getExample().getId())
 *             .name(exampleMailFrom.getMailFromDomain())
 *             .type(&#34;MX&#34;)
 *             .ttl(&#34;600&#34;)
 *             .records(&#34;10 feedback-smtp.us-east-1.amazonses.com&#34;)
 *             .build());
 * 
 *         var exampleSesDomainMailFromTxt = new Record(&#34;exampleSesDomainMailFromTxt&#34;, RecordArgs.builder()        
 *             .zoneId(aws_route53_zone.getExample().getId())
 *             .name(exampleMailFrom.getMailFromDomain())
 *             .type(&#34;TXT&#34;)
 *             .ttl(&#34;600&#34;)
 *             .records(&#34;v=spf1 include:amazonses.com -all&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Email Identity MAIL FROM
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleEmailIdentity = new EmailIdentity(&#34;exampleEmailIdentity&#34;, EmailIdentityArgs.builder()        
 *             .email(&#34;user@example.com&#34;)
 *             .build());
 * 
 *         var exampleMailFrom = new MailFrom(&#34;exampleMailFrom&#34;, MailFromArgs.builder()        
 *             .domain(exampleEmailIdentity.getEmail())
 *             .mailFromDomain(&#34;mail.example.com&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * MAIL FROM domain can be imported using the `domain` attribute, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ses/mailFrom:MailFrom example example.com
 * ```
 * 
 */
@ResourceType(type="aws:ses/mailFrom:MailFrom")
public class MailFrom extends com.pulumi.resources.CustomResource {
    /**
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     * 
     */
    @Export(name="behaviorOnMxFailure", type=String.class, parameters={})
    private Output</* @Nullable */ String> behaviorOnMxFailure;

    /**
     * @return The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send an email. Defaults to `UseDefaultValue`. See the [SES API documentation](https://docs.aws.amazon.com/ses/latest/APIReference/API_SetIdentityMailFromDomain.html) for more information.
     * 
     */
    public Output<Optional<String>> behaviorOnMxFailure() {
        return Codegen.optional(this.behaviorOnMxFailure);
    }
    /**
     * Verified domain name or email identity to generate DKIM tokens for.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return Verified domain name or email identity to generate DKIM tokens for.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     * 
     */
    @Export(name="mailFromDomain", type=String.class, parameters={})
    private Output<String> mailFromDomain;

    /**
     * @return Subdomain (of above domain) which is to be used as MAIL FROM address (Required for DMARC validation)
     * 
     */
    public Output<String> mailFromDomain() {
        return this.mailFromDomain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MailFrom(String name) {
        this(name, MailFromArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MailFrom(String name, MailFromArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MailFrom(String name, MailFromArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/mailFrom:MailFrom", name, args == null ? MailFromArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MailFrom(String name, Output<String> id, @Nullable MailFromState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/mailFrom:MailFrom", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static MailFrom get(String name, Output<String> id, @Nullable MailFromState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MailFrom(name, id, state, options);
    }
}
