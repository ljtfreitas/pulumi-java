// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.AzureQueryPropertiesResponse;
import io.pulumi.azurenative.automation.inputs.NonAzureQueryPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Group specific to the update configuration.
 * 
 */
public final class TargetPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetPropertiesResponse Empty = new TargetPropertiesResponse();

    /**
     * List of Azure queries in the software update configuration.
     * 
     */
    @InputImport(name="azureQueries")
    private final @Nullable List<AzureQueryPropertiesResponse> azureQueries;

    public List<AzureQueryPropertiesResponse> getAzureQueries() {
        return this.azureQueries == null ? List.of() : this.azureQueries;
    }

    /**
     * List of non Azure queries in the software update configuration.
     * 
     */
    @InputImport(name="nonAzureQueries")
    private final @Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries;

    public List<NonAzureQueryPropertiesResponse> getNonAzureQueries() {
        return this.nonAzureQueries == null ? List.of() : this.nonAzureQueries;
    }

    public TargetPropertiesResponse(
        @Nullable List<AzureQueryPropertiesResponse> azureQueries,
        @Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries) {
        this.azureQueries = azureQueries;
        this.nonAzureQueries = nonAzureQueries;
    }

    private TargetPropertiesResponse() {
        this.azureQueries = List.of();
        this.nonAzureQueries = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AzureQueryPropertiesResponse> azureQueries;
        private @Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureQueries = defaults.azureQueries;
    	      this.nonAzureQueries = defaults.nonAzureQueries;
        }

        public Builder setAzureQueries(@Nullable List<AzureQueryPropertiesResponse> azureQueries) {
            this.azureQueries = azureQueries;
            return this;
        }

        public Builder setNonAzureQueries(@Nullable List<NonAzureQueryPropertiesResponse> nonAzureQueries) {
            this.nonAzureQueries = nonAzureQueries;
            return this;
        }

        public TargetPropertiesResponse build() {
            return new TargetPropertiesResponse(azureQueries, nonAzureQueries);
        }
    }
}
