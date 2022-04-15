// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.certificateauthority.CertificateTemplateArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplateState;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplateIdentityConstraints;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePassthroughExtensions;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValues;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Certificate Authority Service provides reusable and parameterized templates that you can use for common certificate issuance scenarios. A certificate template represents a relatively static and well-defined certificate issuance schema within an organization.  A certificate template can essentially become a full-fledged vertical certificate issuance framework.
 * 
 * For more information, see:
 * * [Understanding Certificate Templates](https://cloud.google.com/certificate-authority-service/docs/certificate-template)
 * * [Common configurations and Certificate Profiles](https://cloud.google.com/certificate-authority-service/docs/certificate-profile)
 * ## Example Usage
 * 
 * ## Import
 * 
 * CertificateTemplate can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificateTemplate:CertificateTemplate default projects/{{project}}/locations/{{location}}/certificateTemplates/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificateTemplate:CertificateTemplate default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:certificateauthority/certificateTemplate:CertificateTemplate default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:certificateauthority/certificateTemplate:CertificateTemplate")
public class CertificateTemplate extends io.pulumi.resources.CustomResource {
    /**
     * Output only. The time at which this CertificateTemplate was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Output only. The time at which this CertificateTemplate was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate's identity.
     * 
     */
    @Export(name="identityConstraints", type=CertificateTemplateIdentityConstraints.class, parameters={})
    private Output</* @Nullable */ CertificateTemplateIdentityConstraints> identityConstraints;

    /**
     * @return Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate's identity.
     * 
     */
    public Output</* @Nullable */ CertificateTemplateIdentityConstraints> identityConstraints() {
        return this.identityConstraints;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Optional. Labels with user-defined metadata.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool's IssuancePolicy defines baseline_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate's predefined_values.
     * 
     */
    @Export(name="passthroughExtensions", type=CertificateTemplatePassthroughExtensions.class, parameters={})
    private Output</* @Nullable */ CertificateTemplatePassthroughExtensions> passthroughExtensions;

    /**
     * @return Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don't appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool's IssuancePolicy defines baseline_values that don't appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate's X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate's predefined_values.
     * 
     */
    public Output</* @Nullable */ CertificateTemplatePassthroughExtensions> passthroughExtensions() {
        return this.passthroughExtensions;
    }
    /**
     * Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool's IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    @Export(name="predefinedValues", type=CertificateTemplatePredefinedValues.class, parameters={})
    private Output</* @Nullable */ CertificateTemplatePredefinedValues> predefinedValues;

    /**
     * @return Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool's IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    public Output</* @Nullable */ CertificateTemplatePredefinedValues> predefinedValues() {
        return this.predefinedValues;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Output only. The time at which this CertificateTemplate was updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Output only. The time at which this CertificateTemplate was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateTemplate(String name) {
        this(name, CertificateTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateTemplate(String name, CertificateTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateTemplate(String name, CertificateTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/certificateTemplate:CertificateTemplate", name, args == null ? CertificateTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateTemplate(String name, Output<String> id, @Nullable CertificateTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:certificateauthority/certificateTemplate:CertificateTemplate", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static CertificateTemplate get(String name, Output<String> id, @Nullable CertificateTemplateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateTemplate(name, id, state, options);
    }
}
