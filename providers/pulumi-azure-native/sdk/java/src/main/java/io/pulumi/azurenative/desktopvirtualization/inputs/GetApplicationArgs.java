// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationArgs Empty = new GetApplicationArgs();

    /**
     * The name of the application group
     * 
     */
    @Import(name="applicationGroupName", required=true)
      private final String applicationGroupName;

    public String getApplicationGroupName() {
        return this.applicationGroupName;
    }

    /**
     * The name of the application within the specified application group
     * 
     */
    @Import(name="applicationName", required=true)
      private final String applicationName;

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetApplicationArgs(
        String applicationGroupName,
        String applicationName,
        String resourceGroupName) {
        this.applicationGroupName = Objects.requireNonNull(applicationGroupName, "expected parameter 'applicationGroupName' to be non-null");
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetApplicationArgs() {
        this.applicationGroupName = null;
        this.applicationName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationGroupName;
        private String applicationName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGroupName = defaults.applicationGroupName;
    	      this.applicationName = defaults.applicationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder applicationGroupName(String applicationGroupName) {
            this.applicationGroupName = Objects.requireNonNull(applicationGroupName);
            return this;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetApplicationArgs build() {
            return new GetApplicationArgs(applicationGroupName, applicationName, resourceGroupName);
        }
    }
}
