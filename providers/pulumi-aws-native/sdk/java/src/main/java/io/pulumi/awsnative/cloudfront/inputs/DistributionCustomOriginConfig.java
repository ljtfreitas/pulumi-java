// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionCustomOriginConfig extends io.pulumi.resources.InvokeArgs {

    public static final DistributionCustomOriginConfig Empty = new DistributionCustomOriginConfig();

    @Import(name="hTTPPort")
      private final @Nullable Integer hTTPPort;

    public Optional<Integer> getHTTPPort() {
        return this.hTTPPort == null ? Optional.empty() : Optional.ofNullable(this.hTTPPort);
    }

    @Import(name="hTTPSPort")
      private final @Nullable Integer hTTPSPort;

    public Optional<Integer> getHTTPSPort() {
        return this.hTTPSPort == null ? Optional.empty() : Optional.ofNullable(this.hTTPSPort);
    }

    @Import(name="originKeepaliveTimeout")
      private final @Nullable Integer originKeepaliveTimeout;

    public Optional<Integer> getOriginKeepaliveTimeout() {
        return this.originKeepaliveTimeout == null ? Optional.empty() : Optional.ofNullable(this.originKeepaliveTimeout);
    }

    @Import(name="originProtocolPolicy", required=true)
      private final String originProtocolPolicy;

    public String getOriginProtocolPolicy() {
        return this.originProtocolPolicy;
    }

    @Import(name="originReadTimeout")
      private final @Nullable Integer originReadTimeout;

    public Optional<Integer> getOriginReadTimeout() {
        return this.originReadTimeout == null ? Optional.empty() : Optional.ofNullable(this.originReadTimeout);
    }

    @Import(name="originSSLProtocols")
      private final @Nullable List<String> originSSLProtocols;

    public List<String> getOriginSSLProtocols() {
        return this.originSSLProtocols == null ? List.of() : this.originSSLProtocols;
    }

    public DistributionCustomOriginConfig(
        @Nullable Integer hTTPPort,
        @Nullable Integer hTTPSPort,
        @Nullable Integer originKeepaliveTimeout,
        String originProtocolPolicy,
        @Nullable Integer originReadTimeout,
        @Nullable List<String> originSSLProtocols) {
        this.hTTPPort = hTTPPort;
        this.hTTPSPort = hTTPSPort;
        this.originKeepaliveTimeout = originKeepaliveTimeout;
        this.originProtocolPolicy = Objects.requireNonNull(originProtocolPolicy, "expected parameter 'originProtocolPolicy' to be non-null");
        this.originReadTimeout = originReadTimeout;
        this.originSSLProtocols = originSSLProtocols;
    }

    private DistributionCustomOriginConfig() {
        this.hTTPPort = null;
        this.hTTPSPort = null;
        this.originKeepaliveTimeout = null;
        this.originProtocolPolicy = null;
        this.originReadTimeout = null;
        this.originSSLProtocols = List.of();
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
