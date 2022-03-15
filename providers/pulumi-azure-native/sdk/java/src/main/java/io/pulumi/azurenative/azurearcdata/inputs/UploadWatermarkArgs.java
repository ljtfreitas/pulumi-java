// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties on upload watermark.  Mostly timestamp for each upload data type
 * 
 */
public final class UploadWatermarkArgs extends io.pulumi.resources.ResourceArgs {

    public static final UploadWatermarkArgs Empty = new UploadWatermarkArgs();

    /**
     * Last uploaded date for logs from kubernetes cluster. Defaults to current date time
     * 
     */
    @Import(name="logs")
      private final @Nullable Output<String> logs;

    public Output<String> getLogs() {
        return this.logs == null ? Output.empty() : this.logs;
    }

    /**
     * Last uploaded date for metrics from kubernetes cluster. Defaults to current date time
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<String> metrics;

    public Output<String> getMetrics() {
        return this.metrics == null ? Output.empty() : this.metrics;
    }

    /**
     * Last uploaded date for usages from kubernetes cluster. Defaults to current date time
     * 
     */
    @Import(name="usages")
      private final @Nullable Output<String> usages;

    public Output<String> getUsages() {
        return this.usages == null ? Output.empty() : this.usages;
    }

    public UploadWatermarkArgs(
        @Nullable Output<String> logs,
        @Nullable Output<String> metrics,
        @Nullable Output<String> usages) {
        this.logs = logs;
        this.metrics = metrics;
        this.usages = usages;
    }

    private UploadWatermarkArgs() {
        this.logs = Output.empty();
        this.metrics = Output.empty();
        this.usages = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UploadWatermarkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> logs;
        private @Nullable Output<String> metrics;
        private @Nullable Output<String> usages;

        public Builder() {
    	      // Empty
        }

        public Builder(UploadWatermarkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logs = defaults.logs;
    	      this.metrics = defaults.metrics;
    	      this.usages = defaults.usages;
        }

        public Builder logs(@Nullable Output<String> logs) {
            this.logs = logs;
            return this;
        }

        public Builder logs(@Nullable String logs) {
            this.logs = Output.ofNullable(logs);
            return this;
        }

        public Builder metrics(@Nullable Output<String> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder metrics(@Nullable String metrics) {
            this.metrics = Output.ofNullable(metrics);
            return this;
        }

        public Builder usages(@Nullable Output<String> usages) {
            this.usages = usages;
            return this;
        }

        public Builder usages(@Nullable String usages) {
            this.usages = Output.ofNullable(usages);
            return this;
        }
        public UploadWatermarkArgs build() {
            return new UploadWatermarkArgs(logs, metrics, usages);
        }
    }
}
