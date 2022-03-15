// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.pubsub_v1beta1a.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PushConfigResponse {
    /**
     * A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use "https://example.com/push".
     * 
     */
    private final String pushEndpoint;

    @CustomType.Constructor
    private PushConfigResponse(@CustomType.Parameter("pushEndpoint") String pushEndpoint) {
        this.pushEndpoint = pushEndpoint;
    }

    /**
     * A URL locating the endpoint to which messages should be pushed. For example, a Webhook endpoint might use "https://example.com/push".
     * 
    */
    public String getPushEndpoint() {
        return this.pushEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pushEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(PushConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pushEndpoint = defaults.pushEndpoint;
        }

        public Builder pushEndpoint(String pushEndpoint) {
            this.pushEndpoint = Objects.requireNonNull(pushEndpoint);
            return this;
        }
        public PushConfigResponse build() {
            return new PushConfigResponse(pushEndpoint);
        }
    }
}
