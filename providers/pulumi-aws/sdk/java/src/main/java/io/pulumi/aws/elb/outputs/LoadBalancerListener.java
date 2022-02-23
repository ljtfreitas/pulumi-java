// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerListener {
    /**
     * The port on the instance to route to
     * 
     */
    private final Integer instancePort;
    /**
     * The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
     */
    private final String instanceProtocol;
    /**
     * The port to listen on for the load balancer
     * 
     */
    private final Integer lbPort;
    /**
     * The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
     */
    private final String lbProtocol;
    /**
     * The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
     */
    private final @Nullable String sslCertificateId;

    @OutputCustomType.Constructor({"instancePort","instanceProtocol","lbPort","lbProtocol","sslCertificateId"})
    private LoadBalancerListener(
        Integer instancePort,
        String instanceProtocol,
        Integer lbPort,
        String lbProtocol,
        @Nullable String sslCertificateId) {
        this.instancePort = Objects.requireNonNull(instancePort);
        this.instanceProtocol = Objects.requireNonNull(instanceProtocol);
        this.lbPort = Objects.requireNonNull(lbPort);
        this.lbProtocol = Objects.requireNonNull(lbProtocol);
        this.sslCertificateId = sslCertificateId;
    }

    /**
     * The port on the instance to route to
     * 
     */
    public Integer getInstancePort() {
        return this.instancePort;
    }
    /**
     * The protocol to use to the instance. Valid
     * values are `HTTP`, `HTTPS`, `TCP`, or `SSL`
     * 
     */
    public String getInstanceProtocol() {
        return this.instanceProtocol;
    }
    /**
     * The port to listen on for the load balancer
     * 
     */
    public Integer getLbPort() {
        return this.lbPort;
    }
    /**
     * The protocol to listen on. Valid values are `HTTP`,
     * `HTTPS`, `TCP`, or `SSL`
     * 
     */
    public String getLbProtocol() {
        return this.lbProtocol;
    }
    /**
     * The ARN of an SSL certificate you have
     * uploaded to AWS IAM. **Note ECDSA-specific restrictions below.  Only valid when `lb_protocol` is either HTTPS or SSL**
     * 
     */
    public Optional<String> getSslCertificateId() {
        return Optional.ofNullable(this.sslCertificateId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerListener defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer instancePort;
        private String instanceProtocol;
        private Integer lbPort;
        private String lbProtocol;
        private @Nullable String sslCertificateId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerListener defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.instanceProtocol = defaults.instanceProtocol;
    	      this.lbPort = defaults.lbPort;
    	      this.lbProtocol = defaults.lbProtocol;
    	      this.sslCertificateId = defaults.sslCertificateId;
        }

        public Builder setInstancePort(Integer instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }

        public Builder setInstanceProtocol(String instanceProtocol) {
            this.instanceProtocol = Objects.requireNonNull(instanceProtocol);
            return this;
        }

        public Builder setLbPort(Integer lbPort) {
            this.lbPort = Objects.requireNonNull(lbPort);
            return this;
        }

        public Builder setLbProtocol(String lbProtocol) {
            this.lbProtocol = Objects.requireNonNull(lbProtocol);
            return this;
        }

        public Builder setSslCertificateId(@Nullable String sslCertificateId) {
            this.sslCertificateId = sslCertificateId;
            return this;
        }
        public LoadBalancerListener build() {
            return new LoadBalancerListener(instancePort, instanceProtocol, lbPort, lbProtocol, sslCertificateId);
        }
    }
}
