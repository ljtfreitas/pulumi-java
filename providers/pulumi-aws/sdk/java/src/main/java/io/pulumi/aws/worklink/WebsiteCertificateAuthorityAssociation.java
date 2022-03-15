// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.worklink.WebsiteCertificateAuthorityAssociationArgs;
import io.pulumi.aws.worklink.inputs.WebsiteCertificateAuthorityAssociationState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * WorkLink Website Certificate Authority can be imported using `FLEET-ARN,WEBSITE-CA-ID`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation example arn:aws:worklink::123456789012:fleet/example,abcdefghijk
 * ```
 * 
 */
@ResourceType(type="aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation")
public class WebsiteCertificateAuthorityAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The root certificate of the Certificate Authority.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return The root certificate of the Certificate Authority.
     * 
     */
    public Output<String> getCertificate() {
        return this.certificate;
    }
    /**
     * The certificate name to display.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The certificate name to display.
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The ARN of the fleet.
     * 
     */
    @Export(name="fleetArn", type=String.class, parameters={})
    private Output<String> fleetArn;

    /**
     * @return The ARN of the fleet.
     * 
     */
    public Output<String> getFleetArn() {
        return this.fleetArn;
    }
    /**
     * A unique identifier for the Certificate Authority.
     * 
     */
    @Export(name="websiteCaId", type=String.class, parameters={})
    private Output<String> websiteCaId;

    /**
     * @return A unique identifier for the Certificate Authority.
     * 
     */
    public Output<String> getWebsiteCaId() {
        return this.websiteCaId;
    }

    public interface BuilderApplicator {
        public void apply(WebsiteCertificateAuthorityAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.worklink.WebsiteCertificateAuthorityAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.worklink.WebsiteCertificateAuthorityAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public WebsiteCertificateAuthorityAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebsiteCertificateAuthorityAssociation(String name) {
        this(name, WebsiteCertificateAuthorityAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebsiteCertificateAuthorityAssociation(String name, WebsiteCertificateAuthorityAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebsiteCertificateAuthorityAssociation(String name, WebsiteCertificateAuthorityAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation", name, args == null ? WebsiteCertificateAuthorityAssociationArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private WebsiteCertificateAuthorityAssociation(String name, Output<String> id, @Nullable WebsiteCertificateAuthorityAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation", name, state, makeResourceOptions(options, id));
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
    public static WebsiteCertificateAuthorityAssociation get(String name, Output<String> id, @Nullable WebsiteCertificateAuthorityAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebsiteCertificateAuthorityAssociation(name, id, state, options);
    }
}
