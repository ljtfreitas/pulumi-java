// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest {
    /**
     * @return The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
     * 
     */
    private final Integer count;
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    private final String interval;
    /**
     * @return The path to which this rule status code applies.
     * 
     */
    private final String path;
    /**
     * @return The amount of time that qualifies as slow for this rule.
     * 
     */
    private final String timeTaken;

    @CustomType.Constructor
    private GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest(
        @CustomType.Parameter("count") Integer count,
        @CustomType.Parameter("interval") String interval,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("timeTaken") String timeTaken) {
        this.count = count;
        this.interval = interval;
        this.path = path;
        this.timeTaken = timeTaken;
    }

    /**
     * @return The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
     * 
     */
    public Integer count() {
        return this.count;
    }
    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    public String interval() {
        return this.interval;
    }
    /**
     * @return The path to which this rule status code applies.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return The amount of time that qualifies as slow for this rule.
     * 
     */
    public String timeTaken() {
        return this.timeTaken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String interval;
        private String path;
        private String timeTaken;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.timeTaken = defaults.timeTaken;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder interval(String interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder timeTaken(String timeTaken) {
            this.timeTaken = Objects.requireNonNull(timeTaken);
            return this;
        }        public GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest build() {
            return new GetWindowsWebAppSiteConfigAutoHealSettingTriggerSlowRequest(count, interval, path, timeTaken);
        }
    }
}
