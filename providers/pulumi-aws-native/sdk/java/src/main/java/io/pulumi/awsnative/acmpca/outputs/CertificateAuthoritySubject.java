// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CertificateAuthoritySubject {
    private final @Nullable String commonName;
    private final @Nullable String country;
    private final @Nullable String distinguishedNameQualifier;
    private final @Nullable String generationQualifier;
    private final @Nullable String givenName;
    private final @Nullable String initials;
    private final @Nullable String locality;
    private final @Nullable String organization;
    private final @Nullable String organizationalUnit;
    private final @Nullable String pseudonym;
    private final @Nullable String serialNumber;
    private final @Nullable String state;
    private final @Nullable String surname;
    private final @Nullable String title;

    @CustomType.Constructor
    private CertificateAuthoritySubject(
        @CustomType.Parameter("commonName") @Nullable String commonName,
        @CustomType.Parameter("country") @Nullable String country,
        @CustomType.Parameter("distinguishedNameQualifier") @Nullable String distinguishedNameQualifier,
        @CustomType.Parameter("generationQualifier") @Nullable String generationQualifier,
        @CustomType.Parameter("givenName") @Nullable String givenName,
        @CustomType.Parameter("initials") @Nullable String initials,
        @CustomType.Parameter("locality") @Nullable String locality,
        @CustomType.Parameter("organization") @Nullable String organization,
        @CustomType.Parameter("organizationalUnit") @Nullable String organizationalUnit,
        @CustomType.Parameter("pseudonym") @Nullable String pseudonym,
        @CustomType.Parameter("serialNumber") @Nullable String serialNumber,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("surname") @Nullable String surname,
        @CustomType.Parameter("title") @Nullable String title) {
        this.commonName = commonName;
        this.country = country;
        this.distinguishedNameQualifier = distinguishedNameQualifier;
        this.generationQualifier = generationQualifier;
        this.givenName = givenName;
        this.initials = initials;
        this.locality = locality;
        this.organization = organization;
        this.organizationalUnit = organizationalUnit;
        this.pseudonym = pseudonym;
        this.serialNumber = serialNumber;
        this.state = state;
        this.surname = surname;
        this.title = title;
    }

    public Optional<String> getCommonName() {
        return Optional.ofNullable(this.commonName);
    }
    public Optional<String> getCountry() {
        return Optional.ofNullable(this.country);
    }
    public Optional<String> getDistinguishedNameQualifier() {
        return Optional.ofNullable(this.distinguishedNameQualifier);
    }
    public Optional<String> getGenerationQualifier() {
        return Optional.ofNullable(this.generationQualifier);
    }
    public Optional<String> getGivenName() {
        return Optional.ofNullable(this.givenName);
    }
    public Optional<String> getInitials() {
        return Optional.ofNullable(this.initials);
    }
    public Optional<String> getLocality() {
        return Optional.ofNullable(this.locality);
    }
    public Optional<String> getOrganization() {
        return Optional.ofNullable(this.organization);
    }
    public Optional<String> getOrganizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }
    public Optional<String> getPseudonym() {
        return Optional.ofNullable(this.pseudonym);
    }
    public Optional<String> getSerialNumber() {
        return Optional.ofNullable(this.serialNumber);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> getSurname() {
        return Optional.ofNullable(this.surname);
    }
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthoritySubject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commonName;
        private @Nullable String country;
        private @Nullable String distinguishedNameQualifier;
        private @Nullable String generationQualifier;
        private @Nullable String givenName;
        private @Nullable String initials;
        private @Nullable String locality;
        private @Nullable String organization;
        private @Nullable String organizationalUnit;
        private @Nullable String pseudonym;
        private @Nullable String serialNumber;
        private @Nullable String state;
        private @Nullable String surname;
        private @Nullable String title;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthoritySubject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.country = defaults.country;
    	      this.distinguishedNameQualifier = defaults.distinguishedNameQualifier;
    	      this.generationQualifier = defaults.generationQualifier;
    	      this.givenName = defaults.givenName;
    	      this.initials = defaults.initials;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.pseudonym = defaults.pseudonym;
    	      this.serialNumber = defaults.serialNumber;
    	      this.state = defaults.state;
    	      this.surname = defaults.surname;
    	      this.title = defaults.title;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder country(@Nullable String country) {
            this.country = country;
            return this;
        }

        public Builder distinguishedNameQualifier(@Nullable String distinguishedNameQualifier) {
            this.distinguishedNameQualifier = distinguishedNameQualifier;
            return this;
        }

        public Builder generationQualifier(@Nullable String generationQualifier) {
            this.generationQualifier = generationQualifier;
            return this;
        }

        public Builder givenName(@Nullable String givenName) {
            this.givenName = givenName;
            return this;
        }

        public Builder initials(@Nullable String initials) {
            this.initials = initials;
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

        public Builder pseudonym(@Nullable String pseudonym) {
            this.pseudonym = pseudonym;
            return this;
        }

        public Builder serialNumber(@Nullable String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder surname(@Nullable String surname) {
            this.surname = surname;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        public CertificateAuthoritySubject build() {
            return new CertificateAuthoritySubject(commonName, country, distinguishedNameQualifier, generationQualifier, givenName, initials, locality, organization, organizationalUnit, pseudonym, serialNumber, state, surname, title);
        }
    }
}
