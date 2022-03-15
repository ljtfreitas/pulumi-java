// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionCustomOriginConfig {
    private final @Nullable Integer hTTPPort;
    private final @Nullable Integer hTTPSPort;
    private final @Nullable Integer originKeepaliveTimeout;
    private final String originProtocolPolicy;
    private final @Nullable Integer originReadTimeout;
    private final @Nullable List<String> originSSLProtocols;

    @CustomType.Constructor
    private DistributionCustomOriginConfig(
        @CustomType.Parameter("hTTPPort") @Nullable Integer hTTPPort,
        @CustomType.Parameter("hTTPSPort") @Nullable Integer hTTPSPort,
        @CustomType.Parameter("originKeepaliveTimeout") @Nullable Integer originKeepaliveTimeout,
        @CustomType.Parameter("originProtocolPolicy") String originProtocolPolicy,
        @CustomType.Parameter("originReadTimeout") @Nullable Integer originReadTimeout,
        @CustomType.Parameter("originSSLProtocols") @Nullable List<String> originSSLProtocols) {
        this.hTTPPort = hTTPPort;
        this.hTTPSPort = hTTPSPort;
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        this.originProtocolPolicy = originProtocolPolicy;
        this.originReadTimeout = originReadTimeout;
        this.originSSLProtocols = originSSLProtocols;
    }

    public Optional<Integer> getHTTPPort() {
        return Optional.ofNullable(this.hTTPPort);
    }
    public Optional<Integer> getHTTPSPort() {
        return Optional.ofNullable(this.hTTPSPort);
    }
    public Optional<Integer> getOriginKeepaliveTimeout() {
        return Optional.ofNullable(this.originKeepaliveTimeout);
    }
    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }
    public Optional<Integer> getOriginReadTimeout() {
        return Optional.ofNullable(this.originReadTimeout);
    }
    public List<String> getOriginSSLProtocols() {
        return this.originSSLProtocols == null ? List.of() : this.originSSLProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCustomOriginConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer hTTPPort;
        private @Nullable Integer hTTPSPort;
        private @Nullable Integer originKeepaliveTimeout;
        private String originProtocolPolicy;
        private @Nullable Integer originReadTimeout;
        private @Nullable List<String> originSSLProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCustomOriginConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hTTPPort = defaults.hTTPPort;
    	      this.hTTPSPort = defaults.hTTPSPort;
    	      this.originKeepaliveTimeout = defaults.originKeepaliveTimeout;
    	      this.originProtocolPolicy = defaults.originProtocolPolicy;
    	      this.originReadTimeout = defaults.originReadTimeout;
    	      this.originSSLProtocols = defaults.originSSLProtocols;
        }

        public Builder hTTPPort(@Nullable Integer hTTPPort) {
            this.hTTPPort = hTTPPort;
            return this;
        }

        public Builder hTTPSPort(@Nullable Integer hTTPSPort) {
            this.hTTPSPort = hTTPSPort;
            return this;
        }

        public Builder originKeepaliveTimeout(@Nullable Integer originKeepaliveTimeout) {
            this.originKeepaliveTimeout = originKeepaliveTimeout;
            return this;
        }

        public Builder originProtocolPolicy(String originProtocolPolicy) {
            this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy);
            return this;
        }

        public Builder originReadTimeout(@Nullable Integer originReadTimeout) {
            this.originReadTimeout = originReadTimeout;
            return this;
        }

        public Builder originSSLProtocols(@Nullable List<String> originSSLProtocols) {
            this.originSSLProtocols = originSSLProtocols;
            return this;
        }
        public DistributionCustomOriginConfig build() {
            return new DistributionCustomOriginConfig(hTTPPort, hTTPSPort, originKeepaliveTimeout, originProtocolPolicy, originReadTimeout, originSSLProtocols);
        }
    }
}
