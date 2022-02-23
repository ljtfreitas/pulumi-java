// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetClusterClusterTelemetry extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterClusterTelemetry Empty = new GetClusterClusterTelemetry();

    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public GetClusterClusterTelemetry(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetClusterClusterTelemetry() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterTelemetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetClusterClusterTelemetry build() {
            return new GetClusterClusterTelemetry(type);
        }
    }
}
