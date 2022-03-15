// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProductResult {
    /**
     * whether subscription approval is required. If false, new subscriptions will be approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true, administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    private final @Nullable Boolean approvalRequired;
    /**
     * Product description. May include HTML formatting tags.
     * 
     */
    private final @Nullable String description;
    /**
     * Product name.
     * 
     */
    private final String displayName;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * whether product is published or not. Published products are discoverable by users of developer portal. Non published products are visible only to administrators. Default state of Product is notPublished.
     * 
     */
    private final @Nullable String state;
    /**
     * Whether a product subscription is required for accessing APIs included in this product. If true, the product is referred to as "protected" and a valid subscription key is required for a request to an API included in the product to succeed. If false, the product is referred to as "open" and requests to an API included in the product can be made without a subscription key. If property is omitted when creating a new product it's value is assumed to be true.
     * 
     */
    private final @Nullable Boolean subscriptionRequired;
    /**
     * Whether the number of subscriptions a user can have to this product at the same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    private final @Nullable Integer subscriptionsLimit;
    /**
     * Product terms of use. Developers trying to subscribe to the product will be presented and required to accept these terms before they can complete the subscription process.
     * 
     */
    private final @Nullable String terms;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetProductResult(
        @CustomType.Parameter("approvalRequired") @Nullable Boolean approvalRequired,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("subscriptionRequired") @Nullable Boolean subscriptionRequired,
        @CustomType.Parameter("subscriptionsLimit") @Nullable Integer subscriptionsLimit,
        @CustomType.Parameter("terms") @Nullable String terms,
        @CustomType.Parameter("type") String type) {
        this.approvalRequired = approvalRequired;
        this.description = description;
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.state = state;
        this.subscriptionRequired = subscriptionRequired;
        this.subscriptionsLimit = subscriptionsLimit;
        this.terms = terms;
        this.type = type;
    }

    /**
     * whether subscription approval is required. If false, new subscriptions will be approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true, administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
    */
    public Optional<Boolean> getApprovalRequired() {
        return Optional.ofNullable(this.approvalRequired);
    }
    /**
     * Product description. May include HTML formatting tags.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Product name.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * whether product is published or not. Published products are discoverable by users of developer portal. Non published products are visible only to administrators. Default state of Product is notPublished.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Whether a product subscription is required for accessing APIs included in this product. If true, the product is referred to as "protected" and a valid subscription key is required for a request to an API included in the product to succeed. If false, the product is referred to as "open" and requests to an API included in the product can be made without a subscription key. If property is omitted when creating a new product it's value is assumed to be true.
     * 
    */
    public Optional<Boolean> getSubscriptionRequired() {
        return Optional.ofNullable(this.subscriptionRequired);
    }
    /**
     * Whether the number of subscriptions a user can have to this product at the same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
    */
    public Optional<Integer> getSubscriptionsLimit() {
        return Optional.ofNullable(this.subscriptionsLimit);
    }
    /**
     * Product terms of use. Developers trying to subscribe to the product will be presented and required to accept these terms before they can complete the subscription process.
     * 
    */
    public Optional<String> getTerms() {
        return Optional.ofNullable(this.terms);
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProductResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean approvalRequired;
        private @Nullable String description;
        private String displayName;
        private String id;
        private String name;
        private @Nullable String state;
        private @Nullable Boolean subscriptionRequired;
        private @Nullable Integer subscriptionsLimit;
        private @Nullable String terms;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProductResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRequired = defaults.approvalRequired;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.subscriptionRequired = defaults.subscriptionRequired;
    	      this.subscriptionsLimit = defaults.subscriptionsLimit;
    	      this.terms = defaults.terms;
    	      this.type = defaults.type;
        }

        public Builder approvalRequired(@Nullable Boolean approvalRequired) {
            this.approvalRequired = approvalRequired;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder subscriptionRequired(@Nullable Boolean subscriptionRequired) {
            this.subscriptionRequired = subscriptionRequired;
            return this;
        }

        public Builder subscriptionsLimit(@Nullable Integer subscriptionsLimit) {
            this.subscriptionsLimit = subscriptionsLimit;
            return this;
        }

        public Builder terms(@Nullable String terms) {
            this.terms = terms;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetProductResult build() {
            return new GetProductResult(approvalRequired, description, displayName, id, name, state, subscriptionRequired, subscriptionsLimit, terms, type);
        }
    }
}
