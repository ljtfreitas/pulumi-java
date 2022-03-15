// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.billingbudgets_v1.enums.GoogleCloudBillingBudgetsV1FilterCalendarPeriod;
import io.pulumi.googlenative.billingbudgets_v1.enums.GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment;
import io.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1CustomPeriodArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A filter for a budget, limiting the scope of the cost to calculate.
 * 
 */
public final class GoogleCloudBillingBudgetsV1FilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudBillingBudgetsV1FilterArgs Empty = new GoogleCloudBillingBudgetsV1FilterArgs();

    /**
     * Optional. Specifies to track usage for recurring calendar period. For example, assume that CalendarPeriod.QUARTER is set. The budget tracks usage from April 1 to June 30, when the current calendar month is April, May, June. After that, it tracks usage from July 1 to September 30 when the current calendar month is July, August, September, so on.
     * 
     */
    @Import(name="calendarPeriod")
      private final @Nullable Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod> calendarPeriod;

    public Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod> getCalendarPeriod() {
        return this.calendarPeriod == null ? Output.empty() : this.calendarPeriod;
    }

    /**
     * Optional. If Filter.credit_types_treatment is INCLUDE_SPECIFIED_CREDITS, this is a list of credit types to be subtracted from gross cost to determine the spend for threshold calculations. See [a list of acceptable credit type values](https://cloud.google.com/billing/docs/how-to/export-data-bigquery-tables#credits-type). If Filter.credit_types_treatment is **not** INCLUDE_SPECIFIED_CREDITS, this field must be empty.
     * 
     */
    @Import(name="creditTypes")
      private final @Nullable Output<List<String>> creditTypes;

    public Output<List<String>> getCreditTypes() {
        return this.creditTypes == null ? Output.empty() : this.creditTypes;
    }

    /**
     * Optional. If not set, default behavior is `INCLUDE_ALL_CREDITS`.
     * 
     */
    @Import(name="creditTypesTreatment")
      private final @Nullable Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment> creditTypesTreatment;

    public Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment> getCreditTypesTreatment() {
        return this.creditTypesTreatment == null ? Output.empty() : this.creditTypesTreatment;
    }

    /**
     * Optional. Specifies to track usage from any start date (required) to any end date (optional). This time period is static, it does not recur.
     * 
     */
    @Import(name="customPeriod")
      private final @Nullable Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs> customPeriod;

    public Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs> getCustomPeriod() {
        return this.customPeriod == null ? Output.empty() : this.customPeriod;
    }

    /**
     * Optional. A single label and value pair specifying that usage from only this set of labeled resources should be included in the budget. If omitted, the report includes all labeled and unlabeled usage. An object containing a single `"key": value` pair. Example: `{ "name": "wrench" }`. _Currently, multiple entries or multiple values per entry are not allowed._
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Optional. A set of projects of the form `projects/{project}`, specifying that usage from only this set of projects should be included in the budget. If omitted, the report includes all usage for the billing account, regardless of which project the usage occurred on. Only zero or one project can be specified currently.
     * 
     */
    @Import(name="projects")
      private final @Nullable Output<List<String>> projects;

    public Output<List<String>> getProjects() {
        return this.projects == null ? Output.empty() : this.projects;
    }

    /**
     * Optional. A set of services of the form `services/{service_id}`, specifying that usage from only this set of services should be included in the budget. If omitted, the report includes usage for all the services. The service names are available through the Catalog API: https://cloud.google.com/billing/v1/how-tos/catalog-api.
     * 
     */
    @Import(name="services")
      private final @Nullable Output<List<String>> services;

    public Output<List<String>> getServices() {
        return this.services == null ? Output.empty() : this.services;
    }

    /**
     * Optional. A set of subaccounts of the form `billingAccounts/{account_id}`, specifying that usage from only this set of subaccounts should be included in the budget. If a subaccount is set to the name of the parent account, usage from the parent account is included. If the field is omitted, the report includes usage from the parent account and all subaccounts, if they exist.
     * 
     */
    @Import(name="subaccounts")
      private final @Nullable Output<List<String>> subaccounts;

    public Output<List<String>> getSubaccounts() {
        return this.subaccounts == null ? Output.empty() : this.subaccounts;
    }

    public GoogleCloudBillingBudgetsV1FilterArgs(
        @Nullable Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod> calendarPeriod,
        @Nullable Output<List<String>> creditTypes,
        @Nullable Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment> creditTypesTreatment,
        @Nullable Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs> customPeriod,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<String>> projects,
        @Nullable Output<List<String>> services,
        @Nullable Output<List<String>> subaccounts) {
        this.calendarPeriod = calendarPeriod;
        this.creditTypes = creditTypes;
        this.creditTypesTreatment = creditTypesTreatment;
        this.customPeriod = customPeriod;
        this.labels = labels;
        this.projects = projects;
        this.services = services;
        this.subaccounts = subaccounts;
    }

    private GoogleCloudBillingBudgetsV1FilterArgs() {
        this.calendarPeriod = Output.empty();
        this.creditTypes = Output.empty();
        this.creditTypesTreatment = Output.empty();
        this.customPeriod = Output.empty();
        this.labels = Output.empty();
        this.projects = Output.empty();
        this.services = Output.empty();
        this.subaccounts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudBillingBudgetsV1FilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod> calendarPeriod;
        private @Nullable Output<List<String>> creditTypes;
        private @Nullable Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment> creditTypesTreatment;
        private @Nullable Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs> customPeriod;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<String>> projects;
        private @Nullable Output<List<String>> services;
        private @Nullable Output<List<String>> subaccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudBillingBudgetsV1FilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calendarPeriod = defaults.calendarPeriod;
    	      this.creditTypes = defaults.creditTypes;
    	      this.creditTypesTreatment = defaults.creditTypesTreatment;
    	      this.customPeriod = defaults.customPeriod;
    	      this.labels = defaults.labels;
    	      this.projects = defaults.projects;
    	      this.services = defaults.services;
    	      this.subaccounts = defaults.subaccounts;
        }

        public Builder calendarPeriod(@Nullable Output<GoogleCloudBillingBudgetsV1FilterCalendarPeriod> calendarPeriod) {
            this.calendarPeriod = calendarPeriod;
            return this;
        }

        public Builder calendarPeriod(@Nullable GoogleCloudBillingBudgetsV1FilterCalendarPeriod calendarPeriod) {
            this.calendarPeriod = Output.ofNullable(calendarPeriod);
            return this;
        }

        public Builder creditTypes(@Nullable Output<List<String>> creditTypes) {
            this.creditTypes = creditTypes;
            return this;
        }

        public Builder creditTypes(@Nullable List<String> creditTypes) {
            this.creditTypes = Output.ofNullable(creditTypes);
            return this;
        }

        public Builder creditTypesTreatment(@Nullable Output<GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment> creditTypesTreatment) {
            this.creditTypesTreatment = creditTypesTreatment;
            return this;
        }

        public Builder creditTypesTreatment(@Nullable GoogleCloudBillingBudgetsV1FilterCreditTypesTreatment creditTypesTreatment) {
            this.creditTypesTreatment = Output.ofNullable(creditTypesTreatment);
            return this;
        }

        public Builder customPeriod(@Nullable Output<GoogleCloudBillingBudgetsV1CustomPeriodArgs> customPeriod) {
            this.customPeriod = customPeriod;
            return this;
        }

        public Builder customPeriod(@Nullable GoogleCloudBillingBudgetsV1CustomPeriodArgs customPeriod) {
            this.customPeriod = Output.ofNullable(customPeriod);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder projects(@Nullable Output<List<String>> projects) {
            this.projects = projects;
            return this;
        }

        public Builder projects(@Nullable List<String> projects) {
            this.projects = Output.ofNullable(projects);
            return this;
        }

        public Builder services(@Nullable Output<List<String>> services) {
            this.services = services;
            return this;
        }

        public Builder services(@Nullable List<String> services) {
            this.services = Output.ofNullable(services);
            return this;
        }

        public Builder subaccounts(@Nullable Output<List<String>> subaccounts) {
            this.subaccounts = subaccounts;
            return this;
        }

        public Builder subaccounts(@Nullable List<String> subaccounts) {
            this.subaccounts = Output.ofNullable(subaccounts);
            return this;
        }
        public GoogleCloudBillingBudgetsV1FilterArgs build() {
            return new GoogleCloudBillingBudgetsV1FilterArgs(calendarPeriod, creditTypes, creditTypesTreatment, customPeriod, labels, projects, services, subaccounts);
        }
    }
}
