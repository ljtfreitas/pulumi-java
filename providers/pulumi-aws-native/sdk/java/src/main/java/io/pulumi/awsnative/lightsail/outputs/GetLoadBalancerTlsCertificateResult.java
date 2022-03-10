// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLoadBalancerTlsCertificateResult {
    /**
     * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * 
     */
    private final @Nullable Boolean isAttached;
    private final @Nullable String loadBalancerTlsCertificateArn;
    /**
     * The validation status of the SSL/TLS certificate.
     * 
     */
    private final @Nullable String status;

    @OutputCustomType.Constructor
    private GetLoadBalancerTlsCertificateResult(
        @OutputCustomType.Parameter("isAttached") @Nullable Boolean isAttached,
        @OutputCustomType.Parameter("loadBalancerTlsCertificateArn") @Nullable String loadBalancerTlsCertificateArn,
        @OutputCustomType.Parameter("status") @Nullable String status) {
        this.isAttached = isAttached;
        this.loadBalancerTlsCertificateArn = loadBalancerTlsCertificateArn;
        this.status = status;
    }

    /**
     * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
     * 
    */
    public Optional<Boolean> getIsAttached() {
        return Optional.ofNullable(this.isAttached);
    }
    public Optional<String> getLoadBalancerTlsCertificateArn() {
        return Optional.ofNullable(this.loadBalancerTlsCertificateArn);
    }
    /**
     * The validation status of the SSL/TLS certificate.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerTlsCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isAttached;
        private @Nullable String loadBalancerTlsCertificateArn;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerTlsCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isAttached = defaults.isAttached;
    	      this.loadBalancerTlsCertificateArn = defaults.loadBalancerTlsCertificateArn;
    	      this.status = defaults.status;
        }

        public Builder setIsAttached(@Nullable Boolean isAttached) {
            this.isAttached = isAttached;
            return this;
        }

        public Builder setLoadBalancerTlsCertificateArn(@Nullable String loadBalancerTlsCertificateArn) {
            this.loadBalancerTlsCertificateArn = loadBalancerTlsCertificateArn;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public GetLoadBalancerTlsCertificateResult build() {
            return new GetLoadBalancerTlsCertificateResult(isAttached, loadBalancerTlsCertificateArn, status);
        }
    }
}
