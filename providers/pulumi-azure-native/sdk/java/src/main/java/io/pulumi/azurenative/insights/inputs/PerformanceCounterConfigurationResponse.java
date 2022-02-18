// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PerformanceCounterConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final PerformanceCounterConfigurationResponse Empty = new PerformanceCounterConfigurationResponse();

    @InputImport(name="instance")
    private final @Nullable String instance;

    public Optional<String> getInstance() {
        return this.instance == null ? Optional.empty() : Optional.ofNullable(this.instance);
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="samplingPeriod", required=true)
    private final String samplingPeriod;

    public String getSamplingPeriod() {
        return this.samplingPeriod;
    }

    public PerformanceCounterConfigurationResponse(
        @Nullable String instance,
        String name,
        String samplingPeriod) {
        this.instance = instance;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.samplingPeriod = Objects.requireNonNull(samplingPeriod, "expected parameter 'samplingPeriod' to be non-null");
    }

    private PerformanceCounterConfigurationResponse() {
        this.instance = null;
        this.name = null;
        this.samplingPeriod = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PerformanceCounterConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instance;
        private String name;
        private String samplingPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(PerformanceCounterConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.name = defaults.name;
    	      this.samplingPeriod = defaults.samplingPeriod;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSamplingPeriod(String samplingPeriod) {
            this.samplingPeriod = Objects.requireNonNull(samplingPeriod);
            return this;
        }

        public PerformanceCounterConfigurationResponse build() {
            return new PerformanceCounterConfigurationResponse(instance, name, samplingPeriod);
        }
    }
}
