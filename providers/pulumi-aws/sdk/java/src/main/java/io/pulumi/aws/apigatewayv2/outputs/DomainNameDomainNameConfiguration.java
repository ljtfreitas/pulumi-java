// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainNameDomainNameConfiguration {
    /**
     * The ARN of an AWS-managed certificate that will be used by the endpoint for the domain name. AWS Certificate Manager is the only supported source.
     * Use the `aws.acm.Certificate` resource to configure an ACM certificate.
     * 
     */
    private final String certificateArn;
    /**
     * The endpoint type. Valid values: `REGIONAL`.
     * 
     */
    private final String endpointType;
    /**
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * 
     */
    private final @Nullable String hostedZoneId;
    /**
     * The Transport Layer Security (TLS) version of the [security policy](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-custom-domain-tls-version.html) for the domain name. Valid values: `TLS_1_2`.
     * 
     */
    private final String securityPolicy;
    /**
     * The target domain name.
     * 
     */
    private final @Nullable String targetDomainName;

    @OutputCustomType.Constructor({"certificateArn","endpointType","hostedZoneId","securityPolicy","targetDomainName"})
    private DomainNameDomainNameConfiguration(
        String certificateArn,
        String endpointType,
        @Nullable String hostedZoneId,
        String securityPolicy,
        @Nullable String targetDomainName) {
        this.certificateArn = Objects.requireNonNull(certificateArn);
        this.endpointType = Objects.requireNonNull(endpointType);
        this.hostedZoneId = hostedZoneId;
        this.securityPolicy = Objects.requireNonNull(securityPolicy);
        this.targetDomainName = targetDomainName;
    }

    /**
     * The ARN of an AWS-managed certificate that will be used by the endpoint for the domain name. AWS Certificate Manager is the only supported source.
     * Use the `aws.acm.Certificate` resource to configure an ACM certificate.
     * 
     */
    public String getCertificateArn() {
        return this.certificateArn;
    }
    /**
     * The endpoint type. Valid values: `REGIONAL`.
     * 
     */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The Amazon Route 53 Hosted Zone ID of the endpoint.
     * 
     */
    public Optional<String> getHostedZoneId() {
        return Optional.ofNullable(this.hostedZoneId);
    }
    /**
     * The Transport Layer Security (TLS) version of the [security policy](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-custom-domain-tls-version.html) for the domain name. Valid values: `TLS_1_2`.
     * 
     */
    public String getSecurityPolicy() {
        return this.securityPolicy;
    }
    /**
     * The target domain name.
     * 
     */
    public Optional<String> getTargetDomainName() {
        return Optional.ofNullable(this.targetDomainName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameDomainNameConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateArn;
        private String endpointType;
        private @Nullable String hostedZoneId;
        private String securityPolicy;
        private @Nullable String targetDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameDomainNameConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.endpointType = defaults.endpointType;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.targetDomainName = defaults.targetDomainName;
        }

        public Builder setCertificateArn(String certificateArn) {
            this.certificateArn = Objects.requireNonNull(certificateArn);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setHostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }

        public Builder setSecurityPolicy(String securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }

        public Builder setTargetDomainName(@Nullable String targetDomainName) {
            this.targetDomainName = targetDomainName;
            return this;
        }
        public DomainNameDomainNameConfiguration build() {
            return new DomainNameDomainNameConfiguration(certificateArn, endpointType, hostedZoneId, securityPolicy, targetDomainName);
        }
    }
}
