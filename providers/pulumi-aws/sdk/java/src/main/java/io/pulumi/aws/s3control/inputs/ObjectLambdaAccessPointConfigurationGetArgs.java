// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectLambdaAccessPointConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectLambdaAccessPointConfigurationGetArgs Empty = new ObjectLambdaAccessPointConfigurationGetArgs();

    /**
     * Allowed features. Valid values: `GetObject-Range`, `GetObject-PartNumber`.
     * 
     */
    @Import(name="allowedFeatures")
      private final @Nullable Output<List<String>> allowedFeatures;

    public Output<List<String>> getAllowedFeatures() {
        return this.allowedFeatures == null ? Output.empty() : this.allowedFeatures;
    }

    /**
     * Whether or not the CloudWatch metrics configuration is enabled.
     * 
     */
    @Import(name="cloudWatchMetricsEnabled")
      private final @Nullable Output<Boolean> cloudWatchMetricsEnabled;

    public Output<Boolean> getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled == null ? Output.empty() : this.cloudWatchMetricsEnabled;
    }

    /**
     * Standard access point associated with the Object Lambda Access Point.
     * 
     */
    @Import(name="supportingAccessPoint", required=true)
      private final Output<String> supportingAccessPoint;

    public Output<String> getSupportingAccessPoint() {
        return this.supportingAccessPoint;
    }

    /**
     * List of transformation configurations for the Object Lambda Access Point. See Transformation Configuration below for more details.
     * 
     */
    @Import(name="transformationConfigurations", required=true)
      private final Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations;

    public Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> getTransformationConfigurations() {
        return this.transformationConfigurations;
    }

    public ObjectLambdaAccessPointConfigurationGetArgs(
        @Nullable Output<List<String>> allowedFeatures,
        @Nullable Output<Boolean> cloudWatchMetricsEnabled,
        Output<String> supportingAccessPoint,
        Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations) {
        this.allowedFeatures = allowedFeatures;
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint, "expected parameter 'supportingAccessPoint' to be non-null");
        this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations, "expected parameter 'transformationConfigurations' to be non-null");
    }

    private ObjectLambdaAccessPointConfigurationGetArgs() {
        this.allowedFeatures = Output.empty();
        this.cloudWatchMetricsEnabled = Output.empty();
        this.supportingAccessPoint = Output.empty();
        this.transformationConfigurations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedFeatures;
        private @Nullable Output<Boolean> cloudWatchMetricsEnabled;
        private Output<String> supportingAccessPoint;
        private Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectLambdaAccessPointConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedFeatures = defaults.allowedFeatures;
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.supportingAccessPoint = defaults.supportingAccessPoint;
    	      this.transformationConfigurations = defaults.transformationConfigurations;
        }

        public Builder allowedFeatures(@Nullable Output<List<String>> allowedFeatures) {
            this.allowedFeatures = allowedFeatures;
            return this;
        }

        public Builder allowedFeatures(@Nullable List<String> allowedFeatures) {
            this.allowedFeatures = Output.ofNullable(allowedFeatures);
            return this;
        }

        public Builder cloudWatchMetricsEnabled(@Nullable Output<Boolean> cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            return this;
        }

        public Builder cloudWatchMetricsEnabled(@Nullable Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = Output.ofNullable(cloudWatchMetricsEnabled);
            return this;
        }

        public Builder supportingAccessPoint(Output<String> supportingAccessPoint) {
            this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint);
            return this;
        }

        public Builder supportingAccessPoint(String supportingAccessPoint) {
            this.supportingAccessPoint = Output.of(Objects.requireNonNull(supportingAccessPoint));
            return this;
        }

        public Builder transformationConfigurations(Output<List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs>> transformationConfigurations) {
            this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations);
            return this;
        }

        public Builder transformationConfigurations(List<ObjectLambdaAccessPointConfigurationTransformationConfigurationGetArgs> transformationConfigurations) {
            this.transformationConfigurations = Output.of(Objects.requireNonNull(transformationConfigurations));
            return this;
        }
        public ObjectLambdaAccessPointConfigurationGetArgs build() {
            return new ObjectLambdaAccessPointConfigurationGetArgs(allowedFeatures, cloudWatchMetricsEnabled, supportingAccessPoint, transformationConfigurations);
        }
    }
}
