// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.marketplace;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateStoreCollectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateStoreCollectionArgs Empty = new PrivateStoreCollectionArgs();

    /**
     * Indicating whether all subscriptions are selected (=true) or not (=false).
     * 
     */
    @InputImport(name="allSubscriptions")
    private final @Nullable Input<Boolean> allSubscriptions;

    public Input<Boolean> getAllSubscriptions() {
        return this.allSubscriptions == null ? Input.empty() : this.allSubscriptions;
    }

    /**
     * Gets or sets the association with Commercial's Billing Account.
     * 
     */
    @InputImport(name="claim")
    private final @Nullable Input<String> claim;

    public Input<String> getClaim() {
        return this.claim == null ? Input.empty() : this.claim;
    }

    /**
     * The collection ID
     * 
     */
    @InputImport(name="collectionId")
    private final @Nullable Input<String> collectionId;

    public Input<String> getCollectionId() {
        return this.collectionId == null ? Input.empty() : this.collectionId;
    }

    /**
     * Gets or sets collection name.
     * 
     */
    @InputImport(name="collectionName")
    private final @Nullable Input<String> collectionName;

    public Input<String> getCollectionName() {
        return this.collectionName == null ? Input.empty() : this.collectionName;
    }

    /**
     * Indicating whether the collection is enabled or disabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The store ID - must use the tenant ID
     * 
     */
    @InputImport(name="privateStoreId", required=true)
    private final Input<String> privateStoreId;

    public Input<String> getPrivateStoreId() {
        return this.privateStoreId;
    }

    /**
     * Gets or sets subscription ids list. Empty list indicates all subscriptions are selected, null indicates no update is done, explicit list indicates the explicit selected subscriptions. On insert, null is considered as bad request
     * 
     */
    @InputImport(name="subscriptionsList")
    private final @Nullable Input<List<String>> subscriptionsList;

    public Input<List<String>> getSubscriptionsList() {
        return this.subscriptionsList == null ? Input.empty() : this.subscriptionsList;
    }

    public PrivateStoreCollectionArgs(
        @Nullable Input<Boolean> allSubscriptions,
        @Nullable Input<String> claim,
        @Nullable Input<String> collectionId,
        @Nullable Input<String> collectionName,
        @Nullable Input<Boolean> enabled,
        Input<String> privateStoreId,
        @Nullable Input<List<String>> subscriptionsList) {
        this.allSubscriptions = allSubscriptions;
        this.claim = claim;
        this.collectionId = collectionId;
        this.collectionName = collectionName;
        this.enabled = enabled;
        this.privateStoreId = Objects.requireNonNull(privateStoreId, "expected parameter 'privateStoreId' to be non-null");
        this.subscriptionsList = subscriptionsList;
    }

    private PrivateStoreCollectionArgs() {
        this.allSubscriptions = Input.empty();
        this.claim = Input.empty();
        this.collectionId = Input.empty();
        this.collectionName = Input.empty();
        this.enabled = Input.empty();
        this.privateStoreId = Input.empty();
        this.subscriptionsList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateStoreCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allSubscriptions;
        private @Nullable Input<String> claim;
        private @Nullable Input<String> collectionId;
        private @Nullable Input<String> collectionName;
        private @Nullable Input<Boolean> enabled;
        private Input<String> privateStoreId;
        private @Nullable Input<List<String>> subscriptionsList;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateStoreCollectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allSubscriptions = defaults.allSubscriptions;
    	      this.claim = defaults.claim;
    	      this.collectionId = defaults.collectionId;
    	      this.collectionName = defaults.collectionName;
    	      this.enabled = defaults.enabled;
    	      this.privateStoreId = defaults.privateStoreId;
    	      this.subscriptionsList = defaults.subscriptionsList;
        }

        public Builder setAllSubscriptions(@Nullable Input<Boolean> allSubscriptions) {
            this.allSubscriptions = allSubscriptions;
            return this;
        }

        public Builder setAllSubscriptions(@Nullable Boolean allSubscriptions) {
            this.allSubscriptions = Input.ofNullable(allSubscriptions);
            return this;
        }

        public Builder setClaim(@Nullable Input<String> claim) {
            this.claim = claim;
            return this;
        }

        public Builder setClaim(@Nullable String claim) {
            this.claim = Input.ofNullable(claim);
            return this;
        }

        public Builder setCollectionId(@Nullable Input<String> collectionId) {
            this.collectionId = collectionId;
            return this;
        }

        public Builder setCollectionId(@Nullable String collectionId) {
            this.collectionId = Input.ofNullable(collectionId);
            return this;
        }

        public Builder setCollectionName(@Nullable Input<String> collectionName) {
            this.collectionName = collectionName;
            return this;
        }

        public Builder setCollectionName(@Nullable String collectionName) {
            this.collectionName = Input.ofNullable(collectionName);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setPrivateStoreId(Input<String> privateStoreId) {
            this.privateStoreId = Objects.requireNonNull(privateStoreId);
            return this;
        }

        public Builder setPrivateStoreId(String privateStoreId) {
            this.privateStoreId = Input.of(Objects.requireNonNull(privateStoreId));
            return this;
        }

        public Builder setSubscriptionsList(@Nullable Input<List<String>> subscriptionsList) {
            this.subscriptionsList = subscriptionsList;
            return this;
        }

        public Builder setSubscriptionsList(@Nullable List<String> subscriptionsList) {
            this.subscriptionsList = Input.ofNullable(subscriptionsList);
            return this;
        }

        public PrivateStoreCollectionArgs build() {
            return new PrivateStoreCollectionArgs(allSubscriptions, claim, collectionId, collectionName, enabled, privateStoreId, subscriptionsList);
        }
    }
}
