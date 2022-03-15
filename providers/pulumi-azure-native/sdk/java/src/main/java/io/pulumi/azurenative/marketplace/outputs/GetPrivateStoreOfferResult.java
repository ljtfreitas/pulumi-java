// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace.outputs;

import io.pulumi.azurenative.marketplace.outputs.PlanResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateStoreOfferResult {
    /**
     * Private store offer creation date
     * 
     */
    private final String createdAt;
    /**
     * Identifier for purposes of race condition
     * 
     */
    private final @Nullable String eTag;
    /**
     * Icon File Uris
     * 
     */
    private final @Nullable Map<String,String> iconFileUris;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * Private store offer modification date
     * 
     */
    private final String modifiedAt;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * It will be displayed prominently in the marketplace
     * 
     */
    private final String offerDisplayName;
    /**
     * Offer plans
     * 
     */
    private final @Nullable List<PlanResponse> plans;
    /**
     * Private store unique id
     * 
     */
    private final String privateStoreId;
    /**
     * Publisher name that will be displayed prominently in the marketplace
     * 
     */
    private final String publisherDisplayName;
    /**
     * Plan ids limitation for this offer
     * 
     */
    private final @Nullable List<String> specificPlanIdsLimitation;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * Offers unique id
     * 
     */
    private final String uniqueOfferId;
    /**
     * Indicating whether the offer was not updated to db (true = not updated). If the allow list is identical to the existed one in db, the offer would not be updated.
     * 
     */
    private final @Nullable Boolean updateSuppressedDueIdempotence;

    @CustomType.Constructor
    private GetPrivateStoreOfferResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("eTag") @Nullable String eTag,
        @CustomType.Parameter("iconFileUris") @Nullable Map<String,String> iconFileUris,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("modifiedAt") String modifiedAt,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("offerDisplayName") String offerDisplayName,
        @CustomType.Parameter("plans") @Nullable List<PlanResponse> plans,
        @CustomType.Parameter("privateStoreId") String privateStoreId,
        @CustomType.Parameter("publisherDisplayName") String publisherDisplayName,
        @CustomType.Parameter("specificPlanIdsLimitation") @Nullable List<String> specificPlanIdsLimitation,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uniqueOfferId") String uniqueOfferId,
        @CustomType.Parameter("updateSuppressedDueIdempotence") @Nullable Boolean updateSuppressedDueIdempotence) {
        this.createdAt = createdAt;
        this.eTag = eTag;
        this.iconFileUris = iconFileUris;
        this.id = id;
        this.modifiedAt = modifiedAt;
        this.name = name;
        this.offerDisplayName = offerDisplayName;
        this.plans = plans;
        this.privateStoreId = privateStoreId;
        this.publisherDisplayName = publisherDisplayName;
        this.specificPlanIdsLimitation = specificPlanIdsLimitation;
        this.type = type;
        this.uniqueOfferId = uniqueOfferId;
        this.updateSuppressedDueIdempotence = updateSuppressedDueIdempotence;
    }

    /**
     * Private store offer creation date
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Identifier for purposes of race condition
     * 
    */
    public Optional<String> getETag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * Icon File Uris
     * 
    */
    public Map<String,String> getIconFileUris() {
        return this.iconFileUris == null ? Map.of() : this.iconFileUris;
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Private store offer modification date
     * 
    */
    public String getModifiedAt() {
        return this.modifiedAt;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * It will be displayed prominently in the marketplace
     * 
    */
    public String getOfferDisplayName() {
        return this.offerDisplayName;
    }
    /**
     * Offer plans
     * 
    */
    public List<PlanResponse> getPlans() {
        return this.plans == null ? List.of() : this.plans;
    }
    /**
     * Private store unique id
     * 
    */
    public String getPrivateStoreId() {
        return this.privateStoreId;
    }
    /**
     * Publisher name that will be displayed prominently in the marketplace
     * 
    */
    public String getPublisherDisplayName() {
        return this.publisherDisplayName;
    }
    /**
     * Plan ids limitation for this offer
     * 
    */
    public List<String> getSpecificPlanIdsLimitation() {
        return this.specificPlanIdsLimitation == null ? List.of() : this.specificPlanIdsLimitation;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Offers unique id
     * 
    */
    public String getUniqueOfferId() {
        return this.uniqueOfferId;
    }
    /**
     * Indicating whether the offer was not updated to db (true = not updated). If the allow list is identical to the existed one in db, the offer would not be updated.
     * 
    */
    public Optional<Boolean> getUpdateSuppressedDueIdempotence() {
        return Optional.ofNullable(this.updateSuppressedDueIdempotence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateStoreOfferResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private @Nullable String eTag;
        private @Nullable Map<String,String> iconFileUris;
        private String id;
        private String modifiedAt;
        private String name;
        private String offerDisplayName;
        private @Nullable List<PlanResponse> plans;
        private String privateStoreId;
        private String publisherDisplayName;
        private @Nullable List<String> specificPlanIdsLimitation;
        private String type;
        private String uniqueOfferId;
        private @Nullable Boolean updateSuppressedDueIdempotence;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateStoreOfferResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.eTag = defaults.eTag;
    	      this.iconFileUris = defaults.iconFileUris;
    	      this.id = defaults.id;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.name = defaults.name;
    	      this.offerDisplayName = defaults.offerDisplayName;
    	      this.plans = defaults.plans;
    	      this.privateStoreId = defaults.privateStoreId;
    	      this.publisherDisplayName = defaults.publisherDisplayName;
    	      this.specificPlanIdsLimitation = defaults.specificPlanIdsLimitation;
    	      this.type = defaults.type;
    	      this.uniqueOfferId = defaults.uniqueOfferId;
    	      this.updateSuppressedDueIdempotence = defaults.updateSuppressedDueIdempotence;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
        }

        public Builder iconFileUris(@Nullable Map<String,String> iconFileUris) {
            this.iconFileUris = iconFileUris;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder modifiedAt(String modifiedAt) {
            this.modifiedAt = Objects.requireNonNull(modifiedAt);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder offerDisplayName(String offerDisplayName) {
            this.offerDisplayName = Objects.requireNonNull(offerDisplayName);
            return this;
        }

        public Builder plans(@Nullable List<PlanResponse> plans) {
            this.plans = plans;
            return this;
        }

        public Builder privateStoreId(String privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }

        public Builder publisherDisplayName(String publisherDisplayName) {
            this.publisherDisplayName = Objects.requireNonNull(publisherDisplayName);
            return this;
        }

        public Builder specificPlanIdsLimitation(@Nullable List<String> specificPlanIdsLimitation) {
            this.specificPlanIdsLimitation = specificPlanIdsLimitation;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder uniqueOfferId(String uniqueOfferId) {
            this.uniqueOfferId = Objects.requireNonNull(uniqueOfferId);
            return this;
        }

        public Builder updateSuppressedDueIdempotence(@Nullable Boolean updateSuppressedDueIdempotence) {
            this.updateSuppressedDueIdempotence = updateSuppressedDueIdempotence;
            return this;
        }
        public GetPrivateStoreOfferResult build() {
            return new GetPrivateStoreOfferResult(createdAt, eTag, iconFileUris, id, modifiedAt, name, offerDisplayName, plans, privateStoreId, publisherDisplayName, specificPlanIdsLimitation, type, uniqueOfferId, updateSuppressedDueIdempotence);
        }
    }
}
