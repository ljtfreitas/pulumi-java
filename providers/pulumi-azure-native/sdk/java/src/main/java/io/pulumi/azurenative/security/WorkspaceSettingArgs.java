// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceSettingArgs Empty = new WorkspaceSettingArgs();

    /**
     * All the VMs in this scope will send their security data to the mentioned workspace unless overridden by a setting with more specific scope
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    /**
     * The full Azure ID of the workspace to save the data in
     * 
     */
    @Import(name="workspaceId", required=true)
      private final Output<String> workspaceId;

    public Output<String> getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * Name of the security setting
     * 
     */
    @Import(name="workspaceSettingName")
      private final @Nullable Output<String> workspaceSettingName;

    public Output<String> getWorkspaceSettingName() {
        return this.workspaceSettingName == null ? Output.empty() : this.workspaceSettingName;
    }

    public WorkspaceSettingArgs(
        Output<String> scope,
        Output<String> workspaceId,
        @Nullable Output<String> workspaceSettingName) {
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.workspaceId = Objects.requireNonNull(workspaceId, "expected parameter 'workspaceId' to be non-null");
        this.workspaceSettingName = workspaceSettingName;
    }

    private WorkspaceSettingArgs() {
        this.scope = Output.empty();
        this.workspaceId = Output.empty();
        this.workspaceSettingName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> scope;
        private Output<String> workspaceId;
        private @Nullable Output<String> workspaceSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
    	      this.workspaceId = defaults.workspaceId;
    	      this.workspaceSettingName = defaults.workspaceSettingName;
        }

        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }

        public Builder workspaceId(Output<String> workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }

        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Output.of(Objects.requireNonNull(workspaceId));
            return this;
        }

        public Builder workspaceSettingName(@Nullable Output<String> workspaceSettingName) {
            this.workspaceSettingName = workspaceSettingName;
            return this;
        }

        public Builder workspaceSettingName(@Nullable String workspaceSettingName) {
            this.workspaceSettingName = Output.ofNullable(workspaceSettingName);
            return this;
        }
        public WorkspaceSettingArgs build() {
            return new WorkspaceSettingArgs(scope, workspaceId, workspaceSettingName);
        }
    }
}
