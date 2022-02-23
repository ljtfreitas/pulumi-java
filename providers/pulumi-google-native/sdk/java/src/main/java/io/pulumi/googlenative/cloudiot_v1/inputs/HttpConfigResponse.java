// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration of the HTTP bridge for a device registry.
 * 
 */
public final class HttpConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpConfigResponse Empty = new HttpConfigResponse();

    /**
     * If enabled, allows devices to use DeviceService via the HTTP protocol. Otherwise, any requests to DeviceService will fail for this registry.
     * 
     */
    @InputImport(name="httpEnabledState", required=true)
      private final String httpEnabledState;

    public String getHttpEnabledState() {
        return this.httpEnabledState;
    }

    public HttpConfigResponse(String httpEnabledState) {
        this.httpEnabledState = Objects.requireNonNull(httpEnabledState, "expected parameter 'httpEnabledState' to be non-null");
    }

    private HttpConfigResponse() {
        this.httpEnabledState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpEnabledState;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEnabledState = defaults.httpEnabledState;
        }

        public Builder setHttpEnabledState(String httpEnabledState) {
            this.httpEnabledState = Objects.requireNonNull(httpEnabledState);
            return this;
        }
        public HttpConfigResponse build() {
            return new HttpConfigResponse(httpEnabledState);
        }
    }
}
