// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse;
import io.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse;
import io.pulumi.azurenative.media.outputs.ContentKeyPolicyPlayReadyPlayRightResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContentKeyPolicyPlayReadyLicenseResponse {
    /**
     * A flag indicating whether test devices can use the license.
     * 
     */
    private final Boolean allowTestDevices;
    /**
     * The begin date of license
     * 
     */
    private final @Nullable String beginDate;
    /**
     * The content key location.
     * 
     */
    private final Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation;
    /**
     * The PlayReady content type.
     * 
     */
    private final String contentType;
    /**
     * The expiration date of license.
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * The grace period of license.
     * 
     */
    private final @Nullable String gracePeriod;
    /**
     * The license type.
     * 
     */
    private final String licenseType;
    /**
     * The license PlayRight
     * 
     */
    private final @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight;
    /**
     * The relative begin date of license.
     * 
     */
    private final @Nullable String relativeBeginDate;
    /**
     * The relative expiration date of license.
     * 
     */
    private final @Nullable String relativeExpirationDate;

    @CustomType.Constructor
    private ContentKeyPolicyPlayReadyLicenseResponse(
        @CustomType.Parameter("allowTestDevices") Boolean allowTestDevices,
        @CustomType.Parameter("beginDate") @Nullable String beginDate,
        @CustomType.Parameter("contentKeyLocation") Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation,
        @CustomType.Parameter("contentType") String contentType,
        @CustomType.Parameter("expirationDate") @Nullable String expirationDate,
        @CustomType.Parameter("gracePeriod") @Nullable String gracePeriod,
        @CustomType.Parameter("licenseType") String licenseType,
        @CustomType.Parameter("playRight") @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight,
        @CustomType.Parameter("relativeBeginDate") @Nullable String relativeBeginDate,
        @CustomType.Parameter("relativeExpirationDate") @Nullable String relativeExpirationDate) {
        this.allowTestDevices = allowTestDevices;
        this.beginDate = beginDate;
        this.contentKeyLocation = contentKeyLocation;
        this.contentType = contentType;
        this.expirationDate = expirationDate;
        this.gracePeriod = gracePeriod;
        this.licenseType = licenseType;
        this.playRight = playRight;
        this.relativeBeginDate = relativeBeginDate;
        this.relativeExpirationDate = relativeExpirationDate;
    }

    /**
     * A flag indicating whether test devices can use the license.
     * 
    */
    public Boolean getAllowTestDevices() {
        return this.allowTestDevices;
    }
    /**
     * The begin date of license
     * 
    */
    public Optional<String> getBeginDate() {
        return Optional.ofNullable(this.beginDate);
    }
    /**
     * The content key location.
     * 
    */
    public Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> getContentKeyLocation() {
        return this.contentKeyLocation;
    }
    /**
     * The PlayReady content type.
     * 
    */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * The expiration date of license.
     * 
    */
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * The grace period of license.
     * 
    */
    public Optional<String> getGracePeriod() {
        return Optional.ofNullable(this.gracePeriod);
    }
    /**
     * The license type.
     * 
    */
    public String getLicenseType() {
        return this.licenseType;
    }
    /**
     * The license PlayRight
     * 
    */
    public Optional<ContentKeyPolicyPlayReadyPlayRightResponse> getPlayRight() {
        return Optional.ofNullable(this.playRight);
    }
    /**
     * The relative begin date of license.
     * 
    */
    public Optional<String> getRelativeBeginDate() {
        return Optional.ofNullable(this.relativeBeginDate);
    }
    /**
     * The relative expiration date of license.
     * 
    */
    public Optional<String> getRelativeExpirationDate() {
        return Optional.ofNullable(this.relativeExpirationDate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowTestDevices;
        private @Nullable String beginDate;
        private Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation;
        private String contentType;
        private @Nullable String expirationDate;
        private @Nullable String gracePeriod;
        private String licenseType;
        private @Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight;
        private @Nullable String relativeBeginDate;
        private @Nullable String relativeExpirationDate;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyLicenseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowTestDevices = defaults.allowTestDevices;
    	      this.beginDate = defaults.beginDate;
    	      this.contentKeyLocation = defaults.contentKeyLocation;
    	      this.contentType = defaults.contentType;
    	      this.expirationDate = defaults.expirationDate;
    	      this.gracePeriod = defaults.gracePeriod;
    	      this.licenseType = defaults.licenseType;
    	      this.playRight = defaults.playRight;
    	      this.relativeBeginDate = defaults.relativeBeginDate;
    	      this.relativeExpirationDate = defaults.relativeExpirationDate;
        }

        public Builder allowTestDevices(Boolean allowTestDevices) {
            this.allowTestDevices = Objects.requireNonNull(allowTestDevices);
            return this;
        }

        public Builder beginDate(@Nullable String beginDate) {
            this.beginDate = beginDate;
            return this;
        }

        public Builder contentKeyLocation(Either<ContentKeyPolicyPlayReadyContentEncryptionKeyFromHeaderResponse,ContentKeyPolicyPlayReadyContentEncryptionKeyFromKeyIdentifierResponse> contentKeyLocation) {
            this.contentKeyLocation = Objects.requireNonNull(contentKeyLocation);
            return this;
        }

        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder gracePeriod(@Nullable String gracePeriod) {
            this.gracePeriod = gracePeriod;
            return this;
        }

        public Builder licenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }

        public Builder playRight(@Nullable ContentKeyPolicyPlayReadyPlayRightResponse playRight) {
            this.playRight = playRight;
            return this;
        }

        public Builder relativeBeginDate(@Nullable String relativeBeginDate) {
            this.relativeBeginDate = relativeBeginDate;
            return this;
        }

        public Builder relativeExpirationDate(@Nullable String relativeExpirationDate) {
            this.relativeExpirationDate = relativeExpirationDate;
            return this;
        }
        public ContentKeyPolicyPlayReadyLicenseResponse build() {
            return new ContentKeyPolicyPlayReadyLicenseResponse(allowTestDevices, beginDate, contentKeyLocation, contentType, expirationDate, gracePeriod, licenseType, playRight, relativeBeginDate, relativeExpirationDate);
        }
    }
}
