// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DeliverInfoResponse {
    /**
     * @return URI of the resource that the packet is delivered to.
     * 
     */
    private final String resourceUri;
    /**
     * @return Target type where the packet is delivered to.
     * 
     */
    private final String target;

    @CustomType.Constructor
    private DeliverInfoResponse(
        @CustomType.Parameter("resourceUri") String resourceUri,
        @CustomType.Parameter("target") String target) {
        this.resourceUri = resourceUri;
        this.target = target;
    }

    /**
     * @return URI of the resource that the packet is delivered to.
     * 
     */
    public String resourceUri() {
        return this.resourceUri;
    }
    /**
     * @return Target type where the packet is delivered to.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliverInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceUri;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliverInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
    	      this.target = defaults.target;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public DeliverInfoResponse build() {
            return new DeliverInfoResponse(resourceUri, target);
        }
    }
}
