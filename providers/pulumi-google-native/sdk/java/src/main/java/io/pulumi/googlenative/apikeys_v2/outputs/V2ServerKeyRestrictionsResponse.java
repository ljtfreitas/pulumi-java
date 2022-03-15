// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class V2ServerKeyRestrictionsResponse {
    /**
     * A list of the caller IP addresses that are allowed to make API calls with this key.
     * 
     */
    private final List<String> allowedIps;

    @CustomType.Constructor
    private V2ServerKeyRestrictionsResponse(@CustomType.Parameter("allowedIps") List<String> allowedIps) {
        this.allowedIps = allowedIps;
    }

    /**
     * A list of the caller IP addresses that are allowed to make API calls with this key.
     * 
    */
    public List<String> getAllowedIps() {
        return this.allowedIps;
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
