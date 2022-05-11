// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.backup.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PolicyVMRetentionYearly {
    /**
     * @return The number of yearly backups to keep. Must be between `1` and `9999`
     * 
     */
    private final Integer count;
    /**
     * @return The months of the year to retain backups of. Must be one of `January`, `February`, `March`, `April`, `May`, `June`, `July`, `August`, `September`, `October`, `November` and `December`.
     * 
     */
    private final List<String> months;
    /**
     * @return The weekday backups to retain . Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
     * 
     */
    private final List<String> weekdays;
    /**
     * @return The weeks of the month to retain backups of. Must be one of `First`, `Second`, `Third`, `Fourth`, `Last`.
     * 
     */
    private final List<String> weeks;

    @CustomType.Constructor
    private PolicyVMRetentionYearly(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("months") List<String> months,
        @CustomType.Parameter("weekdays") List<String> weekdays,
        @CustomType.Parameter("weeks") List<String> weeks) {
        this.count = count;
        this.months = months;
        this.weekdays = weekdays;
        this.weeks = weeks;
    }

    /**
     * @return The number of yearly backups to keep. Must be between `1` and `9999`
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The months of the year to retain backups of. Must be one of `January`, `February`, `March`, `April`, `May`, `June`, `July`, `August`, `September`, `October`, `November` and `December`.
     * 
     */
    public List<String> months() {
        return this.months;
    }
    /**
     * @return The weekday backups to retain . Must be one of `Sunday`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday` or `Saturday`.
     * 
     */
    public List<String> weekdays() {
        return this.weekdays;
    }
    /**
     * @return The weeks of the month to retain backups of. Must be one of `First`, `Second`, `Third`, `Fourth`, `Last`.
     * 
     */
    public List<String> weeks() {
        return this.weeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyVMRetentionYearly defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private List<String> months;
        private List<String> weekdays;
        private List<String> weeks;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyVMRetentionYearly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.months = defaults.months;
    	      this.weekdays = defaults.weekdays;
    	      this.weeks = defaults.weeks;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder months(List<String> months) {
            this.months = Objects.requireNonNull(months);
            return this;
        }
        public Builder months(String... months) {
            return months(List.of(months));
        }
        public Builder weekdays(List<String> weekdays) {
            this.weekdays = Objects.requireNonNull(weekdays);
            return this;
        }
        public Builder weekdays(String... weekdays) {
            return weekdays(List.of(weekdays));
        }
        public Builder weeks(List<String> weeks) {
            this.weeks = Objects.requireNonNull(weeks);
            return this;
        }
        public Builder weeks(String... weeks) {
            return weeks(List.of(weeks));
        }        public PolicyVMRetentionYearly build() {
            return new PolicyVMRetentionYearly(count, months, weekdays, weeks);
        }
    }
}
