// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceUpdateConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceUpdateConfigGetArgs Empty = new ServiceUpdateConfigGetArgs();

    @Import(name="delay")
      private final @Nullable Output<String> delay;

    public Output<String> getDelay() {
        return this.delay == null ? Output.empty() : this.delay;
    }

    @Import(name="failureAction")
      private final @Nullable Output<String> failureAction;

    public Output<String> getFailureAction() {
        return this.failureAction == null ? Output.empty() : this.failureAction;
    }

    @Import(name="maxFailureRatio")
      private final @Nullable Output<String> maxFailureRatio;

    public Output<String> getMaxFailureRatio() {
        return this.maxFailureRatio == null ? Output.empty() : this.maxFailureRatio;
    }

    @Import(name="monitor")
      private final @Nullable Output<String> monitor;

    public Output<String> getMonitor() {
        return this.monitor == null ? Output.empty() : this.monitor;
    }

    @Import(name="order")
      private final @Nullable Output<String> order;

    public Output<String> getOrder() {
        return this.order == null ? Output.empty() : this.order;
    }

    @Import(name="parallelism")
      private final @Nullable Output<Integer> parallelism;

    public Output<Integer> getParallelism() {
        return this.parallelism == null ? Output.empty() : this.parallelism;
    }

    public ServiceUpdateConfigGetArgs(
        @Nullable Output<String> delay,
        @Nullable Output<String> failureAction,
        @Nullable Output<String> maxFailureRatio,
        @Nullable Output<String> monitor,
        @Nullable Output<String> order,
        @Nullable Output<Integer> parallelism) {
        this.delay = delay;
        this.failureAction = failureAction;
        this.maxFailureRatio = maxFailureRatio;
        this.monitor = monitor;
        this.order = order;
        this.parallelism = parallelism;
    }

    private ServiceUpdateConfigGetArgs() {
        this.delay = Output.empty();
        this.failureAction = Output.empty();
        this.maxFailureRatio = Output.empty();
        this.monitor = Output.empty();
        this.order = Output.empty();
        this.parallelism = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceUpdateConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> delay;
        private @Nullable Output<String> failureAction;
        private @Nullable Output<String> maxFailureRatio;
        private @Nullable Output<String> monitor;
        private @Nullable Output<String> order;
        private @Nullable Output<Integer> parallelism;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceUpdateConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delay = defaults.delay;
    	      this.failureAction = defaults.failureAction;
    	      this.maxFailureRatio = defaults.maxFailureRatio;
    	      this.monitor = defaults.monitor;
    	      this.order = defaults.order;
    	      this.parallelism = defaults.parallelism;
        }

        public Builder delay(@Nullable Output<String> delay) {
            this.delay = delay;
            return this;
        }

        public Builder delay(@Nullable String delay) {
            this.delay = Output.ofNullable(delay);
            return this;
        }

        public Builder failureAction(@Nullable Output<String> failureAction) {
            this.failureAction = failureAction;
            return this;
        }

        public Builder failureAction(@Nullable String failureAction) {
            this.failureAction = Output.ofNullable(failureAction);
            return this;
        }

        public Builder maxFailureRatio(@Nullable Output<String> maxFailureRatio) {
            this.maxFailureRatio = maxFailureRatio;
            return this;
        }

        public Builder maxFailureRatio(@Nullable String maxFailureRatio) {
            this.maxFailureRatio = Output.ofNullable(maxFailureRatio);
            return this;
        }

        public Builder monitor(@Nullable Output<String> monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder monitor(@Nullable String monitor) {
            this.monitor = Output.ofNullable(monitor);
            return this;
        }

        public Builder order(@Nullable Output<String> order) {
            this.order = order;
            return this;
        }

        public Builder order(@Nullable String order) {
            this.order = Output.ofNullable(order);
            return this;
        }

        public Builder parallelism(@Nullable Output<Integer> parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        public Builder parallelism(@Nullable Integer parallelism) {
            this.parallelism = Output.ofNullable(parallelism);
            return this;
        }
        public ServiceUpdateConfigGetArgs build() {
            return new ServiceUpdateConfigGetArgs(delay, failureAction, maxFailureRatio, monitor, order, parallelism);
        }
    }
}
