// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigSubjectConfigSubject;
import io.pulumi.gcp.certificateauthority.outputs.CertificateConfigSubjectConfigSubjectAltName;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateConfigSubjectConfig {
    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    private final CertificateConfigSubjectConfigSubject subject;
    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    private final @Nullable CertificateConfigSubjectConfigSubjectAltName subjectAltName;

    @CustomType.Constructor
    private CertificateConfigSubjectConfig(
        @CustomType.Parameter("subject") CertificateConfigSubjectConfigSubject subject,
        @CustomType.Parameter("subjectAltName") @Nullable CertificateConfigSubjectConfigSubjectAltName subjectAltName) {
        this.subject = subject;
        this.subjectAltName = subjectAltName;
    }

    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
    */
    public CertificateConfigSubjectConfigSubject getSubject() {
        return this.subject;
    }
    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
    */
    public Optional<CertificateConfigSubjectConfigSubjectAltName> getSubjectAltName() {
        return Optional.ofNullable(this.subjectAltName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigSubjectConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigSubjectConfigSubject subject;
        private @Nullable CertificateConfigSubjectConfigSubjectAltName subjectAltName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigSubjectConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subject = defaults.subject;
    	      this.subjectAltName = defaults.subjectAltName;
        }

        public Builder subject(CertificateConfigSubjectConfigSubject subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder subjectAltName(@Nullable CertificateConfigSubjectConfigSubjectAltName subjectAltName) {
            this.subjectAltName = subjectAltName;
            return this;
        }
        public CertificateConfigSubjectConfig build() {
            return new CertificateConfigSubjectConfig(subject, subjectAltName);
        }
    }
}
