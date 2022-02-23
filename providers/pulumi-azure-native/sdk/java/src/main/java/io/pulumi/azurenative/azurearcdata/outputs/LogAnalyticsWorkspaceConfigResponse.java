// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogAnalyticsWorkspaceConfigResponse {
    /**
     * Azure Log Analytics workspace ID
     * 
     */
    private final @Nullable String workspaceId;

    @OutputCustomType.Constructor({"workspaceId"})
    private LogAnalyticsWorkspaceConfigResponse(@Nullable String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * Azure Log Analytics workspace ID
     * 
     */
    public Optional<String> getWorkspaceId() {
        return Optional.ofNullable(this.workspaceId);
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

        public Builder setWorkspaceId(@Nullable String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public LogAnalyticsWorkspaceConfigResponse build() {
            return new LogAnalyticsWorkspaceConfigResponse(workspaceId);
        }
    }
}
