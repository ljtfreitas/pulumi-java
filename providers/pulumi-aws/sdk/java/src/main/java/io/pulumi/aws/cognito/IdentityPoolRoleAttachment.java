// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cognito.IdentityPoolRoleAttachmentArgs;
import io.pulumi.aws.cognito.inputs.IdentityPoolRoleAttachmentState;
import io.pulumi.aws.cognito.outputs.IdentityPoolRoleAttachmentRoleMapping;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an AWS Cognito Identity Pool Roles Attachment.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cognito Identity Pool Roles Attachment can be imported using the Identity Pool id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment example <identity-pool-id>
 * ```
 * 
 */
@ResourceType(type="aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment")
public class IdentityPoolRoleAttachment extends io.pulumi.resources.CustomResource {
    /**
     * An identity pool ID in the format REGION:GUID.
     * 
     */
    @OutputExport(name="identityPoolId", type=String.class, parameters={})
    private Output<String> identityPoolId;

    /**
     * @return An identity pool ID in the format REGION:GUID.
     * 
     */
    public Output<String> getIdentityPoolId() {
        return this.identityPoolId;
    }
    /**
     * A List of Role Mapping.
     * 
     */
    @OutputExport(name="roleMappings", type=List.class, parameters={IdentityPoolRoleAttachmentRoleMapping.class})
    private Output</* @Nullable */ List<IdentityPoolRoleAttachmentRoleMapping>> roleMappings;

    /**
     * @return A List of Role Mapping.
     * 
     */
    public Output</* @Nullable */ List<IdentityPoolRoleAttachmentRoleMapping>> getRoleMappings() {
        return this.roleMappings;
    }
    /**
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
     * 
     */
    @OutputExport(name="roles", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> roles;

    /**
     * @return The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
     * 
     */
    public Output<Map<String,String>> getRoles() {
        return this.roles;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IdentityPoolRoleAttachment(String name, IdentityPoolRoleAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment", name, args == null ? IdentityPoolRoleAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private IdentityPoolRoleAttachment(String name, Input<String> id, @Nullable IdentityPoolRoleAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment", name, state, makeResourceOptions(options, id));
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
    public static IdentityPoolRoleAttachment get(String name, Input<String> id, @Nullable IdentityPoolRoleAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new IdentityPoolRoleAttachment(name, id, state, options);
    }
}