// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.azurenative.elastic.outputs.FilteringTagResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogRulesResponse {
    /**
     * List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    private final @Nullable List<FilteringTagResponse> filteringTags;
    /**
     * Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     */
    private final @Nullable Boolean sendAadLogs;
    /**
     * Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     * 
     */
    private final @Nullable Boolean sendActivityLogs;
    /**
     * Flag specifying if subscription logs should be sent for the Monitor resource.
     * 
     */
    private final @Nullable Boolean sendSubscriptionLogs;

    @OutputCustomType.Constructor({"filteringTags","sendAadLogs","sendActivityLogs","sendSubscriptionLogs"})
    private LogRulesResponse(
        @Nullable List<FilteringTagResponse> filteringTags,
        @Nullable Boolean sendAadLogs,
        @Nullable Boolean sendActivityLogs,
        @Nullable Boolean sendSubscriptionLogs) {
        this.filteringTags = filteringTags;
        this.sendAadLogs = sendAadLogs;
        this.sendActivityLogs = sendActivityLogs;
        this.sendSubscriptionLogs = sendSubscriptionLogs;
    }

    /**
     * List of filtering tags to be used for capturing logs. This only takes effect if SendActivityLogs flag is enabled. If empty, all resources will be captured. If only Exclude action is specified, the rules will apply to the list of all available resources. If Include actions are specified, the rules will only include resources with the associated tags.
     * 
     */
    public List<FilteringTagResponse> getFilteringTags() {
        return this.filteringTags == null ? List.of() : this.filteringTags;
    }
    /**
     * Flag specifying if AAD logs should be sent for the Monitor resource.
     * 
     */
    public Optional<Boolean> getSendAadLogs() {
        return Optional.ofNullable(this.sendAadLogs);
    }
    /**
     * Flag specifying if activity logs from Azure resources should be sent for the Monitor resource.
     * 
     */
    public Optional<Boolean> getSendActivityLogs() {
        return Optional.ofNullable(this.sendActivityLogs);
    }
    /**
     * Flag specifying if subscription logs should be sent for the Monitor resource.
     * 
     */
    public Optional<Boolean> getSendSubscriptionLogs() {
        return Optional.ofNullable(this.sendSubscriptionLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FilteringTagResponse> filteringTags;
        private @Nullable Boolean sendAadLogs;
        private @Nullable Boolean sendActivityLogs;
        private @Nullable Boolean sendSubscriptionLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(LogRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filteringTags = defaults.filteringTags;
    	      this.sendAadLogs = defaults.sendAadLogs;
    	      this.sendActivityLogs = defaults.sendActivityLogs;
    	      this.sendSubscriptionLogs = defaults.sendSubscriptionLogs;
        }

        public Builder setFilteringTags(@Nullable List<FilteringTagResponse> filteringTags) {
            this.filteringTags = filteringTags;
            return this;
        }

        public Builder setSendAadLogs(@Nullable Boolean sendAadLogs) {
            this.sendAadLogs = sendAadLogs;
            return this;
        }

        public Builder setSendActivityLogs(@Nullable Boolean sendActivityLogs) {
            this.sendActivityLogs = sendActivityLogs;
            return this;
        }

        public Builder setSendSubscriptionLogs(@Nullable Boolean sendSubscriptionLogs) {
            this.sendSubscriptionLogs = sendSubscriptionLogs;
            return this;
        }
        public LogRulesResponse build() {
            return new LogRulesResponse(filteringTags, sendAadLogs, sendActivityLogs, sendSubscriptionLogs);
        }
    }
}
