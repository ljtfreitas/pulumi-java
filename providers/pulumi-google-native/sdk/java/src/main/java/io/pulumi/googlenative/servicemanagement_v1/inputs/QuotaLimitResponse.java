// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * `QuotaLimit` defines a specific limit that applies over a specified duration for a limit type. There can be at most one limit for a duration and limit type combination defined within a `QuotaGroup`.
 * 
 */
public final class QuotaLimitResponse extends io.pulumi.resources.InvokeArgs {

    public static final QuotaLimitResponse Empty = new QuotaLimitResponse();

    /**
     * Default number of tokens that can be consumed during the specified duration. This is the number of tokens assigned when a client application developer activates the service for his/her project. Specifying a value of 0 will block all requests. This can be used if you are provisioning quota to selected consumers and blocking others. Similarly, a value of -1 will indicate an unlimited quota. No other negative values are allowed. Used by group-based quotas only.
     * 
     */
    @InputImport(name="defaultLimit", required=true)
      private final String defaultLimit;

    public String getDefaultLimit() {
        return this.defaultLimit;
    }

    /**
     * Optional. User-visible, extended description for this quota limit. Should be used only when more context is needed to understand this limit than provided by the limit's display name (see: `display_name`).
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * User-visible display name for this limit. Optional. If not set, the UI will provide a default display name based on the quota configuration. This field can be used to override the default display name generated from the configuration.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Duration of this limit in textual notation. Must be "100s" or "1d". Used by group-based quotas only.
     * 
     */
    @InputImport(name="duration", required=true)
      private final String duration;

    public String getDuration() {
        return this.duration;
    }

    /**
     * Free tier value displayed in the Developers Console for this limit. The free tier is the number of tokens that will be subtracted from the billed amount when billing is enabled. This field can only be set on a limit with duration "1d", in a billable group; it is invalid on any other limit. If this field is not set, it defaults to 0, indicating that there is no free tier for this service. Used by group-based quotas only.
     * 
     */
    @InputImport(name="freeTier", required=true)
      private final String freeTier;

    public String getFreeTier() {
        return this.freeTier;
    }

    /**
     * Maximum number of tokens that can be consumed during the specified duration. Client application developers can override the default limit up to this maximum. If specified, this value cannot be set to a value less than the default limit. If not specified, it is set to the default limit. To allow clients to apply overrides with no upper bound, set this to -1, indicating unlimited maximum quota. Used by group-based quotas only.
     * 
     */
    @InputImport(name="maxLimit", required=true)
      private final String maxLimit;

    public String getMaxLimit() {
        return this.maxLimit;
    }

    /**
     * The name of the metric this quota limit applies to. The quota limits with the same metric will be checked together during runtime. The metric must be defined within the service config.
     * 
     */
    @InputImport(name="metric", required=true)
      private final String metric;

    public String getMetric() {
        return this.metric;
    }

    /**
     * Name of the quota limit. The name must be provided, and it must be unique within the service. The name can only include alphanumeric characters as well as '-'. The maximum length of the limit name is 64 characters.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specify the unit of the quota limit. It uses the same syntax as Metric.unit. The supported unit kinds are determined by the quota backend system. Here are some examples: * "1/min/{project}" for quota per minute per project. Note: the order of unit components is insignificant. The "1" at the beginning is required to follow the metric unit syntax.
     * 
     */
    @InputImport(name="unit", required=true)
      private final String unit;

    public String getUnit() {
        return this.unit;
    }

    /**
     * Tiered limit values. You must specify this as a key:value pair, with an integer value that is the maximum number of requests allowed for the specified unit. Currently only STANDARD is supported.
     * 
     */
    @InputImport(name="values", required=true)
      private final Map<String,String> values;

    public Map<String,String> getValues() {
        return this.values;
    }

    public QuotaLimitResponse(
        String defaultLimit,
        String description,
        String displayName,
        String duration,
        String freeTier,
        String maxLimit,
        String metric,
        String name,
        String unit,
        Map<String,String> values) {
        this.defaultLimit = Objects.requireNonNull(defaultLimit, "expected parameter 'defaultLimit' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.duration = Objects.requireNonNull(duration, "expected parameter 'duration' to be non-null");
        this.freeTier = Objects.requireNonNull(freeTier, "expected parameter 'freeTier' to be non-null");
        this.maxLimit = Objects.requireNonNull(maxLimit, "expected parameter 'maxLimit' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private QuotaLimitResponse() {
        this.defaultLimit = null;
        this.description = null;
        this.displayName = null;
        this.duration = null;
        this.freeTier = null;
        this.maxLimit = null;
        this.metric = null;
        this.name = null;
        this.unit = null;
        this.values = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaLimitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultLimit;
        private String description;
        private String displayName;
        private String duration;
        private String freeTier;
        private String maxLimit;
        private String metric;
        private String name;
        private String unit;
        private Map<String,String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(QuotaLimitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLimit = defaults.defaultLimit;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.duration = defaults.duration;
    	      this.freeTier = defaults.freeTier;
    	      this.maxLimit = defaults.maxLimit;
    	      this.metric = defaults.metric;
    	      this.name = defaults.name;
    	      this.unit = defaults.unit;
    	      this.values = defaults.values;
        }

        public Builder setDefaultLimit(String defaultLimit) {
            this.defaultLimit = Objects.requireNonNull(defaultLimit);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setFreeTier(String freeTier) {
            this.freeTier = Objects.requireNonNull(freeTier);
            return this;
        }

        public Builder setMaxLimit(String maxLimit) {
            this.maxLimit = Objects.requireNonNull(maxLimit);
            return this;
        }

        public Builder setMetric(String metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder setValues(Map<String,String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public QuotaLimitResponse build() {
            return new QuotaLimitResponse(defaultLimit, description, displayName, duration, freeTier, maxLimit, metric, name, unit, values);
        }
    }
}
