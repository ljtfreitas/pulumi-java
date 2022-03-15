// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanBillingPeriod;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanConsumptionPricingType;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanRevenueShareType;
import io.pulumi.googlenative.apigee_v1.enums.RatePlanState;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1RateRangeArgs;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1RevenueShareRangeArgs;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleTypeMoneyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RatePlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final RatePlanArgs Empty = new RatePlanArgs();

    /**
     * Name of the API product that the rate plan is associated with.
     * 
     */
    @Import(name="apiproduct")
      private final @Nullable Output<String> apiproduct;

    public Output<String> getApiproduct() {
        return this.apiproduct == null ? Output.empty() : this.apiproduct;
    }

    @Import(name="apiproductId", required=true)
      private final Output<String> apiproductId;

    public Output<String> getApiproductId() {
        return this.apiproductId;
    }

    /**
     * Frequency at which the customer will be billed.
     * 
     */
    @Import(name="billingPeriod")
      private final @Nullable Output<RatePlanBillingPeriod> billingPeriod;

    public Output<RatePlanBillingPeriod> getBillingPeriod() {
        return this.billingPeriod == null ? Output.empty() : this.billingPeriod;
    }

    /**
     * API call volume ranges and the fees charged when the total number of API calls is within a given range. The method used to calculate the final fee depends on the selected pricing model. For example, if the pricing model is `STAIRSTEP` and the ranges are defined as follows: ```{ "start": 1, "end": 100, "fee": 75 }, { "start": 101, "end": 200, "fee": 100 }, }``` Then the following fees would be charged based on the total number of API calls (assuming the currency selected is `USD`): * 1 call costs $75 * 50 calls cost $75 * 150 calls cost $100 The number of API calls cannot exceed 200.
     * 
     */
    @Import(name="consumptionPricingRates")
      private final @Nullable Output<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates;

    public Output<List<GoogleCloudApigeeV1RateRangeArgs>> getConsumptionPricingRates() {
        return this.consumptionPricingRates == null ? Output.empty() : this.consumptionPricingRates;
    }

    /**
     * Pricing model used for consumption-based charges.
     * 
     */
    @Import(name="consumptionPricingType")
      private final @Nullable Output<RatePlanConsumptionPricingType> consumptionPricingType;

    public Output<RatePlanConsumptionPricingType> getConsumptionPricingType() {
        return this.consumptionPricingType == null ? Output.empty() : this.consumptionPricingType;
    }

    /**
     * Currency to be used for billing. Consists of a three-letter code as defined by the [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) standard.
     * 
     */
    @Import(name="currencyCode")
      private final @Nullable Output<String> currencyCode;

    public Output<String> getCurrencyCode() {
        return this.currencyCode == null ? Output.empty() : this.currencyCode;
    }

    /**
     * Description of the rate plan.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Display name of the rate plan.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Time when the rate plan will expire in milliseconds since epoch. Set to 0 or `null` to indicate that the rate plan should never expire.
     * 
     */
    @Import(name="endTime")
      private final @Nullable Output<String> endTime;

    public Output<String> getEndTime() {
        return this.endTime == null ? Output.empty() : this.endTime;
    }

    /**
     * Frequency at which the fixed fee is charged.
     * 
     */
    @Import(name="fixedFeeFrequency")
      private final @Nullable Output<Integer> fixedFeeFrequency;

    public Output<Integer> getFixedFeeFrequency() {
        return this.fixedFeeFrequency == null ? Output.empty() : this.fixedFeeFrequency;
    }

    /**
     * Fixed amount that is charged at a defined interval and billed in advance of use of the API product. The fee will be prorated for the first billing period.
     * 
     */
    @Import(name="fixedRecurringFee")
      private final @Nullable Output<GoogleTypeMoneyArgs> fixedRecurringFee;

    public Output<GoogleTypeMoneyArgs> getFixedRecurringFee() {
        return this.fixedRecurringFee == null ? Output.empty() : this.fixedRecurringFee;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Details of the revenue sharing model.
     * 
     */
    @Import(name="revenueShareRates")
      private final @Nullable Output<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates;

    public Output<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> getRevenueShareRates() {
        return this.revenueShareRates == null ? Output.empty() : this.revenueShareRates;
    }

    /**
     * Method used to calculate the revenue that is shared with developers.
     * 
     */
    @Import(name="revenueShareType")
      private final @Nullable Output<RatePlanRevenueShareType> revenueShareType;

    public Output<RatePlanRevenueShareType> getRevenueShareType() {
        return this.revenueShareType == null ? Output.empty() : this.revenueShareType;
    }

    /**
     * Initial, one-time fee paid when purchasing the API product.
     * 
     */
    @Import(name="setupFee")
      private final @Nullable Output<GoogleTypeMoneyArgs> setupFee;

    public Output<GoogleTypeMoneyArgs> getSetupFee() {
        return this.setupFee == null ? Output.empty() : this.setupFee;
    }

    /**
     * Time when the rate plan becomes active in milliseconds since epoch.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Output.empty() : this.startTime;
    }

    /**
     * Current state of the rate plan (draft or published).
     * 
     */
    @Import(name="state")
      private final @Nullable Output<RatePlanState> state;

    public Output<RatePlanState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public RatePlanArgs(
        @Nullable Output<String> apiproduct,
        Output<String> apiproductId,
        @Nullable Output<RatePlanBillingPeriod> billingPeriod,
        @Nullable Output<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates,
        @Nullable Output<RatePlanConsumptionPricingType> consumptionPricingType,
        @Nullable Output<String> currencyCode,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<String> endTime,
        @Nullable Output<Integer> fixedFeeFrequency,
        @Nullable Output<GoogleTypeMoneyArgs> fixedRecurringFee,
        Output<String> organizationId,
        @Nullable Output<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates,
        @Nullable Output<RatePlanRevenueShareType> revenueShareType,
        @Nullable Output<GoogleTypeMoneyArgs> setupFee,
        @Nullable Output<String> startTime,
        @Nullable Output<RatePlanState> state) {
        this.apiproduct = apiproduct;
        this.apiproductId = Objects.requireNonNull(apiproductId, "expected parameter 'apiproductId' to be non-null");
        this.billingPeriod = billingPeriod;
        this.consumptionPricingRates = consumptionPricingRates;
        this.consumptionPricingType = consumptionPricingType;
        this.currencyCode = currencyCode;
        this.description = description;
        this.displayName = displayName;
        this.endTime = endTime;
        this.fixedFeeFrequency = fixedFeeFrequency;
        this.fixedRecurringFee = fixedRecurringFee;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.revenueShareRates = revenueShareRates;
        this.revenueShareType = revenueShareType;
        this.setupFee = setupFee;
        this.startTime = startTime;
        this.state = state;
    }

    private RatePlanArgs() {
        this.apiproduct = Output.empty();
        this.apiproductId = Output.empty();
        this.billingPeriod = Output.empty();
        this.consumptionPricingRates = Output.empty();
        this.consumptionPricingType = Output.empty();
        this.currencyCode = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.endTime = Output.empty();
        this.fixedFeeFrequency = Output.empty();
        this.fixedRecurringFee = Output.empty();
        this.organizationId = Output.empty();
        this.revenueShareRates = Output.empty();
        this.revenueShareType = Output.empty();
        this.setupFee = Output.empty();
        this.startTime = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RatePlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiproduct;
        private Output<String> apiproductId;
        private @Nullable Output<RatePlanBillingPeriod> billingPeriod;
        private @Nullable Output<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates;
        private @Nullable Output<RatePlanConsumptionPricingType> consumptionPricingType;
        private @Nullable Output<String> currencyCode;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> endTime;
        private @Nullable Output<Integer> fixedFeeFrequency;
        private @Nullable Output<GoogleTypeMoneyArgs> fixedRecurringFee;
        private Output<String> organizationId;
        private @Nullable Output<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates;
        private @Nullable Output<RatePlanRevenueShareType> revenueShareType;
        private @Nullable Output<GoogleTypeMoneyArgs> setupFee;
        private @Nullable Output<String> startTime;
        private @Nullable Output<RatePlanState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(RatePlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiproduct = defaults.apiproduct;
    	      this.apiproductId = defaults.apiproductId;
    	      this.billingPeriod = defaults.billingPeriod;
    	      this.consumptionPricingRates = defaults.consumptionPricingRates;
    	      this.consumptionPricingType = defaults.consumptionPricingType;
    	      this.currencyCode = defaults.currencyCode;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.endTime = defaults.endTime;
    	      this.fixedFeeFrequency = defaults.fixedFeeFrequency;
    	      this.fixedRecurringFee = defaults.fixedRecurringFee;
    	      this.organizationId = defaults.organizationId;
    	      this.revenueShareRates = defaults.revenueShareRates;
    	      this.revenueShareType = defaults.revenueShareType;
    	      this.setupFee = defaults.setupFee;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder apiproduct(@Nullable Output<String> apiproduct) {
            this.apiproduct = apiproduct;
            return this;
        }

        public Builder apiproduct(@Nullable String apiproduct) {
            this.apiproduct = Output.ofNullable(apiproduct);
            return this;
        }

        public Builder apiproductId(Output<String> apiproductId) {
            this.apiproductId = Objects.requireNonNull(apiproductId);
            return this;
        }

        public Builder apiproductId(String apiproductId) {
            this.apiproductId = Output.of(Objects.requireNonNull(apiproductId));
            return this;
        }

        public Builder billingPeriod(@Nullable Output<RatePlanBillingPeriod> billingPeriod) {
            this.billingPeriod = billingPeriod;
            return this;
        }

        public Builder billingPeriod(@Nullable RatePlanBillingPeriod billingPeriod) {
            this.billingPeriod = Output.ofNullable(billingPeriod);
            return this;
        }

        public Builder consumptionPricingRates(@Nullable Output<List<GoogleCloudApigeeV1RateRangeArgs>> consumptionPricingRates) {
            this.consumptionPricingRates = consumptionPricingRates;
            return this;
        }

        public Builder consumptionPricingRates(@Nullable List<GoogleCloudApigeeV1RateRangeArgs> consumptionPricingRates) {
            this.consumptionPricingRates = Output.ofNullable(consumptionPricingRates);
            return this;
        }

        public Builder consumptionPricingType(@Nullable Output<RatePlanConsumptionPricingType> consumptionPricingType) {
            this.consumptionPricingType = consumptionPricingType;
            return this;
        }

        public Builder consumptionPricingType(@Nullable RatePlanConsumptionPricingType consumptionPricingType) {
            this.consumptionPricingType = Output.ofNullable(consumptionPricingType);
            return this;
        }

        public Builder currencyCode(@Nullable Output<String> currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public Builder currencyCode(@Nullable String currencyCode) {
            this.currencyCode = Output.ofNullable(currencyCode);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = Output.ofNullable(endTime);
            return this;
        }

        public Builder fixedFeeFrequency(@Nullable Output<Integer> fixedFeeFrequency) {
            this.fixedFeeFrequency = fixedFeeFrequency;
            return this;
        }

        public Builder fixedFeeFrequency(@Nullable Integer fixedFeeFrequency) {
            this.fixedFeeFrequency = Output.ofNullable(fixedFeeFrequency);
            return this;
        }

        public Builder fixedRecurringFee(@Nullable Output<GoogleTypeMoneyArgs> fixedRecurringFee) {
            this.fixedRecurringFee = fixedRecurringFee;
            return this;
        }

        public Builder fixedRecurringFee(@Nullable GoogleTypeMoneyArgs fixedRecurringFee) {
            this.fixedRecurringFee = Output.ofNullable(fixedRecurringFee);
            return this;
        }

        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder revenueShareRates(@Nullable Output<List<GoogleCloudApigeeV1RevenueShareRangeArgs>> revenueShareRates) {
            this.revenueShareRates = revenueShareRates;
            return this;
        }

        public Builder revenueShareRates(@Nullable List<GoogleCloudApigeeV1RevenueShareRangeArgs> revenueShareRates) {
            this.revenueShareRates = Output.ofNullable(revenueShareRates);
            return this;
        }

        public Builder revenueShareType(@Nullable Output<RatePlanRevenueShareType> revenueShareType) {
            this.revenueShareType = revenueShareType;
            return this;
        }

        public Builder revenueShareType(@Nullable RatePlanRevenueShareType revenueShareType) {
            this.revenueShareType = Output.ofNullable(revenueShareType);
            return this;
        }

        public Builder setupFee(@Nullable Output<GoogleTypeMoneyArgs> setupFee) {
            this.setupFee = setupFee;
            return this;
        }

        public Builder setupFee(@Nullable GoogleTypeMoneyArgs setupFee) {
            this.setupFee = Output.ofNullable(setupFee);
            return this;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = Output.ofNullable(startTime);
            return this;
        }

        public Builder state(@Nullable Output<RatePlanState> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable RatePlanState state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public RatePlanArgs build() {
            return new RatePlanArgs(apiproduct, apiproductId, billingPeriod, consumptionPricingRates, consumptionPricingType, currencyCode, description, displayName, endTime, fixedFeeFrequency, fixedRecurringFee, organizationId, revenueShareRates, revenueShareType, setupFee, startTime, state);
        }
    }
}
