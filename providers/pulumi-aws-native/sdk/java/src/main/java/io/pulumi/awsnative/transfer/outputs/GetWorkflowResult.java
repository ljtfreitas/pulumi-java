// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.outputs;

import io.pulumi.awsnative.transfer.outputs.WorkflowTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkflowResult {
    /**
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * 
     */
    private final @Nullable String arn;
    /**
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    private final @Nullable List<WorkflowTag> tags;
    /**
     * A unique identifier for the workflow.
     * 
     */
    private final @Nullable String workflowId;

    @OutputCustomType.Constructor({"arn","tags","workflowId"})
    private GetWorkflowResult(
        @Nullable String arn,
        @Nullable List<WorkflowTag> tags,
        @Nullable String workflowId) {
        this.arn = arn;
        this.tags = tags;
        this.workflowId = workflowId;
    }

    /**
     * Specifies the unique Amazon Resource Name (ARN) for the workflow.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * Key-value pairs that can be used to group and search for workflows. Tags are metadata attached to workflows for any purpose.
     * 
     */
    public List<WorkflowTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * A unique identifier for the workflow.
     * 
     */
    public Optional<String> getWorkflowId() {
        return Optional.ofNullable(this.workflowId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkflowResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<WorkflowTag> tags;
        private @Nullable String workflowId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkflowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
    	      this.workflowId = defaults.workflowId;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTags(@Nullable List<WorkflowTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setWorkflowId(@Nullable String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public GetWorkflowResult build() {
            return new GetWorkflowResult(arn, tags, workflowId);
        }
    }
}
