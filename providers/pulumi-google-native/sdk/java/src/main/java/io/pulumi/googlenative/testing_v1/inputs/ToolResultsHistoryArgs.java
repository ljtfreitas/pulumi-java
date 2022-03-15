// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a tool results history resource.
 * 
 */
public final class ToolResultsHistoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ToolResultsHistoryArgs Empty = new ToolResultsHistoryArgs();

    /**
     * A tool results history ID.
     * 
     */
    @Import(name="historyId", required=true)
      private final Output<String> historyId;

    public Output<String> getHistoryId() {
        return this.historyId;
    }

    /**
     * The cloud project that owns the tool results history.
     * 
     */
    @Import(name="project", required=true)
      private final Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public ToolResultsHistoryArgs(
        Output<String> historyId,
        Output<String> project) {
        this.historyId = Objects.requireNonNull(historyId, "expected parameter 'historyId' to be non-null");
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private ToolResultsHistoryArgs() {
        this.historyId = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ToolResultsHistoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> historyId;
        private Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ToolResultsHistoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.historyId = defaults.historyId;
    	      this.project = defaults.project;
        }

        public Builder historyId(Output<String> historyId) {
            this.historyId = Objects.requireNonNull(historyId);
            return this;
        }

        public Builder historyId(String historyId) {
            this.historyId = Output.of(Objects.requireNonNull(historyId));
            return this;
        }

        public Builder project(Output<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder project(String project) {
            this.project = Output.of(Objects.requireNonNull(project));
            return this;
        }
        public ToolResultsHistoryArgs build() {
            return new ToolResultsHistoryArgs(historyId, project);
        }
    }
}
