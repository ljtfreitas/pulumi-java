// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UploadWatermarkResponse {
    /**
     * Last uploaded date for logs from kubernetes cluster. Defaults to current date time
     * 
     */
    private final @Nullable String logs;
    /**
     * Last uploaded date for metrics from kubernetes cluster. Defaults to current date time
     * 
     */
    private final @Nullable String metrics;
    /**
     * Last uploaded date for usages from kubernetes cluster. Defaults to current date time
     * 
     */
    private final @Nullable String usages;

    @OutputCustomType.Constructor({"logs","metrics","usages"})
    private UploadWatermarkResponse(
        @Nullable String logs,
        @Nullable String metrics,
        @Nullable String usages) {
        this.logs = logs;
        this.metrics = metrics;
        this.usages = usages;
    }

    /**
     * Last uploaded date for logs from kubernetes cluster. Defaults to current date time
     * 
     */
    public Optional<String> getLogs() {
        return Optional.ofNullable(this.logs);
    }
    /**
     * Last uploaded date for metrics from kubernetes cluster. Defaults to current date time
     * 
     */
    public Optional<String> getMetrics() {
        return Optional.ofNullable(this.metrics);
    }
    /**
     * Last uploaded date for usages from kubernetes cluster. Defaults to current date time
     * 
     */
    public Optional<String> getUsages() {
        return Optional.ofNullable(this.usages);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UploadWatermarkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logs;
        private @Nullable String metrics;
        private @Nullable String usages;

        public Builder() {
    	      // Empty
        }

        public Builder(UploadWatermarkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
    	      this.metrics = defaults.metrics;
    	      this.usages = defaults.usages;
        }

        public Builder setLogs(@Nullable String logs) {
            this.logs = logs;
            return this;
        }

        public Builder setMetrics(@Nullable String metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setUsages(@Nullable String usages) {
            this.usages = usages;
            return this;
        }

        public UploadWatermarkResponse build() {
            return new UploadWatermarkResponse(logs, metrics, usages);
        }
    }
}
