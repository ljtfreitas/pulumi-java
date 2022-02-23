// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FlowSAPODataSourceProperties {
    private final String objectPath;

    @OutputCustomType.Constructor({"objectPath"})
    private FlowSAPODataSourceProperties(String objectPath) {
        this.objectPath = Objects.requireNonNull(objectPath);
    }

    public String getObjectPath() {
        return this.objectPath;
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
