// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a serverless network endpoint group (NEG). The platform must be provided. Note: The target backend service must be in the same project and located in the same region as the Serverless NEG.
 * 
 */
public final class NetworkEndpointGroupServerlessDeploymentArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkEndpointGroupServerlessDeploymentArgs Empty = new NetworkEndpointGroupServerlessDeploymentArgs();

    /**
     * The platform of the backend target(s) of this NEG. Possible values include: 1. API Gateway: apigateway.googleapis.com 2. App Engine: appengine.googleapis.com 3. Cloud Functions: cloudfunctions.googleapis.com 4. Cloud Run: run.googleapis.com
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<String> platform;

    public Output<String> getPlatform() {
        return this.platform == null ? Output.empty() : this.platform;
    }

    /**
     * The user-defined name of the workload/instance. This value must be provided explicitly or in the urlMask. The resource identified by this value is platform-specific and is as follows: 1. API Gateway: The gateway ID 2. App Engine: The service name 3. Cloud Functions: The function name 4. Cloud Run: The service name
     * 
     */
    @Import(name="resource")
      private final @Nullable Output<String> resource;

    public Output<String> getResource() {
        return this.resource == null ? Output.empty() : this.resource;
    }

    /**
     * A template to parse platform-specific fields from a request URL. URL mask allows for routing to multiple resources on the same serverless platform without having to create multiple Network Endpoint Groups and backend resources. The fields parsed by this template are platform-specific and are as follows: 1. API Gateway: The gateway ID 2. App Engine: The service and version 3. Cloud Functions: The function name 4. Cloud Run: The service and tag
     * 
     */
    @Import(name="urlMask")
      private final @Nullable Output<String> urlMask;

    public Output<String> getUrlMask() {
        return this.urlMask == null ? Output.empty() : this.urlMask;
    }

    /**
     * The optional resource version. The version identified by this value is platform-specific and is follows: 1. API Gateway: Unused 2. App Engine: The service version 3. Cloud Functions: Unused 4. Cloud Run: The service tag
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public NetworkEndpointGroupServerlessDeploymentArgs(
        @Nullable Output<String> platform,
        @Nullable Output<String> resource,
        @Nullable Output<String> urlMask,
        @Nullable Output<String> version) {
        this.platform = platform;
        this.resource = resource;
        this.urlMask = urlMask;
        this.version = version;
    }

    private NetworkEndpointGroupServerlessDeploymentArgs() {
        this.platform = Output.empty();
        this.resource = Output.empty();
        this.urlMask = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkEndpointGroupServerlessDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> platform;
        private @Nullable Output<String> resource;
        private @Nullable Output<String> urlMask;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkEndpointGroupServerlessDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.platform = defaults.platform;
    	      this.resource = defaults.resource;
    	      this.urlMask = defaults.urlMask;
    	      this.version = defaults.version;
        }

        public Builder platform(@Nullable Output<String> platform) {
            this.platform = platform;
            return this;
        }

        public Builder platform(@Nullable String platform) {
            this.platform = Output.ofNullable(platform);
            return this;
        }

        public Builder resource(@Nullable Output<String> resource) {
            this.resource = resource;
            return this;
        }

        public Builder resource(@Nullable String resource) {
            this.resource = Output.ofNullable(resource);
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
        public NetworkEndpointGroupServerlessDeploymentArgs build() {
            return new NetworkEndpointGroupServerlessDeploymentArgs(platform, resource, urlMask, version);
        }
    }
}
