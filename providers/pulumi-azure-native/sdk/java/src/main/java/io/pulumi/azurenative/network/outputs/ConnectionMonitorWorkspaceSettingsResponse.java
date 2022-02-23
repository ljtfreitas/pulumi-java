// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorWorkspaceSettingsResponse {
    /**
     * Log analytics workspace resource ID.
     * 
     */
    private final @Nullable String workspaceResourceId;

    @OutputCustomType.Constructor({"workspaceResourceId"})
    private ConnectionMonitorWorkspaceSettingsResponse(@Nullable String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * Log analytics workspace resource ID.
     * 
     */
    public Optional<String> getWorkspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorWorkspaceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorWorkspaceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setWorkspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public ConnectionMonitorWorkspaceSettingsResponse build() {
            return new ConnectionMonitorWorkspaceSettingsResponse(workspaceResourceId);
        }
    }
}
