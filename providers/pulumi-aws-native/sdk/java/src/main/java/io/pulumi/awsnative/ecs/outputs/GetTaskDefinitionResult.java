// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.TaskDefinitionTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTaskDefinitionResult {
    private final @Nullable List<TaskDefinitionTag> tags;
    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS task definition
     * 
     */
    private final @Nullable String taskDefinitionArn;

    @CustomType.Constructor
    private GetTaskDefinitionResult(
        @CustomType.Parameter("tags") @Nullable List<TaskDefinitionTag> tags,
        @CustomType.Parameter("taskDefinitionArn") @Nullable String taskDefinitionArn) {
        this.tags = tags;
        this.taskDefinitionArn = taskDefinitionArn;
    }

    public List<TaskDefinitionTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon ECS task definition
     * 
    */
    public Optional<String> getTaskDefinitionArn() {
        return Optional.ofNullable(this.taskDefinitionArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskDefinitionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TaskDefinitionTag> tags;
        private @Nullable String taskDefinitionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskDefinitionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.taskDefinitionArn = defaults.taskDefinitionArn;
        }

        public Builder tags(@Nullable List<TaskDefinitionTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder taskDefinitionArn(@Nullable String taskDefinitionArn) {
            this.taskDefinitionArn = taskDefinitionArn;
            return this;
        }
        public GetTaskDefinitionResult build() {
            return new GetTaskDefinitionResult(tags, taskDefinitionArn);
        }
    }
}
