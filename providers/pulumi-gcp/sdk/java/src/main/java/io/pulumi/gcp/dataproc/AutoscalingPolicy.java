// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.dataproc.AutoscalingPolicyArgs;
import io.pulumi.gcp.dataproc.inputs.AutoscalingPolicyState;
import io.pulumi.gcp.dataproc.outputs.AutoscalingPolicyBasicAlgorithm;
import io.pulumi.gcp.dataproc.outputs.AutoscalingPolicySecondaryWorkerConfig;
import io.pulumi.gcp.dataproc.outputs.AutoscalingPolicyWorkerConfig;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Describes an autoscaling policy for Dataproc cluster autoscaler.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AutoscalingPolicy can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/autoscalingPolicy:AutoscalingPolicy default projects/{{project}}/locations/{{location}}/autoscalingPolicies/{{policy_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/autoscalingPolicy:AutoscalingPolicy default {{project}}/{{location}}/{{policy_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataproc/autoscalingPolicy:AutoscalingPolicy default {{location}}/{{policy_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataproc/autoscalingPolicy:AutoscalingPolicy")
public class AutoscalingPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Basic algorithm for autoscaling.
     * Structure is documented below.
     * 
     */
    @Export(name="basicAlgorithm", type=AutoscalingPolicyBasicAlgorithm.class, parameters={})
    private Output</* @Nullable */ AutoscalingPolicyBasicAlgorithm> basicAlgorithm;

    /**
     * @return Basic algorithm for autoscaling.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AutoscalingPolicyBasicAlgorithm> getBasicAlgorithm() {
        return this.basicAlgorithm;
    }
    /**
     * The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The  location where the autoscaling policy should reside.
     * The default value is `global`.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The "resource name" of the autoscaling policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The "resource name" of the autoscaling policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The policy id. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 50 characters.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return The policy id. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     * and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between
     * 3 and 50 characters.
     * 
     */
    public Output<String> getPolicyId() {
        return this.policyId;
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
     * Describes how the autoscaler will operate for secondary workers.
     * Structure is documented below.
     * 
     */
    @Export(name="secondaryWorkerConfig", type=AutoscalingPolicySecondaryWorkerConfig.class, parameters={})
    private Output</* @Nullable */ AutoscalingPolicySecondaryWorkerConfig> secondaryWorkerConfig;

    /**
     * @return Describes how the autoscaler will operate for secondary workers.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AutoscalingPolicySecondaryWorkerConfig> getSecondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }
    /**
     * Describes how the autoscaler will operate for primary workers.
     * Structure is documented below.
     * 
     */
    @Export(name="workerConfig", type=AutoscalingPolicyWorkerConfig.class, parameters={})
    private Output</* @Nullable */ AutoscalingPolicyWorkerConfig> workerConfig;

    /**
     * @return Describes how the autoscaler will operate for primary workers.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ AutoscalingPolicyWorkerConfig> getWorkerConfig() {
        return this.workerConfig;
    }

    public interface BuilderApplicator {
        public void apply(AutoscalingPolicyArgs.Builder a);
    }
    private static io.pulumi.gcp.dataproc.AutoscalingPolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.dataproc.AutoscalingPolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AutoscalingPolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AutoscalingPolicy(String name) {
        this(name, AutoscalingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AutoscalingPolicy(String name, AutoscalingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AutoscalingPolicy(String name, AutoscalingPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/autoscalingPolicy:AutoscalingPolicy", name, args == null ? AutoscalingPolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AutoscalingPolicy(String name, Output<String> id, @Nullable AutoscalingPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataproc/autoscalingPolicy:AutoscalingPolicy", name, state, makeResourceOptions(options, id));
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
    public static AutoscalingPolicy get(String name, Output<String> id, @Nullable AutoscalingPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AutoscalingPolicy(name, id, state, options);
    }
}
