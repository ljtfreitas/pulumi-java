// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetWorkspaceAadAdminResult {
    /**
     * Workspace active directory administrator type
     * 
     */
    private final @Nullable String administratorType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Login of the workspace active directory administrator
     * 
     */
    private final @Nullable String login;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Object ID of the workspace active directory administrator
     * 
     */
    private final @Nullable String sid;
    /**
     * Tenant ID of the workspace active directory administrator
     * 
     */
    private final @Nullable String tenantId;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"administratorType","id","login","name","sid","tenantId","type"})
    private GetWorkspaceAadAdminResult(
        @Nullable String administratorType,
        String id,
        @Nullable String login,
        String name,
        @Nullable String sid,
        @Nullable String tenantId,
        String type) {
        this.administratorType = administratorType;
        this.id = Objects.requireNonNull(id);
        this.login = login;
        this.name = Objects.requireNonNull(name);
        this.sid = sid;
        this.tenantId = tenantId;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Workspace active directory administrator type
     * 
     */
    public Optional<String> getAdministratorType() {
        return Optional.ofNullable(this.administratorType);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Login of the workspace active directory administrator
     * 
     */
    public Optional<String> getLogin() {
        return Optional.ofNullable(this.login);
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Object ID of the workspace active directory administrator
     * 
     */
    public Optional<String> getSid() {
        return Optional.ofNullable(this.sid);
    }
    /**
     * Tenant ID of the workspace active directory administrator
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceAadAdminResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorType;
        private String id;
        private @Nullable String login;
        private String name;
        private @Nullable String sid;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceAadAdminResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.id = defaults.id;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAdministratorType(@Nullable String administratorType) {
            this.administratorType = administratorType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogin(@Nullable String login) {
            this.login = login;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSid(@Nullable String sid) {
            this.sid = sid;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetWorkspaceAadAdminResult build() {
            return new GetWorkspaceAadAdminResult(administratorType, id, login, name, sid, tenantId, type);
        }
    }
}
