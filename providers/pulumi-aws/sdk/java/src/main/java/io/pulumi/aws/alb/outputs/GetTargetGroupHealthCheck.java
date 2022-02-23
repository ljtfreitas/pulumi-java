// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTargetGroupHealthCheck {
    private final Boolean enabled;
    private final Integer healthyThreshold;
    private final Integer interval;
    private final String matcher;
    private final String path;
    private final String port;
    private final String protocol;
    private final Integer timeout;
    private final Integer unhealthyThreshold;

    @OutputCustomType.Constructor({"enabled","healthyThreshold","interval","matcher","path","port","protocol","timeout","unhealthyThreshold"})
    private GetTargetGroupHealthCheck(
        Boolean enabled,
        Integer healthyThreshold,
        Integer interval,
        String matcher,
        String path,
        String port,
        String protocol,
        Integer timeout,
        Integer unhealthyThreshold) {
        this.enabled = Objects.requireNonNull(enabled);
        this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
        this.interval = Objects.requireNonNull(interval);
        this.matcher = Objects.requireNonNull(matcher);
        this.path = Objects.requireNonNull(path);
        this.port = Objects.requireNonNull(port);
        this.protocol = Objects.requireNonNull(protocol);
        this.timeout = Objects.requireNonNull(timeout);
        this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
    }

    public Boolean getEnabled() {
        return this.enabled;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    public Integer getInterval() {
        return this.interval;
    }
    public String getMatcher() {
        return this.matcher;
    }
    public String getPath() {
        return this.path;
    }
    public String getPort() {
        return this.port;
    }
    public String getProtocol() {
        return this.protocol;
    }
    public Integer getTimeout() {
        return this.timeout;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetGroupHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private Integer healthyThreshold;
        private Integer interval;
        private String matcher;
        private String path;
        private String port;
        private String protocol;
        private Integer timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetGroupHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.matcher = defaults.matcher;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setHealthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }

        public Builder setMatcher(String matcher) {
            this.matcher = Objects.requireNonNull(matcher);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setPort(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setTimeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setUnhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }
        public GetTargetGroupHealthCheck build() {
            return new GetTargetGroupHealthCheck(enabled, healthyThreshold, interval, matcher, path, port, protocol, timeout, unhealthyThreshold);
        }
    }
}
