// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.inputs.LogzOrganizationPropertiesResponse;
import io.pulumi.azurenative.logz.inputs.PlanDataResponse;
import io.pulumi.azurenative.logz.inputs.UserInfoResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to the monitor resource.
 * 
 */
public final class MonitorPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonitorPropertiesResponse Empty = new MonitorPropertiesResponse();

    @Import(name="liftrResourceCategory", required=true)
      private final String liftrResourceCategory;

    public String getLiftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * The priority of the resource.
     * 
     */
    @Import(name="liftrResourcePreference", required=true)
      private final Integer liftrResourcePreference;

    public Integer getLiftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    @Import(name="logzOrganizationProperties")
      private final @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties;

    public Optional<LogzOrganizationPropertiesResponse> getLogzOrganizationProperties() {
        return this.logzOrganizationProperties == null ? Optional.empty() : Optional.ofNullable(this.logzOrganizationProperties);
    }

    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    @Import(name="marketplaceSubscriptionStatus")
      private final @Nullable String marketplaceSubscriptionStatus;

    public Optional<String> getMarketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus == null ? Optional.empty() : Optional.ofNullable(this.marketplaceSubscriptionStatus);
    }

    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    @Import(name="monitoringStatus")
      private final @Nullable String monitoringStatus;

    public Optional<String> getMonitoringStatus() {
        return this.monitoringStatus == null ? Optional.empty() : Optional.ofNullable(this.monitoringStatus);
    }

    @Import(name="planData")
      private final @Nullable PlanDataResponse planData;

    public Optional<PlanDataResponse> getPlanData() {
        return this.planData == null ? Optional.empty() : Optional.ofNullable(this.planData);
    }

    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @Import(name="userInfo")
      private final @Nullable UserInfoResponse userInfo;

    public Optional<UserInfoResponse> getUserInfo() {
        return this.userInfo == null ? Optional.empty() : Optional.ofNullable(this.userInfo);
    }

    public MonitorPropertiesResponse(
        String liftrResourceCategory,
        Integer liftrResourcePreference,
        @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties,
        @Nullable String marketplaceSubscriptionStatus,
        @Nullable String monitoringStatus,
        @Nullable PlanDataResponse planData,
        String provisioningState,
        @Nullable UserInfoResponse userInfo) {
        this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory, "expected parameter 'liftrResourceCategory' to be non-null");
        this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference, "expected parameter 'liftrResourcePreference' to be non-null");
        this.logzOrganizationProperties = logzOrganizationProperties;
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        this.monitoringStatus = monitoringStatus;
        this.planData = planData;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.userInfo = userInfo;
    }

    private MonitorPropertiesResponse() {
        this.liftrResourceCategory = null;
        this.liftrResourcePreference = null;
        this.logzOrganizationProperties = null;
        this.marketplaceSubscriptionStatus = null;
        this.monitoringStatus = null;
        this.planData = null;
        this.provisioningState = null;
        this.userInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String liftrResourceCategory;
        private Integer liftrResourcePreference;
        private @Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties;
        private @Nullable String marketplaceSubscriptionStatus;
        private @Nullable String monitoringStatus;
        private @Nullable PlanDataResponse planData;
        private String provisioningState;
        private @Nullable UserInfoResponse userInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.liftrResourceCategory = defaults.liftrResourceCategory;
    	      this.liftrResourcePreference = defaults.liftrResourcePreference;
    	      this.logzOrganizationProperties = defaults.logzOrganizationProperties;
    	      this.marketplaceSubscriptionStatus = defaults.marketplaceSubscriptionStatus;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.planData = defaults.planData;
    	      this.provisioningState = defaults.provisioningState;
    	      this.userInfo = defaults.userInfo;
        }

        public Builder liftrResourceCategory(String liftrResourceCategory) {
            this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory);
            return this;
        }

        public Builder liftrResourcePreference(Integer liftrResourcePreference) {
            this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference);
            return this;
        }

        public Builder logzOrganizationProperties(@Nullable LogzOrganizationPropertiesResponse logzOrganizationProperties) {
            this.logzOrganizationProperties = logzOrganizationProperties;
            return this;
        }

        public Builder marketplaceSubscriptionStatus(@Nullable String marketplaceSubscriptionStatus) {
            this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
            return this;
        }

        public Builder monitoringStatus(@Nullable String monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }

        public Builder planData(@Nullable PlanDataResponse planData) {
            this.planData = planData;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder userInfo(@Nullable UserInfoResponse userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public MonitorPropertiesResponse build() {
            return new MonitorPropertiesResponse(liftrResourceCategory, liftrResourcePreference, logzOrganizationProperties, marketplaceSubscriptionStatus, monitoringStatus, planData, provisioningState, userInfo);
        }
    }
}
