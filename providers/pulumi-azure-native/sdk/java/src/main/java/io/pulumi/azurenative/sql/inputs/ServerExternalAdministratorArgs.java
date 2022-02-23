// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.enums.AdministratorType;
import io.pulumi.azurenative.sql.enums.PrincipalType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a active directory administrator.
 * 
 */
public final class ServerExternalAdministratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerExternalAdministratorArgs Empty = new ServerExternalAdministratorArgs();

    /**
     * Type of the sever administrator.
     * 
     */
    @InputImport(name="administratorType")
        private final @Nullable Input<Either<String,AdministratorType>> administratorType;

    public Input<Either<String,AdministratorType>> getAdministratorType() {
        return this.administratorType == null ? Input.empty() : this.administratorType;
    }

    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @InputImport(name="azureADOnlyAuthentication")
        private final @Nullable Input<Boolean> azureADOnlyAuthentication;

    public Input<Boolean> getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication == null ? Input.empty() : this.azureADOnlyAuthentication;
    }

    /**
     * Login name of the server administrator.
     * 
     */
    @InputImport(name="login")
        private final @Nullable Input<String> login;

    public Input<String> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    /**
     * Principal Type of the sever administrator.
     * 
     */
    @InputImport(name="principalType")
        private final @Nullable Input<Either<String,PrincipalType>> principalType;

    public Input<Either<String,PrincipalType>> getPrincipalType() {
        return this.principalType == null ? Input.empty() : this.principalType;
    }

    /**
     * SID (object ID) of the server administrator.
     * 
     */
    @InputImport(name="sid")
        private final @Nullable Input<String> sid;

    public Input<String> getSid() {
        return this.sid == null ? Input.empty() : this.sid;
    }

    /**
     * Tenant ID of the administrator.
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public ServerExternalAdministratorArgs(
        @Nullable Input<Either<String,AdministratorType>> administratorType,
        @Nullable Input<Boolean> azureADOnlyAuthentication,
        @Nullable Input<String> login,
        @Nullable Input<Either<String,PrincipalType>> principalType,
        @Nullable Input<String> sid,
        @Nullable Input<String> tenantId) {
        this.administratorType = administratorType;
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        this.login = login;
        this.principalType = principalType;
        this.sid = sid;
        this.tenantId = tenantId;
    }

    private ServerExternalAdministratorArgs() {
        this.administratorType = Input.empty();
        this.azureADOnlyAuthentication = Input.empty();
        this.login = Input.empty();
        this.principalType = Input.empty();
        this.sid = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerExternalAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AdministratorType>> administratorType;
        private @Nullable Input<Boolean> azureADOnlyAuthentication;
        private @Nullable Input<String> login;
        private @Nullable Input<Either<String,PrincipalType>> principalType;
        private @Nullable Input<String> sid;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerExternalAdministratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorType = defaults.administratorType;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.login = defaults.login;
    	      this.principalType = defaults.principalType;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setAdministratorType(@Nullable Input<Either<String,AdministratorType>> administratorType) {
            this.administratorType = administratorType;
            return this;
        }

        public Builder setAdministratorType(@Nullable Either<String,AdministratorType> administratorType) {
            this.administratorType = Input.ofNullable(administratorType);
            return this;
        }

        public Builder setAzureADOnlyAuthentication(@Nullable Input<Boolean> azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = azureADOnlyAuthentication;
            return this;
        }

        public Builder setAzureADOnlyAuthentication(@Nullable Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Input.ofNullable(azureADOnlyAuthentication);
            return this;
        }

        public Builder setLogin(@Nullable Input<String> login) {
            this.login = login;
            return this;
        }

        public Builder setLogin(@Nullable String login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder setPrincipalType(@Nullable Input<Either<String,PrincipalType>> principalType) {
            this.principalType = principalType;
            return this;
        }

        public Builder setPrincipalType(@Nullable Either<String,PrincipalType> principalType) {
            this.principalType = Input.ofNullable(principalType);
            return this;
        }

        public Builder setSid(@Nullable Input<String> sid) {
            this.sid = sid;
            return this;
        }

        public Builder setSid(@Nullable String sid) {
            this.sid = Input.ofNullable(sid);
            return this;
        }

        public Builder setTenantId(@Nullable Input<String> tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = Input.ofNullable(tenantId);
            return this;
        }
        public ServerExternalAdministratorArgs build() {
            return new ServerExternalAdministratorArgs(administratorType, azureADOnlyAuthentication, login, principalType, sid, tenantId);
        }
    }
}
