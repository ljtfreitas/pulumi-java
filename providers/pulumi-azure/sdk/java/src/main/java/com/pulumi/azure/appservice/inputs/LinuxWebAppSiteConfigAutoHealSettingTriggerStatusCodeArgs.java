// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs Empty = new LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs();

    /**
     * The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * The time interval in the form `hh:mm:ss`.
     * 
     */
    @Import(name="interval", required=true)
    private Output<String> interval;

    /**
     * @return The time interval in the form `hh:mm:ss`.
     * 
     */
    public Output<String> interval() {
        return this.interval;
    }

    /**
     * The path to which this rule status code applies.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The path to which this rule status code applies.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The status code for this rule, accepts single status codes and status code ranges. e.g. `500` or `400-499`. Possible values are integers between `101` and `599`
     * 
     */
    @Import(name="statusCodeRange", required=true)
    private Output<String> statusCodeRange;

    /**
     * @return The status code for this rule, accepts single status codes and status code ranges. e.g. `500` or `400-499`. Possible values are integers between `101` and `599`
     * 
     */
    public Output<String> statusCodeRange() {
        return this.statusCodeRange;
    }

    /**
     * The Request Sub Status of the Status Code.
     * 
     */
    @Import(name="subStatus")
    private @Nullable Output<Integer> subStatus;

    /**
     * @return The Request Sub Status of the Status Code.
     * 
     */
    public Optional<Output<Integer>> subStatus() {
        return Optional.ofNullable(this.subStatus);
    }

    /**
     * The Win32 Status Code of the Request.
     * 
     */
    @Import(name="win32Status")
    private @Nullable Output<String> win32Status;

    /**
     * @return The Win32 Status Code of the Request.
     * 
     */
    public Optional<Output<String>> win32Status() {
        return Optional.ofNullable(this.win32Status);
    }

    private LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs() {}

    private LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs(LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs $) {
        this.count = $.count;
        this.interval = $.interval;
        this.path = $.path;
        this.statusCodeRange = $.statusCodeRange;
        this.subStatus = $.subStatus;
        this.win32Status = $.win32Status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs $;

        public Builder() {
            $ = new LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs();
        }

        public Builder(LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs defaults) {
            $ = new LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count The number of occurrences of the defined `status_code` in the specified `interval` on which to trigger this rule.
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param interval The time interval in the form `hh:mm:ss`.
         * 
         * @return builder
         * 
         */
        public Builder interval(Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval The time interval in the form `hh:mm:ss`.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param path The path to which this rule status code applies.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The path to which this rule status code applies.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param statusCodeRange The status code for this rule, accepts single status codes and status code ranges. e.g. `500` or `400-499`. Possible values are integers between `101` and `599`
         * 
         * @return builder
         * 
         */
        public Builder statusCodeRange(Output<String> statusCodeRange) {
            $.statusCodeRange = statusCodeRange;
            return this;
        }

        /**
         * @param statusCodeRange The status code for this rule, accepts single status codes and status code ranges. e.g. `500` or `400-499`. Possible values are integers between `101` and `599`
         * 
         * @return builder
         * 
         */
        public Builder statusCodeRange(String statusCodeRange) {
            return statusCodeRange(Output.of(statusCodeRange));
        }

        /**
         * @param subStatus The Request Sub Status of the Status Code.
         * 
         * @return builder
         * 
         */
        public Builder subStatus(@Nullable Output<Integer> subStatus) {
            $.subStatus = subStatus;
            return this;
        }

        /**
         * @param subStatus The Request Sub Status of the Status Code.
         * 
         * @return builder
         * 
         */
        public Builder subStatus(Integer subStatus) {
            return subStatus(Output.of(subStatus));
        }

        /**
         * @param win32Status The Win32 Status Code of the Request.
         * 
         * @return builder
         * 
         */
        public Builder win32Status(@Nullable Output<String> win32Status) {
            $.win32Status = win32Status;
            return this;
        }

        /**
         * @param win32Status The Win32 Status Code of the Request.
         * 
         * @return builder
         * 
         */
        public Builder win32Status(String win32Status) {
            return win32Status(Output.of(win32Status));
        }

        public LinuxWebAppSiteConfigAutoHealSettingTriggerStatusCodeArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.interval = Objects.requireNonNull($.interval, "expected parameter 'interval' to be non-null");
            $.statusCodeRange = Objects.requireNonNull($.statusCodeRange, "expected parameter 'statusCodeRange' to be non-null");
            return $;
        }
    }

}
