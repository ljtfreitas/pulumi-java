// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam_instanceProfile;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam_instanceProfile.InstanceProfileArgs;
import io.pulumi.aws.iam_instanceProfile.inputs.InstanceProfileState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="aws:iam/instanceProfile:InstanceProfile")
public class InstanceProfile extends io.pulumi.resources.CustomResource {
    /**
     * Name of the role to add to the profile.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return Name of the role to add to the profile.
     * 
     */
    public Output</* @Nullable */ String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable InstanceProfileArgs.Builder a);
    }
    private static io.pulumi.aws.iam_instanceProfile.InstanceProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iam_instanceProfile.InstanceProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public InstanceProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceProfile(String name) {
        this(name, InstanceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/instanceProfile:InstanceProfile", name, args == null ? InstanceProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private InstanceProfile(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/instanceProfile:InstanceProfile", name, state, makeResourceOptions(options, id));
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
    public static InstanceProfile get(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceProfile(name, id, state, options);
    }
}
