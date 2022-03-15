// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics;

import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorConfigArgs;
import io.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorMetricSetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorArgs Empty = new AnomalyDetectorArgs();

    /**
     * Configuration options for the AnomalyDetector
     * 
     */
    @Import(name="anomalyDetectorConfig", required=true)
      private final Output<AnomalyDetectorConfigArgs> anomalyDetectorConfig;

    public Output<AnomalyDetectorConfigArgs> getAnomalyDetectorConfig() {
        return this.anomalyDetectorConfig;
    }

    /**
     * A description for the AnomalyDetector.
     * 
     */
    @Import(name="anomalyDetectorDescription")
      private final @Nullable Output<String> anomalyDetectorDescription;

    public Output<String> getAnomalyDetectorDescription() {
        return this.anomalyDetectorDescription == null ? Output.empty() : this.anomalyDetectorDescription;
    }

    /**
     * Name for the Amazon Lookout for Metrics Anomaly Detector
     * 
     */
    @Import(name="anomalyDetectorName")
      private final @Nullable Output<String> anomalyDetectorName;

    public Output<String> getAnomalyDetectorName() {
        return this.anomalyDetectorName == null ? Output.empty() : this.anomalyDetectorName;
    }

    /**
     * KMS key used to encrypt the AnomalyDetector data
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    /**
     * List of metric sets for anomaly detection
     * 
     */
    @Import(name="metricSetList", required=true)
      private final Output<List<AnomalyDetectorMetricSetArgs>> metricSetList;

    public Output<List<AnomalyDetectorMetricSetArgs>> getMetricSetList() {
        return this.metricSetList;
    }

    public AnomalyDetectorArgs(
        Output<AnomalyDetectorConfigArgs> anomalyDetectorConfig,
        @Nullable Output<String> anomalyDetectorDescription,
        @Nullable Output<String> anomalyDetectorName,
        @Nullable Output<String> kmsKeyArn,
        Output<List<AnomalyDetectorMetricSetArgs>> metricSetList) {
        this.anomalyDetectorConfig = Objects.requireNonNull(anomalyDetectorConfig, "expected parameter 'anomalyDetectorConfig' to be non-null");
        this.anomalyDetectorDescription = anomalyDetectorDescription;
        this.anomalyDetectorName = anomalyDetectorName;
        this.kmsKeyArn = kmsKeyArn;
        this.metricSetList = Objects.requireNonNull(metricSetList, "expected parameter 'metricSetList' to be non-null");
    }

    private AnomalyDetectorArgs() {
        this.anomalyDetectorConfig = Output.empty();
        this.anomalyDetectorDescription = Output.empty();
        this.anomalyDetectorName = Output.empty();
        this.kmsKeyArn = Output.empty();
        this.metricSetList = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AnomalyDetectorConfigArgs> anomalyDetectorConfig;
        private @Nullable Output<String> anomalyDetectorDescription;
        private @Nullable Output<String> anomalyDetectorName;
        private @Nullable Output<String> kmsKeyArn;
        private Output<List<AnomalyDetectorMetricSetArgs>> metricSetList;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anomalyDetectorConfig = defaults.anomalyDetectorConfig;
    	      this.anomalyDetectorDescription = defaults.anomalyDetectorDescription;
    	      this.anomalyDetectorName = defaults.anomalyDetectorName;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.metricSetList = defaults.metricSetList;
        }

        public Builder anomalyDetectorConfig(Output<AnomalyDetectorConfigArgs> anomalyDetectorConfig) {
            this.anomalyDetectorConfig = Objects.requireNonNull(anomalyDetectorConfig);
            return this;
        }

        public Builder anomalyDetectorConfig(AnomalyDetectorConfigArgs anomalyDetectorConfig) {
            this.anomalyDetectorConfig = Output.of(Objects.requireNonNull(anomalyDetectorConfig));
            return this;
        }

        public Builder anomalyDetectorDescription(@Nullable Output<String> anomalyDetectorDescription) {
            this.anomalyDetectorDescription = anomalyDetectorDescription;
            return this;
        }

        public Builder anomalyDetectorDescription(@Nullable String anomalyDetectorDescription) {
            this.anomalyDetectorDescription = Output.ofNullable(anomalyDetectorDescription);
            return this;
        }

        public Builder anomalyDetectorName(@Nullable Output<String> anomalyDetectorName) {
            this.anomalyDetectorName = anomalyDetectorName;
            return this;
        }

        public Builder anomalyDetectorName(@Nullable String anomalyDetectorName) {
            this.anomalyDetectorName = Output.ofNullable(anomalyDetectorName);
            return this;
        }

        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder metricSetList(Output<List<AnomalyDetectorMetricSetArgs>> metricSetList) {
            this.metricSetList = Objects.requireNonNull(metricSetList);
            return this;
        }

        public Builder metricSetList(List<AnomalyDetectorMetricSetArgs> metricSetList) {
            this.metricSetList = Output.of(Objects.requireNonNull(metricSetList));
            return this;
        }
        public AnomalyDetectorArgs build() {
            return new AnomalyDetectorArgs(anomalyDetectorConfig, anomalyDetectorDescription, anomalyDetectorName, kmsKeyArn, metricSetList);
        }
    }
}
