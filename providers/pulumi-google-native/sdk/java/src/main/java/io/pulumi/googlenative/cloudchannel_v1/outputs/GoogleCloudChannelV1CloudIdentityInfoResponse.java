// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudchannel_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudchannel_v1.outputs.GoogleCloudChannelV1EduDataResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudChannelV1CloudIdentityInfoResponse {
    /**
     * URI of Customer's Admin console dashboard.
     * 
     */
    private final String adminConsoleUri;
    /**
     * The alternate email.
     * 
     */
    private final String alternateEmail;
    /**
     * CustomerType indicates verification type needed for using services.
     * 
     */
    private final String customerType;
    /**
     * Edu information about the customer.
     * 
     */
    private final GoogleCloudChannelV1EduDataResponse eduData;
    /**
     * Whether the domain is verified. This field is not returned for a Customer's cloud_identity_info resource. Partners can use the domains.get() method of the Workspace SDK's Directory API, or listen to the PRIMARY_DOMAIN_VERIFIED Pub/Sub event in to track domain verification of their resolve Workspace customers.
     * 
     */
    private final Boolean isDomainVerified;
    /**
     * Language code.
     * 
     */
    private final String languageCode;
    /**
     * Phone number associated with the Cloud Identity.
     * 
     */
    private final String phoneNumber;
    /**
     * The primary domain name.
     * 
     */
    private final String primaryDomain;

    @OutputCustomType.Constructor({"adminConsoleUri","alternateEmail","customerType","eduData","isDomainVerified","languageCode","phoneNumber","primaryDomain"})
    private GoogleCloudChannelV1CloudIdentityInfoResponse(
        String adminConsoleUri,
        String alternateEmail,
        String customerType,
        GoogleCloudChannelV1EduDataResponse eduData,
        Boolean isDomainVerified,
        String languageCode,
        String phoneNumber,
        String primaryDomain) {
        this.adminConsoleUri = Objects.requireNonNull(adminConsoleUri);
        this.alternateEmail = Objects.requireNonNull(alternateEmail);
        this.customerType = Objects.requireNonNull(customerType);
        this.eduData = Objects.requireNonNull(eduData);
        this.isDomainVerified = Objects.requireNonNull(isDomainVerified);
        this.languageCode = Objects.requireNonNull(languageCode);
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
        this.primaryDomain = Objects.requireNonNull(primaryDomain);
    }

    /**
     * URI of Customer's Admin console dashboard.
     * 
     */
    public String getAdminConsoleUri() {
        return this.adminConsoleUri;
    }
    /**
     * The alternate email.
     * 
     */
    public String getAlternateEmail() {
        return this.alternateEmail;
    }
    /**
     * CustomerType indicates verification type needed for using services.
     * 
     */
    public String getCustomerType() {
        return this.customerType;
    }
    /**
     * Edu information about the customer.
     * 
     */
    public GoogleCloudChannelV1EduDataResponse getEduData() {
        return this.eduData;
    }
    /**
     * Whether the domain is verified. This field is not returned for a Customer's cloud_identity_info resource. Partners can use the domains.get() method of the Workspace SDK's Directory API, or listen to the PRIMARY_DOMAIN_VERIFIED Pub/Sub event in to track domain verification of their resolve Workspace customers.
     * 
     */
    public Boolean getIsDomainVerified() {
        return this.isDomainVerified;
    }
    /**
     * Language code.
     * 
     */
    public String getLanguageCode() {
        return this.languageCode;
    }
    /**
     * Phone number associated with the Cloud Identity.
     * 
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * The primary domain name.
     * 
     */
    public String getPrimaryDomain() {
        return this.primaryDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudChannelV1CloudIdentityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminConsoleUri;
        private String alternateEmail;
        private String customerType;
        private GoogleCloudChannelV1EduDataResponse eduData;
        private Boolean isDomainVerified;
        private String languageCode;
        private String phoneNumber;
        private String primaryDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudChannelV1CloudIdentityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminConsoleUri = defaults.adminConsoleUri;
    	      this.alternateEmail = defaults.alternateEmail;
    	      this.customerType = defaults.customerType;
    	      this.eduData = defaults.eduData;
    	      this.isDomainVerified = defaults.isDomainVerified;
    	      this.languageCode = defaults.languageCode;
    	      this.phoneNumber = defaults.phoneNumber;
    	      this.primaryDomain = defaults.primaryDomain;
        }

        public Builder setAdminConsoleUri(String adminConsoleUri) {
            this.adminConsoleUri = Objects.requireNonNull(adminConsoleUri);
            return this;
        }

        public Builder setAlternateEmail(String alternateEmail) {
            this.alternateEmail = Objects.requireNonNull(alternateEmail);
            return this;
        }

        public Builder setCustomerType(String customerType) {
            this.customerType = Objects.requireNonNull(customerType);
            return this;
        }

        public Builder setEduData(GoogleCloudChannelV1EduDataResponse eduData) {
            this.eduData = Objects.requireNonNull(eduData);
            return this;
        }

        public Builder setIsDomainVerified(Boolean isDomainVerified) {
            this.isDomainVerified = Objects.requireNonNull(isDomainVerified);
            return this;
        }

        public Builder setLanguageCode(String languageCode) {
            this.languageCode = Objects.requireNonNull(languageCode);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPrimaryDomain(String primaryDomain) {
            this.primaryDomain = Objects.requireNonNull(primaryDomain);
            return this;
        }
        public GoogleCloudChannelV1CloudIdentityInfoResponse build() {
            return new GoogleCloudChannelV1CloudIdentityInfoResponse(adminConsoleUri, alternateEmail, customerType, eduData, isDomainVerified, languageCode, phoneNumber, primaryDomain);
        }
    }
}
