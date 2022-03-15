// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecr.RegistryPolicyArgs;
import io.pulumi.aws.ecr.inputs.RegistryPolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Container Registry Policy.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ECR Registry Policy can be imported using the registry id, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecr/registryPolicy:RegistryPolicy example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:ecr/registryPolicy:RegistryPolicy")
public class RegistryPolicy extends io.pulumi.resources.CustomResource {
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * The registry ID where the registry was created.
     * 
     */
    @Export(name="registryId", type=String.class, parameters={})
    private Output<String> registryId;

    /**
     * @return The registry ID where the registry was created.
     * 
     */
    public Output<String> getRegistryId() {
        return this.registryId;
    }

    public interface BuilderApplicator {
        public void apply(RegistryPolicyArgs.Builder a);
    }
    private static io.pulumi.aws.ecr.RegistryPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ecr.RegistryPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegistryPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegistryPolicy(String name) {
        this(name, RegistryPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegistryPolicy(String name, RegistryPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/registryPolicy:RegistryPolicy", name, args == null ? RegistryPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RegistryPolicy(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecr/registryPolicy:RegistryPolicy", name, state, makeResourceOptions(options, id));
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
    public static RegistryPolicy get(String name, Output<String> id, @Nullable RegistryPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegistryPolicy(name, id, state, options);
    }
}
