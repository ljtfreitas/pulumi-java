// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LabAnnouncementPropertiesResponse {
    /**
     * Is the lab announcement active/enabled at this time?
     * 
     */
    private final @Nullable String enabled;
    /**
     * The time at which the announcement expires (null for never)
     * 
     */
    private final @Nullable String expirationDate;
    /**
     * Has this announcement expired?
     * 
     */
    private final @Nullable Boolean expired;
    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
     */
    private final @Nullable String markdown;
    /**
     * The provisioning status of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The plain text title for the lab announcement
     * 
     */
    private final @Nullable String title;
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    private final String uniqueIdentifier;

    @CustomType.Constructor
    private LabAnnouncementPropertiesResponse(
        @CustomType.Parameter("enabled") @Nullable String enabled,
        @CustomType.Parameter("expirationDate") @Nullable String expirationDate,
        @CustomType.Parameter("expired") @Nullable Boolean expired,
        @CustomType.Parameter("markdown") @Nullable String markdown,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("title") @Nullable String title,
        @CustomType.Parameter("uniqueIdentifier") String uniqueIdentifier) {
        this.enabled = enabled;
        this.expirationDate = expirationDate;
        this.expired = expired;
        this.markdown = markdown;
        this.provisioningState = provisioningState;
        this.title = title;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    /**
     * Is the lab announcement active/enabled at this time?
     * 
    */
    public Optional<String> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The time at which the announcement expires (null for never)
     * 
    */
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    /**
     * Has this announcement expired?
     * 
    */
    public Optional<Boolean> getExpired() {
        return Optional.ofNullable(this.expired);
    }
    /**
     * The markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     * 
    */
    public Optional<String> getMarkdown() {
        return Optional.ofNullable(this.markdown);
    }
    /**
     * The provisioning status of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The plain text title for the lab announcement
     * 
    */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
    */
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabAnnouncementPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String expirationDate;
        private @Nullable Boolean expired;
        private @Nullable String markdown;
        private String provisioningState;
        private @Nullable String title;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(LabAnnouncementPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expired = defaults.expired;
    	      this.markdown = defaults.markdown;
    	      this.provisioningState = defaults.provisioningState;
    	      this.title = defaults.title;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder enabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder expired(@Nullable Boolean expired) {
            this.expired = expired;
            return this;
        }

        public Builder markdown(@Nullable String markdown) {
            this.markdown = markdown;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder uniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }
        public LabAnnouncementPropertiesResponse build() {
            return new LabAnnouncementPropertiesResponse(enabled, expirationDate, expired, markdown, provisioningState, title, uniqueIdentifier);
        }
    }
}
