// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.inputs.CommitmentQuotaResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cognitive Services account commitment period.
 * 
 */
public final class CommitmentPeriodResponse extends io.pulumi.resources.InvokeArgs {

    public static final CommitmentPeriodResponse Empty = new CommitmentPeriodResponse();

    /**
     * Commitment period commitment count.
     * 
     */
    @Import(name="count")
      private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * Commitment period end date.
     * 
     */
    @Import(name="endDate", required=true)
      private final String endDate;

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * Cognitive Services account commitment quota.
     * 
     */
    @Import(name="quota", required=true)
      private final CommitmentQuotaResponse quota;

    public CommitmentQuotaResponse getQuota() {
        return this.quota;
    }

    /**
     * Commitment period start date.
     * 
     */
    @Import(name="startDate", required=true)
      private final String startDate;

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * Commitment period commitment tier.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public CommitmentPeriodResponse(
        @Nullable Integer count,
        String endDate,
        CommitmentQuotaResponse quota,
        String startDate,
        @Nullable String tier) {
        this.count = count;
        this.endDate = Objects.requireNonNull(endDate, "expected parameter 'endDate' to be non-null");
        this.quota = Objects.requireNonNull(quota, "expected parameter 'quota' to be non-null");
        this.startDate = Objects.requireNonNull(startDate, "expected parameter 'startDate' to be non-null");
        this.tier = tier;
    }

    private CommitmentPeriodResponse() {
        this.count = null;
        this.endDate = null;
        this.quota = null;
        this.startDate = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private String endDate;
        private CommitmentQuotaResponse quota;
        private String startDate;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPeriodResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.endDate = defaults.endDate;
    	      this.quota = defaults.quota;
    	      this.startDate = defaults.startDate;
    	      this.tier = defaults.tier;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder endDate(String endDate) {
            this.endDate = Objects.requireNonNull(endDate);
            return this;
        }

        public Builder quota(CommitmentQuotaResponse quota) {
            this.quota = Objects.requireNonNull(quota);
            return this;
        }

        public Builder startDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public CommitmentPeriodResponse build() {
            return new CommitmentPeriodResponse(count, endDate, quota, startDate, tier);
        }
    }
}
