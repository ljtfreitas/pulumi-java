// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.PortfolioShareArgs;
import com.pulumi.aws.servicecatalog.inputs.PortfolioShareState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Portfolio Share. Shares the specified portfolio with the specified account or organization node. You can share portfolios to an organization, an organizational unit, or a specific account.
 * 
 * If the portfolio share with the specified account or organization node already exists, using this resource to re-create the share will have no effect and will not return an error. You can then use this resource to update the share.
 * 
 * &gt; **NOTE:** Shares to an organization node can only be created by the management account of an organization or by a delegated administrator. If a delegated admin is de-registered, they can no longer create portfolio shares.
 * 
 * &gt; **NOTE:** AWSOrganizationsAccess must be enabled in order to create a portfolio share to an organization node.
 * 
 * &gt; **NOTE:** You can&#39;t share a shared resource, including portfolios that contain a shared product.
 * 
 * ## Example Usage
 * ### Basic Usage
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
 *         var example = new PortfolioShare(&#34;example&#34;, PortfolioShareArgs.builder()        
 *             .principalId(&#34;012128675309&#34;)
 *             .portfolioId(aws_servicecatalog_portfolio.getExample().getId())
 *             .type(&#34;ACCOUNT&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_servicecatalog_portfolio_share` can be imported using the portfolio share ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/portfolioShare:PortfolioShare example port-12344321:ACCOUNT:123456789012
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/portfolioShare:PortfolioShare")
public class PortfolioShare extends com.pulumi.resources.CustomResource {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Export(name="acceptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> acceptLanguage;

    /**
     * @return Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    public Output<Optional<String>> acceptLanguage() {
        return Codegen.optional(this.acceptLanguage);
    }
    /**
     * Whether the shared portfolio is imported by the recipient account. If the recipient is organizational, the share is automatically imported, and the field is always set to true.
     * 
     */
    @Export(name="accepted", type=Boolean.class, parameters={})
    private Output<Boolean> accepted;

    /**
     * @return Whether the shared portfolio is imported by the recipient account. If the recipient is organizational, the share is automatically imported, and the field is always set to true.
     * 
     */
    public Output<Boolean> accepted() {
        return this.accepted;
    }
    /**
     * Portfolio identifier.
     * 
     */
    @Export(name="portfolioId", type=String.class, parameters={})
    private Output<String> portfolioId;

    /**
     * @return Portfolio identifier.
     * 
     */
    public Output<String> portfolioId() {
        return this.portfolioId;
    }
    /**
     * Identifier of the principal with whom you will share the portfolio. Valid values AWS account IDs and ARNs of AWS Organizations and organizational units.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output<String> principalId;

    /**
     * @return Identifier of the principal with whom you will share the portfolio. Valid values AWS account IDs and ARNs of AWS Organizations and organizational units.
     * 
     */
    public Output<String> principalId() {
        return this.principalId;
    }
    /**
     * Whether to enable sharing of `aws.servicecatalog.TagOption` resources when creating the portfolio share.
     * 
     */
    @Export(name="shareTagOptions", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> shareTagOptions;

    /**
     * @return Whether to enable sharing of `aws.servicecatalog.TagOption` resources when creating the portfolio share.
     * 
     */
    public Output<Optional<Boolean>> shareTagOptions() {
        return Codegen.optional(this.shareTagOptions);
    }
    /**
     * Type of portfolio share. Valid values are `ACCOUNT` (an external account), `ORGANIZATION` (a share to every account in an organization), `ORGANIZATIONAL_UNIT`, `ORGANIZATION_MEMBER_ACCOUNT` (a share to an account in an organization).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of portfolio share. Valid values are `ACCOUNT` (an external account), `ORGANIZATION` (a share to every account in an organization), `ORGANIZATIONAL_UNIT`, `ORGANIZATION_MEMBER_ACCOUNT` (a share to an account in an organization).
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Whether to wait (up to the timeout) for the share to be accepted. Organizational shares are automatically accepted.
     * 
     */
    @Export(name="waitForAcceptance", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> waitForAcceptance;

    /**
     * @return Whether to wait (up to the timeout) for the share to be accepted. Organizational shares are automatically accepted.
     * 
     */
    public Output<Optional<Boolean>> waitForAcceptance() {
        return Codegen.optional(this.waitForAcceptance);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PortfolioShare(String name) {
        this(name, PortfolioShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PortfolioShare(String name, PortfolioShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PortfolioShare(String name, PortfolioShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/portfolioShare:PortfolioShare", name, args == null ? PortfolioShareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PortfolioShare(String name, Output<String> id, @Nullable PortfolioShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/portfolioShare:PortfolioShare", name, state, makeResourceOptions(options, id));
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
    public static PortfolioShare get(String name, Output<String> id, @Nullable PortfolioShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PortfolioShare(name, id, state, options);
    }
}
