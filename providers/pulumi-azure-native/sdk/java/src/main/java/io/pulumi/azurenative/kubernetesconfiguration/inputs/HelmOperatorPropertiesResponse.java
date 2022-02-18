// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for Helm operator.
 * 
 */
public final class HelmOperatorPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final HelmOperatorPropertiesResponse Empty = new HelmOperatorPropertiesResponse();

    /**
     * Values override for the operator Helm chart.
     * 
     */
    @InputImport(name="chartValues")
    private final @Nullable String chartValues;

    public Optional<String> getChartValues() {
        return this.chartValues == null ? Optional.empty() : Optional.ofNullable(this.chartValues);
    }

    /**
     * Version of the operator Helm chart.
     * 
     */
    @InputImport(name="chartVersion")
    private final @Nullable String chartVersion;

    public Optional<String> getChartVersion() {
        return this.chartVersion == null ? Optional.empty() : Optional.ofNullable(this.chartVersion);
    }

    public HelmOperatorPropertiesResponse(
        @Nullable String chartValues,
        @Nullable String chartVersion) {
        this.chartValues = chartValues;
        this.chartVersion = chartVersion;
    }

    private HelmOperatorPropertiesResponse() {
        this.chartValues = null;
        this.chartVersion = null;
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
