// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.batch.JobQueueArgs;
import io.pulumi.aws.batch.inputs.JobQueueState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Batch Job Queue resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Batch Job Queue can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:batch/jobQueue:JobQueue test_queue arn:aws:batch:us-east-1:123456789012:job-queue/sample
 * ```
 * 
 */
@ResourceType(type="aws:batch/jobQueue:JobQueue")
public class JobQueue extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of the job queue.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of the job queue.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     * 
     */
    @Export(name="computeEnvironments", type=List.class, parameters={String.class})
    private Output<List<String>> computeEnvironments;

    /**
     * @return Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     * 
     */
    public Output<List<String>> getComputeEnvironments() {
        return this.computeEnvironments;
    }
    /**
     * Specifies the name of the job queue.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the job queue.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     * 
     */
    public Output<Integer> getPriority() {
        return this.priority;
    }
    /**
     * The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
     * 
     */
    @Export(name="schedulingPolicyArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedulingPolicyArn;

    /**
     * @return The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
     * 
     */
    public Output</* @Nullable */ String> getSchedulingPolicyArn() {
        return this.schedulingPolicyArn;
    }
    /**
     * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     * 
     */
    public Output<String> getState() {
        return this.state;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(JobQueueArgs.Builder a);
    }
    private static io.pulumi.aws.batch.JobQueueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.batch.JobQueueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public JobQueue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobQueue(String name) {
        this(name, JobQueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobQueue(String name, JobQueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobQueue(String name, JobQueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/jobQueue:JobQueue", name, args == null ? JobQueueArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private JobQueue(String name, Output<String> id, @Nullable JobQueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/jobQueue:JobQueue", name, state, makeResourceOptions(options, id));
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
    public static JobQueue get(String name, Output<String> id, @Nullable JobQueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobQueue(name, id, state, options);
    }
}
