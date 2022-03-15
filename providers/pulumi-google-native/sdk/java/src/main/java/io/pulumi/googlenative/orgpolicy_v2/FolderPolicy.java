// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.orgpolicy_v2.FolderPolicyArgs;
import io.pulumi.googlenative.orgpolicy_v2.outputs.GoogleCloudOrgpolicyV2PolicySpecResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a Policy. Returns a `google.rpc.Status` with `google.rpc.Code.NOT_FOUND` if the constraint does not exist. Returns a `google.rpc.Status` with `google.rpc.Code.ALREADY_EXISTS` if the policy already exists on the given Cloud resource.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:orgpolicy/v2:FolderPolicy")
public class FolderPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the Policy. Must be one of the following forms, where constraint_name is the name of the constraint which this Policy configures: * `projects/{project_number}/policies/{constraint_name}` * `folders/{folder_id}/policies/{constraint_name}` * `organizations/{organization_id}/policies/{constraint_name}` For example, "projects/123/policies/compute.disableSerialPortAccess". Note: `projects/{project_id}/policies/{constraint_name}` is also an acceptable name for API requests, but responses will return the name using the equivalent project number.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Basic information about the Organization Policy.
     * 
     */
    @Export(name="spec", type=GoogleCloudOrgpolicyV2PolicySpecResponse.class, parameters={})
    private Output<GoogleCloudOrgpolicyV2PolicySpecResponse> spec;

    /**
     * @return Basic information about the Organization Policy.
     * 
     */
    public Output<GoogleCloudOrgpolicyV2PolicySpecResponse> getSpec() {
        return this.spec;
    }

    public interface BuilderApplicator {
        public void apply(FolderPolicyArgs.Builder a);
    }
    private static io.pulumi.googlenative.orgpolicy_v2.FolderPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.orgpolicy_v2.FolderPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public FolderPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FolderPolicy(String name) {
        this(name, FolderPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FolderPolicy(String name, FolderPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FolderPolicy(String name, FolderPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:orgpolicy/v2:FolderPolicy", name, args == null ? FolderPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private FolderPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:orgpolicy/v2:FolderPolicy", name, null, makeResourceOptions(options, id));
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
    public static FolderPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FolderPolicy(name, id, options);
    }
}
