// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for an App Engine network endpoint group (NEG). The service is optional, may be provided explicitly or in the URL mask. The version is optional and can only be provided explicitly or in the URL mask when service is present. Note: App Engine service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupAppEngineArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupAppEngineArgs Empty = new NetworkEndpointGroupAppEngineArgs();

    /**
     * Optional serving service. The service name is case-sensitive and must be 1-63 characters long. Example value: "default", "my-service".
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    /**
     * A template to parse service and version fields from a request URL. URL mask allows for routing to multiple App Engine services without having to create multiple Network Endpoint Groups and backend services. For example, the request URLs "foo1-dot-appname.appspot.com/v1" and "foo1-dot-appname.appspot.com/v2" can be backed by the same Serverless NEG with URL mask "-dot-appname.appspot.com/". The URL mask will parse them to { service = "foo1", version = "v1" } and { service = "foo1", version = "v2" } respectively.
     * 
     */
    @Import(name="urlMask")
      private final @Nullable Output<String> urlMask;

    public Output<String> getUrlMask() {
        return this.urlMask == null ? Output.empty() : this.urlMask;
    }

    /**
     * Optional serving version. The version name is case-sensitive and must be 1-100 characters long. Example value: "v1", "v2".
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public NetworkEndpointGroupAppEngineArgs(
        @Nullable Output<String> service,
        @Nullable Output<String> urlMask,
        @Nullable Output<String> version) {
        this.service = service;
        this.urlMask = urlMask;
        this.version = version;
    }

    private NetworkEndpointGroupAppEngineArgs() {
        this.service = Output.empty();
        this.urlMask = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupAppEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> service;
        private @Nullable Output<String> urlMask;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupAppEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }

        public Builder urlMask(@Nullable Output<String> urlMask) {
            this.urlMask = urlMask;
            return this;
        }

        public Builder urlMask(@Nullable String urlMask) {
            this.urlMask = Output.ofNullable(urlMask);
            return this;
        }

        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public NetworkEndpointGroupAppEngineArgs build() {
            return new NetworkEndpointGroupAppEngineArgs(service, urlMask, version);
        }
    }
}
