// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.networkservices_v1.outputs.EndpointMatcherMetadataLabelMatcherResponse;
import java.util.Objects;

@CustomType
public final class EndpointMatcherResponse {
    /**
     * The matcher is based on node metadata presented by xDS clients.
     * 
     */
    private final EndpointMatcherMetadataLabelMatcherResponse metadataLabelMatcher;

    @CustomType.Constructor
    private EndpointMatcherResponse(@CustomType.Parameter("metadataLabelMatcher") EndpointMatcherMetadataLabelMatcherResponse metadataLabelMatcher) {
        this.metadataLabelMatcher = metadataLabelMatcher;
    }

    /**
     * The matcher is based on node metadata presented by xDS clients.
     * 
    */
    public EndpointMatcherMetadataLabelMatcherResponse getMetadataLabelMatcher() {
        return this.metadataLabelMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointMatcherMetadataLabelMatcherResponse metadataLabelMatcher;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatcher = defaults.metadataLabelMatcher;
        }

        public Builder metadataLabelMatcher(EndpointMatcherMetadataLabelMatcherResponse metadataLabelMatcher) {
            this.metadataLabelMatcher = Objects.requireNonNull(metadataLabelMatcher);
            return this;
        }
        public EndpointMatcherResponse build() {
            return new EndpointMatcherResponse(metadataLabelMatcher);
        }
    }
}
