// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SandboxConfigResponse {
    /**
     * Type of the sandbox to use for the node.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SandboxConfigResponse(@CustomType.Parameter("type") String type) {
        this.type = type;
    }

    /**
     * Type of the sandbox to use for the node.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SandboxConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SandboxConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SandboxConfigResponse build() {
            return new SandboxConfigResponse(type);
        }
    }
}
