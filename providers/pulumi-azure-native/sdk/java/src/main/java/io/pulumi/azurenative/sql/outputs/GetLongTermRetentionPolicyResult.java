// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLongTermRetentionPolicyResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    private final @Nullable String monthlyRetention;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The week of year to take the yearly backup in an ISO 8601 format.
     * 
     */
    private final @Nullable Integer weekOfYear;
    /**
     * The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    private final @Nullable String weeklyRetention;
    /**
     * The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     */
    private final @Nullable String yearlyRetention;

    @CustomType.Constructor
    private GetLongTermRetentionPolicyResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("monthlyRetention") @Nullable String monthlyRetention,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("weekOfYear") @Nullable Integer weekOfYear,
        @CustomType.Parameter("weeklyRetention") @Nullable String weeklyRetention,
        @CustomType.Parameter("yearlyRetention") @Nullable String yearlyRetention) {
        this.id = id;
        this.monthlyRetention = monthlyRetention;
        this.name = name;
        this.type = type;
        this.weekOfYear = weekOfYear;
        this.weeklyRetention = weeklyRetention;
        this.yearlyRetention = yearlyRetention;
    }

    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
    */
    public Optional<String> getMonthlyRetention() {
        return Optional.ofNullable(this.monthlyRetention);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The week of year to take the yearly backup in an ISO 8601 format.
     * 
    */
    public Optional<Integer> getWeekOfYear() {
        return Optional.ofNullable(this.weekOfYear);
    }
    /**
     * The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
    */
    public Optional<String> getWeeklyRetention() {
        return Optional.ofNullable(this.weeklyRetention);
    }
    /**
     * The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
    */
    public Optional<String> getYearlyRetention() {
        return Optional.ofNullable(this.yearlyRetention);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLongTermRetentionPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String monthlyRetention;
        private String name;
        private String type;
        private @Nullable Integer weekOfYear;
        private @Nullable String weeklyRetention;
        private @Nullable String yearlyRetention;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLongTermRetentionPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.monthlyRetention = defaults.monthlyRetention;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.weekOfYear = defaults.weekOfYear;
    	      this.weeklyRetention = defaults.weeklyRetention;
    	      this.yearlyRetention = defaults.yearlyRetention;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder monthlyRetention(@Nullable String monthlyRetention) {
            this.monthlyRetention = monthlyRetention;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder weekOfYear(@Nullable Integer weekOfYear) {
            this.weekOfYear = weekOfYear;
            return this;
        }

        public Builder weeklyRetention(@Nullable String weeklyRetention) {
            this.weeklyRetention = weeklyRetention;
            return this;
        }

        public Builder yearlyRetention(@Nullable String yearlyRetention) {
            this.yearlyRetention = yearlyRetention;
            return this;
        }
        public GetLongTermRetentionPolicyResult build() {
            return new GetLongTermRetentionPolicyResult(id, monthlyRetention, name, type, weekOfYear, weeklyRetention, yearlyRetention);
        }
    }
}
