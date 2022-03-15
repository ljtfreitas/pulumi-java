// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIstioCanonicalServiceTelemetry extends io.pulumi.resources.InvokeArgs {

    public static final GetIstioCanonicalServiceTelemetry Empty = new GetIstioCanonicalServiceTelemetry();

    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public GetIstioCanonicalServiceTelemetry(String resourceName) {
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetIstioCanonicalServiceTelemetry() {
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIstioCanonicalServiceTelemetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIstioCanonicalServiceTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public GetIstioCanonicalServiceTelemetry build() {
            return new GetIstioCanonicalServiceTelemetry(resourceName);
        }
    }
}
