// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Log analytics workspace id and primary key
 * 
 */
public final class LogAnalyticsWorkspaceConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogAnalyticsWorkspaceConfigArgs Empty = new LogAnalyticsWorkspaceConfigArgs();

    /**
     * Primary key of the workspace
     * 
     */
    @Import(name="primaryKey")
      private final @Nullable Output<String> primaryKey;

    public Output<String> getPrimaryKey() {
        return this.primaryKey == null ? Output.empty() : this.primaryKey;
    }

    /**
     * Azure Log Analytics workspace ID
     * 
     */
    @Import(name="workspaceId")
      private final @Nullable Output<String> workspaceId;

    public Output<String> getWorkspaceId() {
        return this.workspaceId == null ? Output.empty() : this.workspaceId;
    }

    public LogAnalyticsWorkspaceConfigArgs(
        @Nullable Output<String> primaryKey,
        @Nullable Output<String> workspaceId) {
        this.primaryKey = primaryKey;
        this.workspaceId = workspaceId;
    }

    private LogAnalyticsWorkspaceConfigArgs() {
        this.primaryKey = Output.empty();
        this.workspaceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsWorkspaceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> primaryKey;
        private @Nullable Output<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsWorkspaceConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder primaryKey(@Nullable Output<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = Output.ofNullable(primaryKey);
            return this;
        }

        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = Output.ofNullable(workspaceId);
            return this;
        }
        public LogAnalyticsWorkspaceConfigArgs build() {
            return new LogAnalyticsWorkspaceConfigArgs(primaryKey, workspaceId);
        }
    }
}
