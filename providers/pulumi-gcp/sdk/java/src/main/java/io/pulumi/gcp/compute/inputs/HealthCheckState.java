// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.HealthCheckGrpcHealthCheckGetArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckHttp2HealthCheckGetArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckHttpHealthCheckGetArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckHttpsHealthCheckGetArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckLogConfigGetArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckSslHealthCheckGetArgs;
import io.pulumi.gcp.compute.inputs.HealthCheckTcpHealthCheckGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckState extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckState Empty = new HealthCheckState();

    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    @InputImport(name="checkIntervalSec")
        private final @Nullable Input<Integer> checkIntervalSec;

    public Input<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec == null ? Input.empty() : this.checkIntervalSec;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
        private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="grpcHealthCheck")
        private final @Nullable Input<HealthCheckGrpcHealthCheckGetArgs> grpcHealthCheck;

    public Input<HealthCheckGrpcHealthCheckGetArgs> getGrpcHealthCheck() {
        return this.grpcHealthCheck == null ? Input.empty() : this.grpcHealthCheck;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    @InputImport(name="healthyThreshold")
        private final @Nullable Input<Integer> healthyThreshold;

    public Input<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Input.empty() : this.healthyThreshold;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="http2HealthCheck")
        private final @Nullable Input<HealthCheckHttp2HealthCheckGetArgs> http2HealthCheck;

    public Input<HealthCheckHttp2HealthCheckGetArgs> getHttp2HealthCheck() {
        return this.http2HealthCheck == null ? Input.empty() : this.http2HealthCheck;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpHealthCheck")
        private final @Nullable Input<HealthCheckHttpHealthCheckGetArgs> httpHealthCheck;

    public Input<HealthCheckHttpHealthCheckGetArgs> getHttpHealthCheck() {
        return this.httpHealthCheck == null ? Input.empty() : this.httpHealthCheck;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="httpsHealthCheck")
        private final @Nullable Input<HealthCheckHttpsHealthCheckGetArgs> httpsHealthCheck;

    public Input<HealthCheckHttpsHealthCheckGetArgs> getHttpsHealthCheck() {
        return this.httpsHealthCheck == null ? Input.empty() : this.httpsHealthCheck;
    }

    /**
     * Configure logging on this health check.
     * Structure is documented below.
     * 
     */
    @InputImport(name="logConfig")
        private final @Nullable Input<HealthCheckLogConfigGetArgs> logConfig;

    public Input<HealthCheckLogConfigGetArgs> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
        private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="sslHealthCheck")
        private final @Nullable Input<HealthCheckSslHealthCheckGetArgs> sslHealthCheck;

    public Input<HealthCheckSslHealthCheckGetArgs> getSslHealthCheck() {
        return this.sslHealthCheck == null ? Input.empty() : this.sslHealthCheck;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="tcpHealthCheck")
        private final @Nullable Input<HealthCheckTcpHealthCheckGetArgs> tcpHealthCheck;

    public Input<HealthCheckTcpHealthCheckGetArgs> getTcpHealthCheck() {
        return this.tcpHealthCheck == null ? Input.empty() : this.tcpHealthCheck;
    }

    /**
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    @InputImport(name="timeoutSec")
        private final @Nullable Input<Integer> timeoutSec;

    public Input<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Input.empty() : this.timeoutSec;
    }

    /**
     * The type of the health check. One of HTTP, HTTPS, TCP, or SSL.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    @InputImport(name="unhealthyThreshold")
        private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public HealthCheckState(
        @Nullable Input<Integer> checkIntervalSec,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<HealthCheckGrpcHealthCheckGetArgs> grpcHealthCheck,
        @Nullable Input<Integer> healthyThreshold,
        @Nullable Input<HealthCheckHttp2HealthCheckGetArgs> http2HealthCheck,
        @Nullable Input<HealthCheckHttpHealthCheckGetArgs> httpHealthCheck,
        @Nullable Input<HealthCheckHttpsHealthCheckGetArgs> httpsHealthCheck,
        @Nullable Input<HealthCheckLogConfigGetArgs> logConfig,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> selfLink,
        @Nullable Input<HealthCheckSslHealthCheckGetArgs> sslHealthCheck,
        @Nullable Input<HealthCheckTcpHealthCheckGetArgs> tcpHealthCheck,
        @Nullable Input<Integer> timeoutSec,
        @Nullable Input<String> type,
        @Nullable Input<Integer> unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.grpcHealthCheck = grpcHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.http2HealthCheck = http2HealthCheck;
        this.httpHealthCheck = httpHealthCheck;
        this.httpsHealthCheck = httpsHealthCheck;
        this.logConfig = logConfig;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.sslHealthCheck = sslHealthCheck;
        this.tcpHealthCheck = tcpHealthCheck;
        this.timeoutSec = timeoutSec;
        this.type = type;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private HealthCheckState() {
        this.checkIntervalSec = Input.empty();
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.grpcHealthCheck = Input.empty();
        this.healthyThreshold = Input.empty();
        this.http2HealthCheck = Input.empty();
        this.httpHealthCheck = Input.empty();
        this.httpsHealthCheck = Input.empty();
        this.logConfig = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.selfLink = Input.empty();
        this.sslHealthCheck = Input.empty();
        this.tcpHealthCheck = Input.empty();
        this.timeoutSec = Input.empty();
        this.type = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> checkIntervalSec;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<HealthCheckGrpcHealthCheckGetArgs> grpcHealthCheck;
        private @Nullable Input<Integer> healthyThreshold;
        private @Nullable Input<HealthCheckHttp2HealthCheckGetArgs> http2HealthCheck;
        private @Nullable Input<HealthCheckHttpHealthCheckGetArgs> httpHealthCheck;
        private @Nullable Input<HealthCheckHttpsHealthCheckGetArgs> httpsHealthCheck;
        private @Nullable Input<HealthCheckLogConfigGetArgs> logConfig;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<HealthCheckSslHealthCheckGetArgs> sslHealthCheck;
        private @Nullable Input<HealthCheckTcpHealthCheckGetArgs> tcpHealthCheck;
        private @Nullable Input<Integer> timeoutSec;
        private @Nullable Input<String> type;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.grpcHealthCheck = defaults.grpcHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.http2HealthCheck = defaults.http2HealthCheck;
    	      this.httpHealthCheck = defaults.httpHealthCheck;
    	      this.httpsHealthCheck = defaults.httpsHealthCheck;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.sslHealthCheck = defaults.sslHealthCheck;
    	      this.tcpHealthCheck = defaults.tcpHealthCheck;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.type = defaults.type;
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

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
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

        public Builder setGrpcHealthCheck(@Nullable Input<HealthCheckGrpcHealthCheckGetArgs> grpcHealthCheck) {
            this.grpcHealthCheck = grpcHealthCheck;
            return this;
        }

        public Builder setGrpcHealthCheck(@Nullable HealthCheckGrpcHealthCheckGetArgs grpcHealthCheck) {
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

        public Builder setHttp2HealthCheck(@Nullable Input<HealthCheckHttp2HealthCheckGetArgs> http2HealthCheck) {
            this.http2HealthCheck = http2HealthCheck;
            return this;
        }

        public Builder setHttp2HealthCheck(@Nullable HealthCheckHttp2HealthCheckGetArgs http2HealthCheck) {
            this.http2HealthCheck = Input.ofNullable(http2HealthCheck);
            return this;
        }

        public Builder setHttpHealthCheck(@Nullable Input<HealthCheckHttpHealthCheckGetArgs> httpHealthCheck) {
            this.httpHealthCheck = httpHealthCheck;
            return this;
        }

        public Builder setHttpHealthCheck(@Nullable HealthCheckHttpHealthCheckGetArgs httpHealthCheck) {
            this.httpHealthCheck = Input.ofNullable(httpHealthCheck);
            return this;
        }

        public Builder setHttpsHealthCheck(@Nullable Input<HealthCheckHttpsHealthCheckGetArgs> httpsHealthCheck) {
            this.httpsHealthCheck = httpsHealthCheck;
            return this;
        }

        public Builder setHttpsHealthCheck(@Nullable HealthCheckHttpsHealthCheckGetArgs httpsHealthCheck) {
            this.httpsHealthCheck = Input.ofNullable(httpsHealthCheck);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<HealthCheckLogConfigGetArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable HealthCheckLogConfigGetArgs logConfig) {
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

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSslHealthCheck(@Nullable Input<HealthCheckSslHealthCheckGetArgs> sslHealthCheck) {
            this.sslHealthCheck = sslHealthCheck;
            return this;
        }

        public Builder setSslHealthCheck(@Nullable HealthCheckSslHealthCheckGetArgs sslHealthCheck) {
            this.sslHealthCheck = Input.ofNullable(sslHealthCheck);
            return this;
        }

        public Builder setTcpHealthCheck(@Nullable Input<HealthCheckTcpHealthCheckGetArgs> tcpHealthCheck) {
            this.tcpHealthCheck = tcpHealthCheck;
            return this;
        }

        public Builder setTcpHealthCheck(@Nullable HealthCheckTcpHealthCheckGetArgs tcpHealthCheck) {
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

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
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
        public HealthCheckState build() {
            return new HealthCheckState(checkIntervalSec, creationTimestamp, description, grpcHealthCheck, healthyThreshold, http2HealthCheck, httpHealthCheck, httpsHealthCheck, logConfig, name, project, selfLink, sslHealthCheck, tcpHealthCheck, timeoutSec, type, unhealthyThreshold);
        }
    }
}
