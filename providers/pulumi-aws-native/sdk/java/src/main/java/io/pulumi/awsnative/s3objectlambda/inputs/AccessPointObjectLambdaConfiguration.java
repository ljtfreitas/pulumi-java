// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3objectlambda.inputs;

import io.pulumi.awsnative.s3objectlambda.inputs.AccessPointTransformationConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration to be applied to this Object lambda Access Point. It specifies Supporting Access Point, Transformation Configurations. Customers can also set if they like to enable Cloudwatch metrics for accesses to this Object lambda Access Point. Default setting for Cloudwatch metrics is disable.
 * 
 */
public final class AccessPointObjectLambdaConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final AccessPointObjectLambdaConfiguration Empty = new AccessPointObjectLambdaConfiguration();

    @InputImport(name="allowedFeatures")
        private final @Nullable List<String> allowedFeatures;

    public List<String> getAllowedFeatures() {
        return this.allowedFeatures == null ? List.of() : this.allowedFeatures;
    }

    @InputImport(name="cloudWatchMetricsEnabled")
        private final @Nullable Boolean cloudWatchMetricsEnabled;

    public Optional<Boolean> getCloudWatchMetricsEnabled() {
        return this.cloudWatchMetricsEnabled == null ? Optional.empty() : Optional.ofNullable(this.cloudWatchMetricsEnabled);
    }

    @InputImport(name="supportingAccessPoint", required=true)
        private final String supportingAccessPoint;

    public String getSupportingAccessPoint() {
        return this.supportingAccessPoint;
    }

    @InputImport(name="transformationConfigurations", required=true)
        private final List<AccessPointTransformationConfiguration> transformationConfigurations;

    public List<AccessPointTransformationConfiguration> getTransformationConfigurations() {
        return this.transformationConfigurations;
    }

    public AccessPointObjectLambdaConfiguration(
        @Nullable List<String> allowedFeatures,
        @Nullable Boolean cloudWatchMetricsEnabled,
        String supportingAccessPoint,
        List<AccessPointTransformationConfiguration> transformationConfigurations) {
        this.allowedFeatures = allowedFeatures;
        this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
        this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint, "expected parameter 'supportingAccessPoint' to be non-null");
        this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations, "expected parameter 'transformationConfigurations' to be non-null");
    }

    private AccessPointObjectLambdaConfiguration() {
        this.allowedFeatures = List.of();
        this.cloudWatchMetricsEnabled = null;
        this.supportingAccessPoint = null;
        this.transformationConfigurations = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointObjectLambdaConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedFeatures;
        private @Nullable Boolean cloudWatchMetricsEnabled;
        private String supportingAccessPoint;
        private List<AccessPointTransformationConfiguration> transformationConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointObjectLambdaConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedFeatures = defaults.allowedFeatures;
    	      this.cloudWatchMetricsEnabled = defaults.cloudWatchMetricsEnabled;
    	      this.supportingAccessPoint = defaults.supportingAccessPoint;
    	      this.transformationConfigurations = defaults.transformationConfigurations;
        }

        public Builder setAllowedFeatures(@Nullable List<String> allowedFeatures) {
            this.allowedFeatures = allowedFeatures;
            return this;
        }

        public Builder setCloudWatchMetricsEnabled(@Nullable Boolean cloudWatchMetricsEnabled) {
            this.cloudWatchMetricsEnabled = cloudWatchMetricsEnabled;
            return this;
        }

        public Builder setSupportingAccessPoint(String supportingAccessPoint) {
            this.supportingAccessPoint = Objects.requireNonNull(supportingAccessPoint);
            return this;
        }

        public Builder setTransformationConfigurations(List<AccessPointTransformationConfiguration> transformationConfigurations) {
            this.transformationConfigurations = Objects.requireNonNull(transformationConfigurations);
            return this;
        }
        public AccessPointObjectLambdaConfiguration build() {
            return new AccessPointObjectLambdaConfiguration(allowedFeatures, cloudWatchMetricsEnabled, supportingAccessPoint, transformationConfigurations);
        }
    }
}
