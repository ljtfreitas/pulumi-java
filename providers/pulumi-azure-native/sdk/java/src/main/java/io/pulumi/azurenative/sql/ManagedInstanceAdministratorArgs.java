// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.ManagedInstanceAdministratorType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedInstanceAdministratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceAdministratorArgs Empty = new ManagedInstanceAdministratorArgs();

    @InputImport(name="administratorName")
        private final @Nullable Input<String> administratorName;

    public Input<String> getAdministratorName() {
        return this.administratorName == null ? Input.empty() : this.administratorName;
    }

    /**
     * Type of the managed instance administrator.
     * 
     */
    @InputImport(name="administratorType", required=true)
        private final Input<Either<String,ManagedInstanceAdministratorType>> administratorType;

    public Input<Either<String,ManagedInstanceAdministratorType>> getAdministratorType() {
        return this.administratorType;
    }

    /**
     * Login name of the managed instance administrator.
     * 
     */
    @InputImport(name="login", required=true)
        private final Input<String> login;

    public Input<String> getLogin() {
        return this.login;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName", required=true)
        private final Input<String> managedInstanceName;

    public Input<String> getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * SID (object ID) of the managed instance administrator.
     * 
     */
    @InputImport(name="sid", required=true)
        private final Input<String> sid;

    public Input<String> getSid() {
        return this.sid;
    }

    /**
     * Tenant ID of the managed instance administrator.
     * 
     */
    @InputImport(name="tenantId")
        private final @Nullable Input<String> tenantId;

    public Input<String> getTenantId() {
        return this.tenantId == null ? Input.empty() : this.tenantId;
    }

    public ManagedInstanceAdministratorArgs(
        @Nullable Input<String> administratorName,
        Input<Either<String,ManagedInstanceAdministratorType>> administratorType,
        Input<String> login,
        Input<String> managedInstanceName,
        Input<String> resourceGroupName,
        Input<String> sid,
        @Nullable Input<String> tenantId) {
        this.administratorName = administratorName;
        this.administratorType = Objects.requireNonNull(administratorType, "expected parameter 'administratorType' to be non-null");
        this.login = Objects.requireNonNull(login, "expected parameter 'login' to be non-null");
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sid = Objects.requireNonNull(sid, "expected parameter 'sid' to be non-null");
        this.tenantId = tenantId;
    }

    private ManagedInstanceAdministratorArgs() {
        this.administratorName = Input.empty();
        this.administratorType = Input.empty();
        this.login = Input.empty();
        this.managedInstanceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sid = Input.empty();
        this.tenantId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> administratorName;
        private Input<Either<String,ManagedInstanceAdministratorType>> administratorType;
        private Input<String> login;
        private Input<String> managedInstanceName;
        private Input<String> resourceGroupName;
        private Input<String> sid;
        private @Nullable Input<String> tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceAdministratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorName = defaults.administratorName;
    	      this.administratorType = defaults.administratorType;
    	      this.login = defaults.login;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sid = defaults.sid;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setAdministratorName(@Nullable Input<String> administratorName) {
            this.administratorName = administratorName;
            return this;
        }

        public Builder setAdministratorName(@Nullable String administratorName) {
            this.administratorName = Input.ofNullable(administratorName);
            return this;
        }

        public Builder setAdministratorType(Input<Either<String,ManagedInstanceAdministratorType>> administratorType) {
            this.administratorType = Objects.requireNonNull(administratorType);
            return this;
        }

        public Builder setAdministratorType(Either<String,ManagedInstanceAdministratorType> administratorType) {
            this.administratorType = Input.of(Objects.requireNonNull(administratorType));
            return this;
        }

        public Builder setLogin(Input<String> login) {
            this.login = Objects.requireNonNull(login);
            return this;
        }

        public Builder setLogin(String login) {
            this.login = Input.of(Objects.requireNonNull(login));
            return this;
        }

        public Builder setManagedInstanceName(Input<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder setManagedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Input.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSid(Input<String> sid) {
            this.sid = Objects.requireNonNull(sid);
            return this;
        }

        public Builder setSid(String sid) {
            this.sid = Input.of(Objects.requireNonNull(sid));
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
        public ManagedInstanceAdministratorArgs build() {
            return new ManagedInstanceAdministratorArgs(administratorName, administratorType, login, managedInstanceName, resourceGroupName, sid, tenantId);
        }
    }
}
