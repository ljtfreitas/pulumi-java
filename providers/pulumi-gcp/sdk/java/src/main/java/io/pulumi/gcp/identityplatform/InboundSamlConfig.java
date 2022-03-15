// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.identityplatform;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.identityplatform.InboundSamlConfigArgs;
import io.pulumi.gcp.identityplatform.inputs.InboundSamlConfigState;
import io.pulumi.gcp.identityplatform.outputs.InboundSamlConfigIdpConfig;
import io.pulumi.gcp.identityplatform.outputs.InboundSamlConfigSpConfig;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Inbound SAML configuration for a Identity Toolkit project.
 * 
 * You must enable the
 * [Google Identity Platform](https://console.cloud.google.com/marketplace/details/google-cloud-platform/customer-identity) in
 * the marketplace prior to using this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * InboundSamlConfig can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/inboundSamlConfig:InboundSamlConfig default projects/{{project}}/inboundSamlConfigs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/inboundSamlConfig:InboundSamlConfig default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:identityplatform/inboundSamlConfig:InboundSamlConfig default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:identityplatform/inboundSamlConfig:InboundSamlConfig")
public class InboundSamlConfig extends io.pulumi.resources.CustomResource {
    /**
     * Human friendly display name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return Human friendly display name.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * If this config allows users to sign in with the provider.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If this config allows users to sign in with the provider.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * SAML IdP configuration when the project acts as the relying party
     * Structure is documented below.
     * 
     */
    @Export(name="idpConfig", type=InboundSamlConfigIdpConfig.class, parameters={})
    private Output<InboundSamlConfigIdpConfig> idpConfig;

    /**
     * @return SAML IdP configuration when the project acts as the relying party
     * Structure is documented below.
     * 
     */
    public Output<InboundSamlConfigIdpConfig> getIdpConfig() {
        return this.idpConfig;
    }
    /**
     * The name of the InboundSamlConfig resource. Must start with 'saml.' and can only have alphanumeric characters,
     * hyphens, underscores or periods. The part after 'saml.' must also start with a lowercase letter, end with an
     * alphanumeric character, and have at least 2 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the InboundSamlConfig resource. Must start with 'saml.' and can only have alphanumeric characters,
     * hyphens, underscores or periods. The part after 'saml.' must also start with a lowercase letter, end with an
     * alphanumeric character, and have at least 2 characters.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     * and accept an authentication assertion issued by a SAML identity provider.
     * Structure is documented below.
     * 
     */
    @Export(name="spConfig", type=InboundSamlConfigSpConfig.class, parameters={})
    private Output<InboundSamlConfigSpConfig> spConfig;

    /**
     * @return SAML SP (Service Provider) configuration when the project acts as the relying party to receive
     * and accept an authentication assertion issued by a SAML identity provider.
     * Structure is documented below.
     * 
     */
    public Output<InboundSamlConfigSpConfig> getSpConfig() {
        return this.spConfig;
    }

    public interface BuilderApplicator {
        public void apply(InboundSamlConfigArgs.Builder a);
    }
    private static io.pulumi.gcp.identityplatform.InboundSamlConfigArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.identityplatform.InboundSamlConfigArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InboundSamlConfig(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InboundSamlConfig(String name) {
        this(name, InboundSamlConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InboundSamlConfig(String name, InboundSamlConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InboundSamlConfig(String name, InboundSamlConfigArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/inboundSamlConfig:InboundSamlConfig", name, args == null ? InboundSamlConfigArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InboundSamlConfig(String name, Output<String> id, @Nullable InboundSamlConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:identityplatform/inboundSamlConfig:InboundSamlConfig", name, state, makeResourceOptions(options, id));
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
    public static InboundSamlConfig get(String name, Output<String> id, @Nullable InboundSamlConfigState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InboundSamlConfig(name, id, state, options);
    }
}
