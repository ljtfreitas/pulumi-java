// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventHubEventSourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventHubEventSourceArgs Empty = new GetEventHubEventSourceArgs();

    /**
     * The name of the Time Series Insights environment associated with the specified resource group.
     * 
     */
    @InputImport(name="environmentName", required=true)
    private final String environmentName;

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * The name of the Time Series Insights event source associated with the specified environment.
     * 
     */
    @InputImport(name="eventSourceName", required=true)
    private final String eventSourceName;

    public String getEventSourceName() {
        return this.eventSourceName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetEventHubEventSourceArgs(
        String environmentName,
        String eventSourceName,
        String resourceGroupName) {
        this.environmentName = Objects.requireNonNull(environmentName, "expected parameter 'environmentName' to be non-null");
        this.eventSourceName = Objects.requireNonNull(eventSourceName, "expected parameter 'eventSourceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetEventHubEventSourceArgs() {
        this.environmentName = null;
        this.eventSourceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventHubEventSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String environmentName;
        private String eventSourceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventHubEventSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.eventSourceName = defaults.eventSourceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setEnvironmentName(String environmentName) {
            this.environmentName = Objects.requireNonNull(environmentName);
            return this;
        }

        public Builder setEventSourceName(String eventSourceName) {
            this.eventSourceName = Objects.requireNonNull(eventSourceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetEventHubEventSourceArgs build() {
            return new GetEventHubEventSourceArgs(environmentName, eventSourceName, resourceGroupName);
        }
    }
}
