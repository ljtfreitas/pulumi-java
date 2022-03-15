// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.enums.EnabledState;
import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.azurenative.cdn.inputs.SharedPrivateLinkResourcePropertiesArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AFDOriginArgs extends io.pulumi.resources.ResourceArgs {

    public static final AFDOriginArgs Empty = new AFDOriginArgs();

    /**
     * Resource reference to the Azure origin resource.
     * 
     */
    @Import(name="azureOrigin")
      private final @Nullable Output<ResourceReferenceArgs> azureOrigin;

    public Output<ResourceReferenceArgs> getAzureOrigin() {
        return this.azureOrigin == null ? Output.empty() : this.azureOrigin;
    }

    /**
     * Whether to enable health probes to be made against backends defined under backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend pool.
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,EnabledState>> enabledState;

    public Output<Either<String,EnabledState>> getEnabledState() {
        return this.enabledState == null ? Output.empty() : this.enabledState;
    }

    /**
     * The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are supported.This should be unique across all origins in an endpoint.
     * 
     */
    @Import(name="hostName", required=true)
      private final Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName;
    }

    /**
     * The value of the HTTP port. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpPort")
      private final @Nullable Output<Integer> httpPort;

    public Output<Integer> getHttpPort() {
        return this.httpPort == null ? Output.empty() : this.httpPort;
    }

    /**
     * The value of the HTTPS port. Must be between 1 and 65535.
     * 
     */
    @Import(name="httpsPort")
      private final @Nullable Output<Integer> httpsPort;

    public Output<Integer> getHttpsPort() {
        return this.httpsPort == null ? Output.empty() : this.httpsPort;
    }

    /**
     * Name of the origin group which is unique within the profile.
     * 
     */
    @Import(name="originGroupName", required=true)
      private final Output<String> originGroupName;

    public Output<String> getOriginGroupName() {
        return this.originGroupName;
    }

    /**
     * The host header value sent to the origin with each request. If you leave this blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud Services require this host header value to match the origin hostname by default. This overrides the host header defined at Endpoint
     * 
     */
    @Import(name="originHostHeader")
      private final @Nullable Output<String> originHostHeader;

    public Output<String> getOriginHostHeader() {
        return this.originHostHeader == null ? Output.empty() : this.originHostHeader;
    }

    /**
     * Name of the origin that is unique within the profile.
     * 
     */
    @Import(name="originName")
      private final @Nullable Output<String> originName;

    public Output<String> getOriginName() {
        return this.originName == null ? Output.empty() : this.originName;
    }

    /**
     * Priority of origin in given origin group for load balancing. Higher priorities will not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority == null ? Output.empty() : this.priority;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final Output<String> profileName;

    public Output<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The properties of the private link resource for private origin.
     * 
     */
    @Import(name="sharedPrivateLinkResource")
      private final @Nullable Output<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource;

    public Output<SharedPrivateLinkResourcePropertiesArgs> getSharedPrivateLinkResource() {
        return this.sharedPrivateLinkResource == null ? Output.empty() : this.sharedPrivateLinkResource;
    }

    /**
     * Weight of the origin in given origin group for load balancing. Must be between 1 and 1000
     * 
     */
    @Import(name="weight")
      private final @Nullable Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight == null ? Output.empty() : this.weight;
    }

    public AFDOriginArgs(
        @Nullable Output<ResourceReferenceArgs> azureOrigin,
        @Nullable Output<Either<String,EnabledState>> enabledState,
        Output<String> hostName,
        @Nullable Output<Integer> httpPort,
        @Nullable Output<Integer> httpsPort,
        Output<String> originGroupName,
        @Nullable Output<String> originHostHeader,
        @Nullable Output<String> originName,
        @Nullable Output<Integer> priority,
        Output<String> profileName,
        Output<String> resourceGroupName,
        @Nullable Output<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource,
        @Nullable Output<Integer> weight) {
        this.azureOrigin = azureOrigin;
        this.enabledState = enabledState;
        this.hostName = Objects.requireNonNull(hostName, "expected parameter 'hostName' to be non-null");
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.originGroupName = Objects.requireNonNull(originGroupName, "expected parameter 'originGroupName' to be non-null");
        this.originHostHeader = originHostHeader;
        this.originName = originName;
        this.priority = priority;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sharedPrivateLinkResource = sharedPrivateLinkResource;
        this.weight = weight;
    }

    private AFDOriginArgs() {
        this.azureOrigin = Output.empty();
        this.enabledState = Output.empty();
        this.hostName = Output.empty();
        this.httpPort = Output.empty();
        this.httpsPort = Output.empty();
        this.originGroupName = Output.empty();
        this.originHostHeader = Output.empty();
        this.originName = Output.empty();
        this.priority = Output.empty();
        this.profileName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sharedPrivateLinkResource = Output.empty();
        this.weight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceReferenceArgs> azureOrigin;
        private @Nullable Output<Either<String,EnabledState>> enabledState;
        private Output<String> hostName;
        private @Nullable Output<Integer> httpPort;
        private @Nullable Output<Integer> httpsPort;
        private Output<String> originGroupName;
        private @Nullable Output<String> originHostHeader;
        private @Nullable Output<String> originName;
        private @Nullable Output<Integer> priority;
        private Output<String> profileName;
        private Output<String> resourceGroupName;
        private @Nullable Output<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource;
        private @Nullable Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDOriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureOrigin = defaults.azureOrigin;
    	      this.enabledState = defaults.enabledState;
    	      this.hostName = defaults.hostName;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.originGroupName = defaults.originGroupName;
    	      this.originHostHeader = defaults.originHostHeader;
    	      this.originName = defaults.originName;
    	      this.priority = defaults.priority;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sharedPrivateLinkResource = defaults.sharedPrivateLinkResource;
    	      this.weight = defaults.weight;
        }

        public Builder azureOrigin(@Nullable Output<ResourceReferenceArgs> azureOrigin) {
            this.azureOrigin = azureOrigin;
            return this;
        }

        public Builder azureOrigin(@Nullable ResourceReferenceArgs azureOrigin) {
            this.azureOrigin = Output.ofNullable(azureOrigin);
            return this;
        }

        public Builder enabledState(@Nullable Output<Either<String,EnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder enabledState(@Nullable Either<String,EnabledState> enabledState) {
            this.enabledState = Output.ofNullable(enabledState);
            return this;
        }

        public Builder hostName(Output<String> hostName) {
            this.hostName = Objects.requireNonNull(hostName);
            return this;
        }

        public Builder hostName(String hostName) {
            this.hostName = Output.of(Objects.requireNonNull(hostName));
            return this;
        }

        public Builder httpPort(@Nullable Output<Integer> httpPort) {
            this.httpPort = httpPort;
            return this;
        }

        public Builder httpPort(@Nullable Integer httpPort) {
            this.httpPort = Output.ofNullable(httpPort);
            return this;
        }

        public Builder httpsPort(@Nullable Output<Integer> httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }

        public Builder httpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = Output.ofNullable(httpsPort);
            return this;
        }

        public Builder originGroupName(Output<String> originGroupName) {
            this.originGroupName = Objects.requireNonNull(originGroupName);
            return this;
        }

        public Builder originGroupName(String originGroupName) {
            this.originGroupName = Output.of(Objects.requireNonNull(originGroupName));
            return this;
        }

        public Builder originHostHeader(@Nullable Output<String> originHostHeader) {
            this.originHostHeader = originHostHeader;
            return this;
        }

        public Builder originHostHeader(@Nullable String originHostHeader) {
            this.originHostHeader = Output.ofNullable(originHostHeader);
            return this;
        }

        public Builder originName(@Nullable Output<String> originName) {
            this.originName = originName;
            return this;
        }

        public Builder originName(@Nullable String originName) {
            this.originName = Output.ofNullable(originName);
            return this;
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Output.ofNullable(priority);
            return this;
        }

        public Builder profileName(Output<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder profileName(String profileName) {
            this.profileName = Output.of(Objects.requireNonNull(profileName));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sharedPrivateLinkResource(@Nullable Output<SharedPrivateLinkResourcePropertiesArgs> sharedPrivateLinkResource) {
            this.sharedPrivateLinkResource = sharedPrivateLinkResource;
            return this;
        }

        public Builder sharedPrivateLinkResource(@Nullable SharedPrivateLinkResourcePropertiesArgs sharedPrivateLinkResource) {
            this.sharedPrivateLinkResource = Output.ofNullable(sharedPrivateLinkResource);
            return this;
        }

        public Builder weight(@Nullable Output<Integer> weight) {
            this.weight = weight;
            return this;
        }

        public Builder weight(@Nullable Integer weight) {
            this.weight = Output.ofNullable(weight);
            return this;
        }
        public AFDOriginArgs build() {
            return new AFDOriginArgs(azureOrigin, enabledState, hostName, httpPort, httpsPort, originGroupName, originHostHeader, originName, priority, profileName, resourceGroupName, sharedPrivateLinkResource, weight);
        }
    }
}
