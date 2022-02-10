// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApplicationGroupArgs Empty = new GetApplicationGroupArgs();

    @InputImport(name="applicationGroupName", required=true)
    private final String applicationGroupName;

    public String getApplicationGroupName() {
        return this.applicationGroupName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetApplicationGroupArgs(
        String applicationGroupName,
        String resourceGroupName) {
        this.applicationGroupName = Objects.requireNonNull(applicationGroupName, "expected parameter 'applicationGroupName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetApplicationGroupArgs() {
        this.applicationGroupName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationGroupName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationGroupName = defaults.applicationGroupName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setApplicationGroupName(String applicationGroupName) {
            this.applicationGroupName = Objects.requireNonNull(applicationGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetApplicationGroupArgs build() {
            return new GetApplicationGroupArgs(applicationGroupName, resourceGroupName);
        }
    }
}