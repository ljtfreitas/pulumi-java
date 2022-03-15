// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for Binary Authorization.
 * 
 */
public final class BinaryAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final BinaryAuthorizationResponse Empty = new BinaryAuthorizationResponse();

    /**
     * Enable Binary Authorization for this cluster. If enabled, all container images will be validated by Google Binauthz.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public BinaryAuthorizationResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private BinaryAuthorizationResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BinaryAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(BinaryAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public BinaryAuthorizationResponse build() {
            return new BinaryAuthorizationResponse(enabled);
        }
    }
}
