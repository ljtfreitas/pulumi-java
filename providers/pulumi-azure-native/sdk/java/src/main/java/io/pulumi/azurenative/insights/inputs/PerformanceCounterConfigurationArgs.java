// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PerformanceCounterConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PerformanceCounterConfigurationArgs Empty = new PerformanceCounterConfigurationArgs();

    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="samplingPeriod", required=true)
    private final Input<String> samplingPeriod;

    public Input<String> getSamplingPeriod() {
        return this.samplingPeriod;
    }

    public PerformanceCounterConfigurationArgs(
        @Nullable Input<String> instance,
        Input<String> name,
        Input<String> samplingPeriod) {
        this.instance = instance;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.samplingPeriod = Objects.requireNonNull(samplingPeriod, "expected parameter 'samplingPeriod' to be non-null");
    }

    private PerformanceCounterConfigurationArgs() {
        this.instance = Input.empty();
        this.name = Input.empty();
        this.samplingPeriod = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceCounterConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instance;
        private Input<String> name;
        private Input<String> samplingPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(PerformanceCounterConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.samplingPeriod = defaults.samplingPeriod;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSamplingPeriod(Input<String> samplingPeriod) {
            this.samplingPeriod = Objects.requireNonNull(samplingPeriod);
            return this;
        }

        public Builder setSamplingPeriod(String samplingPeriod) {
            this.samplingPeriod = Input.of(Objects.requireNonNull(samplingPeriod));
            return this;
        }

        public PerformanceCounterConfigurationArgs build() {
            return new PerformanceCounterConfigurationArgs(instance, name, samplingPeriod);
        }
    }
}
