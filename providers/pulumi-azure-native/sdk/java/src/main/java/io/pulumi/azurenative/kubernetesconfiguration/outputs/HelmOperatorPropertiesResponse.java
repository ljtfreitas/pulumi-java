// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HelmOperatorPropertiesResponse {
    /**
     * Values override for the operator Helm chart.
     * 
     */
    private final @Nullable String chartValues;
    /**
     * Version of the operator Helm chart.
     * 
     */
    private final @Nullable String chartVersion;

    @OutputCustomType.Constructor({"chartValues","chartVersion"})
    private HelmOperatorPropertiesResponse(
        @Nullable String chartValues,
        @Nullable String chartVersion) {
        this.chartValues = chartValues;
        this.chartVersion = chartVersion;
    }

    /**
     * Values override for the operator Helm chart.
     * 
     */
    public Optional<String> getChartValues() {
        return Optional.ofNullable(this.chartValues);
    }
    /**
     * Version of the operator Helm chart.
     * 
     */
    public Optional<String> getChartVersion() {
        return Optional.ofNullable(this.chartVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmOperatorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String chartValues;
        private @Nullable String chartVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(HelmOperatorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chartValues = defaults.chartValues;
    	      this.chartVersion = defaults.chartVersion;
        }

        public Builder setChartValues(@Nullable String chartValues) {
            this.chartValues = chartValues;
            return this;
        }

        public Builder setChartVersion(@Nullable String chartVersion) {
            this.chartVersion = chartVersion;
            return this;
        }

        public HelmOperatorPropertiesResponse build() {
            return new HelmOperatorPropertiesResponse(chartValues, chartVersion);
        }
    }
}
