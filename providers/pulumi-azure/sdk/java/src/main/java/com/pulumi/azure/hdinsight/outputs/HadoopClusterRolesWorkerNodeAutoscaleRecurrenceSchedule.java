// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class HadoopClusterRolesWorkerNodeAutoscaleRecurrenceSchedule {
    /**
     * @return The days of the week to perform autoscale.
     * 
     */
    private final List<String> days;
    /**
     * @return The number of worker nodes to autoscale at the specified time.
     * 
     */
    private final Integer targetInstanceCount;
    /**
     * @return The time of day to perform the autoscale in 24hour format.
     * 
     */
    private final String time;

    @CustomType.Constructor
    private HadoopClusterRolesWorkerNodeAutoscaleRecurrenceSchedule(
        @CustomType.Parameter("days") List<String> days,
        @CustomType.Parameter("targetInstanceCount") Integer targetInstanceCount,
        @CustomType.Parameter("time") String time) {
        this.days = days;
        this.targetInstanceCount = targetInstanceCount;
        this.time = time;
    }

    /**
     * @return The days of the week to perform autoscale.
     * 
     */
    public List<String> days() {
        return this.days;
    }
    /**
     * @return The number of worker nodes to autoscale at the specified time.
     * 
     */
    public Integer targetInstanceCount() {
        return this.targetInstanceCount;
    }
    /**
     * @return The time of day to perform the autoscale in 24hour format.
     * 
     */
    public String time() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HadoopClusterRolesWorkerNodeAutoscaleRecurrenceSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> days;
        private Integer targetInstanceCount;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(HadoopClusterRolesWorkerNodeAutoscaleRecurrenceSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.targetInstanceCount = defaults.targetInstanceCount;
    	      this.time = defaults.time;
        }

        public Builder days(List<String> days) {
            this.days = Objects.requireNonNull(days);
            return this;
        }
        public Builder days(String... days) {
            return days(List.of(days));
        }
        public Builder targetInstanceCount(Integer targetInstanceCount) {
            this.targetInstanceCount = Objects.requireNonNull(targetInstanceCount);
            return this;
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public HadoopClusterRolesWorkerNodeAutoscaleRecurrenceSchedule build() {
            return new HadoopClusterRolesWorkerNodeAutoscaleRecurrenceSchedule(days, targetInstanceCount, time);
        }
    }
}
