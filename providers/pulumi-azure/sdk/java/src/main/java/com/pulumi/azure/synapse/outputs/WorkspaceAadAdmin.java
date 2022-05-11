// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkspaceAadAdmin {
    /**
     * @return The login name of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    private final String login;
    /**
     * @return The object id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    private final String objectId;
    /**
     * @return The tenant id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    private final String tenantId;

    @CustomType.Constructor
    private WorkspaceAadAdmin(
        @CustomType.Parameter("login") String login,
        @CustomType.Parameter("objectId") String objectId,
        @CustomType.Parameter("tenantId") String tenantId) {
        this.login = login;
        this.objectId = objectId;
        this.tenantId = tenantId;
    }

    /**
     * @return The login name of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public String login() {
        return this.login;
    }
    /**
     * @return The object id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public String objectId() {
        return this.objectId;
    }
    /**
     * @return The tenant id of the Azure AD Administrator of this Synapse Workspace.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceAadAdmin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String login;
        private String objectId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceAadAdmin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.login = defaults.login;
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder login(String login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }
        public Builder objectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }        public WorkspaceAadAdmin build() {
            return new WorkspaceAadAdmin(login, objectId, tenantId);
        }
    }
}
