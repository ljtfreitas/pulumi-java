// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetServerAdministratorResult {
    /**
     * The type of administrator.
     * 
     */
    private final String administratorType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The server administrator login account name.
     * 
     */
    private final String login;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The server administrator Sid (Secure ID).
     * 
     */
    private final String sid;
    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    private final String tenantId;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"administratorType","id","login","name","sid","tenantId","type"})
    private GetServerAdministratorResult(
        String administratorType,
        String id,
        String login,
        String name,
        String sid,
        String tenantId,
        String type) {
        this.administratorType = Objects.requireNonNull(administratorType);
        this.id = Objects.requireNonNull(id);
        this.login = Objects.requireNonNull(login);
        this.name = Objects.requireNonNull(name);
        this.sid = Objects.requireNonNull(sid);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The type of administrator.
     * 
     */
    public String getAdministratorType() {
        return this.administratorType;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The server administrator login account name.
     * 
     */
    public String getLogin() {
        return this.login;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The server administrator Sid (Secure ID).
     * 
     */
    public String getSid() {
        return this.sid;
    }
    /**
     * The server Active Directory Administrator tenant id.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
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

    public static Builder builder(GetServerAdministratorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorType;
        private String id;
        private String login;
        private String name;
        private String sid;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAdministratorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.id = defaults.id;
    	      this.login = defaults.login;
    	      this.name = defaults.name;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAdministratorType(String administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSid(String sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerAdministratorResult build() {
            return new GetServerAdministratorResult(administratorType, id, login, name, sid, tenantId, type);
        }
    }
}
