// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Structure that contains X.500 distinguished name information for your CA.
 * 
 */
public final class CertificateAuthoritySubjectArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthoritySubjectArgs Empty = new CertificateAuthoritySubjectArgs();

    @Import(name="commonName")
      private final @Nullable Output<String> commonName;

    public Output<String> getCommonName() {
        return this.commonName == null ? Output.empty() : this.commonName;
    }

    @Import(name="country")
      private final @Nullable Output<String> country;

    public Output<String> getCountry() {
        return this.country == null ? Output.empty() : this.country;
    }

    @Import(name="distinguishedNameQualifier")
      private final @Nullable Output<String> distinguishedNameQualifier;

    public Output<String> getDistinguishedNameQualifier() {
        return this.distinguishedNameQualifier == null ? Output.empty() : this.distinguishedNameQualifier;
    }

    @Import(name="generationQualifier")
      private final @Nullable Output<String> generationQualifier;

    public Output<String> getGenerationQualifier() {
        return this.generationQualifier == null ? Output.empty() : this.generationQualifier;
    }

    @Import(name="givenName")
      private final @Nullable Output<String> givenName;

    public Output<String> getGivenName() {
        return this.givenName == null ? Output.empty() : this.givenName;
    }

    @Import(name="initials")
      private final @Nullable Output<String> initials;

    public Output<String> getInitials() {
        return this.initials == null ? Output.empty() : this.initials;
    }

    @Import(name="locality")
      private final @Nullable Output<String> locality;

    public Output<String> getLocality() {
        return this.locality == null ? Output.empty() : this.locality;
    }

    @Import(name="organization")
      private final @Nullable Output<String> organization;

    public Output<String> getOrganization() {
        return this.organization == null ? Output.empty() : this.organization;
    }

    @Import(name="organizationalUnit")
      private final @Nullable Output<String> organizationalUnit;

    public Output<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Output.empty() : this.organizationalUnit;
    }

    @Import(name="pseudonym")
      private final @Nullable Output<String> pseudonym;

    public Output<String> getPseudonym() {
        return this.pseudonym == null ? Output.empty() : this.pseudonym;
    }

    @Import(name="serialNumber")
      private final @Nullable Output<String> serialNumber;

    public Output<String> getSerialNumber() {
        return this.serialNumber == null ? Output.empty() : this.serialNumber;
    }

    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    @Import(name="surname")
      private final @Nullable Output<String> surname;

    public Output<String> getSurname() {
        return this.surname == null ? Output.empty() : this.surname;
    }

    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    public CertificateAuthoritySubjectArgs(
        @Nullable Output<String> commonName,
        @Nullable Output<String> country,
        @Nullable Output<String> distinguishedNameQualifier,
        @Nullable Output<String> generationQualifier,
        @Nullable Output<String> givenName,
        @Nullable Output<String> initials,
        @Nullable Output<String> locality,
        @Nullable Output<String> organization,
        @Nullable Output<String> organizationalUnit,
        @Nullable Output<String> pseudonym,
        @Nullable Output<String> serialNumber,
        @Nullable Output<String> state,
        @Nullable Output<String> surname,
        @Nullable Output<String> title) {
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

    private CertificateAuthoritySubjectArgs() {
        this.commonName = Output.empty();
        this.country = Output.empty();
        this.distinguishedNameQualifier = Output.empty();
        this.generationQualifier = Output.empty();
        this.givenName = Output.empty();
        this.initials = Output.empty();
        this.locality = Output.empty();
        this.organization = Output.empty();
        this.organizationalUnit = Output.empty();
        this.pseudonym = Output.empty();
        this.serialNumber = Output.empty();
        this.state = Output.empty();
        this.surname = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthoritySubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> commonName;
        private @Nullable Output<String> country;
        private @Nullable Output<String> distinguishedNameQualifier;
        private @Nullable Output<String> generationQualifier;
        private @Nullable Output<String> givenName;
        private @Nullable Output<String> initials;
        private @Nullable Output<String> locality;
        private @Nullable Output<String> organization;
        private @Nullable Output<String> organizationalUnit;
        private @Nullable Output<String> pseudonym;
        private @Nullable Output<String> serialNumber;
        private @Nullable Output<String> state;
        private @Nullable Output<String> surname;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthoritySubjectArgs defaults) {
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

        public Builder commonName(@Nullable Output<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = Output.ofNullable(commonName);
            return this;
        }

        public Builder country(@Nullable Output<String> country) {
            this.country = country;
            return this;
        }

        public Builder country(@Nullable String country) {
            this.country = Output.ofNullable(country);
            return this;
        }

        public Builder distinguishedNameQualifier(@Nullable Output<String> distinguishedNameQualifier) {
            this.distinguishedNameQualifier = distinguishedNameQualifier;
            return this;
        }

        public Builder distinguishedNameQualifier(@Nullable String distinguishedNameQualifier) {
            this.distinguishedNameQualifier = Output.ofNullable(distinguishedNameQualifier);
            return this;
        }

        public Builder generationQualifier(@Nullable Output<String> generationQualifier) {
            this.generationQualifier = generationQualifier;
            return this;
        }

        public Builder generationQualifier(@Nullable String generationQualifier) {
            this.generationQualifier = Output.ofNullable(generationQualifier);
            return this;
        }

        public Builder givenName(@Nullable Output<String> givenName) {
            this.givenName = givenName;
            return this;
        }

        public Builder givenName(@Nullable String givenName) {
            this.givenName = Output.ofNullable(givenName);
            return this;
        }

        public Builder initials(@Nullable Output<String> initials) {
            this.initials = initials;
            return this;
        }

        public Builder initials(@Nullable String initials) {
            this.initials = Output.ofNullable(initials);
            return this;
        }

        public Builder locality(@Nullable Output<String> locality) {
            this.locality = locality;
            return this;
        }

        public Builder locality(@Nullable String locality) {
            this.locality = Output.ofNullable(locality);
            return this;
        }

        public Builder organization(@Nullable Output<String> organization) {
            this.organization = organization;
            return this;
        }

        public Builder organization(@Nullable String organization) {
            this.organization = Output.ofNullable(organization);
            return this;
        }

        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Output.ofNullable(organizationalUnit);
            return this;
        }

        public Builder pseudonym(@Nullable Output<String> pseudonym) {
            this.pseudonym = pseudonym;
            return this;
        }

        public Builder pseudonym(@Nullable String pseudonym) {
            this.pseudonym = Output.ofNullable(pseudonym);
            return this;
        }

        public Builder serialNumber(@Nullable Output<String> serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Builder serialNumber(@Nullable String serialNumber) {
            this.serialNumber = Output.ofNullable(serialNumber);
            return this;
        }

        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }

        public Builder surname(@Nullable Output<String> surname) {
            this.surname = surname;
            return this;
        }

        public Builder surname(@Nullable String surname) {
            this.surname = Output.ofNullable(surname);
            return this;
        }

        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public CertificateAuthoritySubjectArgs build() {
            return new CertificateAuthoritySubjectArgs(commonName, country, distinguishedNameQualifier, generationQualifier, givenName, initials, locality, organization, organizationalUnit, pseudonym, serialNumber, state, surname, title);
        }
    }
}
