// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Log analytics workspace id and primary key
 * 
 */
public final class LogAnalyticsWorkspaceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogAnalyticsWorkspaceConfigResponse Empty = new LogAnalyticsWorkspaceConfigResponse();

    /**
     * Azure Log Analytics workspace ID
     * 
     */
    @Import(name="workspaceId")
      private final @Nullable String workspaceId;

    public Optional<String> getWorkspaceId() {
        return this.workspaceId == null ? Optional.empty() : Optional.ofNullable(this.workspaceId);
    }

    public LogAnalyticsWorkspaceConfigResponse(@Nullable String workspaceId) {
        this.workspaceId = workspaceId;
    }

    private LogAnalyticsWorkspaceConfigResponse() {
        this.workspaceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAnalyticsWorkspaceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LogAnalyticsWorkspaceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public LogAnalyticsWorkspaceConfigResponse build() {
            return new LogAnalyticsWorkspaceConfigResponse(workspaceId);
        }
    }
}
