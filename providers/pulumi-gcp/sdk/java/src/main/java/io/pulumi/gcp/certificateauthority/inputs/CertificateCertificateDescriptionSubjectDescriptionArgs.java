// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionArgs();

    @Import(name="hexSerialNumber")
      private final @Nullable Output<String> hexSerialNumber;

    public Output<String> hexSerialNumber() {
        return this.hexSerialNumber == null ? Codegen.empty() : this.hexSerialNumber;
    }

    /**
     * The desired lifetime of the CA certificate. Used to create the "notBeforeTime" and
     * "notAfterTime" fields inside an X.509 certificate. A duration in seconds with up to nine
     * fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="lifetime")
      private final @Nullable Output<String> lifetime;

    public Output<String> lifetime() {
        return this.lifetime == null ? Codegen.empty() : this.lifetime;
    }

    @Import(name="notAfterTime")
      private final @Nullable Output<String> notAfterTime;

    public Output<String> notAfterTime() {
        return this.notAfterTime == null ? Codegen.empty() : this.notAfterTime;
    }

    @Import(name="notBeforeTime")
      private final @Nullable Output<String> notBeforeTime;

    public Output<String> notBeforeTime() {
        return this.notBeforeTime == null ? Codegen.empty() : this.notBeforeTime;
    }

    /**
     * The subject alternative name fields.
     * Structure is documented below.
     * 
     */
    @Import(name="subjectAltNames")
      private final @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs>> subjectAltNames;

    public Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs>> subjectAltNames() {
        return this.subjectAltNames == null ? Codegen.empty() : this.subjectAltNames;
    }

    /**
     * Contains distinguished name fields such as the location and organization.
     * Structure is documented below.
     * 
     */
    @Import(name="subjects")
      private final @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectArgs>> subjects;

    public Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectArgs>> subjects() {
        return this.subjects == null ? Codegen.empty() : this.subjects;
    }

    public CertificateCertificateDescriptionSubjectDescriptionArgs(
        @Nullable Output<String> hexSerialNumber,
        @Nullable Output<String> lifetime,
        @Nullable Output<String> notAfterTime,
        @Nullable Output<String> notBeforeTime,
        @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs>> subjectAltNames,
        @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectArgs>> subjects) {
        this.hexSerialNumber = hexSerialNumber;
        this.lifetime = lifetime;
        this.notAfterTime = notAfterTime;
        this.notBeforeTime = notBeforeTime;
        this.subjectAltNames = subjectAltNames;
        this.subjects = subjects;
    }

    private CertificateCertificateDescriptionSubjectDescriptionArgs() {
        this.hexSerialNumber = Codegen.empty();
        this.lifetime = Codegen.empty();
        this.notAfterTime = Codegen.empty();
        this.notBeforeTime = Codegen.empty();
        this.subjectAltNames = Codegen.empty();
        this.subjects = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hexSerialNumber;
        private @Nullable Output<String> lifetime;
        private @Nullable Output<String> notAfterTime;
        private @Nullable Output<String> notBeforeTime;
        private @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs>> subjectAltNames;
        private @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectArgs>> subjects;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hexSerialNumber = defaults.hexSerialNumber;
    	      this.lifetime = defaults.lifetime;
    	      this.notAfterTime = defaults.notAfterTime;
    	      this.notBeforeTime = defaults.notBeforeTime;
    	      this.subjectAltNames = defaults.subjectAltNames;
    	      this.subjects = defaults.subjects;
        }

        public Builder hexSerialNumber(@Nullable Output<String> hexSerialNumber) {
            this.hexSerialNumber = hexSerialNumber;
            return this;
        }
        public Builder hexSerialNumber(@Nullable String hexSerialNumber) {
            this.hexSerialNumber = Codegen.ofNullable(hexSerialNumber);
            return this;
        }
        public Builder lifetime(@Nullable Output<String> lifetime) {
            this.lifetime = lifetime;
            return this;
        }
        public Builder lifetime(@Nullable String lifetime) {
            this.lifetime = Codegen.ofNullable(lifetime);
            return this;
        }
        public Builder notAfterTime(@Nullable Output<String> notAfterTime) {
            this.notAfterTime = notAfterTime;
            return this;
        }
        public Builder notAfterTime(@Nullable String notAfterTime) {
            this.notAfterTime = Codegen.ofNullable(notAfterTime);
            return this;
        }
        public Builder notBeforeTime(@Nullable Output<String> notBeforeTime) {
            this.notBeforeTime = notBeforeTime;
            return this;
        }
        public Builder notBeforeTime(@Nullable String notBeforeTime) {
            this.notBeforeTime = Codegen.ofNullable(notBeforeTime);
            return this;
        }
        public Builder subjectAltNames(@Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs>> subjectAltNames) {
            this.subjectAltNames = subjectAltNames;
            return this;
        }
        public Builder subjectAltNames(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs> subjectAltNames) {
            this.subjectAltNames = Codegen.ofNullable(subjectAltNames);
            return this;
        }
        public Builder subjectAltNames(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }
        public Builder subjects(@Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectArgs>> subjects) {
            this.subjects = subjects;
            return this;
        }
        public Builder subjects(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectArgs> subjects) {
            this.subjects = Codegen.ofNullable(subjects);
            return this;
        }
        public Builder subjects(CertificateCertificateDescriptionSubjectDescriptionSubjectArgs... subjects) {
            return subjects(List.of(subjects));
        }        public CertificateCertificateDescriptionSubjectDescriptionArgs build() {
            return new CertificateCertificateDescriptionSubjectDescriptionArgs(hexSerialNumber, lifetime, notAfterTime, notBeforeTime, subjectAltNames, subjects);
        }
    }
}
