// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameState extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameState Empty = new DomainNameState();

    /**
     * The domain name that AppSync provides.
     * 
     */
    @InputImport(name="appsyncDomainName")
    private final @Nullable Input<String> appsyncDomainName;

    public Input<String> getAppsyncDomainName() {
        return this.appsyncDomainName == null ? Input.empty() : this.appsyncDomainName;
    }

    /**
     * The Amazon Resource Name (ARN) of the certificate. This can be an Certificate Manager (ACM) certificate or an Identity and Access Management (IAM) server certificate. The certifiacte must reside in us-east-1.
     * 
     */
    @InputImport(name="certificateArn")
    private final @Nullable Input<String> certificateArn;

    public Input<String> getCertificateArn() {
        return this.certificateArn == null ? Input.empty() : this.certificateArn;
    }

    /**
     * A description of the Domain Name.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The domain name.
     * 
     */
    @InputImport(name="domainName")
    private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The ID of your Amazon Route 53 hosted zone.
     * 
     */
    @InputImport(name="hostedZoneId")
    private final @Nullable Input<String> hostedZoneId;

    public Input<String> getHostedZoneId() {
        return this.hostedZoneId == null ? Input.empty() : this.hostedZoneId;
    }

    public DomainNameState(
        @Nullable Input<String> appsyncDomainName,
        @Nullable Input<String> certificateArn,
        @Nullable Input<String> description,
        @Nullable Input<String> domainName,
        @Nullable Input<String> hostedZoneId) {
        this.appsyncDomainName = appsyncDomainName;
        this.certificateArn = certificateArn;
        this.description = description;
        this.domainName = domainName;
        this.hostedZoneId = hostedZoneId;
    }

    private DomainNameState() {
        this.appsyncDomainName = Input.empty();
        this.certificateArn = Input.empty();
        this.description = Input.empty();
        this.domainName = Input.empty();
        this.hostedZoneId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appsyncDomainName;
        private @Nullable Input<String> certificateArn;
        private @Nullable Input<String> description;
        private @Nullable Input<String> domainName;
        private @Nullable Input<String> hostedZoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appsyncDomainName = defaults.appsyncDomainName;
    	      this.certificateArn = defaults.certificateArn;
    	      this.description = defaults.description;
    	      this.domainName = defaults.domainName;
    	      this.hostedZoneId = defaults.hostedZoneId;
        }

        public Builder setAppsyncDomainName(@Nullable Input<String> appsyncDomainName) {
            this.appsyncDomainName = appsyncDomainName;
            return this;
        }

        public Builder setAppsyncDomainName(@Nullable String appsyncDomainName) {
            this.appsyncDomainName = Input.ofNullable(appsyncDomainName);
            return this;
        }

        public Builder setCertificateArn(@Nullable Input<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }

        public Builder setCertificateArn(@Nullable String certificateArn) {
            this.certificateArn = Input.ofNullable(certificateArn);
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

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setHostedZoneId(@Nullable Input<String> hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }

        public Builder setHostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = Input.ofNullable(hostedZoneId);
            return this;
        }
        public DomainNameState build() {
            return new DomainNameState(appsyncDomainName, certificateArn, description, domainName, hostedZoneId);
        }
    }
}
