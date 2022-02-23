// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionSubjectDescriptionSubject;
import io.pulumi.gcp.certificateauthority.outputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltName;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateCertificateDescriptionSubjectDescription {
    private final @Nullable String hexSerialNumber;
    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String lifetime;
    private final @Nullable String notAfterTime;
    private final @Nullable String notBeforeTime;
    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltName> subjectAltNames;
    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubject> subjects;

    @OutputCustomType.Constructor({"hexSerialNumber","lifetime","notAfterTime","notBeforeTime","subjectAltNames","subjects"})
    private CertificateCertificateDescriptionSubjectDescription(
        @Nullable String hexSerialNumber,
        @Nullable String lifetime,
        @Nullable String notAfterTime,
        @Nullable String notBeforeTime,
        @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltName> subjectAltNames,
        @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubject> subjects) {
        this.hexSerialNumber = hexSerialNumber;
        this.lifetime = lifetime;
        this.notAfterTime = notAfterTime;
        this.notBeforeTime = notBeforeTime;
        this.subjectAltNames = subjectAltNames;
        this.subjects = subjects;
    }

    public Optional<String> getHexSerialNumber() {
        return Optional.ofNullable(this.hexSerialNumber);
    }
    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    public Optional<String> getLifetime() {
        return Optional.ofNullable(this.lifetime);
    }
    public Optional<String> getNotAfterTime() {
        return Optional.ofNullable(this.notAfterTime);
    }
    public Optional<String> getNotBeforeTime() {
        return Optional.ofNullable(this.notBeforeTime);
    }
    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltName> getSubjectAltNames() {
        return this.subjectAltNames == null ? List.of() : this.subjectAltNames;
    }
    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    public List<CertificateCertificateDescriptionSubjectDescriptionSubject> getSubjects() {
        return this.subjects == null ? List.of() : this.subjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescription defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hexSerialNumber;
        private @Nullable String lifetime;
        private @Nullable String notAfterTime;
        private @Nullable String notBeforeTime;
        private @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltName> subjectAltNames;
        private @Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubject> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescription defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hexSerialNumber = defaults.hexSerialNumber;
    	      this.lifetime = defaults.lifetime;
    	      this.notAfterTime = defaults.notAfterTime;
    	      this.notBeforeTime = defaults.notBeforeTime;
    	      this.subjectAltNames = defaults.subjectAltNames;
    	      this.subjects = defaults.subjects;
        }

        public Builder setHexSerialNumber(@Nullable String hexSerialNumber) {
            this.hexSerialNumber = hexSerialNumber;
            return this;
        }

        public Builder setLifetime(@Nullable String lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        public Builder setNotAfterTime(@Nullable String notAfterTime) {
            this.notAfterTime = notAfterTime;
            return this;
        }

        public Builder setNotBeforeTime(@Nullable String notBeforeTime) {
            this.notBeforeTime = notBeforeTime;
            return this;
        }

        public Builder setSubjectAltNames(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltName> subjectAltNames) {
            this.subjectAltNames = subjectAltNames;
            return this;
        }

        public Builder setSubjects(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubject> subjects) {
            this.subjects = subjects;
            return this;
        }
        public CertificateCertificateDescriptionSubjectDescription build() {
            return new CertificateCertificateDescriptionSubjectDescription(hexSerialNumber, lifetime, notAfterTime, notBeforeTime, subjectAltNames, subjects);
        }
    }
}
