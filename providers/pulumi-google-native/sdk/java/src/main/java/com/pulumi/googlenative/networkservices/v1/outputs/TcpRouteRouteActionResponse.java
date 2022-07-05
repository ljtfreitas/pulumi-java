// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networkservices.v1.outputs.TcpRouteRouteDestinationResponse;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TcpRouteRouteActionResponse {
    /**
     * @return Optional. The destination services to which traffic should be forwarded. At least one destination service is required.
     * 
     */
    private final List<TcpRouteRouteDestinationResponse> destinations;
    /**
     * @return Optional. If true, Router will use the destination IP and port of the original connection as the destination of the request. Default is false.
     * 
     */
    private final Boolean originalDestination;

    @CustomType.Constructor
    private TcpRouteRouteActionResponse(
        @CustomType.Parameter("destinations") List<TcpRouteRouteDestinationResponse> destinations,
        @CustomType.Parameter("originalDestination") Boolean originalDestination) {
        this.destinations = destinations;
        this.originalDestination = originalDestination;
    }

    /**
     * @return Optional. The destination services to which traffic should be forwarded. At least one destination service is required.
     * 
     */
    public List<TcpRouteRouteDestinationResponse> destinations() {
        return this.destinations;
    }
    /**
     * @return Optional. If true, Router will use the destination IP and port of the original connection as the destination of the request. Default is false.
     * 
     */
    public Boolean originalDestination() {
        return this.originalDestination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TcpRouteRouteActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TcpRouteRouteDestinationResponse> destinations;
        private Boolean originalDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(TcpRouteRouteActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.originalDestination = defaults.originalDestination;
        }

        public Builder destinations(List<TcpRouteRouteDestinationResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(TcpRouteRouteDestinationResponse... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder originalDestination(Boolean originalDestination) {
            this.originalDestination = Objects.requireNonNull(originalDestination);
            return this;
        }        public TcpRouteRouteActionResponse build() {
            return new TcpRouteRouteActionResponse(destinations, originalDestination);
        }
    }
}
