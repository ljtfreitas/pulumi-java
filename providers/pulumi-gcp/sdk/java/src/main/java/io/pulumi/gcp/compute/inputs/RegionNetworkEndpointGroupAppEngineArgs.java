// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNetworkEndpointGroupAppEngineArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionNetworkEndpointGroupAppEngineArgs Empty = new RegionNetworkEndpointGroupAppEngineArgs();

    /**
     * Optional serving service.
     * The service name must be 1-63 characters long, and comply with RFC1035.
     * Example value: "default", "my-service".
     * 
     */
    @InputImport(name="service")
        private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * A template to parse function field from a request URL. URL mask allows
     * for routing to multiple Cloud Functions without having to create
     * multiple Network Endpoint Groups and backend services.
     * For example, request URLs "mydomain.com/function1" and "mydomain.com/function2"
     * can be backed by the same Serverless NEG with URL mask "/". The URL mask
     * will parse them to { function = "function1" } and { function = "function2" } respectively.
     * 
     */
    @InputImport(name="urlMask")
        private final @Nullable Input<String> urlMask;

    public Input<String> getUrlMask() {
        return this.urlMask == null ? Input.empty() : this.urlMask;
    }

    /**
     * Optional serving version.
     * The version must be 1-63 characters long, and comply with RFC1035.
     * Example value: "v1", "v2".
     * 
     */
    @InputImport(name="version")
        private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public RegionNetworkEndpointGroupAppEngineArgs(
        @Nullable Input<String> service,
        @Nullable Input<String> urlMask,
        @Nullable Input<String> version) {
        this.service = service;
        this.urlMask = urlMask;
        this.version = version;
    }

    private RegionNetworkEndpointGroupAppEngineArgs() {
        this.service = Input.empty();
        this.urlMask = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNetworkEndpointGroupAppEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> service;
        private @Nullable Input<String> urlMask;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNetworkEndpointGroupAppEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }

        public Builder setUrlMask(@Nullable Input<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }

        public Builder setUrlMask(@Nullable String urlMask) {
            this.urlMask = Input.ofNullable(urlMask);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public RegionNetworkEndpointGroupAppEngineArgs build() {
            return new RegionNetworkEndpointGroupAppEngineArgs(service, urlMask, version);
        }
    }
}
