// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueueState extends io.pulumi.resources.ResourceArgs {

    public static final JobQueueState Empty = new JobQueueState();

    /**
     * The Amazon Resource Name of the job queue.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Specifies the set of compute environments
     * mapped to a job queue and their order.  The position of the compute environments
     * in the list will dictate the order.
     * 
     */
    @InputImport(name="computeEnvironments")
    private final @Nullable Input<List<String>> computeEnvironments;

    public Input<List<String>> getComputeEnvironments() {
        return this.computeEnvironments == null ? Input.empty() : this.computeEnvironments;
    }

    /**
     * Specifies the name of the job queue.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The priority of the job queue. Job queues with a higher priority
     * are evaluated first when associated with the same compute environment.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The ARN of the fair share scheduling policy. If this parameter is specified, the job queue uses a fair share scheduling policy. If this parameter isn't specified, the job queue uses a first in, first out (FIFO) scheduling policy. After a job queue is created, you can replace but can't remove the fair share scheduling policy.
     * 
     */
    @InputImport(name="schedulingPolicyArn")
    private final @Nullable Input<String> schedulingPolicyArn;

    public Input<String> getSchedulingPolicyArn() {
        return this.schedulingPolicyArn == null ? Input.empty() : this.schedulingPolicyArn;
    }

    /**
     * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public JobQueueState(
        @Nullable Input<String> arn,
        @Nullable Input<List<String>> computeEnvironments,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> schedulingPolicyArn,
        @Nullable Input<String> state,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.computeEnvironments = computeEnvironments;
        this.name = name;
        this.priority = priority;
        this.schedulingPolicyArn = schedulingPolicyArn;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private JobQueueState() {
        this.arn = Input.empty();
        this.computeEnvironments = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.schedulingPolicyArn = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<String>> computeEnvironments;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> schedulingPolicyArn;
        private @Nullable Input<String> state;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.computeEnvironments = defaults.computeEnvironments;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.schedulingPolicyArn = defaults.schedulingPolicyArn;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setComputeEnvironments(@Nullable Input<List<String>> computeEnvironments) {
            this.computeEnvironments = computeEnvironments;
            return this;
        }

        public Builder setComputeEnvironments(@Nullable List<String> computeEnvironments) {
            this.computeEnvironments = Input.ofNullable(computeEnvironments);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setSchedulingPolicyArn(@Nullable Input<String> schedulingPolicyArn) {
            this.schedulingPolicyArn = schedulingPolicyArn;
            return this;
        }

        public Builder setSchedulingPolicyArn(@Nullable String schedulingPolicyArn) {
            this.schedulingPolicyArn = Input.ofNullable(schedulingPolicyArn);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public JobQueueState build() {
            return new JobQueueState(arn, computeEnvironments, name, priority, schedulingPolicyArn, state, tags, tagsAll);
        }
    }
}
