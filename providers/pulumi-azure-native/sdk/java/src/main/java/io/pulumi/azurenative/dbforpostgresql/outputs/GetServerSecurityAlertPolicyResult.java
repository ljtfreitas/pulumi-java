// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerSecurityAlertPolicyResult {
    /**
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly
     * 
     */
    private final @Nullable List<String> disabledAlerts;
    /**
     * Specifies that the alert is sent to the account administrators.
     * 
     */
    private final @Nullable Boolean emailAccountAdmins;
    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    private final @Nullable List<String> emailAddresses;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    private final @Nullable Integer retentionDays;
    /**
     * Specifies the state of the policy, whether it is enabled or disabled.
     * 
     */
    private final String state;
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    private final @Nullable String storageAccountAccessKey;
    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    private final @Nullable String storageEndpoint;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"disabledAlerts","emailAccountAdmins","emailAddresses","id","name","retentionDays","state","storageAccountAccessKey","storageEndpoint","type"})
    private GetServerSecurityAlertPolicyResult(
        @Nullable List<String> disabledAlerts,
        @Nullable Boolean emailAccountAdmins,
        @Nullable List<String> emailAddresses,
        String id,
        String name,
        @Nullable Integer retentionDays,
        String state,
        @Nullable String storageAccountAccessKey,
        @Nullable String storageEndpoint,
        String type) {
        this.disabledAlerts = disabledAlerts;
        this.emailAccountAdmins = emailAccountAdmins;
        this.emailAddresses = emailAddresses;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.retentionDays = retentionDays;
        this.state = Objects.requireNonNull(state);
        this.storageAccountAccessKey = storageAccountAccessKey;
        this.storageEndpoint = storageEndpoint;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies an array of alerts that are disabled. Allowed values are: Sql_Injection, Sql_Injection_Vulnerability, Access_Anomaly
     * 
     */
    public List<String> getDisabledAlerts() {
        return this.disabledAlerts == null ? List.of() : this.disabledAlerts;
    }
    /**
     * Specifies that the alert is sent to the account administrators.
     * 
     */
    public Optional<Boolean> getEmailAccountAdmins() {
        return Optional.ofNullable(this.emailAccountAdmins);
    }
    /**
     * Specifies an array of e-mail addresses to which the alert is sent.
     * 
     */
    public List<String> getEmailAddresses() {
        return this.emailAddresses == null ? List.of() : this.emailAddresses;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Specifies the number of days to keep in the Threat Detection audit logs.
     * 
     */
    public Optional<Integer> getRetentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }
    /**
     * Specifies the state of the policy, whether it is enabled or disabled.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * Specifies the identifier key of the Threat Detection audit storage account.
     * 
     */
    public Optional<String> getStorageAccountAccessKey() {
        return Optional.ofNullable(this.storageAccountAccessKey);
    }
    /**
     * Specifies the blob storage endpoint (e.g. https://MyAccount.blob.core.windows.net). This blob storage will hold all Threat Detection audit logs.
     * 
     */
    public Optional<String> getStorageEndpoint() {
        return Optional.ofNullable(this.storageEndpoint);
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

    public static Builder builder(GetServerSecurityAlertPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> disabledAlerts;
        private @Nullable Boolean emailAccountAdmins;
        private @Nullable List<String> emailAddresses;
        private String id;
        private String name;
        private @Nullable Integer retentionDays;
        private String state;
        private @Nullable String storageAccountAccessKey;
        private @Nullable String storageEndpoint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerSecurityAlertPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabledAlerts = defaults.disabledAlerts;
    	      this.emailAccountAdmins = defaults.emailAccountAdmins;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.retentionDays = defaults.retentionDays;
    	      this.state = defaults.state;
    	      this.storageAccountAccessKey = defaults.storageAccountAccessKey;
    	      this.storageEndpoint = defaults.storageEndpoint;
    	      this.type = defaults.type;
        }

        public Builder setDisabledAlerts(@Nullable List<String> disabledAlerts) {
            this.disabledAlerts = disabledAlerts;
            return this;
        }

        public Builder setEmailAccountAdmins(@Nullable Boolean emailAccountAdmins) {
            this.emailAccountAdmins = emailAccountAdmins;
            return this;
        }

        public Builder setEmailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStorageAccountAccessKey(@Nullable String storageAccountAccessKey) {
            this.storageAccountAccessKey = storageAccountAccessKey;
            return this;
        }

        public Builder setStorageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServerSecurityAlertPolicyResult build() {
            return new GetServerSecurityAlertPolicyResult(disabledAlerts, emailAccountAdmins, emailAddresses, id, name, retentionDays, state, storageAccountAccessKey, storageEndpoint, type);
        }
    }
}
