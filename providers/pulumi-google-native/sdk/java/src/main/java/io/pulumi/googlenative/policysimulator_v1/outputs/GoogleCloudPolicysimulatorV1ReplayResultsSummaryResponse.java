// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.policysimulator_v1.outputs.GoogleTypeDateResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse {
    /**
     * The number of replayed log entries with a difference between baseline and simulated policies.
     * 
     */
    private final Integer differenceCount;
    /**
     * The number of log entries that could not be replayed.
     * 
     */
    private final Integer errorCount;
    /**
     * The total number of log entries replayed.
     * 
     */
    private final Integer logCount;
    /**
     * The date of the newest log entry replayed.
     * 
     */
    private final GoogleTypeDateResponse newestDate;
    /**
     * The date of the oldest log entry replayed.
     * 
     */
    private final GoogleTypeDateResponse oldestDate;
    /**
     * The number of replayed log entries with no difference between baseline and simulated policies.
     * 
     */
    private final Integer unchangedCount;

    @OutputCustomType.Constructor({"differenceCount","errorCount","logCount","newestDate","oldestDate","unchangedCount"})
    private GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse(
        Integer differenceCount,
        Integer errorCount,
        Integer logCount,
        GoogleTypeDateResponse newestDate,
        GoogleTypeDateResponse oldestDate,
        Integer unchangedCount) {
        this.differenceCount = Objects.requireNonNull(differenceCount);
        this.errorCount = Objects.requireNonNull(errorCount);
        this.logCount = Objects.requireNonNull(logCount);
        this.newestDate = Objects.requireNonNull(newestDate);
        this.oldestDate = Objects.requireNonNull(oldestDate);
        this.unchangedCount = Objects.requireNonNull(unchangedCount);
    }

    /**
     * The number of replayed log entries with a difference between baseline and simulated policies.
     * 
     */
    public Integer getDifferenceCount() {
        return this.differenceCount;
    }
    /**
     * The number of log entries that could not be replayed.
     * 
     */
    public Integer getErrorCount() {
        return this.errorCount;
    }
    /**
     * The total number of log entries replayed.
     * 
     */
    public Integer getLogCount() {
        return this.logCount;
    }
    /**
     * The date of the newest log entry replayed.
     * 
     */
    public GoogleTypeDateResponse getNewestDate() {
        return this.newestDate;
    }
    /**
     * The date of the oldest log entry replayed.
     * 
     */
    public GoogleTypeDateResponse getOldestDate() {
        return this.oldestDate;
    }
    /**
     * The number of replayed log entries with no difference between baseline and simulated policies.
     * 
     */
    public Integer getUnchangedCount() {
        return this.unchangedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer differenceCount;
        private Integer errorCount;
        private Integer logCount;
        private GoogleTypeDateResponse newestDate;
        private GoogleTypeDateResponse oldestDate;
        private Integer unchangedCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.differenceCount = defaults.differenceCount;
    	      this.errorCount = defaults.errorCount;
    	      this.logCount = defaults.logCount;
    	      this.newestDate = defaults.newestDate;
    	      this.oldestDate = defaults.oldestDate;
    	      this.unchangedCount = defaults.unchangedCount;
        }

        public Builder setDifferenceCount(Integer differenceCount) {
            this.differenceCount = Objects.requireNonNull(differenceCount);
            return this;
        }

        public Builder setErrorCount(Integer errorCount) {
            this.errorCount = Objects.requireNonNull(errorCount);
            return this;
        }

        public Builder setLogCount(Integer logCount) {
            this.logCount = Objects.requireNonNull(logCount);
            return this;
        }

        public Builder setNewestDate(GoogleTypeDateResponse newestDate) {
            this.newestDate = Objects.requireNonNull(newestDate);
            return this;
        }

        public Builder setOldestDate(GoogleTypeDateResponse oldestDate) {
            this.oldestDate = Objects.requireNonNull(oldestDate);
            return this;
        }

        public Builder setUnchangedCount(Integer unchangedCount) {
            this.unchangedCount = Objects.requireNonNull(unchangedCount);
            return this;
        }
        public GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse build() {
            return new GoogleCloudPolicysimulatorV1ReplayResultsSummaryResponse(differenceCount, errorCount, logCount, newestDate, oldestDate, unchangedCount);
        }
    }
}
