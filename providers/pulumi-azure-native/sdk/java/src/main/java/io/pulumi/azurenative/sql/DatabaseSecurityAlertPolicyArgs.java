// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.SecurityAlertsPolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseSecurityAlertPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseSecurityAlertPolicyArgs Empty = new DatabaseSecurityAlertPolicyArgs();

    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="disabledAlerts")
    private final @Nullable Input<List<String>> disabledAlerts;

    public Input<List<String>> getDisabledAlerts() {
        return this.disabledAlerts == null ? Input.empty() : this.disabledAlerts;
    }

    @InputImport(name="emailAccountAdmins")
    private final @Nullable Input<Boolean> emailAccountAdmins;

    public Input<Boolean> getEmailAccountAdmins() {
        return this.emailAccountAdmins == null ? Input.empty() : this.emailAccountAdmins;
    }

    @InputImport(name="emailAddresses")
    private final @Nullable Input<List<String>> emailAddresses;

    public Input<List<String>> getEmailAddresses() {
        return this.emailAddresses == null ? Input.empty() : this.emailAddresses;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="retentionDays")
    private final @Nullable Input<Integer> retentionDays;

    public Input<Integer> getRetentionDays() {
        return this.retentionDays == null ? Input.empty() : this.retentionDays;
    }

    @InputImport(name="securityAlertPolicyName")
    private final @Nullable Input<String> securityAlertPolicyName;

    public Input<String> getSecurityAlertPolicyName() {
        return this.securityAlertPolicyName == null ? Input.empty() : this.securityAlertPolicyName;
    }

    @InputImport(name="serverName", required=true)
    private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    @InputImport(name="state", required=true)
    private final Input<SecurityAlertsPolicyState> state;

    public Input<SecurityAlertsPolicyState> getState() {
        return this.state;
    }

    @InputImport(name="storageAccountAccessKey")
    private final @Nullable Input<String> storageAccountAccessKey;

    public Input<String> getStorageAccountAccessKey() {
        return this.storageAccountAccessKey == null ? Input.empty() : this.storageAccountAccessKey;
    }

    @InputImport(name="storageEndpoint")
    private final @Nullable Input<String> storageEndpoint;

    public Input<String> getStorageEndpoint() {
        return this.storageEndpoint == null ? Input.empty() : this.storageEndpoint;
    }

    public DatabaseSecurityAlertPolicyArgs(
        Input<String> databaseName,
        @Nullable Input<List<String>> disabledAlerts,
        @Nullable Input<Boolean> emailAccountAdmins,
        @Nullable Input<List<String>> emailAddresses,
        Input<String> resourceGroupName,
        @Nullable Input<Integer> retentionDays,
        @Nullable Input<String> securityAlertPolicyName,
        Input<String> serverName,
        Input<SecurityAlertsPolicyState> state,
        @Nullable Input<String> storageAccountAccessKey,
        @Nullable Input<String> storageEndpoint) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.disabledAlerts = disabledAlerts;
        this.emailAccountAdmins = emailAccountAdmins;
        this.emailAddresses = emailAddresses;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.retentionDays = retentionDays;
        this.securityAlertPolicyName = securityAlertPolicyName;
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.storageAccountAccessKey = storageAccountAccessKey;
        this.storageEndpoint = storageEndpoint;
    }

    private DatabaseSecurityAlertPolicyArgs() {
        this.databaseName = Input.empty();
        this.disabledAlerts = Input.empty();
        this.emailAccountAdmins = Input.empty();
        this.emailAddresses = Input.empty();
        this.resourceGroupName = Input.empty();
        this.retentionDays = Input.empty();
        this.securityAlertPolicyName = Input.empty();
        this.serverName = Input.empty();
        this.state = Input.empty();
        this.storageAccountAccessKey = Input.empty();
        this.storageEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseSecurityAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> databaseName;
        private @Nullable Input<List<String>> disabledAlerts;
        private @Nullable Input<Boolean> emailAccountAdmins;
        private @Nullable Input<List<String>> emailAddresses;
        private Input<String> resourceGroupName;
        private @Nullable Input<Integer> retentionDays;
        private @Nullable Input<String> securityAlertPolicyName;
        private Input<String> serverName;
        private Input<SecurityAlertsPolicyState> state;
        private @Nullable Input<String> storageAccountAccessKey;
        private @Nullable Input<String> storageEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseSecurityAlertPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.disabledAlerts = defaults.disabledAlerts;
    	      this.emailAccountAdmins = defaults.emailAccountAdmins;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.retentionDays = defaults.retentionDays;
    	      this.securityAlertPolicyName = defaults.securityAlertPolicyName;
    	      this.serverName = defaults.serverName;
    	      this.state = defaults.state;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageEndpoint = defaults.storageEndpoint;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setDisabledAlerts(@Nullable Input<List<String>> disabledAlerts) {
            this.disabledAlerts = disabledAlerts;
            return this;
        }

        public Builder setDisabledAlerts(@Nullable List<String> disabledAlerts) {
            this.disabledAlerts = Input.ofNullable(disabledAlerts);
            return this;
        }

        public Builder setEmailAccountAdmins(@Nullable Input<Boolean> emailAccountAdmins) {
            this.emailAccountAdmins = emailAccountAdmins;
            return this;
        }

        public Builder setEmailAccountAdmins(@Nullable Boolean emailAccountAdmins) {
            this.emailAccountAdmins = Input.ofNullable(emailAccountAdmins);
            return this;
        }

        public Builder setEmailAddresses(@Nullable Input<List<String>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        public Builder setEmailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = Input.ofNullable(emailAddresses);
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

        public Builder setRetentionDays(@Nullable Input<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Input.ofNullable(retentionDays);
            return this;
        }

        public Builder setSecurityAlertPolicyName(@Nullable Input<String> securityAlertPolicyName) {
            this.securityAlertPolicyName = securityAlertPolicyName;
            return this;
        }

        public Builder setSecurityAlertPolicyName(@Nullable String securityAlertPolicyName) {
            this.securityAlertPolicyName = Input.ofNullable(securityAlertPolicyName);
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder setState(Input<SecurityAlertsPolicyState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setState(SecurityAlertsPolicyState state) {
            this.state = Input.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder setStorageAccountAccessKey(@Nullable Input<String> storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        public Builder setStorageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = Input.ofNullable(storageAccountAccessKey);
            return this;
        }

        public Builder setStorageEndpoint(@Nullable Input<String> storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder setStorageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = Input.ofNullable(storageEndpoint);
            return this;
        }

        public DatabaseSecurityAlertPolicyArgs build() {
            return new DatabaseSecurityAlertPolicyArgs(databaseName, disabledAlerts, emailAccountAdmins, emailAddresses, resourceGroupName, retentionDays, securityAlertPolicyName, serverName, state, storageAccountAccessKey, storageEndpoint);
        }
    }
}