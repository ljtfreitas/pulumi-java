// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    @InputImport(name="critical")
        private final @Nullable Input<Boolean> critical;

    public Input<Boolean> getCritical() {
        return this.critical == null ? Input.empty() : this.critical;
    }

    @InputImport(name="obectIds")
        private final @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdGetArgs>> obectIds;

    public Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdGetArgs>> getObectIds() {
        return this.obectIds == null ? Input.empty() : this.obectIds;
    }

    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    @InputImport(name="value")
        private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs(
        @Nullable Input<Boolean> critical,
        @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdGetArgs>> obectIds,
        @Nullable Input<String> value) {
        this.critical = critical;
        this.obectIds = obectIds;
        this.value = value;
    }

    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs() {
        this.critical = Input.empty();
        this.obectIds = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> critical;
        private @Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdGetArgs>> obectIds;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.obectIds = defaults.obectIds;
    	      this.value = defaults.value;
        }

        public Builder setCritical(@Nullable Input<Boolean> critical) {
            this.critical = critical;
            return this;
        }

        public Builder setCritical(@Nullable Boolean critical) {
            this.critical = Input.ofNullable(critical);
            return this;
        }

        public Builder setObectIds(@Nullable Input<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdGetArgs>> obectIds) {
            this.obectIds = obectIds;
            return this;
        }

        public Builder setObectIds(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanObectIdGetArgs> obectIds) {
            this.obectIds = Input.ofNullable(obectIds);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanGetArgs(critical, obectIds, value);
        }
    }
}
