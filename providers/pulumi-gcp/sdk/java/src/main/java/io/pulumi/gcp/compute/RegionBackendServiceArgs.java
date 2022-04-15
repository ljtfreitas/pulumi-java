// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceBackendArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceConnectionTrackingPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceConsistentHashArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceFailoverPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceIapArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceLogConfigArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceOutlierDetectionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceArgs Empty = new RegionBackendServiceArgs();

    /**
     * Lifetime of cookies in seconds if session_affinity is
     * GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts
     * only until the end of the browser session (or equivalent). The
     * maximum allowed value for TTL is one day.
     * When the load balancing scheme is INTERNAL, this field is not used.
     * 
     */
    @Import(name="affinityCookieTtlSec")
      private final @Nullable Output<Integer> affinityCookieTtlSec;

    public Output<Integer> affinityCookieTtlSec() {
        return this.affinityCookieTtlSec == null ? Codegen.empty() : this.affinityCookieTtlSec;
    }

    /**
     * The set of backends that serve this RegionBackendService.
     * Structure is documented below.
     * 
     */
    @Import(name="backends")
      private final @Nullable Output<List<RegionBackendServiceBackendArgs>> backends;

    public Output<List<RegionBackendServiceBackendArgs>> backends() {
        return this.backends == null ? Codegen.empty() : this.backends;
    }

    /**
     * Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<RegionBackendServiceCdnPolicyArgs> cdnPolicy;

    public Output<RegionBackendServiceCdnPolicyArgs> cdnPolicy() {
        return this.cdnPolicy == null ? Codegen.empty() : this.cdnPolicy;
    }

    /**
     * Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the `load_balancing_scheme` is set to INTERNAL_MANAGED
     * and the `protocol` is set to HTTP, HTTPS, or HTTP2.
     * Structure is documented below.
     * 
     */
    @Import(name="circuitBreakers")
      private final @Nullable Output<RegionBackendServiceCircuitBreakersArgs> circuitBreakers;

    public Output<RegionBackendServiceCircuitBreakersArgs> circuitBreakers() {
        return this.circuitBreakers == null ? Codegen.empty() : this.circuitBreakers;
    }

    /**
     * Time for which instance will be drained (not accept new
     * connections, but still work to finish started).
     * 
     */
    @Import(name="connectionDrainingTimeoutSec")
      private final @Nullable Output<Integer> connectionDrainingTimeoutSec;

    public Output<Integer> connectionDrainingTimeoutSec() {
        return this.connectionDrainingTimeoutSec == null ? Codegen.empty() : this.connectionDrainingTimeoutSec;
    }

    /**
     * Connection Tracking configuration for this BackendService.
     * This is available only for Layer 4 Internal Load Balancing and
     * Network Load Balancing.
     * Structure is documented below.
     * 
     */
    @Import(name="connectionTrackingPolicy")
      private final @Nullable Output<RegionBackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy;

    public Output<RegionBackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy() {
        return this.connectionTrackingPolicy == null ? Codegen.empty() : this.connectionTrackingPolicy;
    }

    /**
     * Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing.
     * This field only applies when all of the following are true -
     * 
     */
    @Import(name="consistentHash")
      private final @Nullable Output<RegionBackendServiceConsistentHashArgs> consistentHash;

    public Output<RegionBackendServiceConsistentHashArgs> consistentHash() {
        return this.consistentHash == null ? Codegen.empty() : this.consistentHash;
    }

    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If true, enable Cloud CDN for this RegionBackendService.
     * 
     */
    @Import(name="enableCdn")
      private final @Nullable Output<Boolean> enableCdn;

    public Output<Boolean> enableCdn() {
        return this.enableCdn == null ? Codegen.empty() : this.enableCdn;
    }

    /**
     * Policy for failovers.
     * Structure is documented below.
     * 
     */
    @Import(name="failoverPolicy")
      private final @Nullable Output<RegionBackendServiceFailoverPolicyArgs> failoverPolicy;

    public Output<RegionBackendServiceFailoverPolicyArgs> failoverPolicy() {
        return this.failoverPolicy == null ? Codegen.empty() : this.failoverPolicy;
    }

    /**
     * The set of URLs to HealthCheck resources for health checking
     * this RegionBackendService. Currently at most one health
     * check can be specified.
     * A health check must be specified unless the backend service uses an internet
     * or serverless NEG as a backend.
     * 
     */
    @Import(name="healthChecks")
      private final @Nullable Output<String> healthChecks;

    public Output<String> healthChecks() {
        return this.healthChecks == null ? Codegen.empty() : this.healthChecks;
    }

    /**
     * Settings for enabling Cloud Identity Aware Proxy
     * Structure is documented below.
     * 
     */
    @Import(name="iap")
      private final @Nullable Output<RegionBackendServiceIapArgs> iap;

    public Output<RegionBackendServiceIapArgs> iap() {
        return this.iap == null ? Codegen.empty() : this.iap;
    }

    /**
     * Indicates what kind of load balancing this regional backend service
     * will be used for. A backend service created for one type of load
     * balancing cannot be used with the other(s). For more information, refer to
     * [Choosing a load balancer](https://cloud.google.com/load-balancing/docs/backend-service).
     * Default value is `INTERNAL`.
     * Possible values are `EXTERNAL`, `EXTERNAL_MANAGED`, `INTERNAL`, and `INTERNAL_MANAGED`.
     * 
     */
    @Import(name="loadBalancingScheme")
      private final @Nullable Output<String> loadBalancingScheme;

    public Output<String> loadBalancingScheme() {
        return this.loadBalancingScheme == null ? Codegen.empty() : this.loadBalancingScheme;
    }

    /**
     * The load balancing algorithm used within the scope of the locality.
     * The possible values are:
     * * `ROUND_ROBIN`: This is a simple policy in which each healthy backend
     *   is selected in round robin order.
     * * `LEAST_REQUEST`: An O(1) algorithm which selects two random healthy
     *   hosts and picks the host which has fewer active requests.
     * * `RING_HASH`: The ring/modulo hash load balancer implements consistent
     *   hashing to backends. The algorithm has the property that the
     *   addition/removal of a host from a set of N hosts only affects
     *   1/N of the requests.
     * * `RANDOM`: The load balancer selects a random healthy host.
     * * `ORIGINAL_DESTINATION`: Backend host is selected based on the client
     *   connection metadata, i.e., connections are opened
     *   to the same address as the destination address of
     *   the incoming connection before the connection
     *   was redirected to the load balancer.
     * * `MAGLEV`: used as a drop in replacement for the ring hash load balancer.
     *   Maglev is not as stable as ring hash but has faster table lookup
     *   build times and host selection times. For more information about
     *   Maglev, refer to https://ai.google/research/pubs/pub44824
     * 
     */
    @Import(name="localityLbPolicy")
      private final @Nullable Output<String> localityLbPolicy;

    public Output<String> localityLbPolicy() {
        return this.localityLbPolicy == null ? Codegen.empty() : this.localityLbPolicy;
    }

    /**
     * This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<RegionBackendServiceLogConfigArgs> logConfig;

    public Output<RegionBackendServiceLogConfigArgs> logConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * Name of the cookie.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the network to which this backend service belongs.
     * This field can only be specified when the load balancing scheme is set to INTERNAL.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the `load_balancing_scheme` is set
     * to INTERNAL_MANAGED and the `protocol` is set to HTTP, HTTPS, or HTTP2.
     * Structure is documented below.
     * 
     */
    @Import(name="outlierDetection")
      private final @Nullable Output<RegionBackendServiceOutlierDetectionArgs> outlierDetection;

    public Output<RegionBackendServiceOutlierDetectionArgs> outlierDetection() {
        return this.outlierDetection == null ? Codegen.empty() : this.outlierDetection;
    }

    /**
     * A named port on a backend instance group representing the port for
     * communication to the backend VMs in that group. Required when the
     * loadBalancingScheme is EXTERNAL, EXTERNAL_MANAGED, INTERNAL_MANAGED, or INTERNAL_SELF_MANAGED
     * and the backends are instance groups. The named port must be defined on each
     * backend instance group. This parameter has no meaning if the backends are NEGs. API sets a
     * default of "http" if not given.
     * Must be omitted when the loadBalancingScheme is INTERNAL (Internal TCP/UDP Load Balancing).
     * 
     */
    @Import(name="portName")
      private final @Nullable Output<String> portName;

    public Output<String> portName() {
        return this.portName == null ? Codegen.empty() : this.portName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The protocol this RegionBackendService uses to communicate with backends.
     * The default is HTTP. **NOTE**: HTTP2 is only valid for beta HTTP/2 load balancer
     * types and may result in errors if used with the GA API.
     * Possible values are `HTTP`, `HTTPS`, `HTTP2`, `SSL`, `TCP`, `UDP`, `GRPC`, and `UNSPECIFIED`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * The Region in which the created backend service should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * Type of session affinity to use. The default is NONE. Session affinity is
     * not applicable if the protocol is UDP.
     * Possible values are `NONE`, `CLIENT_IP`, `CLIENT_IP_PORT_PROTO`, `CLIENT_IP_PROTO`, `GENERATED_COOKIE`, `HEADER_FIELD`, `HTTP_COOKIE`, and `CLIENT_IP_NO_DESTINATION`.
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<String> sessionAffinity;

    public Output<String> sessionAffinity() {
        return this.sessionAffinity == null ? Codegen.empty() : this.sessionAffinity;
    }

    /**
     * How many seconds to wait for the backend before considering it a
     * failed request. Default is 30 seconds. Valid range is [1, 86400].
     * 
     */
    @Import(name="timeoutSec")
      private final @Nullable Output<Integer> timeoutSec;

    public Output<Integer> timeoutSec() {
        return this.timeoutSec == null ? Codegen.empty() : this.timeoutSec;
    }

    public RegionBackendServiceArgs(
        @Nullable Output<Integer> affinityCookieTtlSec,
        @Nullable Output<List<RegionBackendServiceBackendArgs>> backends,
        @Nullable Output<RegionBackendServiceCdnPolicyArgs> cdnPolicy,
        @Nullable Output<RegionBackendServiceCircuitBreakersArgs> circuitBreakers,
        @Nullable Output<Integer> connectionDrainingTimeoutSec,
        @Nullable Output<RegionBackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy,
        @Nullable Output<RegionBackendServiceConsistentHashArgs> consistentHash,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableCdn,
        @Nullable Output<RegionBackendServiceFailoverPolicyArgs> failoverPolicy,
        @Nullable Output<String> healthChecks,
        @Nullable Output<RegionBackendServiceIapArgs> iap,
        @Nullable Output<String> loadBalancingScheme,
        @Nullable Output<String> localityLbPolicy,
        @Nullable Output<RegionBackendServiceLogConfigArgs> logConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<RegionBackendServiceOutlierDetectionArgs> outlierDetection,
        @Nullable Output<String> portName,
        @Nullable Output<String> project,
        @Nullable Output<String> protocol,
        @Nullable Output<String> region,
        @Nullable Output<String> sessionAffinity,
        @Nullable Output<Integer> timeoutSec) {
        this.affinityCookieTtlSec = affinityCookieTtlSec;
        this.backends = backends;
        this.cdnPolicy = cdnPolicy;
        this.circuitBreakers = circuitBreakers;
        this.connectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
        this.connectionTrackingPolicy = connectionTrackingPolicy;
        this.consistentHash = consistentHash;
        this.description = description;
        this.enableCdn = enableCdn;
        this.failoverPolicy = failoverPolicy;
        this.healthChecks = healthChecks;
        this.iap = iap;
        this.loadBalancingScheme = loadBalancingScheme;
        this.localityLbPolicy = localityLbPolicy;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.outlierDetection = outlierDetection;
        this.portName = portName;
        this.project = project;
        this.protocol = protocol;
        this.region = region;
        this.sessionAffinity = sessionAffinity;
        this.timeoutSec = timeoutSec;
    }

    private RegionBackendServiceArgs() {
        this.affinityCookieTtlSec = Codegen.empty();
        this.backends = Codegen.empty();
        this.cdnPolicy = Codegen.empty();
        this.circuitBreakers = Codegen.empty();
        this.connectionDrainingTimeoutSec = Codegen.empty();
        this.connectionTrackingPolicy = Codegen.empty();
        this.consistentHash = Codegen.empty();
        this.description = Codegen.empty();
        this.enableCdn = Codegen.empty();
        this.failoverPolicy = Codegen.empty();
        this.healthChecks = Codegen.empty();
        this.iap = Codegen.empty();
        this.loadBalancingScheme = Codegen.empty();
        this.localityLbPolicy = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.outlierDetection = Codegen.empty();
        this.portName = Codegen.empty();
        this.project = Codegen.empty();
        this.protocol = Codegen.empty();
        this.region = Codegen.empty();
        this.sessionAffinity = Codegen.empty();
        this.timeoutSec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> affinityCookieTtlSec;
        private @Nullable Output<List<RegionBackendServiceBackendArgs>> backends;
        private @Nullable Output<RegionBackendServiceCdnPolicyArgs> cdnPolicy;
        private @Nullable Output<RegionBackendServiceCircuitBreakersArgs> circuitBreakers;
        private @Nullable Output<Integer> connectionDrainingTimeoutSec;
        private @Nullable Output<RegionBackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy;
        private @Nullable Output<RegionBackendServiceConsistentHashArgs> consistentHash;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableCdn;
        private @Nullable Output<RegionBackendServiceFailoverPolicyArgs> failoverPolicy;
        private @Nullable Output<String> healthChecks;
        private @Nullable Output<RegionBackendServiceIapArgs> iap;
        private @Nullable Output<String> loadBalancingScheme;
        private @Nullable Output<String> localityLbPolicy;
        private @Nullable Output<RegionBackendServiceLogConfigArgs> logConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<RegionBackendServiceOutlierDetectionArgs> outlierDetection;
        private @Nullable Output<String> portName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> protocol;
        private @Nullable Output<String> region;
        private @Nullable Output<String> sessionAffinity;
        private @Nullable Output<Integer> timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieTtlSec = defaults.affinityCookieTtlSec;
    	      this.backends = defaults.backends;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.circuitBreakers = defaults.circuitBreakers;
    	      this.connectionDrainingTimeoutSec = defaults.connectionDrainingTimeoutSec;
    	      this.connectionTrackingPolicy = defaults.connectionTrackingPolicy;
    	      this.consistentHash = defaults.consistentHash;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.failoverPolicy = defaults.failoverPolicy;
    	      this.healthChecks = defaults.healthChecks;
    	      this.iap = defaults.iap;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.localityLbPolicy = defaults.localityLbPolicy;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.outlierDetection = defaults.outlierDetection;
    	      this.portName = defaults.portName;
    	      this.project = defaults.project;
    	      this.protocol = defaults.protocol;
    	      this.region = defaults.region;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder affinityCookieTtlSec(@Nullable Output<Integer> affinityCookieTtlSec) {
            this.affinityCookieTtlSec = affinityCookieTtlSec;
            return this;
        }
        public Builder affinityCookieTtlSec(@Nullable Integer affinityCookieTtlSec) {
            this.affinityCookieTtlSec = Codegen.ofNullable(affinityCookieTtlSec);
            return this;
        }
        public Builder backends(@Nullable Output<List<RegionBackendServiceBackendArgs>> backends) {
            this.backends = backends;
            return this;
        }
        public Builder backends(@Nullable List<RegionBackendServiceBackendArgs> backends) {
            this.backends = Codegen.ofNullable(backends);
            return this;
        }
        public Builder backends(RegionBackendServiceBackendArgs... backends) {
            return backends(List.of(backends));
        }
        public Builder cdnPolicy(@Nullable Output<RegionBackendServiceCdnPolicyArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }
        public Builder cdnPolicy(@Nullable RegionBackendServiceCdnPolicyArgs cdnPolicy) {
            this.cdnPolicy = Codegen.ofNullable(cdnPolicy);
            return this;
        }
        public Builder circuitBreakers(@Nullable Output<RegionBackendServiceCircuitBreakersArgs> circuitBreakers) {
            this.circuitBreakers = circuitBreakers;
            return this;
        }
        public Builder circuitBreakers(@Nullable RegionBackendServiceCircuitBreakersArgs circuitBreakers) {
            this.circuitBreakers = Codegen.ofNullable(circuitBreakers);
            return this;
        }
        public Builder connectionDrainingTimeoutSec(@Nullable Output<Integer> connectionDrainingTimeoutSec) {
            this.connectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
            return this;
        }
        public Builder connectionDrainingTimeoutSec(@Nullable Integer connectionDrainingTimeoutSec) {
            this.connectionDrainingTimeoutSec = Codegen.ofNullable(connectionDrainingTimeoutSec);
            return this;
        }
        public Builder connectionTrackingPolicy(@Nullable Output<RegionBackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy) {
            this.connectionTrackingPolicy = connectionTrackingPolicy;
            return this;
        }
        public Builder connectionTrackingPolicy(@Nullable RegionBackendServiceConnectionTrackingPolicyArgs connectionTrackingPolicy) {
            this.connectionTrackingPolicy = Codegen.ofNullable(connectionTrackingPolicy);
            return this;
        }
        public Builder consistentHash(@Nullable Output<RegionBackendServiceConsistentHashArgs> consistentHash) {
            this.consistentHash = consistentHash;
            return this;
        }
        public Builder consistentHash(@Nullable RegionBackendServiceConsistentHashArgs consistentHash) {
            this.consistentHash = Codegen.ofNullable(consistentHash);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enableCdn(@Nullable Output<Boolean> enableCdn) {
            this.enableCdn = enableCdn;
            return this;
        }
        public Builder enableCdn(@Nullable Boolean enableCdn) {
            this.enableCdn = Codegen.ofNullable(enableCdn);
            return this;
        }
        public Builder failoverPolicy(@Nullable Output<RegionBackendServiceFailoverPolicyArgs> failoverPolicy) {
            this.failoverPolicy = failoverPolicy;
            return this;
        }
        public Builder failoverPolicy(@Nullable RegionBackendServiceFailoverPolicyArgs failoverPolicy) {
            this.failoverPolicy = Codegen.ofNullable(failoverPolicy);
            return this;
        }
        public Builder healthChecks(@Nullable Output<String> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(@Nullable String healthChecks) {
            this.healthChecks = Codegen.ofNullable(healthChecks);
            return this;
        }
        public Builder iap(@Nullable Output<RegionBackendServiceIapArgs> iap) {
            this.iap = iap;
            return this;
        }
        public Builder iap(@Nullable RegionBackendServiceIapArgs iap) {
            this.iap = Codegen.ofNullable(iap);
            return this;
        }
        public Builder loadBalancingScheme(@Nullable Output<String> loadBalancingScheme) {
            this.loadBalancingScheme = loadBalancingScheme;
            return this;
        }
        public Builder loadBalancingScheme(@Nullable String loadBalancingScheme) {
            this.loadBalancingScheme = Codegen.ofNullable(loadBalancingScheme);
            return this;
        }
        public Builder localityLbPolicy(@Nullable Output<String> localityLbPolicy) {
            this.localityLbPolicy = localityLbPolicy;
            return this;
        }
        public Builder localityLbPolicy(@Nullable String localityLbPolicy) {
            this.localityLbPolicy = Codegen.ofNullable(localityLbPolicy);
            return this;
        }
        public Builder logConfig(@Nullable Output<RegionBackendServiceLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable RegionBackendServiceLogConfigArgs logConfig) {
            this.logConfig = Codegen.ofNullable(logConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder outlierDetection(@Nullable Output<RegionBackendServiceOutlierDetectionArgs> outlierDetection) {
            this.outlierDetection = outlierDetection;
            return this;
        }
        public Builder outlierDetection(@Nullable RegionBackendServiceOutlierDetectionArgs outlierDetection) {
            this.outlierDetection = Codegen.ofNullable(outlierDetection);
            return this;
        }
        public Builder portName(@Nullable Output<String> portName) {
            this.portName = portName;
            return this;
        }
        public Builder portName(@Nullable String portName) {
            this.portName = Codegen.ofNullable(portName);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder sessionAffinity(@Nullable Output<String> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable String sessionAffinity) {
            this.sessionAffinity = Codegen.ofNullable(sessionAffinity);
            return this;
        }
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Builder timeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Codegen.ofNullable(timeoutSec);
            return this;
        }        public RegionBackendServiceArgs build() {
            return new RegionBackendServiceArgs(affinityCookieTtlSec, backends, cdnPolicy, circuitBreakers, connectionDrainingTimeoutSec, connectionTrackingPolicy, consistentHash, description, enableCdn, failoverPolicy, healthChecks, iap, loadBalancingScheme, localityLbPolicy, logConfig, name, network, outlierDetection, portName, project, protocol, region, sessionAffinity, timeoutSec);
        }
    }
}
