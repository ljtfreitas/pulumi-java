// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGen2EnvironmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGen2EnvironmentArgs Empty = new GetGen2EnvironmentArgs();

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @Import(name="environmentName", required=true)
      private final String environmentName;

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * Setting $expand=status will include the status of the internal services of the environment in the Time Series Insights service.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetGen2EnvironmentArgs(
        String environmentName,
        @Nullable String expand,
        String resourceGroupName) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetGen2EnvironmentArgs() {
        this.environmentName = null;
        this.expand = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGen2EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentName;
        private @Nullable String expand;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGen2EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder environmentName(String environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetGen2EnvironmentArgs build() {
            return new GetGen2EnvironmentArgs(environmentName, expand, resourceGroupName);
        }
    }
}
