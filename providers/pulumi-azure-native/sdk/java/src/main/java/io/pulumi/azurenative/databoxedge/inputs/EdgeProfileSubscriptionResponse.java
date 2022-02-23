// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.SubscriptionRegisteredFeaturesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Subscription details for the Edge Profile
 * 
 */
public final class EdgeProfileSubscriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdgeProfileSubscriptionResponse Empty = new EdgeProfileSubscriptionResponse();

    /**
     * ARM ID of the subscription
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="locationPlacementId")
        private final @Nullable String locationPlacementId;

    public Optional<String> getLocationPlacementId() {
        return this.locationPlacementId == null ? Optional.empty() : Optional.ofNullable(this.locationPlacementId);
    }

    @InputImport(name="quotaId")
        private final @Nullable String quotaId;

    public Optional<String> getQuotaId() {
        return this.quotaId == null ? Optional.empty() : Optional.ofNullable(this.quotaId);
    }

    @InputImport(name="registeredFeatures")
        private final @Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures;

    public List<SubscriptionRegisteredFeaturesResponse> getRegisteredFeatures() {
        return this.registeredFeatures == null ? List.of() : this.registeredFeatures;
    }

    @InputImport(name="registrationDate")
        private final @Nullable String registrationDate;

    public Optional<String> getRegistrationDate() {
        return this.registrationDate == null ? Optional.empty() : Optional.ofNullable(this.registrationDate);
    }

    /**
     * Edge Subscription Registration ID
     * 
     */
    @InputImport(name="registrationId")
        private final @Nullable String registrationId;

    public Optional<String> getRegistrationId() {
        return this.registrationId == null ? Optional.empty() : Optional.ofNullable(this.registrationId);
    }

    @InputImport(name="serializedDetails")
        private final @Nullable String serializedDetails;

    public Optional<String> getSerializedDetails() {
        return this.serializedDetails == null ? Optional.empty() : Optional.ofNullable(this.serializedDetails);
    }

    @InputImport(name="state")
        private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    @InputImport(name="subscriptionId")
        private final @Nullable String subscriptionId;

    public Optional<String> getSubscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    @InputImport(name="tenantId")
        private final @Nullable String tenantId;

    public Optional<String> getTenantId() {
        return this.tenantId == null ? Optional.empty() : Optional.ofNullable(this.tenantId);
    }

    public EdgeProfileSubscriptionResponse(
        @Nullable String id,
        @Nullable String locationPlacementId,
        @Nullable String quotaId,
        @Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures,
        @Nullable String registrationDate,
        @Nullable String registrationId,
        @Nullable String serializedDetails,
        @Nullable String state,
        @Nullable String subscriptionId,
        @Nullable String tenantId) {
        this.id = id;
        this.locationPlacementId = locationPlacementId;
        this.quotaId = quotaId;
        this.registeredFeatures = registeredFeatures;
        this.registrationDate = registrationDate;
        this.registrationId = registrationId;
        this.serializedDetails = serializedDetails;
        this.state = state;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
    }

    private EdgeProfileSubscriptionResponse() {
        this.id = null;
        this.locationPlacementId = null;
        this.quotaId = null;
        this.registeredFeatures = List.of();
        this.registrationDate = null;
        this.registrationId = null;
        this.serializedDetails = null;
        this.state = null;
        this.subscriptionId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeProfileSubscriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String locationPlacementId;
        private @Nullable String quotaId;
        private @Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures;
        private @Nullable String registrationDate;
        private @Nullable String registrationId;
        private @Nullable String serializedDetails;
        private @Nullable String state;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeProfileSubscriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.locationPlacementId = defaults.locationPlacementId;
    	      this.quotaId = defaults.quotaId;
    	      this.registeredFeatures = defaults.registeredFeatures;
    	      this.registrationDate = defaults.registrationDate;
    	      this.registrationId = defaults.registrationId;
    	      this.serializedDetails = defaults.serializedDetails;
    	      this.state = defaults.state;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setLocationPlacementId(@Nullable String locationPlacementId) {
            this.locationPlacementId = locationPlacementId;
            return this;
        }

        public Builder setQuotaId(@Nullable String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        public Builder setRegisteredFeatures(@Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures) {
            this.registeredFeatures = registeredFeatures;
            return this;
        }

        public Builder setRegistrationDate(@Nullable String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public Builder setRegistrationId(@Nullable String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        public Builder setSerializedDetails(@Nullable String serializedDetails) {
            this.serializedDetails = serializedDetails;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setSubscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public EdgeProfileSubscriptionResponse build() {
            return new EdgeProfileSubscriptionResponse(id, locationPlacementId, quotaId, registeredFeatures, registrationDate, registrationId, serializedDetails, state, subscriptionId, tenantId);
        }
    }
}
