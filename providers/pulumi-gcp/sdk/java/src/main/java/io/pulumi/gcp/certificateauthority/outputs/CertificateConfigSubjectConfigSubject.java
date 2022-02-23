// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateConfigSubjectConfigSubject {
    /**
     * The common name of the distinguished name.
     * 
     */
    private final String commonName;
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
    private final String organization;
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

    @OutputCustomType.Constructor({"commonName","countryCode","locality","organization","organizationalUnit","postalCode","province","streetAddress"})
    private CertificateConfigSubjectConfigSubject(
        String commonName,
        @Nullable String countryCode,
        @Nullable String locality,
        String organization,
        @Nullable String organizationalUnit,
        @Nullable String postalCode,
        @Nullable String province,
        @Nullable String streetAddress) {
        this.commonName = Objects.requireNonNull(commonName);
        this.countryCode = countryCode;
        this.locality = locality;
        this.organization = Objects.requireNonNull(organization);
        this.organizationalUnit = organizationalUnit;
        this.postalCode = postalCode;
        this.province = province;
        this.streetAddress = streetAddress;
    }

    /**
     * The common name of the distinguished name.
     * 
     */
    public String getCommonName() {
        return this.commonName;
    }
    /**
     * The country code of the subject.
     * 
     */
    public Optional<String> getCountryCode() {
        return Optional.ofNullable(this.countryCode);
    }
    /**
     * The locality or city of the subject.
     * 
     */
    public Optional<String> getLocality() {
        return Optional.ofNullable(this.locality);
    }
    /**
     * The organization of the subject.
     * 
     */
    public String getOrganization() {
        return this.organization;
    }
    /**
     * The organizational unit of the subject.
     * 
     */
    public Optional<String> getOrganizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }
    /**
     * The postal code of the subject.
     * 
     */
    public Optional<String> getPostalCode() {
        return Optional.ofNullable(this.postalCode);
    }
    /**
     * The province, territory, or regional state of the subject.
     * 
     */
    public Optional<String> getProvince() {
        return Optional.ofNullable(this.province);
    }
    /**
     * The street address of the subject.
     * 
     */
    public Optional<String> getStreetAddress() {
        return Optional.ofNullable(this.streetAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigSubjectConfigSubject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commonName;
        private @Nullable String countryCode;
        private @Nullable String locality;
        private String organization;
        private @Nullable String organizationalUnit;
        private @Nullable String postalCode;
        private @Nullable String province;
        private @Nullable String streetAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigSubjectConfigSubject defaults) {
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

        public Builder setCommonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }

        public Builder setCountryCode(@Nullable String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder setLocality(@Nullable String locality) {
            this.locality = locality;
            return this;
        }

        public Builder setOrganization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }

        public Builder setOrganizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder setPostalCode(@Nullable String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setProvince(@Nullable String province) {
            this.province = province;
            return this;
        }

        public Builder setStreetAddress(@Nullable String streetAddress) {
            this.streetAddress = streetAddress;
            return this;
        }
        public CertificateConfigSubjectConfigSubject build() {
            return new CertificateConfigSubjectConfigSubject(commonName, countryCode, locality, organization, organizationalUnit, postalCode, province, streetAddress);
        }
    }
}
