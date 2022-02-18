// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.ErrorDetailResponse;
import io.pulumi.azurenative.edgeorder.inputs.ForwardShippingDetailsResponse;
import io.pulumi.azurenative.edgeorder.inputs.PreferencesResponse;
import io.pulumi.azurenative.edgeorder.inputs.ProductDetailsResponse;
import io.pulumi.azurenative.edgeorder.inputs.ResourceProviderDetailsResponse;
import io.pulumi.azurenative.edgeorder.inputs.ReverseShippingDetailsResponse;
import io.pulumi.azurenative.edgeorder.inputs.StageDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Order item details
 * 
 */
public final class OrderItemDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OrderItemDetailsResponse Empty = new OrderItemDetailsResponse();

    /**
     * Cancellation reason.
     * 
     */
    @InputImport(name="cancellationReason", required=true)
    private final String cancellationReason;

    public String getCancellationReason() {
        return this.cancellationReason;
    }

    /**
     * Describes whether the order item is cancellable or not.
     * 
     */
    @InputImport(name="cancellationStatus", required=true)
    private final String cancellationStatus;

    public String getCancellationStatus() {
        return this.cancellationStatus;
    }

    /**
     * Current Order item Status
     * 
     */
    @InputImport(name="currentStage", required=true)
    private final StageDetailsResponse currentStage;

    public StageDetailsResponse getCurrentStage() {
        return this.currentStage;
    }

    /**
     * Describes whether the order item is deletable or not.
     * 
     */
    @InputImport(name="deletionStatus", required=true)
    private final String deletionStatus;

    public String getDeletionStatus() {
        return this.deletionStatus;
    }

    /**
     * Top level error for the job.
     * 
     */
    @InputImport(name="error", required=true)
    private final ErrorDetailResponse error;

    public ErrorDetailResponse getError() {
        return this.error;
    }

    /**
     * Forward Package Shipping details
     * 
     */
    @InputImport(name="forwardShippingDetails", required=true)
    private final ForwardShippingDetailsResponse forwardShippingDetails;

    public ForwardShippingDetailsResponse getForwardShippingDetails() {
        return this.forwardShippingDetails;
    }

    /**
     * Parent RP details - this returns only the first or default parent RP from the entire list
     * 
     */
    @InputImport(name="managementRpDetails", required=true)
    private final ResourceProviderDetailsResponse managementRpDetails;

    public ResourceProviderDetailsResponse getManagementRpDetails() {
        return this.managementRpDetails;
    }

    /**
     * List of parent RP details supported for configuration.
     * 
     */
    @InputImport(name="managementRpDetailsList", required=true)
    private final List<ResourceProviderDetailsResponse> managementRpDetailsList;

    public List<ResourceProviderDetailsResponse> getManagementRpDetailsList() {
        return this.managementRpDetailsList;
    }

    /**
     * Additional notification email list
     * 
     */
    @InputImport(name="notificationEmailList")
    private final @Nullable List<String> notificationEmailList;

    public List<String> getNotificationEmailList() {
        return this.notificationEmailList == null ? List.of() : this.notificationEmailList;
    }

    /**
     * Order item status history
     * 
     */
    @InputImport(name="orderItemStageHistory", required=true)
    private final List<StageDetailsResponse> orderItemStageHistory;

    public List<StageDetailsResponse> getOrderItemStageHistory() {
        return this.orderItemStageHistory;
    }

    /**
     * Order item type.
     * 
     */
    @InputImport(name="orderItemType", required=true)
    private final String orderItemType;

    public String getOrderItemType() {
        return this.orderItemType;
    }

    /**
     * Customer notification Preferences
     * 
     */
    @InputImport(name="preferences")
    private final @Nullable PreferencesResponse preferences;

    public Optional<PreferencesResponse> getPreferences() {
        return this.preferences == null ? Optional.empty() : Optional.ofNullable(this.preferences);
    }

    /**
     * Unique identifier for configuration.
     * 
     */
    @InputImport(name="productDetails", required=true)
    private final ProductDetailsResponse productDetails;

    public ProductDetailsResponse getProductDetails() {
        return this.productDetails;
    }

    /**
     * Return reason.
     * 
     */
    @InputImport(name="returnReason", required=true)
    private final String returnReason;

    public String getReturnReason() {
        return this.returnReason;
    }

    /**
     * Describes whether the order item is returnable or not.
     * 
     */
    @InputImport(name="returnStatus", required=true)
    private final String returnStatus;

    public String getReturnStatus() {
        return this.returnStatus;
    }

    /**
     * Reverse Package Shipping details
     * 
     */
    @InputImport(name="reverseShippingDetails", required=true)
    private final ReverseShippingDetailsResponse reverseShippingDetails;

    public ReverseShippingDetailsResponse getReverseShippingDetails() {
        return this.reverseShippingDetails;
    }

    public OrderItemDetailsResponse(
        String cancellationReason,
        String cancellationStatus,
        StageDetailsResponse currentStage,
        String deletionStatus,
        ErrorDetailResponse error,
        ForwardShippingDetailsResponse forwardShippingDetails,
        ResourceProviderDetailsResponse managementRpDetails,
        List<ResourceProviderDetailsResponse> managementRpDetailsList,
        @Nullable List<String> notificationEmailList,
        List<StageDetailsResponse> orderItemStageHistory,
        String orderItemType,
        @Nullable PreferencesResponse preferences,
        ProductDetailsResponse productDetails,
        String returnReason,
        String returnStatus,
        ReverseShippingDetailsResponse reverseShippingDetails) {
        this.cancellationReason = Objects.requireNonNull(cancellationReason, "expected parameter 'cancellationReason' to be non-null");
        this.cancellationStatus = Objects.requireNonNull(cancellationStatus, "expected parameter 'cancellationStatus' to be non-null");
        this.currentStage = Objects.requireNonNull(currentStage, "expected parameter 'currentStage' to be non-null");
        this.deletionStatus = Objects.requireNonNull(deletionStatus, "expected parameter 'deletionStatus' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.forwardShippingDetails = Objects.requireNonNull(forwardShippingDetails, "expected parameter 'forwardShippingDetails' to be non-null");
        this.managementRpDetails = Objects.requireNonNull(managementRpDetails, "expected parameter 'managementRpDetails' to be non-null");
        this.managementRpDetailsList = Objects.requireNonNull(managementRpDetailsList, "expected parameter 'managementRpDetailsList' to be non-null");
        this.notificationEmailList = notificationEmailList;
        this.orderItemStageHistory = Objects.requireNonNull(orderItemStageHistory, "expected parameter 'orderItemStageHistory' to be non-null");
        this.orderItemType = Objects.requireNonNull(orderItemType, "expected parameter 'orderItemType' to be non-null");
        this.preferences = preferences;
        this.productDetails = Objects.requireNonNull(productDetails, "expected parameter 'productDetails' to be non-null");
        this.returnReason = Objects.requireNonNull(returnReason, "expected parameter 'returnReason' to be non-null");
        this.returnStatus = Objects.requireNonNull(returnStatus, "expected parameter 'returnStatus' to be non-null");
        this.reverseShippingDetails = Objects.requireNonNull(reverseShippingDetails, "expected parameter 'reverseShippingDetails' to be non-null");
    }

    private OrderItemDetailsResponse() {
        this.cancellationReason = null;
        this.cancellationStatus = null;
        this.currentStage = null;
        this.deletionStatus = null;
        this.error = null;
        this.forwardShippingDetails = null;
        this.managementRpDetails = null;
        this.managementRpDetailsList = List.of();
        this.notificationEmailList = List.of();
        this.orderItemStageHistory = List.of();
        this.orderItemType = null;
        this.preferences = null;
        this.productDetails = null;
        this.returnReason = null;
        this.returnStatus = null;
        this.reverseShippingDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderItemDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cancellationReason;
        private String cancellationStatus;
        private StageDetailsResponse currentStage;
        private String deletionStatus;
        private ErrorDetailResponse error;
        private ForwardShippingDetailsResponse forwardShippingDetails;
        private ResourceProviderDetailsResponse managementRpDetails;
        private List<ResourceProviderDetailsResponse> managementRpDetailsList;
        private @Nullable List<String> notificationEmailList;
        private List<StageDetailsResponse> orderItemStageHistory;
        private String orderItemType;
        private @Nullable PreferencesResponse preferences;
        private ProductDetailsResponse productDetails;
        private String returnReason;
        private String returnStatus;
        private ReverseShippingDetailsResponse reverseShippingDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderItemDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cancellationReason = defaults.cancellationReason;
    	      this.cancellationStatus = defaults.cancellationStatus;
    	      this.currentStage = defaults.currentStage;
    	      this.deletionStatus = defaults.deletionStatus;
    	      this.error = defaults.error;
    	      this.forwardShippingDetails = defaults.forwardShippingDetails;
    	      this.managementRpDetails = defaults.managementRpDetails;
    	      this.managementRpDetailsList = defaults.managementRpDetailsList;
    	      this.notificationEmailList = defaults.notificationEmailList;
    	      this.orderItemStageHistory = defaults.orderItemStageHistory;
    	      this.orderItemType = defaults.orderItemType;
    	      this.preferences = defaults.preferences;
    	      this.productDetails = defaults.productDetails;
    	      this.returnReason = defaults.returnReason;
    	      this.returnStatus = defaults.returnStatus;
    	      this.reverseShippingDetails = defaults.reverseShippingDetails;
        }

        public Builder setCancellationReason(String cancellationReason) {
            this.cancellationReason = Objects.requireNonNull(cancellationReason);
            return this;
        }

        public Builder setCancellationStatus(String cancellationStatus) {
            this.cancellationStatus = Objects.requireNonNull(cancellationStatus);
            return this;
        }

        public Builder setCurrentStage(StageDetailsResponse currentStage) {
            this.currentStage = Objects.requireNonNull(currentStage);
            return this;
        }

        public Builder setDeletionStatus(String deletionStatus) {
            this.deletionStatus = Objects.requireNonNull(deletionStatus);
            return this;
        }

        public Builder setError(ErrorDetailResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }

        public Builder setForwardShippingDetails(ForwardShippingDetailsResponse forwardShippingDetails) {
            this.forwardShippingDetails = Objects.requireNonNull(forwardShippingDetails);
            return this;
        }

        public Builder setManagementRpDetails(ResourceProviderDetailsResponse managementRpDetails) {
            this.managementRpDetails = Objects.requireNonNull(managementRpDetails);
            return this;
        }

        public Builder setManagementRpDetailsList(List<ResourceProviderDetailsResponse> managementRpDetailsList) {
            this.managementRpDetailsList = Objects.requireNonNull(managementRpDetailsList);
            return this;
        }

        public Builder setNotificationEmailList(@Nullable List<String> notificationEmailList) {
            this.notificationEmailList = notificationEmailList;
            return this;
        }

        public Builder setOrderItemStageHistory(List<StageDetailsResponse> orderItemStageHistory) {
            this.orderItemStageHistory = Objects.requireNonNull(orderItemStageHistory);
            return this;
        }

        public Builder setOrderItemType(String orderItemType) {
            this.orderItemType = Objects.requireNonNull(orderItemType);
            return this;
        }

        public Builder setPreferences(@Nullable PreferencesResponse preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder setProductDetails(ProductDetailsResponse productDetails) {
            this.productDetails = Objects.requireNonNull(productDetails);
            return this;
        }

        public Builder setReturnReason(String returnReason) {
            this.returnReason = Objects.requireNonNull(returnReason);
            return this;
        }

        public Builder setReturnStatus(String returnStatus) {
            this.returnStatus = Objects.requireNonNull(returnStatus);
            return this;
        }

        public Builder setReverseShippingDetails(ReverseShippingDetailsResponse reverseShippingDetails) {
            this.reverseShippingDetails = Objects.requireNonNull(reverseShippingDetails);
            return this;
        }

        public OrderItemDetailsResponse build() {
            return new OrderItemDetailsResponse(cancellationReason, cancellationStatus, currentStage, deletionStatus, error, forwardShippingDetails, managementRpDetails, managementRpDetailsList, notificationEmailList, orderItemStageHistory, orderItemType, preferences, productDetails, returnReason, returnStatus, reverseShippingDetails);
        }
    }
}
