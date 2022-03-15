// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cognito.IdentityPoolProviderPrincipalTagArgs;
import io.pulumi.aws.cognito.inputs.IdentityPoolProviderPrincipalTagState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Cognito Identity Principal Mapping.
 * 
 * ## Import
 * 
 * Cognito Identity Pool Roles Attachment can be imported using the Identity Pool id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cognito/identityPoolProviderPrincipalTag:IdentityPoolProviderPrincipalTag example <identity-pool-id>:<identity_provider_name>
 * ```
 * 
 */
@ResourceType(type="aws:cognito/identityPoolProviderPrincipalTag:IdentityPoolProviderPrincipalTag")
public class IdentityPoolProviderPrincipalTag extends io.pulumi.resources.CustomResource {
    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     */
    @Export(name="identityPoolId", type=String.class, parameters={})
    private Output<String> identityPoolId;

    /**
     * @return An identity pool ID in the format REGION:GUID.
     * 
     */
    public Output<String> getIdentityPoolId() {
        return this.identityPoolId;
    }
    /**
     * The name of the identity provider
     * * `principal_tags`: (Optional: []) - String to string map of variables
     * * `use_defaults`: (Optional: true) use default (username and clientID) attribute mappings.
     * 
     */
    @Export(name="identityProviderName", type=String.class, parameters={})
    private Output<String> identityProviderName;

    /**
     * @return The name of the identity provider
     * * `principal_tags`: (Optional: []) - String to string map of variables
     * * `use_defaults`: (Optional: true) use default (username and clientID) attribute mappings.
     * 
     */
    public Output<String> getIdentityProviderName() {
        return this.identityProviderName;
    }
    @Export(name="principalTags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> principalTags;

    public Output</* @Nullable */ Map<String,String>> getPrincipalTags() {
        return this.principalTags;
    }
    @Export(name="useDefaults", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useDefaults;

    public Output</* @Nullable */ Boolean> getUseDefaults() {
        return this.useDefaults;
    }

    public interface BuilderApplicator {
        public void apply(IdentityPoolProviderPrincipalTagArgs.Builder a);
    }
    private static io.pulumi.aws.cognito.IdentityPoolProviderPrincipalTagArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.cognito.IdentityPoolProviderPrincipalTagArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public IdentityPoolProviderPrincipalTag(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IdentityPoolProviderPrincipalTag(String name) {
        this(name, IdentityPoolProviderPrincipalTagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IdentityPoolProviderPrincipalTag(String name, IdentityPoolProviderPrincipalTagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityPoolProviderPrincipalTag(String name, IdentityPoolProviderPrincipalTagArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/identityPoolProviderPrincipalTag:IdentityPoolProviderPrincipalTag", name, args == null ? IdentityPoolProviderPrincipalTagArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private IdentityPoolProviderPrincipalTag(String name, Output<String> id, @Nullable IdentityPoolProviderPrincipalTagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/identityPoolProviderPrincipalTag:IdentityPoolProviderPrincipalTag", name, state, makeResourceOptions(options, id));
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
    public static IdentityPoolProviderPrincipalTag get(String name, Output<String> id, @Nullable IdentityPoolProviderPrincipalTagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityPoolProviderPrincipalTag(name, id, state, options);
    }
}
