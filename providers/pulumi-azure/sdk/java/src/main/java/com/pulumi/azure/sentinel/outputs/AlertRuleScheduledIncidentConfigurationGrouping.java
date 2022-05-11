// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.sentinel.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertRuleScheduledIncidentConfigurationGrouping {
    /**
     * @return Enable grouping incidents created from alerts triggered by this Sentinel Scheduled Alert Rule. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
     * 
     */
    private final @Nullable String entityMatchingMethod;
    private final @Nullable List<String> groupByAlertDetails;
    private final @Nullable List<String> groupByCustomDetails;
    /**
     * @return A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
     * 
     */
    private final @Nullable List<String> groupByEntities;
    /**
     * @return Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
     * 
     */
    private final @Nullable String lookbackDuration;
    /**
     * @return Whether to re-open closed matching incidents? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean reopenClosedIncidents;

    @CustomType.Constructor
    private AlertRuleScheduledIncidentConfigurationGrouping(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("entityMatchingMethod") @Nullable String entityMatchingMethod,
        @CustomType.Parameter("groupByAlertDetails") @Nullable List<String> groupByAlertDetails,
        @CustomType.Parameter("groupByCustomDetails") @Nullable List<String> groupByCustomDetails,
        @CustomType.Parameter("groupByEntities") @Nullable List<String> groupByEntities,
        @CustomType.Parameter("lookbackDuration") @Nullable String lookbackDuration,
        @CustomType.Parameter("reopenClosedIncidents") @Nullable Boolean reopenClosedIncidents) {
        this.enabled = enabled;
        this.entityMatchingMethod = entityMatchingMethod;
        this.groupByAlertDetails = groupByAlertDetails;
        this.groupByCustomDetails = groupByCustomDetails;
        this.groupByEntities = groupByEntities;
        this.lookbackDuration = lookbackDuration;
        this.reopenClosedIncidents = reopenClosedIncidents;
    }

    /**
     * @return Enable grouping incidents created from alerts triggered by this Sentinel Scheduled Alert Rule. Defaults to `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The method used to group incidents. Possible values are `AnyAlert`, `Selected` and `AllEntities`. Defaults to `AnyAlert`.
     * 
     */
    public Optional<String> entityMatchingMethod() {
        return Optional.ofNullable(this.entityMatchingMethod);
    }
    public List<String> groupByAlertDetails() {
        return this.groupByAlertDetails == null ? List.of() : this.groupByAlertDetails;
    }
    public List<String> groupByCustomDetails() {
        return this.groupByCustomDetails == null ? List.of() : this.groupByCustomDetails;
    }
    /**
     * @return A list of entity types to group by, only when the `entity_matching_method` is `Selected`. Possible values are `Account`, `AzureResource`, `CloudApplication`, `DNS`, `File`, `FileHash`, `Host`, `IP`, `Mailbox`, `MailCluster`, `MailMessage`, `Malware`, `Process`, `RegistryKey`, `RegistryValue`, `SecurityGroup`, `SubmissionMail`, `URL`.
     * 
     */
    public List<String> groupByEntities() {
        return this.groupByEntities == null ? List.of() : this.groupByEntities;
    }
    /**
     * @return Limit the group to alerts created within the lookback duration (in ISO 8601 duration format). Defaults to `PT5M`.
     * 
     */
    public Optional<String> lookbackDuration() {
        return Optional.ofNullable(this.lookbackDuration);
    }
    /**
     * @return Whether to re-open closed matching incidents? Defaults to `false`.
     * 
     */
    public Optional<Boolean> reopenClosedIncidents() {
        return Optional.ofNullable(this.reopenClosedIncidents);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertRuleScheduledIncidentConfigurationGrouping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String entityMatchingMethod;
        private @Nullable List<String> groupByAlertDetails;
        private @Nullable List<String> groupByCustomDetails;
        private @Nullable List<String> groupByEntities;
        private @Nullable String lookbackDuration;
        private @Nullable Boolean reopenClosedIncidents;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertRuleScheduledIncidentConfigurationGrouping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.entityMatchingMethod = defaults.entityMatchingMethod;
    	      this.groupByAlertDetails = defaults.groupByAlertDetails;
    	      this.groupByCustomDetails = defaults.groupByCustomDetails;
    	      this.groupByEntities = defaults.groupByEntities;
    	      this.lookbackDuration = defaults.lookbackDuration;
    	      this.reopenClosedIncidents = defaults.reopenClosedIncidents;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder entityMatchingMethod(@Nullable String entityMatchingMethod) {
            this.entityMatchingMethod = entityMatchingMethod;
            return this;
        }
        public Builder groupByAlertDetails(@Nullable List<String> groupByAlertDetails) {
            this.groupByAlertDetails = groupByAlertDetails;
            return this;
        }
        public Builder groupByAlertDetails(String... groupByAlertDetails) {
            return groupByAlertDetails(List.of(groupByAlertDetails));
        }
        public Builder groupByCustomDetails(@Nullable List<String> groupByCustomDetails) {
            this.groupByCustomDetails = groupByCustomDetails;
            return this;
        }
        public Builder groupByCustomDetails(String... groupByCustomDetails) {
            return groupByCustomDetails(List.of(groupByCustomDetails));
        }
        public Builder groupByEntities(@Nullable List<String> groupByEntities) {
            this.groupByEntities = groupByEntities;
            return this;
        }
        public Builder groupByEntities(String... groupByEntities) {
            return groupByEntities(List.of(groupByEntities));
        }
        public Builder lookbackDuration(@Nullable String lookbackDuration) {
            this.lookbackDuration = lookbackDuration;
            return this;
        }
        public Builder reopenClosedIncidents(@Nullable Boolean reopenClosedIncidents) {
            this.reopenClosedIncidents = reopenClosedIncidents;
            return this;
        }        public AlertRuleScheduledIncidentConfigurationGrouping build() {
            return new AlertRuleScheduledIncidentConfigurationGrouping(enabled, entityMatchingMethod, groupByAlertDetails, groupByCustomDetails, groupByEntities, lookbackDuration, reopenClosedIncidents);
        }
    }
}
