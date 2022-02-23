// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.RegionHealthCheckType;
import io.pulumi.googlenative.compute_alpha.inputs.GRPCHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HTTP2HealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HTTPHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HTTPSHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HealthCheckLogConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SSLHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.TCPHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.UDPHealthCheckArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckArgs Empty = new RegionHealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @InputImport(name="checkIntervalSec")
      private final @Nullable Input<Integer> checkIntervalSec;

    public Input<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec == null ? Input.empty() : this.checkIntervalSec;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="grpcHealthCheck")
      private final @Nullable Input<GRPCHealthCheckArgs> grpcHealthCheck;

    public Input<GRPCHealthCheckArgs> getGrpcHealthCheck() {
        return this.grpcHealthCheck == null ? Input.empty() : this.grpcHealthCheck;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @InputImport(name="healthyThreshold")
      private final @Nullable Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Input.empty() : this.healthyThreshold;
    }

    @InputImport(name="http2HealthCheck")
      private final @Nullable Input<HTTP2HealthCheckArgs> http2HealthCheck;

    public Input<HTTP2HealthCheckArgs> getHttp2HealthCheck() {
        return this.http2HealthCheck == null ? Input.empty() : this.http2HealthCheck;
    }

    @InputImport(name="httpHealthCheck")
      private final @Nullable Input<HTTPHealthCheckArgs> httpHealthCheck;

    public Input<HTTPHealthCheckArgs> getHttpHealthCheck() {
        return this.httpHealthCheck == null ? Input.empty() : this.httpHealthCheck;
    }

    @InputImport(name="httpsHealthCheck")
      private final @Nullable Input<HTTPSHealthCheckArgs> httpsHealthCheck;

    public Input<HTTPSHealthCheckArgs> getHttpsHealthCheck() {
        return this.httpsHealthCheck == null ? Input.empty() : this.httpsHealthCheck;
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Configure logging on this health check.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<HealthCheckLogConfigArgs> logConfig;

    public Input<HealthCheckLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    @InputImport(name="sslHealthCheck")
      private final @Nullable Input<SSLHealthCheckArgs> sslHealthCheck;

    public Input<SSLHealthCheckArgs> getSslHealthCheck() {
        return this.sslHealthCheck == null ? Input.empty() : this.sslHealthCheck;
    }

    @InputImport(name="tcpHealthCheck")
      private final @Nullable Input<TCPHealthCheckArgs> tcpHealthCheck;

    public Input<TCPHealthCheckArgs> getTcpHealthCheck() {
        return this.tcpHealthCheck == null ? Input.empty() : this.tcpHealthCheck;
    }

    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @InputImport(name="timeoutSec")
      private final @Nullable Input<Integer> timeoutSec;

    public Input<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Input.empty() : this.timeoutSec;
    }

    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<RegionHealthCheckType> type;

    public Input<RegionHealthCheckType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="udpHealthCheck")
      private final @Nullable Input<UDPHealthCheckArgs> udpHealthCheck;

    public Input<UDPHealthCheckArgs> getUdpHealthCheck() {
        return this.udpHealthCheck == null ? Input.empty() : this.udpHealthCheck;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @InputImport(name="unhealthyThreshold")
      private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public RegionHealthCheckArgs(
        @Nullable Input<Integer> checkIntervalSec,
        @Nullable Input<String> description,
        @Nullable Input<GRPCHealthCheckArgs> grpcHealthCheck,
        @Nullable Input<Integer> healthyThreshold,
        @Nullable Input<HTTP2HealthCheckArgs> http2HealthCheck,
        @Nullable Input<HTTPHealthCheckArgs> httpHealthCheck,
        @Nullable Input<HTTPSHealthCheckArgs> httpsHealthCheck,
        @Nullable Input<String> kind,
        @Nullable Input<HealthCheckLogConfigArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<SSLHealthCheckArgs> sslHealthCheck,
        @Nullable Input<TCPHealthCheckArgs> tcpHealthCheck,
        @Nullable Input<Integer> timeoutSec,
        @Nullable Input<RegionHealthCheckType> type,
        @Nullable Input<UDPHealthCheckArgs> udpHealthCheck,
        @Nullable Input<Integer> unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.description = description;
        this.grpcHealthCheck = grpcHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.http2HealthCheck = http2HealthCheck;
        this.httpHealthCheck = httpHealthCheck;
        this.httpsHealthCheck = httpsHealthCheck;
        this.kind = kind;
        this.logConfig = logConfig;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.sslHealthCheck = sslHealthCheck;
        this.tcpHealthCheck = tcpHealthCheck;
        this.timeoutSec = timeoutSec;
        this.type = type;
        this.udpHealthCheck = udpHealthCheck;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private RegionHealthCheckArgs() {
        this.checkIntervalSec = Input.empty();
        this.description = Input.empty();
        this.grpcHealthCheck = Input.empty();
        this.healthyThreshold = Input.empty();
        this.http2HealthCheck = Input.empty();
        this.httpHealthCheck = Input.empty();
        this.httpsHealthCheck = Input.empty();
        this.kind = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.sslHealthCheck = Input.empty();
        this.tcpHealthCheck = Input.empty();
        this.timeoutSec = Input.empty();
        this.type = Input.empty();
        this.udpHealthCheck = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> checkIntervalSec;
        private @Nullable Input<String> description;
        private @Nullable Input<GRPCHealthCheckArgs> grpcHealthCheck;
        private @Nullable Input<Integer> healthyThreshold;
        private @Nullable Input<HTTP2HealthCheckArgs> http2HealthCheck;
        private @Nullable Input<HTTPHealthCheckArgs> httpHealthCheck;
        private @Nullable Input<HTTPSHealthCheckArgs> httpsHealthCheck;
        private @Nullable Input<String> kind;
        private @Nullable Input<HealthCheckLogConfigArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<SSLHealthCheckArgs> sslHealthCheck;
        private @Nullable Input<TCPHealthCheckArgs> tcpHealthCheck;
        private @Nullable Input<Integer> timeoutSec;
        private @Nullable Input<RegionHealthCheckType> type;
        private @Nullable Input<UDPHealthCheckArgs> udpHealthCheck;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.description = defaults.description;
    	      this.grpcHealthCheck = defaults.grpcHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.http2HealthCheck = defaults.http2HealthCheck;
    	      this.httpHealthCheck = defaults.httpHealthCheck;
    	      this.httpsHealthCheck = defaults.httpsHealthCheck;
    	      this.kind = defaults.kind;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.sslHealthCheck = defaults.sslHealthCheck;
    	      this.tcpHealthCheck = defaults.tcpHealthCheck;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.type = defaults.type;
    	      this.udpHealthCheck = defaults.udpHealthCheck;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setCheckIntervalSec(@Nullable Input<Integer> checkIntervalSec) {
            this.checkIntervalSec = checkIntervalSec;
            return this;
        }

        public Builder setCheckIntervalSec(@Nullable Integer checkIntervalSec) {
            this.checkIntervalSec = Input.ofNullable(checkIntervalSec);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setGrpcHealthCheck(@Nullable Input<GRPCHealthCheckArgs> grpcHealthCheck) {
            this.grpcHealthCheck = grpcHealthCheck;
            return this;
        }

        public Builder setGrpcHealthCheck(@Nullable GRPCHealthCheckArgs grpcHealthCheck) {
            this.grpcHealthCheck = Input.ofNullable(grpcHealthCheck);
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Input<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        public Builder setHealthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Input.ofNullable(healthyThreshold);
            return this;
        }

        public Builder setHttp2HealthCheck(@Nullable Input<HTTP2HealthCheckArgs> http2HealthCheck) {
            this.http2HealthCheck = http2HealthCheck;
            return this;
        }

        public Builder setHttp2HealthCheck(@Nullable HTTP2HealthCheckArgs http2HealthCheck) {
            this.http2HealthCheck = Input.ofNullable(http2HealthCheck);
            return this;
        }

        public Builder setHttpHealthCheck(@Nullable Input<HTTPHealthCheckArgs> httpHealthCheck) {
            this.httpHealthCheck = httpHealthCheck;
            return this;
        }

        public Builder setHttpHealthCheck(@Nullable HTTPHealthCheckArgs httpHealthCheck) {
            this.httpHealthCheck = Input.ofNullable(httpHealthCheck);
            return this;
        }

        public Builder setHttpsHealthCheck(@Nullable Input<HTTPSHealthCheckArgs> httpsHealthCheck) {
            this.httpsHealthCheck = httpsHealthCheck;
            return this;
        }

        public Builder setHttpsHealthCheck(@Nullable HTTPSHealthCheckArgs httpsHealthCheck) {
            this.httpsHealthCheck = Input.ofNullable(httpsHealthCheck);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<HealthCheckLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable HealthCheckLogConfigArgs logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setSslHealthCheck(@Nullable Input<SSLHealthCheckArgs> sslHealthCheck) {
            this.sslHealthCheck = sslHealthCheck;
            return this;
        }

        public Builder setSslHealthCheck(@Nullable SSLHealthCheckArgs sslHealthCheck) {
            this.sslHealthCheck = Input.ofNullable(sslHealthCheck);
            return this;
        }

        public Builder setTcpHealthCheck(@Nullable Input<TCPHealthCheckArgs> tcpHealthCheck) {
            this.tcpHealthCheck = tcpHealthCheck;
            return this;
        }

        public Builder setTcpHealthCheck(@Nullable TCPHealthCheckArgs tcpHealthCheck) {
            this.tcpHealthCheck = Input.ofNullable(tcpHealthCheck);
            return this;
        }

        public Builder setTimeoutSec(@Nullable Input<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }

        public Builder setTimeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Input.ofNullable(timeoutSec);
            return this;
        }

        public Builder setType(@Nullable Input<RegionHealthCheckType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable RegionHealthCheckType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUdpHealthCheck(@Nullable Input<UDPHealthCheckArgs> udpHealthCheck) {
            this.udpHealthCheck = udpHealthCheck;
            return this;
        }

        public Builder setUdpHealthCheck(@Nullable UDPHealthCheckArgs udpHealthCheck) {
            this.udpHealthCheck = Input.ofNullable(udpHealthCheck);
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.ofNullable(unhealthyThreshold);
            return this;
        }
        public RegionHealthCheckArgs build() {
            return new RegionHealthCheckArgs(checkIntervalSec, description, grpcHealthCheck, healthyThreshold, http2HealthCheck, httpHealthCheck, httpsHealthCheck, kind, logConfig, name, project, region, requestId, sslHealthCheck, tcpHealthCheck, timeoutSec, type, udpHealthCheck, unhealthyThreshold);
        }
    }
}
