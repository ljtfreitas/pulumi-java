// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleMetricDataSourceResponse {
    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    private final @Nullable String legacyResourceId;
    /**
     * the name of the metric that defines what the rule monitors.
     * 
     */
    private final @Nullable String metricName;
    /**
     * the namespace of the metric.
     * 
     */
    private final @Nullable String metricNamespace;
    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource'.
     * 
     */
    private final String odataType;
    /**
     * the location of the resource.
     * 
     */
    private final @Nullable String resourceLocation;
    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    private final @Nullable String resourceUri;

    @CustomType.Constructor
    private RuleMetricDataSourceResponse(
        @CustomType.Parameter("legacyResourceId") @Nullable String legacyResourceId,
        @CustomType.Parameter("metricName") @Nullable String metricName,
        @CustomType.Parameter("metricNamespace") @Nullable String metricNamespace,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("resourceLocation") @Nullable String resourceLocation,
        @CustomType.Parameter("resourceUri") @Nullable String resourceUri) {
        this.legacyResourceId = legacyResourceId;
        this.metricName = metricName;
        this.metricNamespace = metricNamespace;
        this.odataType = odataType;
        this.resourceLocation = resourceLocation;
        this.resourceUri = resourceUri;
    }

    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
    */
    public Optional<String> getLegacyResourceId() {
        return Optional.ofNullable(this.legacyResourceId);
    }
    /**
     * the name of the metric that defines what the rule monitors.
     * 
    */
    public Optional<String> getMetricName() {
        return Optional.ofNullable(this.metricName);
    }
    /**
     * the namespace of the metric.
     * 
    */
    public Optional<String> getMetricNamespace() {
        return Optional.ofNullable(this.metricNamespace);
    }
    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * the location of the resource.
     * 
    */
    public Optional<String> getResourceLocation() {
        return Optional.ofNullable(this.resourceLocation);
    }
    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
    */
    public Optional<String> getResourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleMetricDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String legacyResourceId;
        private @Nullable String metricName;
        private @Nullable String metricNamespace;
        private String odataType;
        private @Nullable String resourceLocation;
        private @Nullable String resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleMetricDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.legacyResourceId = defaults.legacyResourceId;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.odataType = defaults.odataType;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder legacyResourceId(@Nullable String legacyResourceId) {
            this.legacyResourceId = legacyResourceId;
            return this;
        }

        public Builder metricName(@Nullable String metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder metricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder resourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }

        public Builder resourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }
        public RuleMetricDataSourceResponse build() {
            return new RuleMetricDataSourceResponse(legacyResourceId, metricName, metricNamespace, odataType, resourceLocation, resourceUri);
        }
    }
}
