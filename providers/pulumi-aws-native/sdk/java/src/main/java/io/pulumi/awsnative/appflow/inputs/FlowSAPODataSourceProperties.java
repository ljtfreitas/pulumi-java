// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FlowSAPODataSourceProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowSAPODataSourceProperties Empty = new FlowSAPODataSourceProperties();

    @InputImport(name="objectPath", required=true)
        private final String objectPath;

    public String getObjectPath() {
        return this.objectPath;
    }

    public FlowSAPODataSourceProperties(String objectPath) {
        this.objectPath = Objects.requireNonNull(objectPath, "expected parameter 'objectPath' to be non-null");
    }

    private FlowSAPODataSourceProperties() {
        this.objectPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSAPODataSourceProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSAPODataSourceProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectPath = defaults.objectPath;
        }

        public Builder setObjectPath(String objectPath) {
            this.objectPath = Objects.requireNonNull(objectPath);
            return this;
        }
        public FlowSAPODataSourceProperties build() {
            return new FlowSAPODataSourceProperties(objectPath);
        }
    }
}
