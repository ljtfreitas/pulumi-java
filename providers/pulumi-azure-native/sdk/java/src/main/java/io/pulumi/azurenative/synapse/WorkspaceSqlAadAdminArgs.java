// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkspaceSqlAadAdminArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkspaceSqlAadAdminArgs Empty = new WorkspaceSqlAadAdminArgs();

    /**
     * Workspace active directory administrator type
     * 
     */
    @Import(name="administratorType")
      private final @Nullable Output<String> administratorType;

    public Output<String> getAdministratorType() {
        return this.administratorType == null ? Output.empty() : this.administratorType;
    }

    /**
     * Login of the workspace active directory administrator
     * 
     */
    @Import(name="login")
      private final @Nullable Output<String> login;

    public Output<String> getLogin() {
        return this.login == null ? Output.empty() : this.login;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Object ID of the workspace active directory administrator
     * 
     */
    @Import(name="sid")
      private final @Nullable Output<String> sid;

    public Output<String> getSid() {
        return this.sid == null ? Output.empty() : this.sid;
    }

    /**
     * Tenant ID of the workspace active directory administrator
     * 
     */
    @Import(name="tenantId")
      private final @Nullable Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId == null ? Output.empty() : this.tenantId;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public WorkspaceSqlAadAdminArgs(
        @Nullable Output<String> administratorType,
        @Nullable Output<String> login,
        Output<String> resourceGroupName,
        @Nullable Output<String> sid,
        @Nullable Output<String> tenantId,
        Output<String> workspaceName) {
        this.administratorType = administratorType;
        this.login = login;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sid = sid;
        this.tenantId = tenantId;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private WorkspaceSqlAadAdminArgs() {
        this.administratorType = Output.empty();
        this.login = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sid = Output.empty();
        this.tenantId = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceSqlAadAdminArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> administratorType;
        private @Nullable Output<String> login;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> sid;
        private @Nullable Output<String> tenantId;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceSqlAadAdminArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.login = defaults.login;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder administratorType(@Nullable Output<String> administratorType) {
            this.administratorType = administratorType;
            return this;
        }

        public Builder administratorType(@Nullable String administratorType) {
            this.administratorType = Output.ofNullable(administratorType);
            return this;
        }

        public Builder login(@Nullable Output<String> login) {
            this.login = login;
            return this;
        }

        public Builder login(@Nullable String login) {
            this.login = Output.ofNullable(login);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sid(@Nullable Output<String> sid) {
            this.sid = sid;
            return this;
        }

        public Builder sid(@Nullable String sid) {
            this.sid = Output.ofNullable(sid);
            return this;
        }

        public Builder tenantId(@Nullable Output<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = Output.ofNullable(tenantId);
            return this;
        }

        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public WorkspaceSqlAadAdminArgs build() {
            return new WorkspaceSqlAadAdminArgs(administratorType, login, resourceGroupName, sid, tenantId, workspaceName);
        }
    }
}
