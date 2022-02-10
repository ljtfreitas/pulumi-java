// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.ProductState;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProductArgs Empty = new ProductArgs();

    @InputImport(name="approvalRequired")
    private final @Nullable Input<Boolean> approvalRequired;

    public Input<Boolean> getApprovalRequired() {
        return this.approvalRequired == null ? Input.empty() : this.approvalRequired;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName", required=true)
    private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="productId")
    private final @Nullable Input<String> productId;

    public Input<String> getProductId() {
        return this.productId == null ? Input.empty() : this.productId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="state")
    private final @Nullable Input<ProductState> state;

    public Input<ProductState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="subscriptionRequired")
    private final @Nullable Input<Boolean> subscriptionRequired;

    public Input<Boolean> getSubscriptionRequired() {
        return this.subscriptionRequired == null ? Input.empty() : this.subscriptionRequired;
    }

    @InputImport(name="subscriptionsLimit")
    private final @Nullable Input<Integer> subscriptionsLimit;

    public Input<Integer> getSubscriptionsLimit() {
        return this.subscriptionsLimit == null ? Input.empty() : this.subscriptionsLimit;
    }

    @InputImport(name="terms")
    private final @Nullable Input<String> terms;

    public Input<String> getTerms() {
        return this.terms == null ? Input.empty() : this.terms;
    }

    public ProductArgs(
        @Nullable Input<Boolean> approvalRequired,
        @Nullable Input<String> description,
        Input<String> displayName,
        @Nullable Input<String> productId,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<ProductState> state,
        @Nullable Input<Boolean> subscriptionRequired,
        @Nullable Input<Integer> subscriptionsLimit,
        @Nullable Input<String> terms) {
        this.approvalRequired = approvalRequired;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.productId = productId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.state = state;
        this.subscriptionRequired = subscriptionRequired;
        this.subscriptionsLimit = subscriptionsLimit;
        this.terms = terms;
    }

    private ProductArgs() {
        this.approvalRequired = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.productId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.state = Input.empty();
        this.subscriptionRequired = Input.empty();
        this.subscriptionsLimit = Input.empty();
        this.terms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> approvalRequired;
        private @Nullable Input<String> description;
        private Input<String> displayName;
        private @Nullable Input<String> productId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<ProductState> state;
        private @Nullable Input<Boolean> subscriptionRequired;
        private @Nullable Input<Integer> subscriptionsLimit;
        private @Nullable Input<String> terms;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRequired = defaults.approvalRequired;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.productId = defaults.productId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.state = defaults.state;
    	      this.subscriptionRequired = defaults.subscriptionRequired;
    	      this.subscriptionsLimit = defaults.subscriptionsLimit;
    	      this.terms = defaults.terms;
        }

        public Builder setApprovalRequired(@Nullable Input<Boolean> approvalRequired) {
            this.approvalRequired = approvalRequired;
            return this;
        }

        public Builder setApprovalRequired(@Nullable Boolean approvalRequired) {
            this.approvalRequired = Input.ofNullable(approvalRequired);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setProductId(@Nullable Input<String> productId) {
            this.productId = productId;
            return this;
        }

        public Builder setProductId(@Nullable String productId) {
            this.productId = Input.ofNullable(productId);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setState(@Nullable Input<ProductState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable ProductState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setSubscriptionRequired(@Nullable Input<Boolean> subscriptionRequired) {
            this.subscriptionRequired = subscriptionRequired;
            return this;
        }

        public Builder setSubscriptionRequired(@Nullable Boolean subscriptionRequired) {
            this.subscriptionRequired = Input.ofNullable(subscriptionRequired);
            return this;
        }

        public Builder setSubscriptionsLimit(@Nullable Input<Integer> subscriptionsLimit) {
            this.subscriptionsLimit = subscriptionsLimit;
            return this;
        }

        public Builder setSubscriptionsLimit(@Nullable Integer subscriptionsLimit) {
            this.subscriptionsLimit = Input.ofNullable(subscriptionsLimit);
            return this;
        }

        public Builder setTerms(@Nullable Input<String> terms) {
            this.terms = terms;
            return this;
        }

        public Builder setTerms(@Nullable String terms) {
            this.terms = Input.ofNullable(terms);
            return this;
        }

        public ProductArgs build() {
            return new ProductArgs(approvalRequired, description, displayName, productId, resourceGroupName, serviceName, state, subscriptionRequired, subscriptionsLimit, terms);
        }
    }
}