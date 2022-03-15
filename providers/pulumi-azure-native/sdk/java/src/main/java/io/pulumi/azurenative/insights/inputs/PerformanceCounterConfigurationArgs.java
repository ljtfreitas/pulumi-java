// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerformanceCounterConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerformanceCounterConfigurationArgs Empty = new PerformanceCounterConfigurationArgs();

    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Output.empty() : this.instance;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="samplingPeriod", required=true)
      private final Output<String> samplingPeriod;

    public Output<String> getSamplingPeriod() {
        return this.samplingPeriod;
    }

    public PerformanceCounterConfigurationArgs(
        @Nullable Output<String> instance,
        Output<String> name,
        Output<String> samplingPeriod) {
        this.instance = instance;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.samplingPeriod = Objects.requireNonNull(samplingPeriod, "expected parameter 'samplingPeriod' to be non-null");
    }

    private PerformanceCounterConfigurationArgs() {
        this.instance = Output.empty();
        this.name = Output.empty();
        this.samplingPeriod = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceCounterConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instance;
        private Output<String> name;
        private Output<String> samplingPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(PerformanceCounterConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.samplingPeriod = defaults.samplingPeriod;
        }

        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder instance(@Nullable String instance) {
            this.instance = Output.ofNullable(instance);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder samplingPeriod(Output<String> samplingPeriod) {
            this.samplingPeriod = Objects.requireNonNull(samplingPeriod);
            return this;
        }

        public Builder samplingPeriod(String samplingPeriod) {
            this.samplingPeriod = Output.of(Objects.requireNonNull(samplingPeriod));
            return this;
        }
        public PerformanceCounterConfigurationArgs build() {
            return new PerformanceCounterConfigurationArgs(instance, name, samplingPeriod);
        }
    }
}
