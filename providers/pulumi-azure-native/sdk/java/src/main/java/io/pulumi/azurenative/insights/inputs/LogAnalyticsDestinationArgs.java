// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Log Analytics destination.
 * 
 */
public final class LogAnalyticsDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogAnalyticsDestinationArgs Empty = new LogAnalyticsDestinationArgs();

    /**
     * A friendly name for the destination.
     * This name should be unique across all destinations (regardless of type) within the data collection rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The resource ID of the Log Analytics workspace.
     * 
     */
    @Import(name="workspaceResourceId")
      private final @Nullable Output<String> workspaceResourceId;

    public Output<String> getWorkspaceResourceId() {
        return this.workspaceResourceId == null ? Output.empty() : this.workspaceResourceId;
    }

    public LogAnalyticsDestinationArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> workspaceResourceId) {
        this.name = name;
        this.workspaceResourceId = workspaceResourceId;
    }

    private LogAnalyticsDestinationArgs() {
        this.name = Output.empty();
        this.workspaceResourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder workspaceResourceId(@Nullable Output<String> workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }

        public Builder workspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = Output.ofNullable(workspaceResourceId);
            return this;
        }
        public LogAnalyticsDestinationArgs build() {
            return new LogAnalyticsDestinationArgs(name, workspaceResourceId);
        }
    }
}
