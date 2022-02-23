// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationActionWorkspaceResponse {
    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'Workspace'.
     * 
     */
    private final String actionType;
    /**
     * The fully qualified Log Analytics Workspace Azure Resource ID.
     * 
     */
    private final @Nullable String workspaceResourceId;

    @OutputCustomType.Constructor({"actionType","workspaceResourceId"})
    private AutomationActionWorkspaceResponse(
        String actionType,
        @Nullable String workspaceResourceId) {
        this.actionType = Objects.requireNonNull(actionType);
        this.workspaceResourceId = workspaceResourceId;
    }

    /**
     * The type of the action that will be triggered by the Automation
     * Expected value is 'Workspace'.
     * 
     */
    public String getActionType() {
        return this.actionType;
    }
    /**
     * The fully qualified Log Analytics Workspace Azure Resource ID.
     * 
     */
    public Optional<String> getWorkspaceResourceId() {
        return Optional.ofNullable(this.workspaceResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationActionWorkspaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionType;
        private @Nullable String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationActionWorkspaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionType = defaults.actionType;
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder setActionType(String actionType) {
            this.actionType = Objects.requireNonNull(actionType);
            return this;
        }

        public Builder setWorkspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }
        public AutomationActionWorkspaceResponse build() {
            return new AutomationActionWorkspaceResponse(actionType, workspaceResourceId);
        }
    }
}
