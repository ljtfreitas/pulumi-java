// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for resources used by Airflow schedulers.
 * 
 */
public final class SchedulerResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulerResourceArgs Empty = new SchedulerResourceArgs();

    /**
     * Optional. The number of schedulers.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    /**
     * Optional. CPU request and limit for a single Airflow scheduler replica.
     * 
     */
    @InputImport(name="cpu")
      private final @Nullable Input<Double> cpu;

    public Input<Double> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    /**
     * Optional. Memory (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    @InputImport(name="memoryGb")
      private final @Nullable Input<Double> memoryGb;

    public Input<Double> getMemoryGb() {
        return this.memoryGb == null ? Input.empty() : this.memoryGb;
    }

    /**
     * Optional. Storage (GB) request and limit for a single Airflow scheduler replica.
     * 
     */
    @InputImport(name="storageGb")
      private final @Nullable Input<Double> storageGb;

    public Input<Double> getStorageGb() {
        return this.storageGb == null ? Input.empty() : this.storageGb;
    }

    public SchedulerResourceArgs(
        @Nullable Input<Integer> count,
        @Nullable Input<Double> cpu,
        @Nullable Input<Double> memoryGb,
        @Nullable Input<Double> storageGb) {
        this.count = count;
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    private SchedulerResourceArgs() {
        this.count = Input.empty();
        this.cpu = Input.empty();
        this.memoryGb = Input.empty();
        this.storageGb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> count;
        private @Nullable Input<Double> cpu;
        private @Nullable Input<Double> memoryGb;
        private @Nullable Input<Double> storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setCpu(@Nullable Input<Double> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setCpu(@Nullable Double cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder setMemoryGb(@Nullable Input<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }

        public Builder setMemoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Input.ofNullable(memoryGb);
            return this;
        }

        public Builder setStorageGb(@Nullable Input<Double> storageGb) {
            this.storageGb = storageGb;
            return this;
        }

        public Builder setStorageGb(@Nullable Double storageGb) {
            this.storageGb = Input.ofNullable(storageGb);
            return this;
        }
        public SchedulerResourceArgs build() {
            return new SchedulerResourceArgs(count, cpu, memoryGb, storageGb);
        }
    }
}
