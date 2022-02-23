// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrimaryTaskSetResult {
    /**
     * The ID or full Amazon Resource Name (ARN) of the task set.
     * 
     */
    private final @Nullable String taskSetId;

    @OutputCustomType.Constructor({"taskSetId"})
    private GetPrimaryTaskSetResult(@Nullable String taskSetId) {
        this.taskSetId = taskSetId;
    }

    /**
     * The ID or full Amazon Resource Name (ARN) of the task set.
     * 
     */
    public Optional<String> getTaskSetId() {
        return Optional.ofNullable(this.taskSetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrimaryTaskSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String taskSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrimaryTaskSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.taskSetId = defaults.taskSetId;
        }

        public Builder setTaskSetId(@Nullable String taskSetId) {
            this.taskSetId = taskSetId;
            return this;
        }
        public GetPrimaryTaskSetResult build() {
            return new GetPrimaryTaskSetResult(taskSetId);
        }
    }
}
