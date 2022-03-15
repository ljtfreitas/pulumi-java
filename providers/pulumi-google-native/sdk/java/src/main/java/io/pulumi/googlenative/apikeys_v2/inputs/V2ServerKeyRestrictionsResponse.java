// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The IP addresses of callers that are allowed to use the key.
 * 
 */
public final class V2ServerKeyRestrictionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final V2ServerKeyRestrictionsResponse Empty = new V2ServerKeyRestrictionsResponse();

    /**
     * A list of the caller IP addresses that are allowed to make API calls with this key.
     * 
     */
    @Import(name="allowedIps", required=true)
      private final List<String> allowedIps;

    public List<String> getAllowedIps() {
        return this.allowedIps;
    }

    public V2ServerKeyRestrictionsResponse(List<String> allowedIps) {
        this.allowedIps = Objects.requireNonNull(allowedIps, "expected parameter 'allowedIps' to be non-null");
    }

    private V2ServerKeyRestrictionsResponse() {
        this.allowedIps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2ServerKeyRestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedIps;

        public Builder() {
    	      // Empty
        }

        public Builder(V2ServerKeyRestrictionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedIps = defaults.allowedIps;
        }

        public Builder allowedIps(List<String> allowedIps) {
            this.allowedIps = Objects.requireNonNull(allowedIps);
            return this;
        }
        public V2ServerKeyRestrictionsResponse build() {
            return new V2ServerKeyRestrictionsResponse(allowedIps);
        }
    }
}
