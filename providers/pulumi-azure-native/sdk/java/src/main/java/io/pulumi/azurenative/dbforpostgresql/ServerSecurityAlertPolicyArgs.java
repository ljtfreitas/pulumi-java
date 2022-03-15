// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql;

import io.pulumi.azurenative.dbforpostgresql.enums.ServerSecurityAlertPolicyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerSecurityAlertPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerSecurityAlertPolicyArgs Empty = new ServerSecurityAlertPolicyArgs();

    /**
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly
     * 
     */
    @Import(name="disabledAlerts")
      private final @Nullable Output<List<String>> disabledAlerts;

    public Output<List<String>> getDisabledAlerts() {
        return this.disabledAlerts == null ? Output.empty() : this.disabledAlerts;
    }

    /**
     * Specifies that the alert is sent to the account administrators.
     * 
     */
    @Import(name="emailAccountAdmins")
      private final @Nullable Output<Boolean> emailAccountAdmins;

    public Output<Boolean> getEmailAccountAdmins() {
        return this.emailAccountAdmins == null ? Output.empty() : this.emailAccountAdmins;
    }

    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    @Import(name="emailAddresses")
      private final @Nullable Output<List<String>> emailAddresses;

    public Output<List<String>> getEmailAddresses() {
        return this.emailAddresses == null ? Output.empty() : this.emailAddresses;
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
     * Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    @Import(name="retentionDays")
      private final @Nullable Output<Integer> retentionDays;

    public Output<Integer> getRetentionDays() {
        return this.retentionDays == null ? Output.empty() : this.retentionDays;
    }

    /**
     * The name of the threat detection policy.
     * 
     */
    @Import(name="securityAlertPolicyName")
      private final @Nullable Output<String> securityAlertPolicyName;

    public Output<String> getSecurityAlertPolicyName() {
        return this.securityAlertPolicyName == null ? Output.empty() : this.securityAlertPolicyName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName;
    }

    /**
     * Specifies the state of the policy, whether it is enabled or disabled.
     * 
     */
    @Import(name="state", required=true)
      private final Output<ServerSecurityAlertPolicyState> state;

    public Output<ServerSecurityAlertPolicyState> getState() {
        return this.state;
    }

    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    @Import(name="storageAccountAccessKey")
      private final @Nullable Output<String> storageAccountAccessKey;

    public Output<String> getStorageAccountAccessKey() {
        return this.storageAccountAccessKey == null ? Output.empty() : this.storageAccountAccessKey;
    }

    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    @Import(name="storageEndpoint")
      private final @Nullable Output<String> storageEndpoint;

    public Output<String> getStorageEndpoint() {
        return this.storageEndpoint == null ? Output.empty() : this.storageEndpoint;
    }

    public ServerSecurityAlertPolicyArgs(
        @Nullable Output<List<String>> disabledAlerts,
        @Nullable Output<Boolean> emailAccountAdmins,
        @Nullable Output<List<String>> emailAddresses,
        Output<String> resourceGroupName,
        @Nullable Output<Integer> retentionDays,
        @Nullable Output<String> securityAlertPolicyName,
        Output<String> serverName,
        Output<ServerSecurityAlertPolicyState> state,
        @Nullable Output<String> storageAccountAccessKey,
        @Nullable Output<String> storageEndpoint) {
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

    private ServerSecurityAlertPolicyArgs() {
        this.disabledAlerts = Output.empty();
        this.emailAccountAdmins = Output.empty();
        this.emailAddresses = Output.empty();
        this.resourceGroupName = Output.empty();
        this.retentionDays = Output.empty();
        this.securityAlertPolicyName = Output.empty();
        this.serverName = Output.empty();
        this.state = Output.empty();
        this.storageAccountAccessKey = Output.empty();
        this.storageEndpoint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerSecurityAlertPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> disabledAlerts;
        private @Nullable Output<Boolean> emailAccountAdmins;
        private @Nullable Output<List<String>> emailAddresses;
        private Output<String> resourceGroupName;
        private @Nullable Output<Integer> retentionDays;
        private @Nullable Output<String> securityAlertPolicyName;
        private Output<String> serverName;
        private Output<ServerSecurityAlertPolicyState> state;
        private @Nullable Output<String> storageAccountAccessKey;
        private @Nullable Output<String> storageEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerSecurityAlertPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
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

        public Builder disabledAlerts(@Nullable Output<List<String>> disabledAlerts) {
            this.disabledAlerts = disabledAlerts;
            return this;
        }

        public Builder disabledAlerts(@Nullable List<String> disabledAlerts) {
            this.disabledAlerts = Output.ofNullable(disabledAlerts);
            return this;
        }

        public Builder emailAccountAdmins(@Nullable Output<Boolean> emailAccountAdmins) {
            this.emailAccountAdmins = emailAccountAdmins;
            return this;
        }

        public Builder emailAccountAdmins(@Nullable Boolean emailAccountAdmins) {
            this.emailAccountAdmins = Output.ofNullable(emailAccountAdmins);
            return this;
        }

        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        public Builder emailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = Output.ofNullable(emailAddresses);
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

        public Builder retentionDays(@Nullable Output<Integer> retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder retentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = Output.ofNullable(retentionDays);
            return this;
        }

        public Builder securityAlertPolicyName(@Nullable Output<String> securityAlertPolicyName) {
            this.securityAlertPolicyName = securityAlertPolicyName;
            return this;
        }

        public Builder securityAlertPolicyName(@Nullable String securityAlertPolicyName) {
            this.securityAlertPolicyName = Output.ofNullable(securityAlertPolicyName);
            return this;
        }

        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }

        public Builder state(Output<ServerSecurityAlertPolicyState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder state(ServerSecurityAlertPolicyState state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }

        public Builder storageAccountAccessKey(@Nullable Output<String> storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        public Builder storageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = Output.ofNullable(storageAccountAccessKey);
            return this;
        }

        public Builder storageEndpoint(@Nullable Output<String> storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder storageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = Output.ofNullable(storageEndpoint);
            return this;
        }
        public ServerSecurityAlertPolicyArgs build() {
            return new ServerSecurityAlertPolicyArgs(disabledAlerts, emailAccountAdmins, emailAddresses, resourceGroupName, retentionDays, securityAlertPolicyName, serverName, state, storageAccountAccessKey, storageEndpoint);
        }
    }
}
