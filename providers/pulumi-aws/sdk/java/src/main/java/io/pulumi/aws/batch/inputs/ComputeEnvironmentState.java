// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.aws.batch.inputs.ComputeEnvironmentComputeResourcesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComputeEnvironmentState extends io.pulumi.resources.ResourceArgs {

    public static final ComputeEnvironmentState Empty = new ComputeEnvironmentState();

    /**
     * The Amazon Resource Name (ARN) of the compute environment.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name for your compute environment. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="computeEnvironmentName")
      private final @Nullable Output<String> computeEnvironmentName;

    public Output<String> getComputeEnvironmentName() {
        return this.computeEnvironmentName == null ? Output.empty() : this.computeEnvironmentName;
    }

    /**
     * Creates a unique compute environment name beginning with the specified prefix. Conflicts with `compute_environment_name`.
     * 
     */
    @Import(name="computeEnvironmentNamePrefix")
      private final @Nullable Output<String> computeEnvironmentNamePrefix;

    public Output<String> getComputeEnvironmentNamePrefix() {
        return this.computeEnvironmentNamePrefix == null ? Output.empty() : this.computeEnvironmentNamePrefix;
    }

    /**
     * Details of the compute resources managed by the compute environment. This parameter is required for managed compute environments. See details below.
     * 
     */
    @Import(name="computeResources")
      private final @Nullable Output<ComputeEnvironmentComputeResourcesGetArgs> computeResources;

    public Output<ComputeEnvironmentComputeResourcesGetArgs> getComputeResources() {
        return this.computeResources == null ? Output.empty() : this.computeResources;
    }

    /**
     * The Amazon Resource Name (ARN) of the underlying Amazon ECS cluster used by the compute environment.
     * 
     */
    @Import(name="ecsClusterArn")
      private final @Nullable Output<String> ecsClusterArn;

    public Output<String> getEcsClusterArn() {
        return this.ecsClusterArn == null ? Output.empty() : this.ecsClusterArn;
    }

    /**
     * The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to make calls to other AWS services on your behalf.
     * 
     */
    @Import(name="serviceRole")
      private final @Nullable Output<String> serviceRole;

    public Output<String> getServiceRole() {
        return this.serviceRole == null ? Output.empty() : this.serviceRole;
    }

    /**
     * The state of the compute environment. If the state is `ENABLED`, then the compute environment accepts jobs from a queue and can scale out automatically based on queues. Valid items are `ENABLED` or `DISABLED`. Defaults to `ENABLED`.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * The current status of the compute environment (for example, CREATING or VALID).
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * A short, human-readable string to provide additional details about the current status of the compute environment.
     * 
     */
    @Import(name="statusReason")
      private final @Nullable Output<String> statusReason;

    public Output<String> getStatusReason() {
        return this.statusReason == null ? Output.empty() : this.statusReason;
    }

    /**
     * Key-value pair tags to be applied to resources that are launched in the compute environment. This parameter isn't applicable to jobs running on Fargate resources, and shouldn't be specified.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The type of compute environment. Valid items are `EC2`, `SPOT`, `FARGATE` or `FARGATE_SPOT`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ComputeEnvironmentState(
        @Nullable Output<String> arn,
        @Nullable Output<String> computeEnvironmentName,
        @Nullable Output<String> computeEnvironmentNamePrefix,
        @Nullable Output<ComputeEnvironmentComputeResourcesGetArgs> computeResources,
        @Nullable Output<String> ecsClusterArn,
        @Nullable Output<String> serviceRole,
        @Nullable Output<String> state,
        @Nullable Output<String> status,
        @Nullable Output<String> statusReason,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type) {
        this.arn = arn;
        this.computeEnvironmentName = computeEnvironmentName;
        this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
        this.computeResources = computeResources;
        this.ecsClusterArn = ecsClusterArn;
        this.serviceRole = serviceRole;
        this.state = state;
        this.status = status;
        this.statusReason = statusReason;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private ComputeEnvironmentState() {
        this.arn = Output.empty();
        this.computeEnvironmentName = Output.empty();
        this.computeEnvironmentNamePrefix = Output.empty();
        this.computeResources = Output.empty();
        this.ecsClusterArn = Output.empty();
        this.serviceRole = Output.empty();
        this.state = Output.empty();
        this.status = Output.empty();
        this.statusReason = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> computeEnvironmentName;
        private @Nullable Output<String> computeEnvironmentNamePrefix;
        private @Nullable Output<ComputeEnvironmentComputeResourcesGetArgs> computeResources;
        private @Nullable Output<String> ecsClusterArn;
        private @Nullable Output<String> serviceRole;
        private @Nullable Output<String> state;
        private @Nullable Output<String> status;
        private @Nullable Output<String> statusReason;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.computeEnvironmentName = defaults.computeEnvironmentName;
    	      this.computeEnvironmentNamePrefix = defaults.computeEnvironmentNamePrefix;
    	      this.computeResources = defaults.computeResources;
    	      this.ecsClusterArn = defaults.ecsClusterArn;
    	      this.serviceRole = defaults.serviceRole;
    	      this.state = defaults.state;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder computeEnvironmentName(@Nullable Output<String> computeEnvironmentName) {
            this.computeEnvironmentName = computeEnvironmentName;
            return this;
        }

        public Builder computeEnvironmentName(@Nullable String computeEnvironmentName) {
            this.computeEnvironmentName = Output.ofNullable(computeEnvironmentName);
            return this;
        }

        public Builder computeEnvironmentNamePrefix(@Nullable Output<String> computeEnvironmentNamePrefix) {
            this.computeEnvironmentNamePrefix = computeEnvironmentNamePrefix;
            return this;
        }

        public Builder computeEnvironmentNamePrefix(@Nullable String computeEnvironmentNamePrefix) {
            this.computeEnvironmentNamePrefix = Output.ofNullable(computeEnvironmentNamePrefix);
            return this;
        }

        public Builder computeResources(@Nullable Output<ComputeEnvironmentComputeResourcesGetArgs> computeResources) {
            this.computeResources = computeResources;
            return this;
        }

        public Builder computeResources(@Nullable ComputeEnvironmentComputeResourcesGetArgs computeResources) {
            this.computeResources = Output.ofNullable(computeResources);
            return this;
        }

        public Builder ecsClusterArn(@Nullable Output<String> ecsClusterArn) {
            this.ecsClusterArn = ecsClusterArn;
            return this;
        }

        public Builder ecsClusterArn(@Nullable String ecsClusterArn) {
            this.ecsClusterArn = Output.ofNullable(ecsClusterArn);
            return this;
        }

        public Builder serviceRole(@Nullable Output<String> serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        public Builder serviceRole(@Nullable String serviceRole) {
            this.serviceRole = Output.ofNullable(serviceRole);
            return this;
        }

        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder statusReason(@Nullable Output<String> statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        public Builder statusReason(@Nullable String statusReason) {
            this.statusReason = Output.ofNullable(statusReason);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public ComputeEnvironmentState build() {
            return new ComputeEnvironmentState(arn, computeEnvironmentName, computeEnvironmentNamePrefix, computeResources, ecsClusterArn, serviceRole, state, status, statusReason, tags, tagsAll, type);
        }
    }
}
