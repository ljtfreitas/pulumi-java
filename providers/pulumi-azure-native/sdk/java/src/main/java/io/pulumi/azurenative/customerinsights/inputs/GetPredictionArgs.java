// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPredictionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPredictionArgs Empty = new GetPredictionArgs();

    /**
     * The name of the hub.
     * 
     */
    @InputImport(name="hubName", required=true)
    private final String hubName;

    public String getHubName() {
        return this.hubName;
    }

    /**
     * The name of the Prediction.
     * 
     */
    @InputImport(name="predictionName", required=true)
    private final String predictionName;

    public String getPredictionName() {
        return this.predictionName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPredictionArgs(
        String hubName,
        String predictionName,
        String resourceGroupName) {
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.predictionName = Objects.requireNonNull(predictionName, "expected parameter 'predictionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPredictionArgs() {
        this.hubName = null;
        this.predictionName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPredictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubName;
        private String predictionName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPredictionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.predictionName = defaults.predictionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setPredictionName(String predictionName) {
            this.predictionName = Objects.requireNonNull(predictionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetPredictionArgs build() {
            return new GetPredictionArgs(hubName, predictionName, resourceGroupName);
        }
    }
}
