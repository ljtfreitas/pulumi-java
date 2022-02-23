// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetKpiArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKpiArgs Empty = new GetKpiArgs();

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
     * The name of the KPI.
     * 
     */
    @InputImport(name="kpiName", required=true)
        private final String kpiName;

    public String getKpiName() {
        return this.kpiName;
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

    public GetKpiArgs(
        String hubName,
        String kpiName,
        String resourceGroupName) {
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.kpiName = Objects.requireNonNull(kpiName, "expected parameter 'kpiName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetKpiArgs() {
        this.hubName = null;
        this.kpiName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKpiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hubName;
        private String kpiName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKpiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hubName = defaults.hubName;
    	      this.kpiName = defaults.kpiName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setKpiName(String kpiName) {
            this.kpiName = Objects.requireNonNull(kpiName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetKpiArgs build() {
            return new GetKpiArgs(hubName, kpiName, resourceGroupName);
        }
    }
}
