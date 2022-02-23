// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a active directory administrator.
 * 
 */
public final class ManagedInstanceExternalAdministratorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedInstanceExternalAdministratorResponse Empty = new ManagedInstanceExternalAdministratorResponse();

    /**
     * Type of the sever administrator.
     * 
     */
    @InputImport(name="administratorType")
        private final @Nullable String administratorType;

    public Optional<String> getAdministratorType() {
        return this.administratorType == null ? Optional.empty() : Optional.ofNullable(this.administratorType);
    }

    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @InputImport(name="azureADOnlyAuthentication")
        private final @Nullable Boolean azureADOnlyAuthentication;

    public Optional<Boolean> getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication == null ? Optional.empty() : Optional.ofNullable(this.azureADOnlyAuthentication);
    }

    /**
     * Login name of the server administrator.
     * 
     */
    @InputImport(name="login")
        private final @Nullable String login;

    public Optional<String> getLogin() {
        return this.login == null ? Optional.empty() : Optional.ofNullable(this.login);
    }

    /**
     * Principal Type of the sever administrator.
     * 
     */
    @InputImport(name="principalType")
        private final @Nullable String principalType;

    public Optional<String> getPrincipalType() {
        return this.principalType == null ? Optional.empty() : Optional.ofNullable(this.principalType);
    }

    /**
     * SID (object ID) of the server administrator.
     * 
     */
    @InputImport(name="sid")
        private final @Nullable String sid;

    public Optional<String> getSid() {
        return this.sid == null ? Optional.empty() : Optional.ofNullable(this.sid);
    }

    /**
     * Tenant ID of the administrator.
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public ManagedInstanceExternalAdministratorResponse(
        @Nullable String administratorType,
        @Nullable Boolean azureADOnlyAuthentication,
        @Nullable String login,
        @Nullable String principalType,
        @Nullable String sid,
        @Nullable String tenantId) {
        this.administratorType = administratorType;
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        this.login = login;
        this.principalType = principalType;
        this.sid = sid;
        this.tenantId = tenantId;
    }

    private ManagedInstanceExternalAdministratorResponse() {
        this.administratorType = null;
        this.azureADOnlyAuthentication = null;
        this.login = null;
        this.principalType = null;
        this.sid = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceExternalAdministratorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String administratorType;
        private @Nullable Boolean azureADOnlyAuthentication;
        private @Nullable String login;
        private @Nullable String principalType;
        private @Nullable String sid;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceExternalAdministratorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.login = defaults.login;
    	      this.principalType = defaults.principalType;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setAdministratorType(@Nullable String administratorType) {
            this.administratorType = administratorType;
            return this;
        }

        public Builder setAzureADOnlyAuthentication(@Nullable Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = azureADOnlyAuthentication;
            return this;
        }

        public Builder setLogin(@Nullable String login) {
            this.login = login;
            return this;
        }

        public Builder setPrincipalType(@Nullable String principalType) {
            this.principalType = principalType;
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
        public ManagedInstanceExternalAdministratorResponse build() {
            return new ManagedInstanceExternalAdministratorResponse(administratorType, azureADOnlyAuthentication, login, principalType, sid, tenantId);
        }
    }
}
