// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMeshSpecEgressFilter extends io.pulumi.resources.InvokeArgs {

    public static final GetMeshSpecEgressFilter Empty = new GetMeshSpecEgressFilter();

    /**
     * The egress filter type.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public GetMeshSpecEgressFilter(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetMeshSpecEgressFilter() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMeshSpecEgressFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMeshSpecEgressFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMeshSpecEgressFilter build() {
            return new GetMeshSpecEgressFilter(type);
        }
    }
}
