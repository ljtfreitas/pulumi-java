// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateCertificateDescriptionSubjectDescriptionSubject {
    /**
     * The common name of the distinguished name.
     * 
     */
    private final @Nullable String commonName;
    /**
     * The country code of the subject.
     * 
     */
    private final @Nullable String countryCode;
    /**
     * The locality or city of the subject.
     * 
     */
    private final @Nullable String locality;
    /**
     * The organization of the subject.
     * 
     */
    private final @Nullable String organization;
    /**
     * The organizational unit of the subject.
     * 
     */
    private final @Nullable String organizationalUnit;
    /**
     * The postal code of the subject.
     * 
     */
    private final @Nullable String postalCode;
    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    private final @Nullable String province;
    /**
     * The street address of the subject.
     * 
     */
    private final @Nullable String streetAddress;

    @CustomType.Constructor
    private CertificateCertificateDescriptionSubjectDescriptionSubject(
        @CustomType.Parameter("commonName") @Nullable String commonName,
        @CustomType.Parameter("countryCode") @Nullable String countryCode,
        @CustomType.Parameter("locality") @Nullable String locality,
        @CustomType.Parameter("organization") @Nullable String organization,
        @CustomType.Parameter("organizationalUnit") @Nullable String organizationalUnit,
        @CustomType.Parameter("postalCode") @Nullable String postalCode,
        @CustomType.Parameter("province") @Nullable String province,
        @CustomType.Parameter("streetAddress") @Nullable String streetAddress) {
        this.commonName = commonName;
        this.countryCode = countryCode;
        this.locality = locality;
        this.organization = organization;
        this.organizationalUnit = organizationalUnit;
        this.postalCode = postalCode;
        this.province = province;
        this.streetAddress = streetAddress;
    }

    /**
     * The common name of the distinguished name.
     * 
    */
    public Optional<String> commonName() {
        return Optional.ofNullable(this.commonName);
    }
    /**
     * The country code of the subject.
     * 
    */
    public Optional<String> countryCode() {
        return Optional.ofNullable(this.countryCode);
    }
    /**
     * The locality or city of the subject.
     * 
    */
    public Optional<String> locality() {
        return Optional.ofNullable(this.locality);
    }
    /**
     * The organization of the subject.
     * 
    */
    public Optional<String> organization() {
        return Optional.ofNullable(this.organization);
    }
    /**
     * The organizational unit of the subject.
     * 
    */
    public Optional<String> organizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }
    /**
     * The postal code of the subject.
     * 
    */
    public Optional<String> postalCode() {
        return Optional.ofNullable(this.postalCode);
    }
    /**
     * The province, territory, or regional state of the subject.
     * 
    */
    public Optional<String> province() {
        return Optional.ofNullable(this.province);
    }
    /**
     * The street address of the subject.
     * 
    */
    public Optional<String> streetAddress() {
        return Optional.ofNullable(this.streetAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commonName;
        private @Nullable String countryCode;
        private @Nullable String locality;
        private @Nullable String organization;
        private @Nullable String organizationalUnit;
        private @Nullable String postalCode;
        private @Nullable String province;
        private @Nullable String streetAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.countryCode = defaults.countryCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.postalCode = defaults.postalCode;
    	      this.province = defaults.province;
    	      this.streetAddress = defaults.streetAddress;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = commonName;
            return this;
        }
        public Builder countryCode(@Nullable String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public Builder locality(@Nullable String locality) {
            this.locality = locality;
            return this;
        }
        public Builder organization(@Nullable String organization) {
            this.organization = organization;
            return this;
        }
        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }
        public Builder postalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder province(@Nullable String province) {
            this.province = province;
            return this;
        }
        public Builder streetAddress(@Nullable String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }        public CertificateCertificateDescriptionSubjectDescriptionSubject build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubject(commonName, countryCode, locality, organization, organizationalUnit, postalCode, province, streetAddress);
        }
    }
}
