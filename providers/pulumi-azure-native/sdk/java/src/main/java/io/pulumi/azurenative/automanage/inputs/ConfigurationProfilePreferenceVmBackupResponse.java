// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Automanage configuration profile VM Backup preferences.
 * 
 */
public final class ConfigurationProfilePreferenceVmBackupResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationProfilePreferenceVmBackupResponse Empty = new ConfigurationProfilePreferenceVmBackupResponse();

    /**
     * Instant RP retention policy range in days
     * 
     */
    @InputImport(name="instantRpRetentionRangeInDays")
        private final @Nullable Integer instantRpRetentionRangeInDays;

    public Optional<Integer> getInstantRpRetentionRangeInDays() {
        return this.instantRpRetentionRangeInDays == null ? Optional.empty() : Optional.ofNullable(this.instantRpRetentionRangeInDays);
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @InputImport(name="retentionPolicy")
        private final @Nullable String retentionPolicy;

    public Optional<String> getRetentionPolicy() {
        return this.retentionPolicy == null ? Optional.empty() : Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @InputImport(name="schedulePolicy")
        private final @Nullable String schedulePolicy;

    public Optional<String> getSchedulePolicy() {
        return this.schedulePolicy == null ? Optional.empty() : Optional.ofNullable(this.schedulePolicy);
    }

    /**
     * TimeZone optional input as string. For example: Pacific Standard Time
     * 
     */
    @InputImport(name="timeZone")
        private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public ConfigurationProfilePreferenceVmBackupResponse(
        @Nullable Integer instantRpRetentionRangeInDays,
        @Nullable String retentionPolicy,
        @Nullable String schedulePolicy,
        @Nullable String timeZone) {
        this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
        this.timeZone = timeZone;
    }

    private ConfigurationProfilePreferenceVmBackupResponse() {
        this.instantRpRetentionRangeInDays = null;
        this.retentionPolicy = null;
        this.schedulePolicy = null;
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfilePreferenceVmBackupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instantRpRetentionRangeInDays;
        private @Nullable String retentionPolicy;
        private @Nullable String schedulePolicy;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfilePreferenceVmBackupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instantRpRetentionRangeInDays = defaults.instantRpRetentionRangeInDays;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setInstantRpRetentionRangeInDays(@Nullable Integer instantRpRetentionRangeInDays) {
            this.instantRpRetentionRangeInDays = instantRpRetentionRangeInDays;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable String retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setSchedulePolicy(@Nullable String schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public ConfigurationProfilePreferenceVmBackupResponse build() {
            return new ConfigurationProfilePreferenceVmBackupResponse(instantRpRetentionRangeInDays, retentionPolicy, schedulePolicy, timeZone);
        }
    }
}
