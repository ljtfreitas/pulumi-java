// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway;

import io.pulumi.aws.apigateway.inputs.DomainNameEndpointConfigurationArgs;
import io.pulumi.aws.apigateway.inputs.DomainNameMutualTlsAuthenticationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameArgs Empty = new DomainNameArgs();

    /**
     * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificate_name`, `certificate_body`, `certificate_chain`, `certificate_private_key`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificateArn")
    private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * The certificate issued for the domain name
     * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
     * `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificateBody")
    private final @Nullable Input<String> certificateBody;

    public Input<String> getCertificateBody() {
        return this.certificateBody == null ? Input.empty() : this.certificateBody;
    }

    /**
     * The certificate for the CA that issued the
     * certificate, along with any intermediate CA certificates required to
     * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`,
     * `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificateChain")
    private final @Nullable Input<String> certificateChain;

    public Input<String> getCertificateChain() {
        return this.certificateChain == null ? Input.empty() : this.certificateChain;
    }

    /**
     * The unique name to use when registering this
     * certificate as an IAM server certificate. Conflicts with `certificate_arn`, `regional_certificate_arn`, and
     * `regional_certificate_name`. Required if `certificate_arn` is not set.
     * 
     */
    @InputImport(name="certificateName")
    private final @Nullable Input<String> certificateName;

    public Input<String> getCertificateName() {
        return this.certificateName == null ? Input.empty() : this.certificateName;
    }

    /**
     * The private key associated with the
     * domain certificate given in `certificate_body`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificate_arn`, `regional_certificate_arn`, and `regional_certificate_name`.
     * 
     */
    @InputImport(name="certificatePrivateKey")
    private final @Nullable Input<String> certificatePrivateKey;

    public Input<String> getCertificatePrivateKey() {
        return this.certificatePrivateKey == null ? Input.empty() : this.certificatePrivateKey;
    }

    /**
     * The fully-qualified domain name to register
     * 
     */
    @InputImport(name="domainName", required=true)
    private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Configuration block defining API endpoint information including type. Defined below.
     * 
     */
    @InputImport(name="endpointConfiguration")
    private final @Nullable Input<DomainNameEndpointConfigurationArgs> endpointConfiguration;

    public Input<DomainNameEndpointConfigurationArgs> getEndpointConfiguration() {
        return this.endpointConfiguration == null ? Input.empty() : this.endpointConfiguration;
    }

    /**
     * The mutual TLS authentication configuration for the domain name. Defined below.
     * 
     */
    @InputImport(name="mutualTlsAuthentication")
    private final @Nullable Input<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication;

    public Input<DomainNameMutualTlsAuthenticationArgs> getMutualTlsAuthentication() {
        return this.mutualTlsAuthentication == null ? Input.empty() : this.mutualTlsAuthentication;
    }

    /**
     * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and `certificate_private_key`.
     * 
     */
    @InputImport(name="regionalCertificateArn")
    private final @Nullable Input<String> regionalCertificateArn;

    public Input<String> getRegionalCertificateArn() {
        return this.regionalCertificateArn == null ? Input.empty() : this.regionalCertificateArn;
    }

    /**
     * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificate_arn`, `certificate_name`, `certificate_body`, `certificate_chain`, and
     * `certificate_private_key`.
     * 
     */
    @InputImport(name="regionalCertificateName")
    private final @Nullable Input<String> regionalCertificateName;

    public Input<String> getRegionalCertificateName() {
        return this.regionalCertificateName == null ? Input.empty() : this.regionalCertificateName;
    }

    /**
     * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
     * 
     */
    @InputImport(name="securityPolicy")
    private final @Nullable Input<String> securityPolicy;

    public Input<String> getSecurityPolicy() {
        return this.securityPolicy == null ? Input.empty() : this.securityPolicy;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DomainNameArgs(
        @Nullable Input<String> certificateArn,
        @Nullable Input<String> certificateBody,
        @Nullable Input<String> certificateChain,
        @Nullable Input<String> certificateName,
        @Nullable Input<String> certificatePrivateKey,
        Input<String> domainName,
        @Nullable Input<DomainNameEndpointConfigurationArgs> endpointConfiguration,
        @Nullable Input<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication,
        @Nullable Input<String> regionalCertificateArn,
        @Nullable Input<String> regionalCertificateName,
        @Nullable Input<String> securityPolicy,
        @Nullable Input<Map<String,String>> tags) {
        this.certificateArn = certificateArn;
        this.certificateBody = certificateBody;
        this.certificateChain = certificateChain;
        this.certificateName = certificateName;
        this.certificatePrivateKey = certificatePrivateKey;
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.endpointConfiguration = endpointConfiguration;
        this.mutualTlsAuthentication = mutualTlsAuthentication;
        this.regionalCertificateArn = regionalCertificateArn;
        this.regionalCertificateName = regionalCertificateName;
        this.securityPolicy = securityPolicy;
        this.tags = tags;
    }

    private DomainNameArgs() {
        this.certificateArn = Input.empty();
        this.certificateBody = Input.empty();
        this.certificateChain = Input.empty();
        this.certificateName = Input.empty();
        this.certificatePrivateKey = Input.empty();
        this.domainName = Input.empty();
        this.endpointConfiguration = Input.empty();
        this.mutualTlsAuthentication = Input.empty();
        this.regionalCertificateArn = Input.empty();
        this.regionalCertificateName = Input.empty();
        this.securityPolicy = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<String> certificateBody;
        private @Nullable Input<String> certificateChain;
        private @Nullable Input<String> certificateName;
        private @Nullable Input<String> certificatePrivateKey;
        private Input<String> domainName;
        private @Nullable Input<DomainNameEndpointConfigurationArgs> endpointConfiguration;
        private @Nullable Input<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication;
        private @Nullable Input<String> regionalCertificateArn;
        private @Nullable Input<String> regionalCertificateName;
        private @Nullable Input<String> securityPolicy;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.certificateName = defaults.certificateName;
    	      this.certificatePrivateKey = defaults.certificatePrivateKey;
    	      this.domainName = defaults.domainName;
    	      this.endpointConfiguration = defaults.endpointConfiguration;
    	      this.mutualTlsAuthentication = defaults.mutualTlsAuthentication;
    	      this.regionalCertificateArn = defaults.regionalCertificateArn;
    	      this.regionalCertificateName = defaults.regionalCertificateName;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.tags = defaults.tags;
        }

        public Builder setCertificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
            return this;
        }

        public Builder setCertificateBody(@Nullable Input<String> certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        public Builder setCertificateBody(@Nullable String certificateBody) {
            this.certificateBody = Input.ofNullable(certificateBody);
            return this;
        }

        public Builder setCertificateChain(@Nullable Input<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        public Builder setCertificateChain(@Nullable String certificateChain) {
            this.certificateChain = Input.ofNullable(certificateChain);
            return this;
        }

        public Builder setCertificateName(@Nullable Input<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        public Builder setCertificateName(@Nullable String certificateName) {
            this.certificateName = Input.ofNullable(certificateName);
            return this;
        }

        public Builder setCertificatePrivateKey(@Nullable Input<String> certificatePrivateKey) {
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        public Builder setCertificatePrivateKey(@Nullable String certificatePrivateKey) {
            this.certificatePrivateKey = Input.ofNullable(certificatePrivateKey);
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable Input<DomainNameEndpointConfigurationArgs> endpointConfiguration) {
            this.endpointConfiguration = endpointConfiguration;
            return this;
        }

        public Builder setEndpointConfiguration(@Nullable DomainNameEndpointConfigurationArgs endpointConfiguration) {
            this.endpointConfiguration = Input.ofNullable(endpointConfiguration);
            return this;
        }

        public Builder setMutualTlsAuthentication(@Nullable Input<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication) {
            this.mutualTlsAuthentication = mutualTlsAuthentication;
            return this;
        }

        public Builder setMutualTlsAuthentication(@Nullable DomainNameMutualTlsAuthenticationArgs mutualTlsAuthentication) {
            this.mutualTlsAuthentication = Input.ofNullable(mutualTlsAuthentication);
            return this;
        }

        public Builder setRegionalCertificateArn(@Nullable Input<String> regionalCertificateArn) {
            this.regionalCertificateArn = regionalCertificateArn;
            return this;
        }

        public Builder setRegionalCertificateArn(@Nullable String regionalCertificateArn) {
            this.regionalCertificateArn = Input.ofNullable(regionalCertificateArn);
            return this;
        }

        public Builder setRegionalCertificateName(@Nullable Input<String> regionalCertificateName) {
            this.regionalCertificateName = regionalCertificateName;
            return this;
        }

        public Builder setRegionalCertificateName(@Nullable String regionalCertificateName) {
            this.regionalCertificateName = Input.ofNullable(regionalCertificateName);
            return this;
        }

        public Builder setSecurityPolicy(@Nullable Input<String> securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }

        public Builder setSecurityPolicy(@Nullable String securityPolicy) {
            this.securityPolicy = Input.ofNullable(securityPolicy);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DomainNameArgs build() {
            return new DomainNameArgs(certificateArn, certificateBody, certificateChain, certificateName, certificatePrivateKey, domainName, endpointConfiguration, mutualTlsAuthentication, regionalCertificateArn, regionalCertificateName, securityPolicy, tags);
        }
    }
}
