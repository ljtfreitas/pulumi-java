// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class SchedulerResourceResponse {
    /**
     * @return Optional. The number of schedulers.
     * 
     */
    private final Integer count;
    /**
     * @return Optional. CPU request and limit for a single Airflow scheduler replica.
     * 
     */
    private final Double cpu;
    /**
     * @return Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    private final Double memoryGb;
    /**
     * @return Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    private final Double storageGb;

    @CustomType.Constructor
    private SchedulerResourceResponse(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("cpu") Double cpu,
        @CustomType.Parameter("memoryGb") Double memoryGb,
        @CustomType.Parameter("storageGb") Double storageGb) {
        this.count = count;
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    /**
     * @return Optional. The number of schedulers.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return Optional. CPU request and limit for a single Airflow scheduler replica.
     * 
     */
    public Double cpu() {
        return this.cpu;
    }
    /**
     * @return Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    public Double memoryGb() {
        return this.memoryGb;
    }
    /**
     * @return Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    public Double storageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulerResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulerResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }
        public Builder memoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }
        public Builder storageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }        public SchedulerResourceResponse build() {
            return new SchedulerResourceResponse(count, cpu, memoryGb, storageGb);
        }
    }
}
