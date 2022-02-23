// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A set of properties that can be defined in the context of a specific item type. Each type may have its own properties.
 * 
 */
public final class ApplicationInsightsComponentAnalyticsItemPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationInsightsComponentAnalyticsItemPropertiesResponse Empty = new ApplicationInsightsComponentAnalyticsItemPropertiesResponse();

    /**
     * A function alias, used when the type of the item is Function
     * 
     */
    @InputImport(name="functionAlias")
        private final @Nullable String functionAlias;

    public Optional<String> getFunctionAlias() {
        return this.functionAlias == null ? Optional.empty() : Optional.ofNullable(this.functionAlias);
    }

    public ApplicationInsightsComponentAnalyticsItemPropertiesResponse(@Nullable String functionAlias) {
        this.functionAlias = functionAlias;
    }

    private ApplicationInsightsComponentAnalyticsItemPropertiesResponse() {
        this.functionAlias = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInsightsComponentAnalyticsItemPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String functionAlias;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInsightsComponentAnalyticsItemPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionAlias = defaults.functionAlias;
        }

        public Builder setFunctionAlias(@Nullable String functionAlias) {
            this.functionAlias = functionAlias;
            return this;
        }
        public ApplicationInsightsComponentAnalyticsItemPropertiesResponse build() {
            return new ApplicationInsightsComponentAnalyticsItemPropertiesResponse(functionAlias);
        }
    }
}
